# Generated from SimpleCode.g4 by ANTLR 4.7.2
from antlr4 import *
if __name__ is not None and "." in __name__:
    from .SimpleCodeParser import SimpleCodeParser
else:
    from SimpleCodeParser import SimpleCodeParser

# This class defines a complete listener for a parse tree produced by SimpleCodeParser.
class SimpleCodeListener(ParseTreeListener):

    # Enter a parse tree produced by SimpleCodeParser#program.
    def enterProgram(self, ctx:SimpleCodeParser.ProgramContext):
        pass

    # Exit a parse tree produced by SimpleCodeParser#program.
    def exitProgram(self, ctx:SimpleCodeParser.ProgramContext):
        pass


    # Enter a parse tree produced by SimpleCodeParser#field_decl.
    def enterField_decl(self, ctx:SimpleCodeParser.Field_declContext):
        pass

    # Exit a parse tree produced by SimpleCodeParser#field_decl.
    def exitField_decl(self, ctx:SimpleCodeParser.Field_declContext):
        pass


    # Enter a parse tree produced by SimpleCodeParser#variable.
    def enterVariable(self, ctx:SimpleCodeParser.VariableContext):
        pass

    # Exit a parse tree produced by SimpleCodeParser#variable.
    def exitVariable(self, ctx:SimpleCodeParser.VariableContext):
        pass


    # Enter a parse tree produced by SimpleCodeParser#array_decl.
    def enterArray_decl(self, ctx:SimpleCodeParser.Array_declContext):
        pass

    # Exit a parse tree produced by SimpleCodeParser#array_decl.
    def exitArray_decl(self, ctx:SimpleCodeParser.Array_declContext):
        pass


    # Enter a parse tree produced by SimpleCodeParser#method_decl.
    def enterMethod_decl(self, ctx:SimpleCodeParser.Method_declContext):
        pass

    # Exit a parse tree produced by SimpleCodeParser#method_decl.
    def exitMethod_decl(self, ctx:SimpleCodeParser.Method_declContext):
        pass


    # Enter a parse tree produced by SimpleCodeParser#method_decl_type.
    def enterMethod_decl_type(self, ctx:SimpleCodeParser.Method_decl_typeContext):
        pass

    # Exit a parse tree produced by SimpleCodeParser#method_decl_type.
    def exitMethod_decl_type(self, ctx:SimpleCodeParser.Method_decl_typeContext):
        pass


    # Enter a parse tree produced by SimpleCodeParser#method_params.
    def enterMethod_params(self, ctx:SimpleCodeParser.Method_paramsContext):
        pass

    # Exit a parse tree produced by SimpleCodeParser#method_params.
    def exitMethod_params(self, ctx:SimpleCodeParser.Method_paramsContext):
        pass


    # Enter a parse tree produced by SimpleCodeParser#block.
    def enterBlock(self, ctx:SimpleCodeParser.BlockContext):
        pass

    # Exit a parse tree produced by SimpleCodeParser#block.
    def exitBlock(self, ctx:SimpleCodeParser.BlockContext):
        pass


    # Enter a parse tree produced by SimpleCodeParser#statement.
    def enterStatement(self, ctx:SimpleCodeParser.StatementContext):
        pass

    # Exit a parse tree produced by SimpleCodeParser#statement.
    def exitStatement(self, ctx:SimpleCodeParser.StatementContext):
        pass


    # Enter a parse tree produced by SimpleCodeParser#assign_statement.
    def enterAssign_statement(self, ctx:SimpleCodeParser.Assign_statementContext):
        pass

    # Exit a parse tree produced by SimpleCodeParser#assign_statement.
    def exitAssign_statement(self, ctx:SimpleCodeParser.Assign_statementContext):
        pass


    # Enter a parse tree produced by SimpleCodeParser#assign_op.
    def enterAssign_op(self, ctx:SimpleCodeParser.Assign_opContext):
        pass

    # Exit a parse tree produced by SimpleCodeParser#assign_op.
    def exitAssign_op(self, ctx:SimpleCodeParser.Assign_opContext):
        pass


    # Enter a parse tree produced by SimpleCodeParser#method_call.
    def enterMethod_call(self, ctx:SimpleCodeParser.Method_callContext):
        pass

    # Exit a parse tree produced by SimpleCodeParser#method_call.
    def exitMethod_call(self, ctx:SimpleCodeParser.Method_callContext):
        pass


    # Enter a parse tree produced by SimpleCodeParser#method_call_params.
    def enterMethod_call_params(self, ctx:SimpleCodeParser.Method_call_paramsContext):
        pass

    # Exit a parse tree produced by SimpleCodeParser#method_call_params.
    def exitMethod_call_params(self, ctx:SimpleCodeParser.Method_call_paramsContext):
        pass


    # Enter a parse tree produced by SimpleCodeParser#method_name.
    def enterMethod_name(self, ctx:SimpleCodeParser.Method_nameContext):
        pass

    # Exit a parse tree produced by SimpleCodeParser#method_name.
    def exitMethod_name(self, ctx:SimpleCodeParser.Method_nameContext):
        pass


    # Enter a parse tree produced by SimpleCodeParser#location.
    def enterLocation(self, ctx:SimpleCodeParser.LocationContext):
        pass

    # Exit a parse tree produced by SimpleCodeParser#location.
    def exitLocation(self, ctx:SimpleCodeParser.LocationContext):
        pass


    # Enter a parse tree produced by SimpleCodeParser#expr.
    def enterExpr(self, ctx:SimpleCodeParser.ExprContext):
        pass

    # Exit a parse tree produced by SimpleCodeParser#expr.
    def exitExpr(self, ctx:SimpleCodeParser.ExprContext):
        pass


    # Enter a parse tree produced by SimpleCodeParser#callout_arg.
    def enterCallout_arg(self, ctx:SimpleCodeParser.Callout_argContext):
        pass

    # Exit a parse tree produced by SimpleCodeParser#callout_arg.
    def exitCallout_arg(self, ctx:SimpleCodeParser.Callout_argContext):
        pass


    # Enter a parse tree produced by SimpleCodeParser#literal.
    def enterLiteral(self, ctx:SimpleCodeParser.LiteralContext):
        pass

    # Exit a parse tree produced by SimpleCodeParser#literal.
    def exitLiteral(self, ctx:SimpleCodeParser.LiteralContext):
        pass


