from antlr4 import *
from SimpleCodeLexer import SimpleCodeLexer
from SimpleCodeListener import SimpleCodeListener
from SimpleCodeParser import SimpleCodeParser
import sys
from antlr4.tree.Tree import TerminalNodeImpl

class SimpleCodePrintListener(SimpleCodeListener):
    def __init__(self, lexer):
        self.lexer = lexer

    def enterProgram(self, ctx):
        for child in ctx.getChildren():
            if (not isinstance(child, TerminalNodeImpl)):
                continue
            print(child.getText(), self.lexer.ruleNames[child.getSymbol().type - 1])

    def enterMethod_decl(self, ctx):
        for child in ctx.getChildren():
            if (not isinstance(child, TerminalNodeImpl)):
                continue
            print(child.getText(), self.lexer.ruleNames[child.getSymbol().type - 1])

    def enterBlock(self, ctx):
        for child in ctx.getChildren():
            if (not isinstance(child, TerminalNodeImpl)):
                continue
            print(child.getText(), self.lexer.ruleNames[child.getSymbol().type - 1])

    def enterField_decl(self, ctx:SimpleCodeParser.Field_declContext):
        for child in ctx.getChildren():
            if (not isinstance(child, TerminalNodeImpl)):
                continue
            print(child.getText(), self.lexer.ruleNames[child.getSymbol().type - 1])

    # Enter a parse tree produced by SimpleCodeParser#method_decl_type.
    def enterMethod_decl_type(self, ctx:SimpleCodeParser.Method_decl_typeContext):
        for child in ctx.getChildren():
            if (not isinstance(child, TerminalNodeImpl)):
                continue
            print(child.getText(), self.lexer.ruleNames[child.getSymbol().type - 1])

    # Enter a parse tree produced by SimpleCodeParser#variable.
    def enterVariable(self, ctx:SimpleCodeParser.VariableContext):
        for child in ctx.getChildren():
            if (not isinstance(child, TerminalNodeImpl)):
                continue
            print(child.getText(), self.lexer.ruleNames[child.getSymbol().type - 1])

    # Enter a parse tree produced by SimpleCodeParser#method_params.
    def enterMethod_params(self, ctx:SimpleCodeParser.Method_paramsContext):
        for child in ctx.getChildren():
            if (not isinstance(child, TerminalNodeImpl)):
                continue
            print(child.getText(), self.lexer.ruleNames[child.getSymbol().type - 1])


    # Enter a parse tree produced by SimpleCodeParser#block.
    def enterBlock(self, ctx:SimpleCodeParser.BlockContext):
        for child in ctx.getChildren():
            if (not isinstance(child, TerminalNodeImpl)):
                continue
            print(child.getText(), self.lexer.ruleNames[child.getSymbol().type - 1])


    # Enter a parse tree produced by SimpleCodeParser#var_decl.
    def enterVar_decl(self, ctx:SimpleCodeParser.Var_declContext):
        for child in ctx.getChildren():
            if (not isinstance(child, TerminalNodeImpl)):
                continue
            print(child.getText(), self.lexer.ruleNames[child.getSymbol().type - 1])

    # Enter a parse tree produced by SimpleCodeParser#statement.
    def enterStatement(self, ctx:SimpleCodeParser.StatementContext):
        for child in ctx.getChildren():
            if (not isinstance(child, TerminalNodeImpl)):
                continue
            print(child.getText(), self.lexer.ruleNames[child.getSymbol().type - 1])

    # Enter a parse tree produced by SimpleCodeParser#assign_op.
    def enterAssign_op(self, ctx:SimpleCodeParser.Assign_opContext):
        for child in ctx.getChildren():
            if (not isinstance(child, TerminalNodeImpl)):
                continue
            print(child.getText(), self.lexer.ruleNames[child.getSymbol().type - 1])

    # Enter a parse tree produced by SimpleCodeParser#method_call.
    def enterMethod_call(self, ctx:SimpleCodeParser.Method_callContext):
        for child in ctx.getChildren():
            if (not isinstance(child, TerminalNodeImpl)):
                continue
            print(child.getText(), self.lexer.ruleNames[child.getSymbol().type - 1])

    # Enter a parse tree produced by SimpleCodeParser#method_call_params.
    def enterMethod_call_params(self, ctx:SimpleCodeParser.Method_call_paramsContext):
        for child in ctx.getChildren():
            if (not isinstance(child, TerminalNodeImpl)):
                continue
            print(child.getText(), self.lexer.ruleNames[child.getSymbol().type - 1])

    # Enter a parse tree produced by SimpleCodeParser#method_name.
    def enterMethod_name(self, ctx:SimpleCodeParser.Method_nameContext):
        for child in ctx.getChildren():
            if (not isinstance(child, TerminalNodeImpl)):
                continue
            print(child.getText(), self.lexer.ruleNames[child.getSymbol().type - 1])

    # Enter a parse tree produced by SimpleCodeParser#location.
    def enterLocation(self, ctx:SimpleCodeParser.LocationContext):
        for child in ctx.getChildren():
            if (not isinstance(child, TerminalNodeImpl)):
                continue
            print(child.getText(), self.lexer.ruleNames[child.getSymbol().type - 1])

    # Enter a parse tree produced by SimpleCodeParser#expr.
    def enterExpr(self, ctx:SimpleCodeParser.ExprContext):
        for child in ctx.getChildren():
            if (not isinstance(child, TerminalNodeImpl)):
                continue
            print(child.getText(), self.lexer.ruleNames[child.getSymbol().type - 1])

    # Enter a parse tree produced by SimpleCodeParser#callout_arg.
    def enterCallout_arg(self, ctx:SimpleCodeParser.Callout_argContext):
        for child in ctx.getChildren():
            if (not isinstance(child, TerminalNodeImpl)):
                continue
            print(child.getText(), self.lexer.ruleNames[child.getSymbol().type - 1])

    # Enter a parse tree produced by SimpleCodeParser#bin_op.
    def enterBin_op(self, ctx:SimpleCodeParser.Bin_opContext):
        for child in ctx.getChildren():
            if (not isinstance(child, TerminalNodeImpl)):
                continue
            print(child.getText(), self.lexer.ruleNames[child.getSymbol().type - 1])

    # Enter a parse tree produced by SimpleCodeParser#arith_op.
    def enterArith_op(self, ctx:SimpleCodeParser.Arith_opContext):
        for child in ctx.getChildren():
            if (not isinstance(child, TerminalNodeImpl)):
                continue
            print(child.getText(), self.lexer.ruleNames[child.getSymbol().type - 1])

    # Enter a parse tree produced by SimpleCodeParser#rel_op.
    def enterRel_op(self, ctx:SimpleCodeParser.Rel_opContext):
        for child in ctx.getChildren():
            if (not isinstance(child, TerminalNodeImpl)):
                continue
            print(child.getText(), self.lexer.ruleNames[child.getSymbol().type - 1])

    # Enter a parse tree produced by SimpleCodeParser#eq_op.
    def enterEq_op(self, ctx:SimpleCodeParser.Eq_opContext):
        for child in ctx.getChildren():
            if (not isinstance(child, TerminalNodeImpl)):
                continue
            print(child.getText(), self.lexer.ruleNames[child.getSymbol().type - 1])

    # Enter a parse tree produced by SimpleCodeParser#cond_op.
    def enterCond_op(self, ctx:SimpleCodeParser.Cond_opContext):
        for child in ctx.getChildren():
            if (not isinstance(child, TerminalNodeImpl)):
                continue
            print(child.getText(), self.lexer.ruleNames[child.getSymbol().type - 1])

    # Enter a parse tree produced by SimpleCodeParser#literal.
    def enterLiteral(self, ctx:SimpleCodeParser.LiteralContext):
        for child in ctx.getChildren():
            if (not isinstance(child, TerminalNodeImpl)):
                continue
            print(child.getText(), self.lexer.ruleNames[child.getSymbol().type - 1])


    # Enter a parse tree produced by SimpleCodeParser#int_literal.
    def enterInt_literal(self, ctx:SimpleCodeParser.Int_literalContext):
        for child in ctx.getChildren():
            if (not isinstance(child, TerminalNodeImpl)):
                continue
            print(child.getText(), self.lexer.ruleNames[child.getSymbol().type - 1])


    # Enter a parse tree produced by SimpleCodeParser#string_literal.
    def enterString_literal(self, ctx:SimpleCodeParser.String_literalContext):
        for child in ctx.getChildren():
            if (not isinstance(child, TerminalNodeImpl)):
                continue
            print(child.getText(), self.lexer.ruleNames[child.getSymbol().type - 1])

def main():
    input_stream = FileStream('in.in')
    lexer = SimpleCodeLexer(input_stream)
    stream = CommonTokenStream(lexer)
    parser = SimpleCodeParser(stream)
    tree = parser.program()
    printer = SimpleCodePrintListener(lexer)
    walker = ParseTreeWalker()
    walker.walk(printer, tree)

if __name__ == '__main__':
    print('Starting parse....')
    main()
