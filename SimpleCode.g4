grammar SimpleCode;           
program  : 'class' 'Program' '{'  field_decl* method_decl*  '}' ;
field_decl : Data_type ' ' variable (',' variable)* ';' ;
method_decl: method_decl_type ' ' IDENTIFIER '(' method_params? ')' block ;
method_decl_type: 'void' | Data_type ;
variable : IDENTIFIER | IDENTIFIER '[' INTLITERAL ']' ;
method_params : Data_type IDENTIFIER (',' Data_type IDENTIFIER)* ;
block : '{' var_decl* statement* '}' ;
var_decl : Data_type IDENTIFIER (',' IDENTIFIER)* ';';
statement : location assign_op expr ';' | method_call ';' | 'if' '(' (expr) ')' block ('else' block)? | 'for' IDENTIFIER '=' (expr) ',' (expr) block | 'return' (expr)? ';' | 'break' ';' | 'continue' ';' | block ;
assign_op : '=' | '+=' | '-=' ;
method_call : method_name '(' method_call_params? ')' | 'callout' (STRINGLITERAL (',' callout_arg (',' callout_arg)*)?) ;
method_call_params : Data_type IDENTIFIER (',' Data_type IDENTIFIER)* ;
Data_type : 'int' | 'boolean' ;
method_name : IDENTIFIER ;
location : IDENTIFIER | IDENTIFIER '[' expr ']' ;
expr : location | method_call | literal | expr bin_op expr | '-' expr | '!' expr | '(' expr ')' ;
callout_arg : expr | STRINGLITERAL ;
bin_op : arith_op | rel_op | eq_op | cond_op ;
arith_op : '+' | '-' | '*' | '/' + '%' ;
rel_op : '<' | '>' | '<=' | '>=' ;
eq_op : '==' | '!=' ;
cond_op : '&&' | '||' ;
literal : INTLITERAL | CHARLITERAL | BOOLEANLITERAL ;
IDENTIFIER : ALPHA (ALPHA | DIGIT)* ;
INTLITERAL : Decimal_Literal | Hex_Literal ;
Decimal_Literal : DIGIT DIGIT* ;
Hex_Literal : '0x' HEX_DIGIT+ ;
CHAR: . ;
CHARLITERAL : '\'' CHAR '\''  ;
STRINGLITERAL : '"' CHAR* '"' ;

ALPHA : [a-zA-Z] ;
DIGIT : [0-9] ;
HEX_DIGIT : [0-9a-fA-F] ;
BOOLEANLITERAL : 'true' | 'false' ;

White : [ \t]+ -> skip ;
Newline : ( '\r' '\n'? | '\n' ) -> skip ;
LineComment : '//' ~[\r\n]* -> skip ;