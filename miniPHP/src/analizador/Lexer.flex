package analizador;
import static analizador.Token.*;
%%
%class Lexer
%type Token


L = [a-zA-Z]
D = [0-9]

//TOKEN PARA SIGNOS DE PUNTUACION
PUNTOYCOMA=(";")
SINGO=("\\")
DOLAR=("$")
PUNTO=(".")
COMA=(",")
DOSPUNTOS=(":")
PARENIZQ=("(")
PARENDER=(")")
LLAVEIZQ=("{")
LLAVEDER=("}")
CORCHIZQ=("[")
CORCHDER=("]")
AMPERSAND=("&")
INTERROGACION=("?")
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
OPERASIG_ARRAY=("=>")

//TOKEN PARA ESTRUCTURAS CONTROL
IF=("if")
ELSE=("else")
ELSEIF=("elseif")
WHILE=("while")
ENDWHILE=("endwhile")
FOR=("for")
SWITCH=("switch")
CASE=("case")
ENDSWITCH=("endswitch")
BREAK=("break")
DEFAULT=("default")
DO=("do")
FOREACH=("foreach")
ENDFOREACH=("endforeach")
SWITCH=("switch")

//////////////////////////////




//TOKEN PARA TIPOS DE DATOS
TIPODATO=(("string")|("bool")|("int"))

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
INCLUDE= ("include")
CONTINUE= ("continue")
PALABRARESERVADA=(("__halt_compiler")|("clone")|("die")|("empty")|("final")|("include_once")
                |("list")|("try")|("abstract")|("clone")|("callable")|("enddeclare")|("finally")|("goto")
                |("instanceof")|("namespace")|("unset")|("yield")|("eval")|("use")
                |("catch")|("declare")|("exit")|("implements")|("interface")
                |("require")|("throw")|("var")|("isset")|("require_once")|("trait")|("array")|("header")|("preg_match_all")|("resource")
                |("void")|("object")|("iterable")|("as"))

//TOKEN PARA CLASES Y OBJETIVOS
CLASS= ("class")
PUBLIC= ("public")
PROTECTED= ("protected")
PRIVATE= ("private")
NEW= ("new")
EXTENDS= ("extends")

//TOKEN PARA CODIGO HTML
CODIGOHTML=(("<html>")|("<p>")|("</html>")|("</body>")|("</p>")|("<td>")|("</td>")|("<tr>")|("</tr>")|("</form>")|("<form>")|("</table>")|("<table>")|("<h1>")|("</h1>")
            |("<head>")|("</head>"))
HTML=(("<")(.)*(">"))(.|{WHITE}|{ENTER})*(.|{WHITE}|{ENTER})*("<")(.)*(">")

//TOKENS ESPECIALES
CADENA= (("\"")(~["\""])|("\'")(~["\'"]))
ENTERO= ("+"|"-")?([0-9]+|0[xX][0-9a-fA-F]+|0[bB][01]+)
REAL= ([+-])?(([0-9]+ | [0-9]+(".")[0-9]+) ([eE][+-])?[0-9]+)
IDENTIFICADOR= [a-zA-Z_\x7f-\xff][a-zA-Z0-9_\x7f-\xff]*
BOOLEANO= (("true")|("false"))

//TOKEN PARA CODIGO SQL
MYSQLQUERY=("mysql_query"){WHITE}*{PARENIZQ}{WHITE}*({CADENA}|{VARIABLE}){WHITE}*{PARENDER}{PUNTOYCOMA}
CODIGOSQL=(("mysql_query")|("mysql_fetch_assoc")|("mysql_error")|("mysql_real_escape_string")|("mysql_affected_rows")|("mysql_insert")|("parse_mysql_dump")|("mysql_connect")
            |("mysql_close"))

//TOKEN DECLARACIONES VARIABLE///////////////////////////

VARIABLE= ({DOLAR}{IDENTIFICADOR})
CONSTANTE= ({CONST}{WHITE}*{IDENTIFICADOR})
TIPOVARIABLE=({GLOBAL}{WHITE}*)|(({STATIC}{WHITE}*)?(({PUBLIC}|{PROTECTED}|{PRIVATE}){WHITE}*)?)
VARIABLEPREDEFINIDA= (("$globals")|("$_server")|("$_get")|("$_post")|("$_files")|("$_request")|("$_session")|("$_env")|("$_cookie"))
VARIABLEPREDEFINIDA1=(("$php_errormsg")|("$http_response_header")|("$argc")|("$argv"))

//DECLARACION DE EXPRESIONES/////////////////////////

EXPRESIONGLOBAL= (({VARIABLE}{OPERASIGNACION}{WHITE}*)+({VARIABLE}
    |({VARIABLE}|{ENTERO}|{REAL})({OPERARITMETICO}({VARIABLE}|{ENTERO}|{REAL}))+
    |{CORCHIZQ}(({CADENA}|{ENTERO}|{REAL}){OPERASIG_ARRAY}({CADENA}|{ENTERO}|{REAL}){COMA}{WHITE}*)*{CORCHDER}
    |{FUNCIONANONIMA}
    |{LLAMADAFUNCION}
    |{NEW}{LLAMADAFUNCION}
    ){PUNTOYCOMA})
|{VARIABLE}({COMA}{VARIABLE})*{PUNTOYCOMA}
| {CONSTANTE}{OPERASIGNACION}{WHITE}*({CADENA}|{ENTERO}|{REAL}|{LLAMADAFUNCION}){PUNTOYCOMA}
|({ECHO}{WHITE}*(({VARIABLE}|{ENTERO}|{REAL})({OPERARITMETICO}({VARIABLE}|{ENTERO}|{REAL}))* 
    |{CADENA}({PUNTO}({VARIABLE}|{CADENA}))?
    |{FUNCIONANONIMA}
    |{LLAMADAFUNCION}
    ){WHITE}*{PUNTOYCOMA})

EXPRESIONLOCAL= ({TIPOVARIABLE}{WHITE}*{VARIABLE}{OPERASIGNACION})+(
    {CADENA}
    |({VARIABLE}|{ENTERO}|{REAL})({OPERARITMETICO}({VARIABLE}|{ENTERO}|{REAL}))*){PUNTOYCOMA}
|{TIPOVARIABLE}{VARIABLE}({COMA}{VARIABLE})*{PUNTOYCOMA}



//DECLARACION DE ESTRUCTURAS////////////////////////////////////////


SENTENCIAIF={IF}{WHITE}*{PARENIZQ}{COMPARACION}{PARENDER}{WHITE}*{LLAVEIZQ}(.)*({BREAK}{PUNTOYCOMA})?{LLAVEDER}({SENTENCIAELSE})?

SENTENCIAELSE={ELSE}{WHITE}*{LLAVEIZQ}(.)*({BREAK}{PUNTOYCOMA})?{LLAVEDER}

SENTENCIAWHILE={WHILE}{WHITE}*{PARENIZQ}{COMPARACION}{PARENDER}{WHITE}*(({LLAVEIZQ}(.)*({BREAK}{PUNTOYCOMA})?{LLAVEDER})
    |({DOSPUNTOS}(.)*({BREAK}{PUNTOYCOMA})?{ENDWHILE}{WHITE}*{PUNTOYCOMA}))

SENTENCIADOWHILE={DO}{WHITE}*{LLAVEIZQ}(.)*({BREAK}{PUNTOYCOMA})?{LLAVEDER}{WHITE}*{WHILE}{WHITE}*{PARENIZQ}{WHITE}*{COMPARACION}{PARENDER}{WHITE}*{PUNTOYCOMA}

SENTENCIAFOR={FOR}{WHITE}*{PARENIZQ}({EXPRESION1FOR}({COMA}{EXPRESION1FOR})*)?{PUNTOYCOMA}({COMPARACION})?{PUNTOYCOMA}({EXPRESION2FOR}({COMA}{EXPRESION2FOR})*)?{WHITE}*{PARENDER}{WHITE}*(({LLAVEIZQ}(.)*({BREAK}{PUNTOYCOMA})?{WHITE}*{LLAVEDER})|({WHITE}*{PUNTOYCOMA}))

EXPRESION1FOR={VARIABLE}{OPERASIGNACION}({VARIABLE}|{REAL}|{ENTERO})

EXPRESION2FOR=({WHITE}*{OPERINCDEC}{VARIABLE}
    |{WHITE}*{PRINT}{VARIABLE}
    |{WHITE}*{ECHO}{VARIABLE}
    |{VARIABLE}({OPERINCDEC}|({OPERCOMBINADO_ARIT}({VARIABLE}|{ENTERO}|{REAL})
        |{OPERCOMBINADO_CAD}{CADENA}))
    )

SENTENCIASWITCH={SWITCH}{WHITE}*{PARENIZQ}{VARIABLE}{PARENDER}{WHITE}*({LLAVEIZQ}{WHITE}*{BLOQUECASE}{WHITE}*{LLAVEDER}
        |{DOSPUNTOS}{BLOQUECASE}{ENDSWITCH}{PUNTOYCOMA})

BLOQUECASE=({CASE}({ENTERO}|{REAL}|{CADENA})({DOSPUNTOS}|{PUNTOYCOMA}){WHITE}*(.)*{WHITE}*({BREAK}{PUNTOYCOMA})?)+{WHITE}*({DEFAULT}({DOSPUNTOS}|{PUNTOYCOMA})(.)*({BREAK}{PUNTOYCOMA})?)?


COMPARACION= ({VARIABLE}|{CADENA}|{ENTERO}|{REAL}){WHITE}*{OPERCOMPARACION}{WHITE}*({VARIABLE}|{CADENA}|{ENTERO}|{REAL}){WHITE}*({OPERLOGICO}{WHITE}*{VARIABLE}{WHITE}*{OPERCOMPARACION}{WHITE}*({VARIABLE}|{CADENA}|{ENTERO}|{REAL}))*
|({OPERLOGNOT})?({VARIABLE}|{BOOLEANO}|{ENTERO})



//FUNCIONES/////////////////////////////////

FUNCIONES={TIPOVARIABLE}{FUNCTION}{IDENTIFICADOR}{PARENIZQ}({ARGUMENTOS})?{PARENDER}{WHITE}*{LLAVEIZQ}{WHITE}*{CADENA}({DEVOLVERVALORES})?{WHITE}*{LLAVEDER}

FUNCIONANONIMA={FUNCTION}{PARENIZQ}({ARGUMENTOS})?{PARENDER}{WHITE}*{LLAVEIZQ}{WHITE}*{CADENA}({DEVOLVERVALORES})?{WHITE}*{LLAVEDER}


ARGUMENTOS=({AMPERSAND})?{VARIABLE}{WHITE}*({COMA}{WHITE}*({AMPERSAND})?{VARIABLE}|{OPERASIGNACION}{WHITE}*({REAL}|{ENTERO}|{CADENA}|{NULL}))*

DEVOLVERVALORES={RETURN}(({VARIABLE}|{ENTERO}|{REAL})({OPERARITMETICO}({VARIABLE}|{ENTERO}|{REAL}))*
    |{CADENA}){PUNTOYCOMA}




//LLAMADA FUNCION//////////////////////////////////////////////////////////////////////

LLAMADAFUNCION={IDENTIFICADOR}{WHITE}*{PARENIZQ}{WHITE}*({PASARARGUMENTOS})?{WHITE}*{PARENDER}

PASARARGUMENTOS= ({VARIABLE}|{REAL}|{ENTERO})({COMA}{WHITE}*({VARIABLE}|{REAL}|{ENTERO})|{OPERARITMETICO}({VARIABLE}|{REAL}|{ENTERO}))*
|{CADENA}


//CLASE/////////////////////////////////////////////////////////////////////////

CLASE={CLASS}{WHITE}*{IDENTIFICADOR}({EXTENDS}{IDENTIFICADOR})?{LLAVEIZQ}{WHITE}*({ATRIBUTOS}|{METODOS})*{WHITE}*{LLAVEDER}

ATRIBUTOS={TIPOVARIABLE}{VARIABLE}{PUNTOYCOMA}

//METODOS={FUNCIONES}
METODOS={TIPOVARIABLE}{FUNCTION}{IDENTIFICADOR}{PARENIZQ}({ARGUMENTOS})?{PARENDER}

ENTER=[\n]
WHITE=[ \t\r\n]

%{
public String lexeme;
%}
%%
//{WHITE} {/*Ignore*/}

//TOKEN PARA CAMPOS DE ACCESO A BASE DE DATOS
{VARIABLE}{WHITE}*{CORCHIZQ}{WHITE}*({CADENA}){WHITE}*({COMA}{WHITE}*{CADENA})*{WHITE}*{CORCHDER} {lexeme=yytext(); return CAMPOS_DE_ACCESO;}

//TOKEN PARA ERRORES
{DOLAR}{D}({L}|{D})+ {lexeme=yytext(); return ERROR;}
("="){D}({L}|{D})+ {lexeme=yytext(); return ERROR;}
{DOLAR}({L}|{D}|("_"))+{DOLAR} {lexeme=yytext(); return ERROR;}
("=")("!")("=") {lexeme=yytext(); return ERROR;}
("/*")({WHITE}|{ENTER})*{L}+ {lexeme=yytext(); return ERROR;}
{DOLAR}{D}{L}+ {lexeme=yytext(); return ERROR;}

{SINGO} {lexeme=yytext(); return SINGO;}

{HTML} {lexeme=yytext(); return HTML;}

{ENTER} {lexeme=yytext(); return ENTER;}
{WHITE} {lexeme=yytext(); return WHITE;}



//TOKEN PARA SIGNOS DE PUNTUACION

{DOLAR} {lexeme=yytext(); return DOLAR;}
{PUNTOYCOMA} {lexeme=yytext(); return PUNTO_Y_COMA;}
{PUNTO} {lexeme=yytext(); return PUNTO;}
{COMA} {lexeme=yytext(); return COMA;}
{DOSPUNTOS} {lexeme=yytext(); return DOSPUNTOS;}
{PARENIZQ} {lexeme=yytext(); return PARENTESIS_IZQUIERDO;}
{PARENDER} {lexeme=yytext(); return PARENTESIS_DERECHO;}
{LLAVEIZQ} {lexeme=yytext(); return LLAVE_IZQUIERDA;}
{LLAVEDER} {lexeme=yytext(); return LLAVE_DERECHA;}
{CORCHIZQ} {lexeme=yytext(); return CORCHETE_IZQUIERDO;}
{CORCHDER} {lexeme=yytext(); return CORCHETE_DERECHO;}
{AMPERSAND} {lexeme=yytext(); return AMPERSAND;}
{INTERROGACION} {lexeme=yytext(); return INTERROGACION;}

//TOKEN PARA OPERADORES
{OPERASIGNACION} {lexeme=yytext(); return OPERADOR_ASIGNACION;}
{OPERARITMETICO} {lexeme=yytext(); return OPERADOR_ARITMETICO;}
{OPERCOMBINADO_ARIT} {lexeme=yytext(); return OPERCOMBINADO_ARITMETICO;}
{OPERCOMBINADO_CAD} {lexeme=yytext(); return OPERCOMBINADO_CAD;}
{OPERCOMPARACION} {lexeme=yytext(); return OPERADOR_COMPARACION;}
{OPERINCDEC} {lexeme=yytext(); return OPERADOR_INCREMENTO;}
{OPERLOGICO} {lexeme=yytext(); return OPERADOR_LOGICO;}
{OPERLOGNOT} {lexeme=yytext(); return OPERLOGNOT;}
{OPERASIG_ARRAY} {lexeme=yytext(); return OPERASIG_ARRAY;}


//TOKEN PARA ESTRUCTURAS CONTROL
{IF} {return IF;}
{ELSE} {return ELSE;}
{WHILE} {return WHILE;}
{ENDWHILE} {return ENDWHILE;}
{FOR} {return FOR;}
{SWITCH} {return SWITCH;}
{CASE} {return CASE;}
{ENDSWITCH} {return ENDSWITCH;}
{BREAK} {return BREAK;}
{DEFAULT} {return DEFAULT;}
{DO} {return DO;}
{FOREACH} {return FOREACH;}
{ENDFOREACH} {return ENDFOREACH;}
{ELSEIF} {return ELSEIF;}
{SWITCH} {return SWITCH;}

//TOKEN PARA PALABRAS RESERVADAS
{INICIO} {lexeme=yytext(); return INICIO;}
{FIN} {lexeme=yytext(); return FIN;}
{ECHO} {return ECHO;} 
{GLOBAL} {return GLOBAL;}
{STATIC} {return STATIC;}
{CONST} {return CONST;}
{PRINT} {return PRINT;}
{FUNCTION} {return FUNCTION;}
{RETURN} {return RETURN;}
{NULL} {return NULL;}
{INCLUDE} {return INCLUDE;} 
{CONTINUE} {return CONTINUE;} 
{PALABRARESERVADA} {lexeme=yytext(); return PALABRARESERVADA;} 

//TOKEN PARA CLASES Y OBJETIVOS
{TIPOVARIABLE}{FUNCTION}{WHITE}*{IDENTIFICADOR}{WHITE}*{PARENIZQ}{WHITE}*({ARGUMENTOS})?{WHITE}*{PARENDER} {lexeme=yytext(); return DECLARACION_FUNCION;}
{CLASS} {return CLASS;}
{PUBLIC} {return PUBLIC;}
{PROTECTED} {return PROTECTED;}
{PRIVATE} {return PRIVATE;}
{NEW} {return NEW;}
{EXTENDS} {return EXTENDS;}

//TOKENS ESPECIALES
{CADENA} {lexeme=yytext(); return CADENA;}
{ENTERO} {lexeme=yytext(); return ENTERO;}
{REAL} {lexeme=yytext(); return REAL;}
{BOOLEANO} {lexeme=yytext(); return BOOLEANO;}
{IDENTIFICADOR} {lexeme=yytext(); return IDENTIFICADOR;}

//TOKEN DECLARACIONES DE VARIABLES

{VARIABLEPREDEFINIDA}({CORCHIZQ}*{WHITE}*{CADENA}*{WHITE}*{CORCHDER})? {lexeme=yytext(); return VARIABLEPREDEFINIDA;}
{VARIABLEPREDEFINIDA1} {lexeme=yytext(); return VARIABLEPREDEFINIDA1;}
{VARIABLE} {lexeme=yytext(); return VARIABLE;}
{CONSTANTE} {lexeme=yytext(); return CONSTANTE;}
{TIPODATO} {lexeme=yytext(); return TIPO_DATO;}

//TOKEN PARA COMENTARIOS
("/*")(({WHITE}|{ENTER})*|.*)*("*/") {/*Ignore*/}
("//").*(\n) {/*Ignore*/}



//TOKEN PARA CODIGO DE BASE DE DATOS
{MYSQLQUERY} { return MYSQLQUERY;}
{CODIGOSQL} {lexeme=yytext(); return CODIGO_SQL;}


//TOKEN PARA CODIGO HTML
{CODIGOHTML} {lexeme=yytext(); return CODIGO_HTML;}

//TOKEN PARA SNETENCIAS DE ESTRUCTURA DE CONTROL
{IF}{WHITE}*{PARENIZQ}{WHITE}*{COMPARACION}{WHITE}*{PARENDER} {lexeme=yytext();return SENTENCIA_IF;}
{ELSEIF}{WHITE}*{PARENIZQ}{WHITE}*{COMPARACION}{WHITE}*{PARENDER} {lexeme=yytext(); return SENTENCIA_ELSEIF;}
{WHILE}{WHITE}*{PARENIZQ}{WHITE}*{COMPARACION}{WHITE}*{PARENDER} {lexeme=yytext(); return SENTENCIA_WHILE;}
{SWITCH}{WHITE}*{PARENIZQ}{WHITE}*{VARIABLE}{WHITE}*{PARENDER} {lexeme=yytext(); return SENTENCIA_SWITCH;}

//TOKEN PARA FUNCIONES
{LLAMADAFUNCION} {lexeme=yytext(); return LLAMADAFUNCION;}

//{L}({L}|{D})* {lexeme=yytext(); return ID;}
//(("+"|"-"){D}+|{D}+) {lexeme=yytext(); return INT;}

. {lexeme=yytext(); return ERROR;}