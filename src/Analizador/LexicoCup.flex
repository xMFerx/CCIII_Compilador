package Analizador;
import java_cup.runtime.Symbol;

/*  José Luis Quintero Cañizalez - Edison Mauricio Riaño Alvarado */

%%
%class LexicoCup
%type java_cup.runtime.Symbol
%cup 
%full
%line
%char
L=[a-zA-Z_]+
D=[0-9]+
espacio=[ ,\t,\r,\n]+
%{
    private Symbol symbol(int type, Object value){
        return new Symbol(type, yyline, yycolumn, value);
    }
    private Symbol symbol(int type){
        return new Symbol(type, yyline, yycolumn);
    }
%}
%%

/* Espacios en blanco */
{espacio} {/*Ignore*/}

/* Comentarios */
( "//"(.)* ) {/*Ignore*/}

/* Comillas */
( "\"" ) {return new Symbol(sym.Comillas, yychar, yyline, yytext());}
/* Simples */
( "\'" ) {return new Symbol(sym.Comillas_s, yychar, yyline, yytext());}
/* Backslash */
( "\\" ) {return new Symbol(sym.Back, yychar, yyline, yytext());}

/* Tipos de datos */
/* Byte */
( byte ) {return new Symbol(sym.T_byte, yychar, yyline, yytext());}
/* Int */
( int ) {return new Symbol(sym.T_int, yychar, yyline, yytext());}
/* Char */
( char ) {return new Symbol(sym.T_char, yychar, yyline, yytext());}
/* Long */
( long ) {return new Symbol(sym.T_long, yychar, yyline, yytext());}
/* Float */
( float ) {return new Symbol(sym.T_float, yychar, yyline, yytext());}
/* Double */
( double ) {return new Symbol(sym.T_double, yychar, yyline, yytext());}
/* Tipo de dato String */
( string ) {return new Symbol(sym.Cadena, yychar, yyline, yytext());}
/* Tipo de dato boolean */
( bool ) {return new Symbol(sym.T_bool, yychar, yyline, yytext());}

/* Palabra reservada If */
( if ) {return new Symbol(sym.If, yychar, yyline, yytext());}
/* Palabra reservada Else */
( else ) {return new Symbol(sym.Else, yychar, yyline, yytext());}

/* Palabra reservada Switch */
( switch ) {return new Symbol(sym.Switch, yychar, yyline, yytext());}
/* Case */
( case ) {return new Symbol(sym.Case, yychar, yyline, yytext());}
/* Default */
( default ) {return new Symbol(sym.Default, yychar, yyline, yytext());}

/* Palabra reservada While */
( while ) {return new Symbol(sym.While, yychar, yyline, yytext());}
/* Palabra reservada Do */
( do ) {return new Symbol(sym.Do, yychar, yyline, yytext());}

/* Palabra reservada For */
( for ) {return new Symbol(sym.For, yychar, yyline, yytext());}

/* Operador Igual */
( "=" ) {return new Symbol(sym.Igual, yychar, yyline, yytext());}
/* Operador Suma */
( "+" ) {return new Symbol(sym.Suma, yychar, yyline, yytext());}
/* Operador Resta */
( "-" ) {return new Symbol(sym.Resta, yychar, yyline, yytext());}
/* Operador Multiplicacion */
( "*" ) {return new Symbol(sym.Multiplicacion, yychar, yyline, yytext());}
/* Operador Division */
( "/" ) {return new Symbol(sym.Division, yychar, yyline, yytext());}
/* Operador Modulo */
( "%" ) {return new Symbol(sym.Modulo, yychar, yyline, yytext());}

/* Operadores logicos */
/* AND */
( "&&" ) {return new Symbol(sym.Op_and, yychar, yyline, yytext());}
/* OR */
( "||" ) {return new Symbol(sym.Op_or, yychar, yyline, yytext());}
/* NOT */
( "!" ) {return new Symbol(sym.Op_not, yychar, yyline, yytext());}
/* AND BINARIO */
( "&" ) {return new Symbol(sym.Op_andB, yychar, yyline, yytext());}
/* OR BINARIO */
( "|" ) {return new Symbol(sym.Op_orB, yychar, yyline, yytext());}

/*Operadores Relacionales */
/*mayor que*/
( ">" ) {return new Symbol(sym.Op_mayor, yychar, yyline, yytext());}
/*menor que*/
( "<" ) {return new Symbol(sym.Op_menor, yychar, yyline, yytext());}
/*igual que*/
( "==" ) {return new Symbol(sym.Op_igual, yychar, yyline, yytext());}
/*diferente que*/
( "!=" ) {return new Symbol(sym.Op_diferente, yychar, yyline, yytext());}
/*mayor o igual que*/
( ">=" ) {return new Symbol(sym.Op_mayorE, yychar, yyline, yytext());}
/*menor o igual que*/
( "<=" ) {return new Symbol(sym.Op_menorE, yychar, yyline, yytext());}
/*desplazamiento a la izquierda*/
( "<<" ) {return new Symbol(sym.Op_desIzq, yychar, yyline, yytext());}
/*desplazamiento a la derecha*/
( ">>" ) {return new Symbol(sym.Op_desDer, yychar, yyline, yytext());}

/* Operadores Atribucion */
/* Asignacion y suma */
( "+=" ) {return new Symbol(sym.Op_asigSuma, yychar, yyline, yytext());}
/* Asignacion y resta */
( "-=" ) {return new Symbol(sym.Op_asigResta, yychar, yyline, yytext());}
/* Asignacion y multiplicacion */
(  "*=" ) {return new Symbol(sym.Op_asigMult, yychar, yyline, yytext());}
/* Asignacion y division */
( "/=" ) {return new Symbol(sym.Op_asigDiv, yychar, yyline, yytext());}
/* Asignacion y modulo */
( "%=" ) {return new Symbol(sym.Op_asigModulo, yychar, yyline, yytext());}

/* Operadores Incremento */
( "++" ) {return new Symbol(sym.Op_incremento, yychar, yyline, yytext());}
/* Operadores decremento */
( "--" ) {return new Symbol(sym.Op_decremento, yychar, yyline, yytext());}

/*Operadores Booleanos*/
/* True */
(true) {return new Symbol(sym.Op_boolTrue, yychar, yyline, yytext());}
/* False */
(false) {return new Symbol(sym.Op_boolFalse, yychar, yyline, yytext());}

/* Parentesis de apertura */
( "(" ) {return new Symbol(sym.Parent_a, yychar, yyline, yytext());}
/* Parentesis de cierre */
( ")" ) {return new Symbol(sym.Parent_c, yychar, yyline, yytext());}

/* Llave de apertura */
( "{" ) {return new Symbol(sym.Llave_a, yychar, yyline, yytext());}
/* Llave de cierre */
( "}" ) {return new Symbol(sym.Llave_c, yychar, yyline, yytext());}

/* Corchete de apertura */
( "[" ) {return new Symbol(sym.Corchete_a, yychar, yyline, yytext());}
/* Corchete de cierre */
( "]" ) {return new Symbol(sym.Corchete_c, yychar, yyline, yytext());}

/* Marcador de importación */
( #include ) {return new Symbol(sym.Include, yychar, yyline, yytext());}

/* Marcador de inicio de IOStream */
( iostream ) {return new Symbol(sym.Iostream, yychar, yyline, yytext());}

/* Marcador de Using */
( using ) {return new Symbol(sym.Using, yychar, yyline, yytext());}
/* Marcador de NameSpace */
( namespace ) {return new Symbol(sym.Namespace, yychar, yyline, yytext());}
/* Marcador de STD */
( std ) {return new Symbol(sym.Std, yychar, yyline, yytext());}

/* Marcador de inicio de algoritmo */
( "main" ) {return new Symbol(sym.Main, yychar, yyline, yytext());}

/* Marcador de inicio de metodos */
( "void" ) {return new Symbol(sym.Void, yychar, yyline, yytext());}

/* Marcador de salida */
( break ) {return new Symbol(sym.Break, yychar, yyline, yytext());}

/* Marcador de inicio de impresion en pantalla */
( "printf" ) {return new Symbol(sym.Printf, yychar, yyline, yytext());}

/* Marcador de inicio de impresion en pantalla */
( "scanf" ) {return new Symbol(sym.Scanf, yychar, yyline, yytext());}

/* Cin */
( cin ) {return new Symbol(sym.Cin, yychar, yyline, yytext());}
/* Cout */
( cout ) {return new Symbol(sym.Cout, yychar, yyline, yytext());}

/* Return */
( return ) {return new Symbol(sym.Return, yychar, yyline, yytext());}
/* Define */
( #define ) {return new Symbol(sym.Define, yychar, yyline, yytext());}

/* Punto y coma */
( ";" ) {return new Symbol(sym.P_coma, yychar, yyline, yytext());}
/* Punto */
( "." ) {return new Symbol(sym.Punto, yychar, yyline, yytext());}
/* Dos puntos */
( ":" ) {return new Symbol(sym.DPuntos, yychar, yyline, yytext());}

/* Identificador */
{L}({L}|{D})* {return new Symbol(sym.Identificador, yychar, yyline, yytext());}

/* Numero */
("(-"{D}+")")|{D}+ {return new Symbol(sym.Numero, yychar, yyline, yytext());}

/* Error de analisis */
 . {return new Symbol(sym.ERROR, yychar, yyline, yytext());}

