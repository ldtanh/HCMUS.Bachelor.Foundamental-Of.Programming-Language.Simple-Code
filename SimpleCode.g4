grammar SimpleCode;

program:
	CLASS SPACE+ PROGRAM SPACE+ '{' ' '* field_decl* method_decl* ' '* '}';
field_decl: DATA_TYPE SPACE+ variable (',' variable)*? ';';
method_decl:
	method_decl_type SPACE+ IDENTIFIER '(' method_params? ')' ' '* block;
method_decl_type: VOID | DATA_TYPE;
variable: array_decl | IDENTIFIER ;
array_decl: IDENTIFIER '[' INTLITERAL ']' ;
method_params:
	DATA_TYPE SPACE+ IDENTIFIER (',' DATA_TYPE ' ' IDENTIFIER)*;
block: '{' (var_decl | statement)* '}';
var_decl: DATA_TYPE SPACE+ variable (',' variable)* ';';
statement:
	location ' '* assign_op ' '* expr ';' ' '*
	| method_call
	| IF ' '* '(' expr ')' ' '* block (ELSE ' '* block)?
	| FOR ' '* IDENTIFIER ' '* '=' ' '* expr ' '* ',' ' '* expr ' '* block
	| RETURN ' '* (expr)? ';'
	| BREAK ' '* ';'
	| CONTINUE ' '* ';'
	| block;
assign_op: '=' | '+=' | '-=';
method_call:
	method_name '(' method_call_params? ')' ';'
	| CALLOUT SPACE+ (
		STRINGLITERAL (' '* ',' callout_arg (',' callout_arg)*)?
	);
method_call_params:
	IDENTIFIER (',' ' '* IDENTIFIER)*;
DATA_TYPE: INT | BOOLEAN;
method_name: IDENTIFIER;
location: IDENTIFIER | (IDENTIFIER '[' expr ']');
expr:
	location
	| method_call
	| literal
	| expr ' '* bin_op ' '* expr
	| '-' expr
	| '!' expr
	| '(' expr ')';
callout_arg: expr | STRINGLITERAL;

bin_op: arith_op | rel_op | eq_op | cond_op;
arith_op: '+' | '-' | '*' | '/' | '%';
rel_op: '<' | '>' | '<=' | '>=';
eq_op: '==' | '!=';
cond_op: '&&' | '||';

SPACE: ' ';
TAB: '\t';

CLASS: 'class';
PROGRAM: 'Program';
VOID: 'void';
TRUE: 'true';
FALSE: 'false';
IF: 'if';
ELSE: 'else';
FOR: 'for';
BREAK: 'break';
CONTINUE: 'continue';
RETURN: 'return';
CALLOUT: 'callout';
INT: 'int';
BOOLEAN: 'boolean';

literal: INTLITERAL | CHARLITERAL | BOOLEANLITERAL;
BOOLEANLITERAL: TRUE | FALSE;
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
