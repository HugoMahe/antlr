// define a grammar called syntaxSat
grammar SyntaxSat;


@header {
// antlr exo3
}

commandes : Commande*;

Commande : Instruction ';';

Instruction : ( AppelMethode | Assignement );

AppelMethode : Variable'.'[a-zA-Z]+'('Parametres');';

Declaration : 'new' [a-zA-Z]+'('Parametres');';

Parametres : (( Parametre',')* Parametre | Parametre | None);

Parametre : ( Variable | Champ | Valeur | Declaration | AppelMethode ); 

Assignement : PG '=' PD ;  

PG : ( Variable | Champ );

PD : (Variable | Champ | Declaration | AppelMethode | Valeur);

Variable : [a-zA-Z]+ ; 

Champ : Variable'.'[a-zA-Z]+;

Valeur : [0-9]+;

WS  : [ \t\r\n]+ -> skip ;

None : ' ';