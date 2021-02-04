// define a grammar called hello
grammar Hello2;

@header {
// antlr exo2
}

schedule : day_activity* ;

day_activity : day ':' (activity+ | none) ;

day : ID ;

activity : (sleeping | meeting | practice ) ';' ;

sleeping : 'Sleeping' NB;

practice : 'Practice' ID NB ;

meeting  : 'Meeting' ID ;

none : 'None';

NB  : [0-9]+ ; 
ID  : [a-zA-Z]+ ;
WS  : [ \t\r\n]+ -> skip ;

// lundi : Sleeping 10; Practice swimming 1; Meeting John;
// mardi : Sleeping 7; Practice running 2; Meeting Bill;