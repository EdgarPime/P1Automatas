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
    PUNTO_Y_COMA,PUNTO,COMA,DOSPUNTOS,PARENTESIS_IZQUIERDO,PARENTESIS_DERECHO,LLAVE_IZQUIERDA,LLAVE_DERECHA,CORCHETE_IZQUIERDO,CORCHETE_DERECHO,AMPERSAND,
    OPERADOR_ASIGNACION,OPERADOR_ARITMETICO,OPERCOMBINADO_ARITMETICO,OPERCOMBINADO_CAD,OPERADOR_COMPARACION,OEPRADOR_INCREMENTO,OPERADOR_LOGICO,OPERLOGNOT,OPERASIG_ARRAY,
    IF,ELSE,WHILE,ENDWHILE,FOR,SWITCH,CASE,ENDSWITCH,BREAK,DEFAULT,DO,
    INICIO,FIN,ECHO,GLOBAL,STATIC,CONST,PRINT,FUNCTION,RETURN,NULL,INCLUDE,CONTINUE,
    CLASS,PUBLIC,PROTECTED,PRIVATE,NEW,EXTENDS,
    CADENA,ENTERO,REAL, IDENTIFICADOR,BOOLEANO,ARRAY,
    VARIABLE,CONSTANTE,TIPOVARIABLE,VARIABLEPREDEFINIDA,
    VARIABLE_LOGICA,VARIABLE_ENTERO,VARIABLE_REAL,VARIABLE_CADENA,VARIABLEARRAY,
    SENTENCIA_IF,SENTENCIA_WHILE, SENTENCIA_FOR,SENTENCIA_SWITCH,SENTENCIA_CASE,SENTENCIA_ELSEIF,SENTENCIA_FOREACH,
    FUNCION,LLAMADAFUNCION,CLASE,
    ERROR, EXPRESIONGLOBAL, ATRIBUTO, COMENTARIO, COMENTARIO2
}
