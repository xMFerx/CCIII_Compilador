package SoloLexico;
import static SoloLexico.Tokens.*;
%%
%class Lexico
%type Tokens
L=[a-zA-Z_]+
D=[0-9]+
espacio=[ \t \r]+
%{
    public String lexemas;
%}
%%
/* Int */
(int) { lexemas = yytext(); return Int; }

/* Char */
(char) { lexemas = yytext(); return Char; }

/* Float */
(float) { lexemas = yytext(); return Float; }

/* Long */
(long) { lexemas = yytext(); return Long; }

/* Short */
(short) { lexemas = yytext(); return Short; }

/* Unsigned */
(unsigned) { lexemas = yytext(); return Unsigned; }

/* Signed */
(signed) { lexemas = yytext(); return Signed; }

/* Double */
(double) {lexemas=yytext(); return Doble;}

/* Espacios en blanco */
{espacio} {/*Ignore*/}

/* Comentarios */
( "//"(.)* ) {/*Ignore*/}

/* Salto de linea */
( "\n" ) {return Linea;}

/* Comillas */
( "\"" ) {lexemas=yytext(); return Comillas;}

/* Tipo de dato String */
( String ) {lexemas=yytext(); return Cadena;}

/* Operador Igual */
( "=" ) {lexemas=yytext(); return Igual;}

/* Operador Suma */
( "+" ) {lexemas=yytext(); return Suma;}

/* Operador Resta */
( "-" ) {lexemas=yytext(); return Resta;}

/* Operador Multiplicación */
( "*" ) {lexemas=yytext(); return Multiplicacion;}

/* Operador División */
( "/" ) {lexemas=yytext(); return Division;}

/* Parentesis de apertura */
( "(" ) {lexemas=yytext(); return Parent_a;}

/* Parentesis de cierre */
( ")" ) {lexemas=yytext(); return Parent_c;}

/* Llave de apertura */
( "{" ) {lexemas=yytext(); return Llave_a;}

/* Llave de cierre */
( "}" ) {lexemas=yytext(); return Llave_c;}

/* IF */
(if) { lexemas = yytext(); return IF; }

/* ELSE */
("else") { lexemas = yytext(); return ELSE; }

/* WHILE */
("while") { lexemas = yytext(); return WHILE; }

/* FOR */
("for") { lexemas = yytext(); return FOR; }

/* DO */
("do") { lexemas = yytext(); return DO; }

/* SWITCH */
("switch") { lexemas = yytext(); return SWITCH; }

/* CASE */
("case") { lexemas = yytext(); return CASE; }

/* DEFAULT */
("default") { lexemas = yytext(); return DEFAULT; }

/* BREAK */
("break") { lexemas = yytext(); return BREAK; }

/* CONTINUE */
("continue") { lexemas = yytext(); return CONTINUE; }

/* RETURN */
("return") { lexemas = yytext(); return RETURN; }

/* CONST */
("const") { lexemas = yytext(); return CONST; }

/* VOLATILE */
("volatile") { lexemas = yytext(); return VOLATILE; }

/* STATIC */
("static") { lexemas = yytext(); return STATIC; }

/* EXTERN */
("extern") { lexemas = yytext(); return EXTERN; }

/* REGISTER */
("register") { lexemas = yytext(); return REGISTER; }

/* TYPEDEF */
("typedef") { lexemas = yytext(); return TYPEDEF; }

/* OPERADORES DE ASIGNACIÓN */

/* ASSIGN_ADD */
("+=") { lexemas = yytext(); return ASSIGN_ADD; }

/* ASSIGN_SUB */
("-=") { lexemas = yytext(); return ASSIGN_SUB; }

/* ASSIGN_MUL */
("*=") { lexemas = yytext(); return ASSIGN_MUL; }

/* ASSIGN_DIV */
("/=") { lexemas = yytext(); return ASSIGN_DIV; }

/* ASSIGN_MOD */
("%=") { lexemas = yytext(); return ASSIGN_MOD; }

/* ASSIGN_AND */
("&=") { lexemas = yytext(); return ASSIGN_AND; }

/* ASSIGN_OR */
("|=") { lexemas = yytext(); return ASSIGN_OR; }

/* ASSIGN_XOR */
("^=") { lexemas = yytext(); return ASSIGN_XOR; }

/* ASSIGN_LEFT */
("<<=") { lexemas = yytext(); return ASSIGN_LEFT; }

/* ASSIGN_RIGHT */
(">>=") { lexemas = yytext(); return ASSIGN_RIGHT; }

/* OPERADORES INCREMENTO/DECREMENTO */

/* INCREMENT */
("++") { lexemas = yytext(); return INCREMENT; }

/* DECREMENT */
("--") { lexemas = yytext(); return DECREMENT; }

/* OPERADORES TERNARIOS */

/* QUESTION_MARK */
("?") { lexemas = yytext(); return QUESTION_MARK; }

/* COLON */
(":") { lexemas = yytext(); return COLON; }

/* OPERADORES DE BITS */

/* BITWISE_AND */
("&") { lexemas = yytext(); return BITWISE_AND; }

/* BITWISE_OR */
("|") { lexemas = yytext(); return BITWISE_OR; }

/* BITWISE_XOR */
("^") { lexemas = yytext(); return BITWISE_XOR; }

/* BITWISE_NOT */
("~") { lexemas = yytext(); return BITWISE_NOT; }

/* OPERADORES DE DESPLAZAMIENTO */

/* SHIFT_LEFT */
("<<") { lexemas = yytext(); return SHIFT_LEFT; }

/* SHIFT_RIGHT */
(">>") { lexemas = yytext(); return SHIFT_RIGHT; }

/* OTROS SÍMBOLOS */

/*

/* AMPERSAND */
("&") { lexemas = yytext(); return AMPERSAND; }

/* PIPE */
("|") { lexemas = yytext(); return PIPE; }

/* TILDE */
("~") { lexemas = yytext(); return TILDE; }

*/

/* ARROW */
("->") { lexemas = yytext(); return ARROW; }

/* CONSTANTES BOOLEANAS */

/* TRUE */
("true") { lexemas = yytext(); return TRUE; }

/* FALSE */
("false") { lexemas = yytext(); return FALSE; }

/* SÍMBOLOS DEL PREPROCESADOR */

/* DEFINE */
("define") { lexemas = yytext(); return DEFINE; }

/* INCLUDE */
("include") { lexemas = yytext(); return INCLUDE; }

/* IFDEF */
("ifdef") { lexemas = yytext(); return IFDEF; }

/* IFNDEF */
("ifndef") { lexemas = yytext(); return IFNDEF; }

/* ENDIF */
("endif") { lexemas = yytext(); return ENDIF; }

/* ERROR */
("error") { lexemas = yytext(); return ERROR; }

/* PRAGMA */
("pragma") { lexemas = yytext(); return PRAGMA; }

/* PRAGMA */
("%") { lexemas = yytext(); return Porcentaje; }

/* Marcador de inicio de algoritmo */
( "main" ) {lexemas=yytext(); return Main;}

/* P_coma */
( ";" ) {lexemas=yytext(); return P_coma;}

/* Identificador */
{L}({L}|{D})* {lexemas=yytext(); return Identificador;}

/* Numero */
("(-"{D}+")")|{D}+ {lexemas=yytext(); return Numero;}

/* Error de analisis */
 . {return ERROR;}