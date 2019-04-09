from antlr4 import *
from SimpleCodeLexer import SimpleCodeLexer
from SimpleCodeListener import SimpleCodeListener
from SimpleCodeParser import SimpleCodeParser
import sys

class SimpleCodePrintListener(SimpleCodeListener):
    def enterProgram(self, ctx):
        print(ctx.getText())
        print(ctx.toStringTree())
        for child in ctx.getChildren():
            print(child.getSymbol())

def main():
    input_stream = FileStream('in.in')
    # lexer = SimpleCodeLexer(input_stream)
    # stream = CommonTokenStream(lexer)
    # parser = SimpleCodeParser(stream)
    # tree = parser.program()
    # printer = SimpleCodePrintListener()
    # walker = ParseTreeWalker()
    # walker.walk(printer, tree)

    lexer = SimpleCodeLexer(input_stream)
    stream = CommonTokenStream(lexer)
    parser = SimpleCodeParser(stream)
    tree = parser.program()
    printer = SimpleCodePrintListener()
    walker = ParseTreeWalker()
    walker.walk(printer, tree)

if __name__ == '__main__':
    print('Starting parse....')
    main()
