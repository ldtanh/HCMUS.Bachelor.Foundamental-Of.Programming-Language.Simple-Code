from antlr4 import *
from SimpleCodeLexer import SimpleCodeLexer
from SimpleCodeListener import SimpleCodeListener
from SimpleCodeParser import SimpleCodeParser
from SimpleCodeVisitor import SimpleCodeVisitor
import sys
from antlr4.tree.Tree import TerminalNodeImpl, ErrorNodeImpl
from antlr4.error.ErrorListener import ErrorListener
from antlr4.error.Errors import RecognitionException, NoViableAltException, InputMismatchException, FailedPredicateException, ParseCancellationException

filterList = ['IDENTIFIER', 'INTLITERAL',
              'CHARLITERAL', 'STRINGLITERAL', 'BOOLEANLITERAL']

fWrite = open(sys.argv[1] + '.out', 'w')

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
        if not msg.find("' '"):
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


ERROR_DUPLICATE_VAR_DEFINE = 'Variable [{0}] is already declared with type [{1}]\n'
ERROR_VAR_NOT_DEFINED = 'Variable [{0}] has not been defined\n'
ERROR_VAR_EXCUTE_AS_FUNCTION = 'Variable [{0}] is not a function\n'
ERROR_DATA_TYPE_NOT_COMPATIBLE_OPERATOR = 'Type [{0}] is not compatible with operator [{1}]\n'
ERROR_DATA_TYPE_DIFFERENT = "Type [{0}] and type [{1}] are different to operate\n"
MAIN_METHOD_IS_NOT_AVAILABLE = "There is no 'main' method is declared\n"
ERROR_ARRAY_ZERO_LENGTH = "Array [{0}] is declared with zero-size\n"
ERROR_ARRAY_LENGTH_NOT_DEFINED = "Array [{0}] is declared with wrong size\n"
FUNCTION_NOT_DEFINED = "Function [{0}] is not defined!\n"
FUNCTION_PARAMS_MISMATCHED = "Function [{0}] requires list parameters as {1}, which is actually as {2}\n"
ERROR_VOID_RETURN_DATA_TYPE = "Void [{0}] can't return value, got type [{1}]\n"
ERROR_FUNCTION_RETURN_WRONG_TYPE = "Function [{0}] expected return type as [{1}], got [{2}]\n"
ERROR_FUNCTION_RETURN_EMPTY = "Function [{0}] expected return type as [{1}], got empty\n"
ERROR_ARRAY_INDEX_TYPE = "Array [{0}] index type must be [int], got [{1}]\n"
ERROR_ARRAY_INDEX_UNDEFINED = "Array [{0}] must have index, but got empty\n"
ERROR_RHS_IS_ARRAY = "Right hand side of assignment must not be {0}\n"
ERROR_ARRAY_INDEX_OUT_OF_RANGE = "Array [{0}] index is out of range, must be less than [{1}], actually [{2}]\n"
ERROR_VAR_IS_NOT_ARRAY = "[{0}] is not an array to iterate\n"
ERROR_IF_CONDITION_MUST_BE_BOOLEAN = 'Condition in if-else must be boolean, got [{0}]\n'
ERROR_ITERATOR_LOOP_NOT_INT = 'Iterator in Loop must be int-variable, got [{0}]\n'
ERROR_MISSING_IDENTIFIER_FOR = 'For-loop is missing iterator\n'
ERROR_PARAMS_FOR = 'For-loop got {0} param(s), expected 3\n'
ERROR_INIT_VALUE_FOR = 'For-loop must have initialized value int-type, got [{0}]\n'
ERROR_FINAL_VALUE_FOR = 'For-loop must have final value int-type, got [{0}]\n'

INT_TYPE = 'int'
BOOL_TYPE = 'boolean'
ARRAY_TYPE = 'array[{0}]'

VOID = 'void'

def checkTypeCompatible(op, dataType):
    if op.strip() in ['+=', '-=', '+', '-', '*', '/', '%', '<','>', '<=', '>=', '=']:
        return dataType == INT_TYPE
    return dataType == BOOL_TYPE

class MyVisitor(SimpleCodeVisitor):
    def __init__(self, lexer, fWrite):
        self.table = {}
        self.funcTable = {}
        self.arrayTable = {}
        self.lexer = lexer
        self.fWrite = fWrite

    def printError(self, ctx, errorMsg, *args):
        if ctx is not None:
            self.fWrite.write('Error at line {0}, column {1} : {2}'.format(ctx.start.line, ctx.start.column, errorMsg.format(*args)))
        else:
            self.fWrite.write('Error at line 0, column 0 : {0}'.format(errorMsg.format(*args)))

    def visitProgram(self, ctx:SimpleCodeParser.ProgramContext):
        return self.visitChildren(ctx)


    def visitField_decl(self, ctx:SimpleCodeParser.Field_declContext):
        dataType = ctx.DATA_TYPE().getText()
        for i in range(ctx.getChildCount()):
            child = ctx.getChild(i)
            if (not isinstance(child, TerminalNodeImpl)) and (child.getText().strip() != ''):
                id = self.visit(child).getText()
                if id in self.table:
                    if self.table[id] != dataType:
                        self.printError(ctx, ERROR_DUPLICATE_VAR_DEFINE, id, self.table[id])
                else:
                    self.table[id] = dataType


    def visitMethod_decl(self, ctx:SimpleCodeParser.Method_declContext):
        declarationType = ctx.method_decl_type().getText()
        methodName = ctx.IDENTIFIER().getText()
        if (ctx.method_params()):
            self.funcTable[methodName] = self.visit(ctx.method_params())
        else:
            self.funcTable[methodName] = []

        if methodName in self.table:
            if self.table[methodName] != declarationType:
                self.printError(ctx, ERROR_DUPLICATE_VAR_DEFINE, methodName, self.table[methodName])
        else:
            self.table[methodName] = declarationType
        
        listReturned = self.visit(ctx.block())

        for child in listReturned:
            returnType = VOID
            if len(child.expr()) > 0:
                returnType = self.visit(child.expr()[0])
            if returnType != declarationType:
                if declarationType == VOID:
                    self.printError(child, ERROR_VOID_RETURN_DATA_TYPE, methodName, returnType)
                elif returnType == VOID:
                    self.printError(child, ERROR_FUNCTION_RETURN_EMPTY, methodName, declarationType)
                else:
                    self.printError(child, ERROR_FUNCTION_RETURN_WRONG_TYPE, methodName, declarationType, returnType)


    def visitMethod_params(self, ctx:SimpleCodeParser.Method_paramsContext):
        listParams = [id.getText() for id in ctx.DATA_TYPE()]
        # print(ctx.DATA_TYPE())
        return listParams

    def visitVariable(self, ctx:SimpleCodeParser.VariableContext):
        if ctx.IDENTIFIER() is not None:
            return ctx.IDENTIFIER()
        return self.visitChildren(ctx)
    
    def visitArray_decl(self, ctx:SimpleCodeParser.Array_declContext):
        # if ctx.INTLITERAL() == '':
        if isinstance(ctx.INTLITERAL(), ErrorNodeImpl):
            self.printError(ctx, ERROR_ARRAY_LENGTH_NOT_DEFINED, ctx.IDENTIFIER().getText())
        elif ctx.INTLITERAL().getText() == '0':
            self.printError(ctx, ERROR_ARRAY_ZERO_LENGTH, ctx.IDENTIFIER().getText())
        else:
            # Everything ok
            self.arrayTable[ctx.IDENTIFIER().getText()] = int(ctx.INTLITERAL().getText())
        return ctx.IDENTIFIER()

    def visitAssign_statement(self, ctx:SimpleCodeParser.Assign_statementContext):
        lhs = self.visit(ctx.location())
        op = ctx.assign_op().getText()
        rhs = self.visit(ctx.expr())
        
        if not self.table.get(lhs):
            self.printError(ctx, ERROR_VAR_NOT_DEFINED, lhs)
            return
        
        if not checkTypeCompatible(op, self.table[lhs]):
            self.printError(ctx, ERROR_DATA_TYPE_NOT_COMPATIBLE_OPERATOR, self.table[lhs], op)
            return

        if (rhs in [INT_TYPE, BOOL_TYPE]) and (not checkTypeCompatible(op, rhs)):
            self.printError(ctx, ERROR_DATA_TYPE_NOT_COMPATIBLE_OPERATOR, rhs, op)
            return

        lhsType = self.table.get(lhs)
        rhsType = rhs

        if rhsType not in [INT_TYPE, BOOL_TYPE]:
            rhsType = self.table.get(rhs)

        if not rhsType:
            self.printError(ctx, ERROR_VAR_NOT_DEFINED, rhs)
            return
        
        if lhsType != rhsType:
            self.printError(ctx, ERROR_DATA_TYPE_DIFFERENT, lhsType, rhsType)
        
        rhsArrayCheck = self.arrayTable.get(rhs)
        if rhsArrayCheck:
            arrayType = ARRAY_TYPE.format(self.table[rhs])
            self.printError(ctx, ERROR_RHS_IS_ARRAY, arrayType)        
        
    def visitLiteral(self, ctx:SimpleCodeParser.LiteralContext):
        if (ctx.INTLITERAL()):
            return INT_TYPE
        if (ctx.BOOLEANLITERAL()):
            return BOOL_TYPE
        return self.visitChildren(ctx)

    def visitLocation(self, ctx:SimpleCodeParser.LocationContext):
        varName = ctx.IDENTIFIER().getText()
        # Check if Array
        if ctx.expr():
            arrSize = self.arrayTable.get(varName)

            if not arrSize:
                # Not array!
                self.printError(ctx, ERROR_VAR_IS_NOT_ARRAY, varName)
                return varName

            idxType = self.visit(ctx.expr())

            if idxType not in [INT_TYPE, BOOL_TYPE, None]:
                idxType = self.table.get(idxType)
            
            
            if not idxType:
                self.printError(ctx, ERROR_ARRAY_INDEX_UNDEFINED, varName)
            elif idxType != INT_TYPE:
                self.printError(ctx, ERROR_ARRAY_INDEX_TYPE, varName, idxType)
            else:
                idx = int(ctx.expr().getText())
                if idx >= arrSize:
                    self.printError(ctx, ERROR_ARRAY_INDEX_OUT_OF_RANGE, varName, arrSize, idx)
        return varName

    def visitMethod_call(self, ctx:SimpleCodeParser.Method_callContext):
        if ctx.CALLOUT() is None:
            funcName = ctx.method_name().getText()
            if not self.table.get(funcName):
                self.printError(ctx, FUNCTION_NOT_DEFINED, funcName)
                return None
            if not self.funcTable.get(funcName):
                self.printError(ctx, ERROR_VAR_EXCUTE_AS_FUNCTION, funcName)
                return None

            listParams = []
            if ctx.method_call_params():
                listParams = self.visit(ctx.method_call_params())
            
            if listParams is not None:
                requiredParams = self.funcTable[funcName]
                if requiredParams != listParams:            
                    self.printError(ctx, FUNCTION_PARAMS_MISMATCHED, funcName, requiredParams, listParams)            
                   
            return self.table.get(funcName)

    def visitExpr(self, ctx:SimpleCodeParser.ExprContext):
        if (ctx.location()):
            return self.visit(ctx.location())
        if (ctx.literal()):
            return self.visit(ctx.literal())
        if (ctx.method_call()):
            return self.visit(ctx.method_call())

        return self.visitChildren(ctx)

    def visitMethod_call_params(self, ctx:SimpleCodeParser.Method_call_paramsContext):
        listParams = []
        for _ in ctx.expr():
            id = self.visitExpr(_)

            if id in [INT_TYPE, BOOL_TYPE]:
                listParams.append(id)
                continue

            if not self.table.get(id):
                self.printError(ctx, ERROR_VAR_NOT_DEFINED, id)
                return None
            listParams.append(self.table[id])

        return listParams

    def visitBlock(self, ctx:SimpleCodeParser.BlockContext):
        self.visitChildren(ctx)
        listReturned = []
        for _ in ctx.statement():
            if _.RETURN() is not None:
                listReturned.append(_)
        return listReturned
    
    def visitStatement(self, ctx:SimpleCodeParser.StatementContext):
        if (ctx.IF()):
            idx = self.visit(ctx.expr()[0])
            if idx not in [INT_TYPE, BOOL_TYPE, None]:
                idx = self.table.get(idx)
            if idx != BOOL_TYPE:
                self.printError(ctx, ERROR_IF_CONDITION_MUST_BE_BOOLEAN, idx)
    
        if (ctx.FOR()):
            idx = ctx.IDENTIFIER()

            if idx is None:
                self.printError(ctx, ERROR_MISSING_IDENTIFIER_FOR)
                return self.visitChildren(ctx)
                
            idx = idx.getText()
            idxType = self.table.get(idx)
            if idxType not in [INT_TYPE, None]:
                self.printError(ctx, ERROR_ITERATOR_LOOP_NOT_INT, idxType)
            else:
                isArray = self.arrayTable.get(idx)
                if isArray:
                    self.printError(ctx, ERROR_ITERATOR_LOOP_NOT_INT, ARRAY_TYPE.format(idxType))
            
            listForParams = ctx.expr()
            if len(listForParams) != 2:
                self.printError(ctx, ERROR_PARAMS_FOR, len(listForParams) + 1)
                return self.visitChildren(ctx)
            
            initValueType = self.visit(listForParams[0])
            if initValueType != INT_TYPE:
                self.printError(ctx, ERROR_INIT_VALUE_FOR, initValueType)
                
            finalValueType = self.visit(listForParams[1])
            if finalValueType != INT_TYPE:
                self.printError(ctx, ERROR_FINAL_VALUE_FOR, finalValueType)
                

        return self.visitChildren(ctx)

def main(argv):
    input_stream = FileStream(argv[1])
    lexer = SimpleCodeLexer(input_stream)
    stream = CommonTokenStream(lexer)
    parser = SimpleCodeParser(stream)
    parser._listeners = [MyErrorListener()]
    tree = parser.program()
    visitor = MyVisitor(lexer, fWrite)
    visitor.visit(tree)
    # Check for main method
    if not visitor.table.get('main'):
        visitor.printError(None, MAIN_METHOD_IS_NOT_AVAILABLE)
    # flattenTree(tree, lexer)
    print(visitor.table)
    print(visitor.funcTable)
    print(visitor.arrayTable)
if __name__ == '__main__':
    main(sys.argv)
