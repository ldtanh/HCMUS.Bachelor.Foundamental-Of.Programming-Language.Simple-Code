grammar BaiTap1;           
program : 'class Program {' decl* '}';
decl : field_decl | method_decl ;
variable : id | id '[' int_literal ']' ;
field_decl : type ' ' variable (',' variable)*    ';' ;
method_decl: (type | 'void') id (type id (',' type id)*) block ;
block : '{' var_decl* statement* '}' ;
var_decl : type id (',' id)* ;
type : 'int' | 'boolean';
statement : (location assign_op expr | method_call | 'if' (expr) block ('else' block)? | 'for' id = expr',' expr block | return (expr)? | 'break' | 'continue' | block) ';' ;
assign_op : '=' | '+=' | '-=' ;
method_name : id ;
location : id | id '[' expr ']' ;
expr : location | method_call | literal | expr bin_op expr | '-' expr | '!' expr | (expr) ;
callout_arg : expr | string_literal ;
bin_op : arith_op | rel_op | eq_op | cond_op ;
arth_op : '+' | '-' | '*' | '/' + '%' ;
rel_op : '<' | '>' | '<=' | '>=' ;
eq_op : '==' | '!=' ;
cond_op : '&&' | '||' ;
literal : int_literal | char_literal | bool_literal ;
id : ALPHA alpha_num* ;
alpha_num : ALPHA | DIGIT ;
ALPHA : [a-zA-Z] ;
DIGIT : [0-9] ;
HEX_DIGIT : [0-9a-fA-F] ;
int_literal : decimal_literal | hex_literal ;
decimal_literal : DIGIT DIGIT* ;
hex_literal : '0x' HEX_DIGIT HEX_DIGIT* ;
bool_literal : 'true' | 'false' ;
char: . ;
char_literal : '\'' char '\''  ;
string_literal : '"' char* '"' ;

SPACES : [ \t]+ ;

COMMENT : '//' ~[\r\n\f]*;

SKIP : ( SPACES | COMMENT ) -> skip ;
