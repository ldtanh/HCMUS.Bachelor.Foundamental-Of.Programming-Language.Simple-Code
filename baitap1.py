from antlr4 import *
from SimpleCodeLexer import SimpleCodeLexer
from SimpleCodeListener import SimpleCodeListener
from SimpleCodeParser import SimpleCodeParser
import sys
from antlr4.tree.Tree import TerminalNodeImpl, ErrorNodeImpl
from antlr4.error.ErrorListener import ErrorListener
from antlr4.error.Errors import RecognitionException, NoViableAltException, InputMismatchException, FailedPredicateException, ParseCancellationException

filterList = ['IDENTIFIER', 'INTLITERAL',
              'CHARLITERAL', 'STRINGLITERAL', 'BOOLEANLITERAL']
fWrite = open(sys.argv[2] + '.out', 'w')


def printOutChildNode(child, lexers):
    global filterList, fWrite
    line = child.getSymbol().line
    lexer = child.getText()
    token = lexers.ruleNames[child.getSymbol().type - 1]
    if (token in filterList):
        fWrite.write('{0} {1} {2}\n'.format(line, token, lexer))
    else:
        fWrite.write('{0} {1}\n'.format(line, lexer))


def flattenTree(parent, lexers):
    if (int(sys.argv[1]) == 1):
        return
    for i in range(parent.getChildCount()):
        child = parent.getChild(i)
        # if (not isinstance(child, ErrorNodeImpl)):
        if (isinstance(child, TerminalNodeImpl)) and (child.getText().strip() != ''):
            printOutChildNode(child, lexers)
        else:
            flattenTree(child, lexers)


class MyErrorListener(ErrorListener):
    def __init__(self):
        super(MyErrorListener, self).__init__()

    def printSyntaxError(self, msg, line, column):
        fWrite.write(
            '[Syntax Error] Line {0}, column {1}: {2}\n'.format(line, column, msg))

    def escapeWSAndQuote(self, s: str):
        s = s.replace("\n", "\\n")
        s = s.replace("\r", "\\r")
        s = s.replace("\t", "\\t")
        return "'" + s + "'"

    def getTokenErrorDisplay(self, t: Token):
        if t is None:
            return "<no token>"
        s = t.text
        if s is None:
            if t.type == Token.EOF:
                s = "<EOF>"
            else:
                s = "<" + str(t.type) + ">"
        return self.escapeWSAndQuote(s)

    def reportNoViableAlternative(self, recognizer: Parser, e: NoViableAltException, line, column):
        tokens = recognizer.getTokenStream()
        if tokens is not None:
            if e.startToken.type == Token.EOF:
                input = "<EOF>"
            else:
                input = tokens.getText()
        else:
            input = "<unknown input>"
        if (input.strip() != ''):
            msg = 'No viable alternative at input {0}'.format(
                self.escapeWSAndQuote(input))
            self.printSyntaxError(msg, line, column)

    def reportInputMismatch(self, recognizer: Parser, e: InputMismatchException, line, column):
        msg = "Mismatched input {0}. Expected {1}".format(self.getTokenErrorDisplay(
            e.offendingToken), e.getExpectedTokens().toString(recognizer.literalNames, recognizer.symbolicNames))
        self.printSyntaxError(msg, line, column)

    def reportFailedPredicate(self, recognizer, e, line, column):
        ruleName = recognizer.ruleNames[recognizer._ctx.getRuleIndex()]
        msg = "Following Rule is error: {0}. Message: {1}".format(
            ruleName, e.message)
        self.printSyntaxError(msg, line, column)

    def syntaxError(self, recognizer, offendingSymbol, line, column, msg, e):
        if isinstance(e, NoViableAltException):
            self.reportNoViableAlternative(recognizer, e, line, column)
        elif isinstance(e, InputMismatchException):
            self.reportInputMismatch(recognizer, e, line, column)
        elif isinstance(e, FailedPredicateException):
            self.reportFailedPredicate(recognizer, e, line, column)
        else:
            self.printSyntaxError(msg, line, column)


def main(argv):
    input_stream = FileStream(argv[2])
    lexer = SimpleCodeLexer(input_stream)
    print(lexer, type(lexer))
    stream = CommonTokenStream(lexer)
    parser = SimpleCodeParser(stream)
    if (int(sys.argv[1]) == 1):
        parser._listeners = [MyErrorListener()]
    tree = parser.program()
    flattenTree(tree, lexer)

    # printer = SimpleCodePrintListener(lexer)
    # walker = ParseTreeWalker()
    # walker.walk(printer, tree)


if __name__ == '__main__':
    main(sys.argv)
