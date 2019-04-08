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


    # Enter a parse tree produced by SimpleCodeParser#variable.
    def enterVariable(self, ctx:SimpleCodeParser.VariableContext):
        pass

    # Exit a parse tree produced by SimpleCodeParser#variable.
    def exitVariable(self, ctx:SimpleCodeParser.VariableContext):
        pass


    # Enter a parse tree produced by SimpleCodeParser#field_decl.
    def enterField_decl(self, ctx:SimpleCodeParser.Field_declContext):
        pass

    # Exit a parse tree produced by SimpleCodeParser#field_decl.
    def exitField_decl(self, ctx:SimpleCodeParser.Field_declContext):
        pass


    # Enter a parse tree produced by SimpleCodeParser#method_decl_type.
    def enterMethod_decl_type(self, ctx:SimpleCodeParser.Method_decl_typeContext):
        pass

    # Exit a parse tree produced by SimpleCodeParser#method_decl_type.
    def exitMethod_decl_type(self, ctx:SimpleCodeParser.Method_decl_typeContext):
        pass


    # Enter a parse tree produced by SimpleCodeParser#method_decl.
    def enterMethod_decl(self, ctx:SimpleCodeParser.Method_declContext):
        pass

    # Exit a parse tree produced by SimpleCodeParser#method_decl.
    def exitMethod_decl(self, ctx:SimpleCodeParser.Method_declContext):
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


    # Enter a parse tree produced by SimpleCodeParser#var_decl.
    def enterVar_decl(self, ctx:SimpleCodeParser.Var_declContext):
        pass

    # Exit a parse tree produced by SimpleCodeParser#var_decl.
    def exitVar_decl(self, ctx:SimpleCodeParser.Var_declContext):
        pass


    # Enter a parse tree produced by SimpleCodeParser#data_type.
    def enterData_type(self, ctx:SimpleCodeParser.Data_typeContext):
        pass

    # Exit a parse tree produced by SimpleCodeParser#data_type.
    def exitData_type(self, ctx:SimpleCodeParser.Data_typeContext):
        pass


    # Enter a parse tree produced by SimpleCodeParser#statement.
    def enterStatement(self, ctx:SimpleCodeParser.StatementContext):
        pass

    # Exit a parse tree produced by SimpleCodeParser#statement.
    def exitStatement(self, ctx:SimpleCodeParser.StatementContext):
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


    # Enter a parse tree produced by SimpleCodeParser#bin_op.
    def enterBin_op(self, ctx:SimpleCodeParser.Bin_opContext):
        pass

    # Exit a parse tree produced by SimpleCodeParser#bin_op.
    def exitBin_op(self, ctx:SimpleCodeParser.Bin_opContext):
        pass


    # Enter a parse tree produced by SimpleCodeParser#arith_op.
    def enterArith_op(self, ctx:SimpleCodeParser.Arith_opContext):
        pass

    # Exit a parse tree produced by SimpleCodeParser#arith_op.
    def exitArith_op(self, ctx:SimpleCodeParser.Arith_opContext):
        pass


    # Enter a parse tree produced by SimpleCodeParser#rel_op.
    def enterRel_op(self, ctx:SimpleCodeParser.Rel_opContext):
        pass

    # Exit a parse tree produced by SimpleCodeParser#rel_op.
    def exitRel_op(self, ctx:SimpleCodeParser.Rel_opContext):
        pass


    # Enter a parse tree produced by SimpleCodeParser#eq_op.
    def enterEq_op(self, ctx:SimpleCodeParser.Eq_opContext):
        pass

    # Exit a parse tree produced by SimpleCodeParser#eq_op.
    def exitEq_op(self, ctx:SimpleCodeParser.Eq_opContext):
        pass


    # Enter a parse tree produced by SimpleCodeParser#cond_op.
    def enterCond_op(self, ctx:SimpleCodeParser.Cond_opContext):
        pass

    # Exit a parse tree produced by SimpleCodeParser#cond_op.
    def exitCond_op(self, ctx:SimpleCodeParser.Cond_opContext):
        pass


    # Enter a parse tree produced by SimpleCodeParser#literal.
    def enterLiteral(self, ctx:SimpleCodeParser.LiteralContext):
        pass

    # Exit a parse tree produced by SimpleCodeParser#literal.
    def exitLiteral(self, ctx:SimpleCodeParser.LiteralContext):
        pass


    # Enter a parse tree produced by SimpleCodeParser#identifier.
    def enterIdentifier(self, ctx:SimpleCodeParser.IdentifierContext):
        pass

    # Exit a parse tree produced by SimpleCodeParser#identifier.
    def exitIdentifier(self, ctx:SimpleCodeParser.IdentifierContext):
        pass


    # Enter a parse tree produced by SimpleCodeParser#alpha_num.
    def enterAlpha_num(self, ctx:SimpleCodeParser.Alpha_numContext):
        pass

    # Exit a parse tree produced by SimpleCodeParser#alpha_num.
    def exitAlpha_num(self, ctx:SimpleCodeParser.Alpha_numContext):
        pass


    # Enter a parse tree produced by SimpleCodeParser#int_literal.
    def enterInt_literal(self, ctx:SimpleCodeParser.Int_literalContext):
        pass

    # Exit a parse tree produced by SimpleCodeParser#int_literal.
    def exitInt_literal(self, ctx:SimpleCodeParser.Int_literalContext):
        pass


    # Enter a parse tree produced by SimpleCodeParser#decimal_literal.
    def enterDecimal_literal(self, ctx:SimpleCodeParser.Decimal_literalContext):
        pass

    # Exit a parse tree produced by SimpleCodeParser#decimal_literal.
    def exitDecimal_literal(self, ctx:SimpleCodeParser.Decimal_literalContext):
        pass


    # Enter a parse tree produced by SimpleCodeParser#hex_literal.
    def enterHex_literal(self, ctx:SimpleCodeParser.Hex_literalContext):
        pass

    # Exit a parse tree produced by SimpleCodeParser#hex_literal.
    def exitHex_literal(self, ctx:SimpleCodeParser.Hex_literalContext):
        pass


    # Enter a parse tree produced by SimpleCodeParser#bool_literal.
    def enterBool_literal(self, ctx:SimpleCodeParser.Bool_literalContext):
        pass

    # Exit a parse tree produced by SimpleCodeParser#bool_literal.
    def exitBool_literal(self, ctx:SimpleCodeParser.Bool_literalContext):
        pass


    # Enter a parse tree produced by SimpleCodeParser#char.
    def enterChar(self, ctx:SimpleCodeParser.CharContext):
        pass

    # Exit a parse tree produced by SimpleCodeParser#char.
    def exitChar(self, ctx:SimpleCodeParser.CharContext):
        pass


    # Enter a parse tree produced by SimpleCodeParser#char_literal.
    def enterChar_literal(self, ctx:SimpleCodeParser.Char_literalContext):
        pass

    # Exit a parse tree produced by SimpleCodeParser#char_literal.
    def exitChar_literal(self, ctx:SimpleCodeParser.Char_literalContext):
        pass


    # Enter a parse tree produced by SimpleCodeParser#string_literal.
    def enterString_literal(self, ctx:SimpleCodeParser.String_literalContext):
        pass

    # Exit a parse tree produced by SimpleCodeParser#string_literal.
    def exitString_literal(self, ctx:SimpleCodeParser.String_literalContext):
        pass


