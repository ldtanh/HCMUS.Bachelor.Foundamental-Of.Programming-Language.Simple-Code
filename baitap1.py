from antlr4 import *
from SimpleCodeLexer import SimpleCodeLexer
from SimpleCodeListener import SimpleCodeListener
from SimpleCodeParser import SimpleCodeParser
import sys
from antlr4.tree.Tree import TerminalNodeImpl
from antlr4.error.ErrorListener import ErrorListener

filterList = ['IDENTIFIER','INTLITERAL','CHARLITERAL','STRINGLITERAL','BOOLEANLITERAL']

def printOutChildNode(child, lexers):
    global filterList
    col = child.getSymbol().column
    line = child.getSymbol().line
    lexer = child.getText()
    token = lexers.ruleNames[child.getSymbol().type - 1]
    if (token in filterList):
        print('{0} {1} {2}'.format(line, token, lexer))
    else:
        print('{0} {1}'.format(line, lexer))

def flattenTree(parent, lexers):
    for i in range(parent.getChildCount()):
        child = parent.getChild(i)
        if (isinstance(child, TerminalNodeImpl)) and (child.getText().strip() != ''):
            printOutChildNode(child, lexers)
        else:
            flattenTree(child, lexers)

class MyErrorListener( ErrorListener ):
    def __init__(self):
        super(MyErrorListener, self).__init__()

    def syntaxError(self, recognizer, offendingSymbol, line, column, msg, e):
        print('Syntax Error {0} at {1}:{2}'.format(msg, line, column))

    def reportAmbiguity(self, recognizer, dfa, startIndex, stopIndex, exact, ambigAlts, configs):
        print('Grammar Ambiguity')

    def reportAttemptingFullContext(self, recognizer, dfa, startIndex, stopIndex, conflictingAlts, configs):
        print('Context Error')

    def reportContextSensitivity(self, recognizer, dfa, startIndex, stopIndex, prediction, configs):
        print('Context Sensitivity')

def main():
    input_stream = FileStream('in.in')
    lexer = SimpleCodeLexer(input_stream)
    stream = CommonTokenStream(lexer)
    parser = SimpleCodeParser(stream)
    parser._listeners = [ MyErrorListener() ]
    tree = parser.program()
    flattenTree(tree, lexer)

    # printer = SimpleCodePrintListener(lexer)
    # walker = ParseTreeWalker()
    # walker.walk(printer, tree)

if __name__ == '__main__':
    print('Starting parse....')
    main()
