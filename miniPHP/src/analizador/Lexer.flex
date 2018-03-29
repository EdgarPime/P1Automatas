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
LLAVEDER=("{")
CORCHIZQ=("[")
CORCHDER=("]")
AMPERSAN=("&")

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
CADENA=("'").*("'")
ENTERO= [0-9]+
REAL=[0-9]+(".")[0-9]+
IDENTIFICADOR= [a-zA-Z]([a-zA-Z0-9_])*

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
{IDENTIFICADOR} {return IDENTIFICADOR;}
{PUNTOYCOMA} {return PUNTOYCOMA;} 
{INICIO}{WHITE}*{FIN} {return CORRECTO;}
{NEW} {lexeme=yytext();return NEW;}
{L}({L}|{D})* {lexeme=yytext(); return ID;}
(("+"|"-"){D}+|{D}+) {lexeme=yytext(); return INT;}
. {return ERROR;}