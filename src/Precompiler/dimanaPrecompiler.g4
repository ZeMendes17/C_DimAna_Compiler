grammar dimanaPrecompiler;


program: statement* EOF;

statement: preprocessorDirective | code;

preprocessorDirective: 'use' SPACE? filename (SYMBOLS | SPACE)* NEWLINE;
code: LETTER | SYMBOLS | STRING | SPACE | NEWLINE;

filename: STRING;

STRING: '"' ~["]* '"';
SYMBOLS: [\u0021-\u007E];
LETTER: [a-zA-Z];
// WS: [ \t\r\n] -> skip;
SPACE: [ \t\r];
NEWLINE: [\n];
