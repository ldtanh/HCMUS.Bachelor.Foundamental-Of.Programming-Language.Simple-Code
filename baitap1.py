from antlr4 import *
from SimpleCodeLexer import SimpleCodeLexer
from SimpleCodeListener import SimpleCodeListener
from SimpleCodeParser import SimpleCodeParser
import sys

class SimpleCodePrintListener(SimpleCodeListener):
    def enterProgram(self, ctx):
        print("Enter Program: %s" % ctx)
    
    def enterMethod_decl(self, ctx):
        print("Enter Method Declaration: {0}".format(ctx))
        
def main():
    lexer = SimpleCodeLexer(StdinStream())
    stream = CommonTokenStream(lexer)
    parser = SimpleCodeParser(stream)
    tree = parser.program()
    printer = SimpleCodePrintListener()
    walker = ParseTreeWalker()
    walker.walk(printer, tree)

if __name__ == '__main__':
    print('Starting parse....')
    main()
