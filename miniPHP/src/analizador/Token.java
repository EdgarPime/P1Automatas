/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package analizador;

/**
 *
 * @author Carlos
 */
public enum Token {
    PUNTO_Y_COMA,PUNTO,COMA,DOSPUNTOS,PARENTESIS_IZQUIERDO,PARENTESIS_DERECHO,LLAVE_IZQUIERDA,LLAVE_DERECHA,CORCHETE_IZQUIERDO,CORCHETE_DERECHO,AMPERSAND,INTERROGACION,DOLAR,
    OPERADOR_ASIGNACION,OPERADOR_ARITMETICO,OPERCOMBINADO_ARITMETICO,OPERCOMBINADO_CAD,OPERADOR_COMPARACION,OPERADOR_INCREMENTO,OPERADOR_LOGICO,OPERLOGNOT,OPERASIG_ARRAY,
    IF,ELSE,WHILE,ENDWHILE,FOR,SWITCH,CASE,ENDSWITCH,BREAK,DEFAULT,DO,FOREACH,ENDFOREACH,ELSEIF, 
    INICIO,FIN,ECHO,GLOBAL,STATIC,CONST,PRINT,FUNCTION,RETURN,NULL,INCLUDE,CONTINUE, PALABRARESERVADA,
    CLASS,PUBLIC,PROTECTED,PRIVATE,NEW,EXTENDS, DECLARACION_FUNCION,
    CADENA,ENTERO,REAL, IDENTIFICADOR,BOOLEANO,TIPO_DATO,
    VARIABLE,CONSTANTE,VARIABLEPREDEFINIDA, VARIABLEPREDEFINIDA1,
    ERROR, COMENTARIO, COMENTARIO2,CAMPOS_DE_ACCESO,WHITE,
    MYSQLQUERY, CODIGO_HTML, CODIGO_SQL, ENTER, LLAMADAFUNCION,SENTENCIA_IF, SENTENCIA_WHILE, SENTENCIA_SWITCH, SENTENCIA_ELSEIF,HTML,SINGO
}
