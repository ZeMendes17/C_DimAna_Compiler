grammar dimana;

program: statement* EOF;

statement: 
      variableDeclaration
    | assignment
    | inputStatement
    | outputStatement
    | loopStatement
    ;

variableDeclaration: dataType ID ('=' expression)? ';';

assignment: ID '=' expression ';';

inputStatement: ID '=' dataType '(' 'read' STRING ')' '*'? ID ';';

outputStatement: ('write' | 'writeln') expressionList ';';

loopStatement: 'for' ID '=' INT 'to' INT 'do' statement* 'end' ';';

expressionList: expression (',' expression)*;

expression
    : expression ('*' | '/') expression # MulDivExpression
    | expression ('+' | '-') expression # AddSubExpression
    | '(' expression ')'                # ParenExpression
    | ID                                # IdExpression
    | dataType '(' expression ')'       # TypeConversion
    | REAL                              # RealLiteral
    | INT                               # IntLiteral
    | STRING                            # StringLiteral
    ;

dataType: 'integer' | 'real' | 'string' | 'list' '[' ID ']' | ID;

ID: [a-zA-Z_][a-zA-Z0-9_]*;
INT: [0-9]+;
REAL: [0-9]* '.' [0-9]+;
STRING: '"' .*? '"';

WS: [ \t\r\n]+ -> skip;
LINE_COMMENT: '#' ~[\r\n]* -> skip;
