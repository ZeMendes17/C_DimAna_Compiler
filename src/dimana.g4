grammar dimana;

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
    | alternativeUnit
    | listDeclaration
    ;

variableDeclaration: dataType ID ('=' expression)?;

assignment: ID '=' expression;

inputStatement: ID '=' dataType? '('? 'read' STRING ')'? ('*' ID)?;
// fiz umas alterações aqui, para também apanhar casos deste tipo -> name = read "Name: ";

outputStatement:  write_expr expression;

write_expr: 'write' | 'writeln';

loopStatement: 'for' ID '=' (INT | ID) 'to' (INT | ID | 'length' '(' ID ')') 'do' ((expression ';')* | statList) 'end';

// expressionList: expression (',' expression)*;

headerFile: 'use' STRING;

prefixUnit: 'prefix' dataType ID '=' (INT |  '1e' minus='-'? INT);

unit: 'dimension' dataType ID ('[' ID (',' ID)? ']' ('=' expression)? | '=' expression);

alternativeUnit: 'unit' ID '[' ID (',' ID)? ']' '=' expression;

listDeclaration: 'list' '[' dataType ']' ID ('=' 'new' 'list' '[' dataType ']')?;


expression
    : 'read' STRING                                     # InputExpression
    | 'string' '(' (STRING | ID) ',' INT ')'            # StringAssignExpression
    | expression ('*' | '/') expression                 # MulDivExpression
    | expression ('+' | '-') expression                 # AddSubExpression
    | '(' expression ')'                                # ParenExpression
    | expression ',' expression                         # ExprListExpression
    | expression '>>' ID                                #AddListExpression
    | ID '[' ID ']'                                     #IndexExpression
    | ID                                                # IdExpression
    | dataType '(' expression ')'                       # TypeConversion
    | REAL                                              # RealLiteral
    | INT                                               # IntLiteral
    | STRING                                            # StringLiteral
    ;

dataType: 'integer' | 'real' | 'string' | 'list' '[' ID ']' | ID;

ID: [a-zA-Z_][a-zA-Z0-9_]*;
INT: [0-9]+;
REAL: [0-9]* '.' [0-9]+;
STRING: '"' .*? '"';

WS: [ \t\r\n]+ -> skip;
LINE_COMMENT: '#' ~[\r\n]* -> skip;
ERROR: .;