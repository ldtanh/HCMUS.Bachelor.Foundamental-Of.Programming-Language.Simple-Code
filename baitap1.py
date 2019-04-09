from antlr4 import *
from SimpleCodeLexer import SimpleCodeLexer
from SimpleCodeListener import SimpleCodeListener
from SimpleCodeParser import SimpleCodeParser
import sys
from antlr4.tree.Tree import TerminalNodeImpl

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

def main():
    input_stream = FileStream('in.in')
    lexer = SimpleCodeLexer(input_stream)
    stream = CommonTokenStream(lexer)
    parser = SimpleCodeParser(stream)
    tree = parser.program()
    flattenTree(tree, lexer)

    # printer = SimpleCodePrintListener(lexer)
    # walker = ParseTreeWalker()
    # walker.walk(printer, tree)

if __name__ == '__main__':
    print('Starting parse....')
    main()
