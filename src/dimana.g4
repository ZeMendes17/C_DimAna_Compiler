grammar dimana;

// Lexer rules


// Parser rules
program: statement*;

statement: dimensionDefinition | unitDefinition | dataTypeDefinition | expr | printStatement | readStatement | conversion | listAppend | listAccess | loop | include | assignment | comparison;
dimensionDefinition: 'dimension' ID ('=' dimensionExpression)? ';';
dimensionExpression: dimensionTerm ('*'|'/' dimensionTerm)*;
dimensionTerm: ID ('^' INTEGER)?;
unitDefinition: 'unit' ID 'for' ID ('=' expr)? ';';
dataTypeDefinition: ('integer' | 'real' | 'text' | 'list') ID ';';

expr:
      '-' expr
    | '+' expr
    | expr '+' expr
    | expr '-' expr
    | expr '*' expr
    | expr '/' expr
    | expr '^' expr
    | ID
    | INTEGER
    | REAL
    | TEXT
    | listCreation
    | '(' expr ')'
    ;

listCreation: '[' expr (',' expr)* ']';

printStatement: 'print' expr ';';
readStatement: 'read' ID ';';
conversion: ID '(' expr ')';

listAppend: ID '.' 'append' '(' expr ')' ';';
listAccess: ID '[' expr ']';
loop: 'loop' ID 'from' expr 'to' expr statement* 'endloop' ';';
include: 'include' STRING ';';
assignment: ID '=' expr ';';
comparison: expr ('=='|'!='|'>'|'<'|'>='|'<=') expr;

// Lexer rules
ID: [a-zA-Z][a-zA-Z0-9_]*;
STRING: '"' ~'\n'* '"';

INTEGER: '-'? DIGIT+;
REAL: '-'? DIGIT+ '.' DIGIT+;
DIGIT: [0-9];
TEXT: '"' ~'"'* '"';
WS: [ \t\r\n]+ -> skip;
COMMENT: '//' ~('\n'|'\r')* '\r'? '\n' -> skip;