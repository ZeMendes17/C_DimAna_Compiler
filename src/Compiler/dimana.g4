grammar dimana;

// see if necessary

// @parser::header {
// import java.util.Map;
// import java.util.HashMap;
// import java.util.List;
// }

// @parser::members { // first is variable name, second are types (maybe) ex: l, [meter, inch]
// // or v, [meter/time]
// static protected Map<String,List<String>> typeTable = new HashMap<>();
// }

program: statList EOF;

statList: (statement? ';')*;

statement: 
     inputStatement
    | assignment
    | variableDeclaration
    | outputStatement
    | loopStatement
    | headerFile
    | prefixUnit
    | unit
    //| dimension
    | alternativeUnit
    | listDeclaration
    ;

variableDeclaration: dataType ID ('=' expression)?;

assignment: ID '=' expression;

inputStatement: ID '=' dataType? '('? 'read' STRING ')'? ('*' ID)?;
// fiz umas alterações aqui, para também apanhar casos deste tipo -> name = read "Name: ";

//outputStatement:  write_expr expression   ;
outputStatement: write_expr outputFormat (',' outputFormat)*;
outputFormat: 'string' '(' (  ID | STRING | expression ) ',' INT ')' | STRING | ID;

write_expr: 'write' | 'writeln';

loopStatement: 'for' ID '=' (INT | ID) 'to' (INT | ID | length '(' ID ')') 'do' ((expression ';')* ) 'end';

length : 'length';

headerFile: 'use' STRING;

prefixUnit: 'prefix' dataType ID '=' (INT |  '1e' minus='-'? INT);

/* dimension: 'dimension' dataType ID defDimension;

defDimension
    :   ('[' ID (',' ID)? ']')                     #independentUnit         
    |   ( ('[' ID (',' ID)? ']')? '=' expression)  #dependantUnit
    |   ('=' expression)                           #derivedUnit
    ; */

unit
    : 'dimension' dataType ID ('[' ID (',' ID)? ']')                     #independentUnit         
    | 'dimension' dataType ID ( ('[' ID (',' ID)? ']')? '=' expression)  #dependantUnit
;

// unit: 'dimension' dataType ID ('[' ID (',' ID)? ']' ('=' expression)? | '=' expression);

alternativeUnit: 'unit' ID '[' ID (',' ID)? ']' '=' expression;

listDeclaration: 'list' '[' dataType ']' ID ('=' 'new' 'list' '[' dataType ']')?;


expression
    : 'read' STRING                                         # InputExpression
    | castTypes? '('?'read' STRING ')'? ('*'ID)? '>>' ID    # InputTypeExpression
    | 'string' '(' (STRING | ID) ',' INT ')'                # StringAssignExpression
    | expression op=('*' | '/') expression                  # MulDivExpression
    | expression op=('+' | '-') expression                  # AddSubExpression
    | '(' expression ')'                                    # ParenExpression
    | outputStatement                                       # OutputExpression
    | expression ',' expression                             # ExprListExpression
    | ID '[' ID ']'                                         # IndexExpression
    | ID                                                    # IdExpression
    | dataType '(' expression ')'                           # TypeConversion
    | REAL                                                  # RealLiteral
    | INT                                                   # IntLiteral
    | STRING                                                # StringLiteral
    ;

dataType: 'integer' | 'real' | 'string' | 'list' '[' ID ']' | ID;
castTypes : 'integer' | 'real';

ID: [a-zA-Z_][a-zA-Z0-9_]*;
INT: [0-9]+;
REAL: [0-9]* '.' [0-9]+;
STRING: '"' .*? '"';

WS: [ \t\r\n]+ -> skip;
LINE_COMMENT: '#' ~[\r\n]* -> skip;
ERROR: .;