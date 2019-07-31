grammar SimpleCode;

program:
	CLASS SPACE+ PROGRAM SPACE+ '{' SPACE* field_decl* method_decl* SPACE* '}';
field_decl: DATA_TYPE SPACE+ variable (',' variable)*? ';' SPACE*;
method_decl:
	method_decl_type SPACE+ IDENTIFIER '(' method_params? ')' SPACE* block;
method_decl_type: VOID | DATA_TYPE;
variable: array_decl | IDENTIFIER ;
array_decl: IDENTIFIER '[' INTLITERAL ']' ;
method_params:
	DATA_TYPE SPACE+ IDENTIFIER (',' DATA_TYPE ' ' IDENTIFIER)*;
block: '{' (var_decl | statement)* '}';
var_decl: DATA_TYPE SPACE+ variable (',' variable)* ';';
statement:
	location SPACE* assign_op SPACE* expr ';'
	| method_call
	| IF SPACE* '(' expr ')' SPACE* block (ELSE SPACE* block)?
	| FOR SPACE* IDENTIFIER SPACE* '=' SPACE* expr SPACE* ',' SPACE* expr SPACE* block
	| RETURN SPACE* (expr)? ';'
	| BREAK SPACE* ';'
	| CONTINUE SPACE* ';'
	| block;
assign_op : '=' | '+=' | '-=';
method_call:
	method_name '(' method_call_params? ')' ';'
	| CALLOUT SPACE* '(' SPACE* (
		STRINGLITERAL SPACE* (',' SPACE* callout_arg (',' callout_arg)*)? ')' SPACE* ';' SPACE*
	);
method_call_params:
	IDENTIFIER (',' SPACE* IDENTIFIER)*;
DATA_TYPE: INT | BOOLEAN;
method_name: IDENTIFIER;
location: IDENTIFIER | (IDENTIFIER '[' expr ']');
expr:
	location
	| method_call
	| literal
	| expr SPACE* BINARY_OP SPACE* expr
	| '-' expr
	| '!' expr
	| '(' expr ')';
callout_arg: expr | STRINGLITERAL;

BINARY_OP: ARITH_OP | REL_OP | EQ_OP | COND_OP;
ARITH_OP: '+' | '-' | '*' | '/' | '%';
REL_OP: '<' | '>' | '<=' | '>=';
EQ_OP: '==' | '!=';
COND_OP: '&&' | '||';

SPACE: ' ';
TAB: '\t';

CLASS: 'class';
PROGRAM: 'Program';
VOID: 'void';
IF: 'if';
ELSE: 'else';
FOR: 'for';
BREAK: 'break';
CONTINUE: 'continue';
RETURN: 'return';
CALLOUT: 'callout';
INT: 'int';
BOOLEAN: 'boolean';

literal: INTLITERAL | CHARLITERAL | BOOLEANLITERAL | STRINGLITERAL;
BOOLEANLITERAL: 'true' | 'false';
IDENTIFIER: ALPHA (ALPHA | DIGIT)*;
INTLITERAL: DECIMALLITERAL | HEXLITERAL;
DECIMALLITERAL: DIGIT DIGIT*;
HEXLITERAL: '0x' HEX_DIGIT+;
CHAR: ~['\\\r\n] | '\\' ['"?abfnrtv\\];
CHARLITERAL: '\'' CHAR '\'';
STRINGLITERAL: '"' CHAR* '"';

DIGIT: [0-9];
ALPHA: [a-zA-Z_];
HEX_DIGIT: [0-9a-fA-F];

White: [ \t]+ -> skip;
Newline: ( '\r' '\n'? | '\n') -> skip;
LineComment: '//' ~[\r\n]* -> skip;
BlockComment: '/*' .*? '*/' -> skip;

ERROR : . ;