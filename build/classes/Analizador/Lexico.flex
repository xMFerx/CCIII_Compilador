package Analizador;
import static Analizador.Tokens.*;
%%
%class Lexico
%type Tokens
L=[a-zA-Z_]+                   
D=[0-9]+         
espacio=[ ,\t,\r]+
%{
    public String lexemas;
%}
%%
/* Espacios en blanco */
{espacio} {/*Ignore*/}

(try)
(catch)

/* Comentarios */
( "//"(.)* ) {/*Ignore*/}

/* Salto de linea */
( "\n" ) {return Linea;}

/* Comillas */
/* Dobles */
( "\"" ) {lexemas=yytext(); return Comillas;}
/* Simples */
( "\'" ) {lexemas=yytext(); return Comillas_s;}
/* Backslash */
( "\\" ) {lexemas=yytext(); return Back;}


/* Tipos de datos */
/* Byte */
( byte ) {lexemas=yytext(); return T_byte;}
/* Int */
( int ) {lexemas=yytext(); return T_int;}
/* Char */
( char ) {lexemas=yytext(); return T_char;}
/* Long */
( long ) {lexemas=yytext(); return T_long;}
/* Float */
( float ) {lexemas=yytext(); return T_float;}
/* Double */
( double ) {lexemas=yytext(); return T_double;}
/* String */
( string ) {lexemas=yytext(); return Cadena;}
/* Tipo de dato boolean */
( bool ) {lexemas=yytext(); return T_bool;}

/* Palabra reservada If */
( if ) {lexemas=yytext(); return If;}
/* Palabra reservada Else */
( else ) {lexemas=yytext(); return Else;}

/* Estructura Switch */
( switch ) {lexemas=yytext(); return Switch;}
/* Case */
( case ) {lexemas=yytext(); return Case;}
/* Default */
( default ) {lexemas=yytext(); return Default;}

/* Estructura While */
( while ) {lexemas=yytext(); return While;}
/* Estructura Do */
( do ) {lexemas=yytext(); return Do;}


/* Operador Igual */
( "=" ) {lexemas=yytext(); return Igual;}
/* Operador Suma */
( "+" ) {lexemas=yytext(); return Suma;}
/* Operador Resta */
( "-" ) {lexemas=yytext(); return Resta;}
/* Operador Multiplicacion */
( "*" ) {lexemas=yytext(); return Multiplicacion;}
/* Operador Division */
( "/" ) {lexemas=yytext(); return Division;}
/* Operador Modulo */
( "%" ) {lexemas=yytext(); return Modulo;}

/* Operadores logicos */
/* AND */
( "&&" ) {lexemas=yytext(); return Op_and;}
/* OR */
( "||" ) {lexemas=yytext(); return Op_or;}
/* NOT */
( "!" ) {lexemas=yytext(); return Op_not;}
/* AND BINARIO */
( "&" ) {lexemas=yytext(); return Op_andB;}
/* OR BINARIO */
( "|" ) {lexemas=yytext(); return Op_orB;}

/*Operadores Relacionales */
/*mayor que*/
( ">" ) {lexemas = yytext(); return Op_mayor;}
/*menor que*/
( "<" ) {lexemas = yytext(); return Op_menor;}
/*igual que*/
( "==" ) {lexemas = yytext(); return Op_igual;}
/*diferente que*/
( "!=" ) {lexemas = yytext(); return Op_diferente;}
/*mayor o igual que*/
( ">=" ) {lexemas = yytext(); return Op_mayorE;}
/*menor o igual que*/
( "<=" ) {lexemas = yytext(); return Op_menorE;}
/*desplazamiento a la izquierda*/
( "<<" ) {lexemas = yytext(); return Op_desIzq;}
/*desplazamiento a la derecha*/
( ">>" ) {lexemas = yytext(); return Op_desDer;}

/* Operadores Atribucion */
/* Asignacion y suma */
( "+=" ) {lexemas = yytext(); return Op_asigSuma;}
/* Asignacion y resta */
( "-=" ) {lexemas = yytext(); return Op_asigResta;}
/* Asignacion y multiplicacion */
(  "*=" ) {lexemas = yytext(); return Op_asigMult;}
/* Asignacion y division */
( "/=" ) {lexemas = yytext(); return Op_asigDiv;}
/* Asignacion y modulo */
( "%=" ) {lexemas = yytext(); return Op_asigModulo;}

/* Operadores Incremento */
( "++" ) {lexemas = yytext(); return Op_incremento;}
/* Operadores decremento */
( "--" ) {lexemas = yytext(); return Op_decremento;}

/*Operadores Booleanos*/
/* True */
(true) {lexemas = yytext(); return Op_boolTrue;}
/* False */
(false) {lexemas = yytext(); return Op_boolFalse;}

/* Parentesis de apertura */
( "(" ) {lexemas=yytext(); return Parentesis_a;}
/* Parentesis de cierre */
( ")" ) {lexemas=yytext(); return Parentesis_c;}

/* Llave de apertura */
( "{" ) {lexemas=yytext(); return Llave_a;}
/* Llave de cierre */
( "}" ) {lexemas=yytext(); return Llave_c;}

/* Corchete de apertura */
( "[" ) {lexemas = yytext(); return Corchete_a;}
/* Corchete de cierre */
( "]" ) {lexemas = yytext(); return Corchete_c;}

/* Marcador de importación */
( #include ) {lexemas=yytext(); return Include;}

/* Marcador de IOStream*/
( iostream ) {lexemas=yytext(); return Iostream;}

/* Marcador de Using*/
( using ) {lexemas=yytext(); return Using;}
/* Marcador de NameSpace*/
( namespace ) {lexemas=yytext(); return Namespace;}
/* Marcador de STD*/
( std ) {lexemas=yytext(); return Std;}

/* Marcador de inicio de algoritmo */
( "main" ) {lexemas=yytext(); return Main;}

/* Marcador de inicio de metodos */
( "void" ) {lexemas=yytext(); return Void;}

/* Marcador de salida */
( break ) {lexemas=yytext(); return Break;}

/* Marcador de inicio de impresion en pantalla */
( "printf" ) {lexemas=yytext(); return Printf;}

/* Marcador de lectura de pantalla  */
( "scanf" ) {lexemas=yytext(); return Scanf;}

/* Cin */
( cin ) {lexemas=yytext(); return Cin;}
/* Cout */
( cout ) {lexemas=yytext(); return Cout;}

/* Return */
( return ) {lexemas=yytext(); return Return;}
/* Define */
( #define ) {lexemas=yytext(); return Define;}

/* Punto y coma */
( ";" ) {lexemas=yytext(); return P_coma;}
/* Punto */
( "." ) {lexemas=yytext(); return Punto;}
/* Dos puntos */
( ":" ) {lexemas=yytext(); return DPuntos;}

/* Identificador */
{L}({L}|{D})* {lexemas=yytext(); return Identificador;}

/* Numero */
("(-"{D}+")")|{D}+ {lexemas=yytext(); return Numero;}

/* Error de analisis */
 . {return ERROR;}

