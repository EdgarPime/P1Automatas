package analizador;
import static analizador.Token.*;
%%
%class Lexer
%type Token


L = [a-zA-Z_]
D = [0-9]

//TOKEN PARA SIGNOS DE PUNTUACION
PUNTOYCOMA=(";")
DOLAR=("$")
PUNTO=(".")
COMA=(",")
DOSPUNTOS=(";")
PARENIZQ=("(")
PARENDER=(")")
LLAVEIZQ=("{")
LLAVEDER=("}")
CORCHIZQ=("[")
CORCHDER=("]")
AMPERSAN=("&")
PUNTUACION={PUNTO}{COMA}

//TOKEN PARA OPERADORES
OPERASIGNACION=("=")
OPERARITMETICO=("+")|("*")|("-")|("/")|("%")|("**")
OPERCOMBINADO_ARIT=("+=")|("-=")|("*=")|("/=")|("**=")|("%=")
OPERCOMBINADO_CAD=(".=")
OPERCOMPARACION=("==")|("===")|("!=")|("<>")|("!==")|("<")|(">")|("<=")|(">=")|("<=>")
OPERINCDEC=("++")|("--")
OPERLOGICO=("and")|("xor")|("or")|("&&")|("||")
OPERLOGNOT=("!")
OPERSIG_ARRAY=("=>")

//TOKEN PARA ESTRUCTURAS CONTROL
IF=("if")
ELSE=("else")
WHILE=("while")
ENDWHILE=("endwhile")
FOR=("for")
SWITCH=("switch")
CASE=("case")
ENDSWITCH=("endswitch")
BREAK=("break")
CONTINUAR=("continue")
DEFAULT=("default")

//TOKEN PARA PALABRAS RESERVADAS
INICIO =("<?php")
FIN = ("?>")
ECHO = ("echo")
GLOBAL= ("global")
STATIC= ("static")
CONST= ("const")
PRINT= ("print")
FUNCTION= ("function")
RETURN= ("return")
NULL= ("null"|"NULL")

//TOKEN PARA CLASES Y OBJETIVOS
CLASS= ("class")
PUBLIC= ("public")
PROTECTED= ("protected")
PRIVATE= ("private")
NEW= ("new")
EXTENDS= ("extends")

//TOKENS ESPECIALES
CADENA= {WHITE}*(((("'").*("'"))|((\").*(\")))){WHITE}*
ENTERO= {WHITE}*[0-9]*{WHITE}*
REAL= {WHITE}*[0-9]+(".")[0-9]+{WHITE}*
IDENTIFICADOR= {WHITE}*[a-zA-Z_\x7f-\xff][a-zA-Z0-9_\x7f-\xff]*{WHITE}*

//PRINCIPALES//////////////////////////////////////////////////////////////////

BLOQUELOCAL=({EXPRESIONLOCAL}|{EXPRESIONGLOBAL}|{SENTENCIAS}|{FUNCIONES}|{LLAMADAFUNCION}{PUNTOYCOMA}|{CLASE})*

SENTENCIAS=({SENTENCIAIF}|{SENTENCIAWHILE}|{SENTENCIADOWHILE}|{SENTENCIAFOR}|{SENTENCIASWITCH})

//TOKEN DECLARACIONES VARIABLE///////////////////////////

VARIABLE= ({WHITE}*{DOLAR}{IDENTIFICADOR}{WHITE}*)
CONSTANTE= ({WHITE}*{CONST}{IDENTIFICADOR}{WHITE}*)
TIPOVARIABLE=({GLOBAL}{WHITE}*)|({STATIC}?{WHITE}*({PUBLIC}|{PROTECTED}|{PRIVATE})?){WHITE}*



//DECLARACION DE ESTRUCTURAS////////////////////////////////////////

SENTENCIAIF={IF}{PARENIZQ}{COMPARACION}{PARENDER}{LLAVEIZQ}{BLOQUELOCAL}({BREAK}{PUNTOYCOMA})?{LLAVEDER}({SENTENCIAELSE})?

SENTENCIAELSE={ELSE}{LLAVEIZQ}{BLOQUELOCAL}({BREAK}{PUNTOYCOMA})?{LLAVEDER}

SENTENCIAWHILE={WHILE}{PARENIZQ}{COMPARACION}{PARENDER}({LLAVEIZQ}{BLOQUELOCAL}({BREAK}{PUNTOYCOMA})?{LLAVEDER}
    |{DOSPUNTOS}{BLOQUELOCAL}({BREAK}{PUNTOYCOMA})?{ENDWHILE}{PUNTOYCOMA}

SENTENCIADOWHILE={DO}{LLAVEIZQ}{BLOQUELOCAL}({BREAK}{PUNTOYCOMA})?{LLAVEDER}{WHILE}{PARENIZQ}{COMPARACION}{PARENDER}{PUNTOYCOMA}

COMPARACION= {VARIABLE}{OPERCOMPARACION}({VARIABLE}|{CADENA}|{ENTERO}|{REAL})({OPERLOGICO}{VARIABLE}{OPERCOMPARACION}({VARIABLE}|{CADENA}|{ENTERO}|{REAL}))*
|({OPERLOGNOT})?{VARIABLE}



//DECLARACION DE EXPRESIONES/////////////////////////

EXPRESIONGLOBAL= (({VARIABLE}{OPERASIGNACION}{WHITE}*)+({CADENA}
|({VARIABLE}|{ENTERO}|{REAL})({OPERARITMETICO}({VARIABLE}|{ENTERO}|{REAL}))*){PUNTOYCOMA})
|{VARIABLE}({COMA}{VARIABLE})*{PUNTOYCOMA}
| {CONSTANTE}{OPERASIGNACION}{WHITE}*({CADENA}|{ENTERO}|{REAL}){PUNTOYCOMA}
|({ECHO}{WHITE}*(({VARIABLE}|{ENTERO}|{REAL})({OPERARITMETICO}({VARIABLE}|{ENTERO}|{REAL}))* 
    |{CADENA}({PUNTO}({VARIABLE}|{CADENA}))?){PUNTOYCOMA})

EXPRESIONLOCAL= ({TIPOVARIABLE}{WHITE}*{VARIABLE}{OPERASIGNACION})+(
    {CADENA}
    |({VARIABLE}|{ENTERO}|{REAL})({OPERARITMETICO}({VARIABLE}|{ENTERO}|{REAL}))*){PUNTOYCOMA}
|{TIPOVARIABLE}{VARIABLE}({COMA}{VARIABLE})*{PUNTOYCOMA}



//FUNCIONES/////////////////////////////////

FUNCIONES={TIPOVARIABLE}{FUNCTION}{IDENTIFICADOR}{PARENIZQ}

ARGUMENTOS=({AMPERSAND})?{VARIABLE}({COMA}({AMPERSAND})?{VARIABLE}|{OPERASIGNACION}({REAL}|{ENTERO}|{CADENA}|{NULL}))*

FUNCIONANONIMA={FUNCTION}{PARENIZQ}({ARGUMENTOS})?{PARENDER}{LLAVEIZQ}{BLOQUELOCAL}({DEVOLVERVALORES})?{LLAVEDER}

DEVOLVERVALORES={RETURN}(({VARIABLE}|{ENTERO}|{REAL})({OPERARITMETICO}({VARIABLE}|{ENTERO}|{REAL}))*
    |{CADENA}){PUNTOYCOMA}



//LLAMADA FUNCION//////////////////////////////////////////////////////////////////////

LLAMADAFUNCION={IDENTIFICADOR}{PARENIZQ}({PASARARGUMENTOS})?{PARENDER}

PASARARGUMENTOS= ({VARIABLE}|{REAL}|{ENTERO})({COMA}({VARIABLE}|{REAL}|{ENTERO})|{OPERARITMETICO}({VARIABLE}|{REAL}|{ENTERO}))*
|{CADENA}


//CLASE/////////////////////////////////////////////////////////////////////////

CLASE={CLASS}{IDENTIFICADOR}({EXTENDS}{IDENTIFICADOR})?{LLAVEIZQ}({ATRIBUTOS}|{METODOS})*{LLAVEDER}

ATRIBUTOS={TIPOVARIABLE}{VARIABLE}{PUNTPYCOMA}

METODOS={FUNCIONES}

WHITE=[ \t\r\n]

%{
public String lexeme;
%}
%%
{WHITE} {/*Ignore*/}
"=" {return ASSIGN;}
"==" {return EQUALS;}
"+" {return SUMA;}
"*" {return MULT;}
"-" {return RESTA;}
"/" {return DIV;}


({INICIO}{WHITE}*(.)*{FIN}) {return CORRECTO;}


//EXPRESIONES GLOBALES



{LLAMADAFUNCION} {return PRUEBA;}

{EXPRESIONGLOBAL} {return VARIABLE;}

{IDENTIFICADOR} {return IDENTIFICADOR;}
{PUNTOYCOMA} {return PUNTOYCOMA;} 
{NEW} {lexeme=yytext();return NEW;}
{L}({L}|{D})* {lexeme=yytext(); return ID;}
//(("+"|"-"){D}+|{D}+) {lexeme=yytex$t(); return INT;}

. {return ERROR;}