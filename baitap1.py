from antlr4 import *
from BaiTap1Lexer import BaiTap1Lexer
from BaiTap1Listener import BaiTap1Listener
from BaiTap1Parser import BaiTap1Parser
import sys

class BaiTap1PrintListener(BaiTap1Listener):
    def enterHi(self, ctx):
        print("BaiTap1: %s" % ctx.ID())

def main():
    lexer = BaiTap1Lexer(StdinStream())
    stream = CommonTokenStream(lexer)
    parser = BaiTap1Parser(stream)
    tree = parser.program()
    printer = BaiTap1PrintListener()
    walker = ParseTreeWalker()
    walker.walk(printer, tree)

if __name__ == '__main__':
    print('Starting parse....')
    main()
