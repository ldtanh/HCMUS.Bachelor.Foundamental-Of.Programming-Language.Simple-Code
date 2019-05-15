# Generated from SimpleCode.g4 by ANTLR 4.7.2
from antlr4 import *
from antlr4.tree.Tree import TerminalNodeImpl, ErrorNodeImpl

if __name__ is not None and "." in __name__:
    from .SimpleCodeParser import SimpleCodeParser
else:
    from SimpleCodeParser import SimpleCodeParser

from antlr4.tree.Tree import TerminalNodeImpl, ErrorNodeImpl

# This class defines a complete generic visitor for a parse tree produced by SimpleCodeParser.

class SimpleCodeVisitor(ParseTreeVisitor):
    def __init__(self, lexer):
        self.table = {}
        self.lexer = lexer
        self.currentType = None

    # Visit a parse tree produced by SimpleCodeParser#program.
    def visitProgram(self, ctx:SimpleCodeParser.ProgramContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by SimpleCodeParser#field_decl.
    def visitField_decl(self, ctx:SimpleCodeParser.Field_declContext):
        self.currentType = ctx.DATA_TYPE()
        for i in range(ctx.getChildCount()):
            child = ctx.getChild(i)
            if (not isinstance(child, TerminalNodeImpl)) and (child.getText().strip() != ''):
                print(self.visit(child))
        # return self.visitChildren(ctx)


    # Visit a parse tree produced by SimpleCodeParser#method_decl.
    def visitMethod_decl(self, ctx:SimpleCodeParser.Method_declContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by SimpleCodeParser#method_decl_type.
    def visitMethod_decl_type(self, ctx:SimpleCodeParser.Method_decl_typeContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by SimpleCodeParser#variable.
    def visitVariable(self, ctx:SimpleCodeParser.VariableContext):
        if ctx.IDENTIFIER() is not None:
            return ctx.IDENTIFIER()
        return self.visitChildren(ctx)


    # Visit a parse tree produced by SimpleCodeParser#array_decl.
    def visitArray_decl(self, ctx:SimpleCodeParser.Array_declContext):
        return ctx.IDENTIFIER()


    # Visit a parse tree produced by SimpleCodeParser#method_params.
    def visitMethod_params(self, ctx:SimpleCodeParser.Method_paramsContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by SimpleCodeParser#block.
    def visitBlock(self, ctx:SimpleCodeParser.BlockContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by SimpleCodeParser#var_decl.
    def visitVar_decl(self, ctx:SimpleCodeParser.Var_declContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by SimpleCodeParser#statement.
    def visitStatement(self, ctx:SimpleCodeParser.StatementContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by SimpleCodeParser#assign_op.
    def visitAssign_op(self, ctx:SimpleCodeParser.Assign_opContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by SimpleCodeParser#method_call.
    def visitMethod_call(self, ctx:SimpleCodeParser.Method_callContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by SimpleCodeParser#method_call_params.
    def visitMethod_call_params(self, ctx:SimpleCodeParser.Method_call_paramsContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by SimpleCodeParser#method_name.
    def visitMethod_name(self, ctx:SimpleCodeParser.Method_nameContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by SimpleCodeParser#location.
    def visitLocation(self, ctx:SimpleCodeParser.LocationContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by SimpleCodeParser#expr.
    def visitExpr(self, ctx:SimpleCodeParser.ExprContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by SimpleCodeParser#callout_arg.
    def visitCallout_arg(self, ctx:SimpleCodeParser.Callout_argContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by SimpleCodeParser#literal.
    def visitLiteral(self, ctx:SimpleCodeParser.LiteralContext):
        return self.visitChildren(ctx)



del SimpleCodeParser