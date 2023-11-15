/* The following code was generated by JFlex 1.4.3 on 14/11/23, 3:48 p. m. */

package Analizador;
import java_cup.runtime.Symbol;

/*  José Luis Quintero Cañizalez - Edison Mauricio Riaño Alvarado */


/**
 * This class is a scanner generated by 
 * <a href="http://www.jflex.de/">JFlex</a> 1.4.3
 * on 14/11/23, 3:48 p. m. from the specification file
 * <tt>src/Analizador/LexicoCup.flex</tt>
 */
class LexicoCup implements java_cup.runtime.Scanner {

  /** This character denotes the end of file */
  public static final int YYEOF = -1;

  /** initial size of the lookahead buffer */
  private static final int ZZ_BUFFERSIZE = 16384;

  /** lexical states */
  public static final int YYINITIAL = 0;

  /**
   * ZZ_LEXSTATE[l] is the state in the DFA for the lexical state l
   * ZZ_LEXSTATE[l+1] is the state in the DFA for the lexical state l
   *                  at the beginning of a line
   * l is of the form l = 2*k, k a non negative integer
   */
  private static final int ZZ_LEXSTATE[] = { 
     0, 0
  };

  /** 
   * Translates characters to character classes
   */
  private static final char [] ZZ_CMAP = {
     0,  0,  0,  0,  0,  0,  0,  0,  0,  3,  5,  0,  0,  3,  0,  0, 
     0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0, 
     3, 34,  6, 43,  0, 31, 32,  7, 37, 38, 30, 28,  3, 29, 49,  4, 
     2,  2,  2,  2,  2,  2,  2,  2,  2,  2, 50, 48, 36, 27, 35,  0, 
     0,  1,  1,  1,  1,  1,  1,  1,  1,  1,  1,  1,  1,  1,  1,  1, 
     1,  1,  1,  1,  1,  1,  1,  1,  1,  1,  1, 41,  8, 42,  0,  1, 
     0, 17,  9, 15, 23, 12, 22, 21, 16, 13,  1, 47, 19, 44, 14, 20, 
    45,  1, 18, 25, 11, 24, 46, 26,  1, 10,  1, 39, 33, 40,  0,  0, 
     0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0, 
     0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0, 
     0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0, 
     0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0, 
     0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0, 
     0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0, 
     0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0, 
     0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0
  };

  /** 
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\1\0\1\1\1\2\1\3\1\4\1\5\1\6\1\7"+
    "\1\10\15\2\1\11\1\12\1\13\1\14\1\15\1\16"+
    "\1\17\1\20\1\21\1\22\1\23\1\24\1\25\1\26"+
    "\1\27\1\30\1\1\3\2\1\31\1\32\1\33\1\4"+
    "\1\34\7\2\1\35\13\2\1\36\5\2\1\37\1\40"+
    "\1\41\1\42\1\43\1\44\1\45\1\46\1\47\1\50"+
    "\1\51\1\52\1\53\1\54\3\0\10\2\1\55\2\2"+
    "\1\56\7\2\1\57\4\2\1\60\3\2\3\0\3\2"+
    "\1\61\1\2\1\62\1\63\1\64\2\2\1\65\1\66"+
    "\1\67\1\2\1\70\11\2\1\3\2\0\1\71\1\2"+
    "\1\72\1\73\3\2\1\74\1\75\2\2\1\76\1\2"+
    "\1\77\1\2\1\100\2\0\3\2\1\101\1\2\1\102"+
    "\1\103\1\104\2\0\1\105\2\2\1\106\1\0\1\107"+
    "\1\110\1\2\1\111\1\112";

  private static int [] zzUnpackAction() {
    int [] result = new int[185];
    int offset = 0;
    offset = zzUnpackAction(ZZ_ACTION_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAction(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /** 
   * Translates a state to a row index in the transition table
   */
  private static final int [] ZZ_ROWMAP = zzUnpackRowMap();

  private static final String ZZ_ROWMAP_PACKED_0 =
    "\0\0\0\63\0\146\0\231\0\314\0\377\0\63\0\63"+
    "\0\63\0\u0132\0\u0165\0\u0198\0\u01cb\0\u01fe\0\u0231\0\u0264"+
    "\0\u0297\0\u02ca\0\u02fd\0\u0330\0\u0363\0\u0396\0\u03c9\0\u03fc"+
    "\0\u042f\0\u0462\0\u0495\0\u04c8\0\u04fb\0\u052e\0\u0561\0\u0594"+
    "\0\u05c7\0\63\0\63\0\63\0\63\0\63\0\u05fa\0\u062d"+
    "\0\u0660\0\u0693\0\63\0\63\0\63\0\u06c6\0\63\0\u06f9"+
    "\0\u072c\0\u075f\0\u0792\0\u07c5\0\u07f8\0\u082b\0\146\0\u085e"+
    "\0\u0891\0\u08c4\0\u08f7\0\u092a\0\u095d\0\u0990\0\u09c3\0\u09f6"+
    "\0\u0a29\0\u0a5c\0\u0a8f\0\u0ac2\0\u0af5\0\u0b28\0\u0b5b\0\u0b8e"+
    "\0\63\0\63\0\63\0\63\0\63\0\63\0\63\0\63"+
    "\0\63\0\63\0\63\0\63\0\63\0\63\0\u0bc1\0\u0bf4"+
    "\0\u0c27\0\u0c5a\0\u0c8d\0\u0cc0\0\u0cf3\0\u0d26\0\u0d59\0\u0d8c"+
    "\0\u0dbf\0\146\0\u0df2\0\u0e25\0\146\0\u0e58\0\u0e8b\0\u0ebe"+
    "\0\u0ef1\0\u0f24\0\u0f57\0\u0f8a\0\146\0\u0fbd\0\u0ff0\0\u1023"+
    "\0\u1056\0\146\0\u1089\0\u10bc\0\u10ef\0\u1122\0\u1155\0\u1188"+
    "\0\u11bb\0\u11ee\0\u1221\0\146\0\u1254\0\146\0\146\0\146"+
    "\0\u1287\0\u12ba\0\146\0\146\0\146\0\u12ed\0\146\0\u1320"+
    "\0\u1353\0\u1386\0\u13b9\0\u13ec\0\u141f\0\u1452\0\u1485\0\u14b8"+
    "\0\63\0\u14eb\0\u151e\0\146\0\u1551\0\146\0\146\0\u1584"+
    "\0\u15b7\0\u15ea\0\146\0\146\0\u161d\0\u1650\0\146\0\u1683"+
    "\0\146\0\u16b6\0\146\0\u16e9\0\u171c\0\u174f\0\u1782\0\u17b5"+
    "\0\146\0\u17e8\0\146\0\146\0\146\0\u181b\0\u184e\0\146"+
    "\0\u1881\0\u18b4\0\146\0\u18e7\0\63\0\146\0\u191a\0\63"+
    "\0\146";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[185];
    int offset = 0;
    offset = zzUnpackRowMap(ZZ_ROWMAP_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackRowMap(String packed, int offset, int [] result) {
    int i = 0;  /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int high = packed.charAt(i++) << 16;
      result[j++] = high | packed.charAt(i++);
    }
    return j;
  }

  /** 
   * The transition table of the DFA
   */
  private static final int [] ZZ_TRANS = zzUnpackTrans();

  private static final String ZZ_TRANS_PACKED_0 =
    "\1\2\1\3\1\4\1\5\1\6\1\5\1\7\1\10"+
    "\1\11\1\12\1\3\1\13\1\14\1\15\1\16\1\17"+
    "\2\3\1\20\1\21\2\3\1\22\1\23\1\24\1\25"+
    "\1\26\1\27\1\30\1\31\1\32\1\33\1\34\1\35"+
    "\1\36\1\37\1\40\1\41\1\42\1\43\1\44\1\45"+
    "\1\46\1\47\1\50\1\51\1\52\1\3\1\53\1\54"+
    "\1\55\64\0\2\3\6\0\22\3\21\0\4\3\5\0"+
    "\1\4\63\0\1\5\1\0\1\5\61\0\1\56\26\0"+
    "\1\57\30\0\2\3\6\0\1\3\1\60\7\3\1\61"+
    "\1\3\1\62\6\3\21\0\4\3\4\0\2\3\6\0"+
    "\11\3\1\63\10\3\21\0\4\3\4\0\2\3\6\0"+
    "\12\3\1\64\7\3\21\0\4\3\4\0\2\3\6\0"+
    "\5\3\1\65\5\3\1\66\1\3\1\67\4\3\21\0"+
    "\4\3\4\0\2\3\6\0\10\3\1\70\11\3\21\0"+
    "\4\3\4\0\2\3\6\0\4\3\1\71\2\3\1\72"+
    "\1\73\2\3\1\74\6\3\21\0\4\3\4\0\2\3"+
    "\6\0\3\3\1\75\16\3\21\0\4\3\4\0\2\3"+
    "\6\0\13\3\1\76\6\3\21\0\4\3\4\0\2\3"+
    "\6\0\10\3\1\77\1\3\1\100\1\101\6\3\21\0"+
    "\4\3\4\0\2\3\6\0\3\3\1\102\7\3\1\103"+
    "\6\3\21\0\4\3\4\0\2\3\6\0\20\3\1\104"+
    "\1\3\21\0\4\3\4\0\2\3\6\0\2\3\1\105"+
    "\3\3\1\106\12\3\1\107\21\0\4\3\4\0\2\3"+
    "\6\0\7\3\1\110\12\3\21\0\4\3\36\0\1\111"+
    "\62\0\1\112\1\113\61\0\1\114\1\0\1\115\60\0"+
    "\1\116\62\0\1\117\67\0\1\120\63\0\1\121\54\0"+
    "\1\122\62\0\1\123\7\0\1\124\52\0\1\125\10\0"+
    "\1\126\53\0\1\127\42\0\1\130\11\0\1\131\34\0"+
    "\2\3\6\0\10\3\1\132\11\3\21\0\4\3\4\0"+
    "\2\3\6\0\11\3\1\133\10\3\21\0\4\3\4\0"+
    "\2\3\6\0\13\3\1\134\6\3\21\0\4\3\3\0"+
    "\5\56\1\0\55\56\1\0\2\3\6\0\2\3\1\135"+
    "\17\3\21\0\4\3\4\0\2\3\6\0\3\3\1\136"+
    "\16\3\21\0\4\3\4\0\2\3\6\0\13\3\1\137"+
    "\6\3\21\0\4\3\4\0\2\3\6\0\17\3\1\140"+
    "\2\3\21\0\4\3\4\0\2\3\6\0\20\3\1\141"+
    "\1\3\21\0\4\3\4\0\2\3\6\0\2\3\1\142"+
    "\17\3\21\0\4\3\4\0\2\3\6\0\20\3\1\143"+
    "\1\3\21\0\4\3\4\0\2\3\6\0\22\3\21\0"+
    "\1\144\3\3\4\0\2\3\6\0\5\3\1\145\14\3"+
    "\21\0\4\3\4\0\2\3\6\0\10\3\1\146\11\3"+
    "\21\0\4\3\4\0\2\3\6\0\20\3\1\147\1\3"+
    "\21\0\4\3\4\0\2\3\6\0\17\3\1\150\2\3"+
    "\21\0\4\3\4\0\2\3\6\0\2\3\1\151\17\3"+
    "\21\0\4\3\4\0\2\3\6\0\5\3\1\152\14\3"+
    "\21\0\4\3\4\0\2\3\6\0\12\3\1\153\7\3"+
    "\21\0\4\3\4\0\2\3\6\0\13\3\1\154\6\3"+
    "\21\0\4\3\4\0\2\3\6\0\11\3\1\155\10\3"+
    "\21\0\4\3\4\0\2\3\6\0\15\3\1\156\4\3"+
    "\21\0\4\3\4\0\2\3\6\0\17\3\1\157\2\3"+
    "\21\0\4\3\4\0\2\3\6\0\4\3\1\160\15\3"+
    "\21\0\4\3\4\0\2\3\6\0\11\3\1\161\4\3"+
    "\1\162\3\3\21\0\4\3\4\0\2\3\6\0\10\3"+
    "\1\163\11\3\21\0\4\3\4\0\2\3\6\0\4\3"+
    "\1\164\15\3\21\0\4\3\4\0\2\3\6\0\4\3"+
    "\1\165\15\3\21\0\4\3\5\0\1\166\76\0\1\167"+
    "\60\0\1\170\47\0\2\3\6\0\4\3\1\171\15\3"+
    "\21\0\4\3\4\0\2\3\6\0\4\3\1\172\15\3"+
    "\21\0\4\3\4\0\2\3\6\0\4\3\1\173\15\3"+
    "\21\0\4\3\4\0\2\3\6\0\3\3\1\174\16\3"+
    "\21\0\4\3\4\0\2\3\6\0\10\3\1\175\11\3"+
    "\21\0\4\3\4\0\2\3\6\0\12\3\1\176\7\3"+
    "\21\0\4\3\4\0\2\3\6\0\3\3\1\177\16\3"+
    "\21\0\4\3\4\0\2\3\6\0\3\3\1\200\16\3"+
    "\21\0\4\3\4\0\2\3\6\0\2\3\1\201\17\3"+
    "\21\0\4\3\4\0\2\3\6\0\3\3\1\202\16\3"+
    "\21\0\4\3\4\0\2\3\6\0\11\3\1\203\10\3"+
    "\21\0\4\3\4\0\2\3\6\0\3\3\1\204\16\3"+
    "\21\0\4\3\4\0\2\3\6\0\2\3\1\205\17\3"+
    "\21\0\4\3\4\0\2\3\6\0\17\3\1\206\2\3"+
    "\21\0\4\3\4\0\2\3\6\0\14\3\1\207\5\3"+
    "\21\0\4\3\4\0\2\3\6\0\20\3\1\210\1\3"+
    "\21\0\4\3\4\0\2\3\6\0\10\3\1\211\11\3"+
    "\21\0\4\3\4\0\2\3\6\0\10\3\1\212\11\3"+
    "\21\0\4\3\4\0\2\3\6\0\1\213\21\3\21\0"+
    "\4\3\4\0\2\3\6\0\5\3\1\214\14\3\21\0"+
    "\4\3\4\0\2\3\6\0\4\3\1\215\15\3\21\0"+
    "\4\3\4\0\2\3\6\0\5\3\1\216\14\3\21\0"+
    "\4\3\4\0\2\3\6\0\2\3\1\217\17\3\21\0"+
    "\4\3\4\0\2\3\6\0\12\3\1\220\7\3\21\0"+
    "\4\3\5\0\1\166\43\0\1\221\33\0\1\222\71\0"+
    "\1\223\35\0\2\3\6\0\5\3\1\224\14\3\21\0"+
    "\4\3\4\0\2\3\6\0\5\3\1\225\14\3\21\0"+
    "\4\3\4\0\2\3\6\0\16\3\1\226\3\3\21\0"+
    "\4\3\4\0\2\3\6\0\22\3\21\0\3\3\1\227"+
    "\4\0\2\3\6\0\11\3\1\230\10\3\21\0\4\3"+
    "\4\0\2\3\6\0\20\3\1\231\1\3\21\0\4\3"+
    "\4\0\2\3\6\0\11\3\1\232\10\3\21\0\4\3"+
    "\4\0\2\3\6\0\3\3\1\233\16\3\21\0\4\3"+
    "\4\0\2\3\6\0\2\3\1\234\17\3\21\0\4\3"+
    "\4\0\2\3\6\0\17\3\1\235\2\3\21\0\4\3"+
    "\4\0\2\3\6\0\12\3\1\236\7\3\21\0\4\3"+
    "\4\0\2\3\6\0\14\3\1\237\5\3\21\0\4\3"+
    "\4\0\2\3\6\0\5\3\1\240\14\3\21\0\4\3"+
    "\4\0\2\3\6\0\15\3\1\241\4\3\21\0\4\3"+
    "\4\0\2\3\6\0\6\3\1\242\13\3\21\0\4\3"+
    "\4\0\2\3\6\0\3\3\1\243\16\3\21\0\4\3"+
    "\26\0\1\244\54\0\1\245\46\0\2\3\6\0\2\3"+
    "\1\246\17\3\21\0\4\3\4\0\2\3\6\0\3\3"+
    "\1\247\16\3\21\0\4\3\4\0\2\3\6\0\22\3"+
    "\21\0\1\3\1\250\2\3\4\0\2\3\6\0\5\3"+
    "\1\251\14\3\21\0\4\3\4\0\2\3\6\0\12\3"+
    "\1\252\7\3\21\0\4\3\4\0\2\3\6\0\3\3"+
    "\1\253\16\3\21\0\4\3\4\0\2\3\6\0\14\3"+
    "\1\254\5\3\21\0\4\3\4\0\2\3\6\0\7\3"+
    "\1\255\12\3\21\0\4\3\33\0\1\256\50\0\1\257"+
    "\45\0\2\3\6\0\15\3\1\260\4\3\21\0\4\3"+
    "\4\0\2\3\6\0\10\3\1\261\11\3\21\0\4\3"+
    "\4\0\2\3\6\0\10\3\1\262\11\3\21\0\4\3"+
    "\4\0\2\3\6\0\2\3\1\263\17\3\21\0\4\3"+
    "\32\0\1\264\47\0\1\265\47\0\2\3\6\0\22\3"+
    "\21\0\1\266\3\3\4\0\2\3\6\0\6\3\1\267"+
    "\13\3\21\0\4\3\17\0\1\270\47\0\2\3\6\0"+
    "\3\3\1\271\16\3\21\0\4\3\3\0";

  private static int [] zzUnpackTrans() {
    int [] result = new int[6477];
    int offset = 0;
    offset = zzUnpackTrans(ZZ_TRANS_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackTrans(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      value--;
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /* error codes */
  private static final int ZZ_UNKNOWN_ERROR = 0;
  private static final int ZZ_NO_MATCH = 1;
  private static final int ZZ_PUSHBACK_2BIG = 2;

  /* error messages for the codes above */
  private static final String ZZ_ERROR_MSG[] = {
    "Unkown internal scanner error",
    "Error: could not match input",
    "Error: pushback value was too large"
  };

  /**
   * ZZ_ATTRIBUTE[aState] contains the attributes of state <code>aState</code>
   */
  private static final int [] ZZ_ATTRIBUTE = zzUnpackAttribute();

  private static final String ZZ_ATTRIBUTE_PACKED_0 =
    "\1\0\1\11\4\1\3\11\30\1\5\11\4\1\3\11"+
    "\1\1\1\11\31\1\16\11\3\0\34\1\3\0\30\1"+
    "\1\11\2\0\20\1\2\0\10\1\2\0\4\1\1\0"+
    "\1\11\2\1\1\11\1\1";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[185];
    int offset = 0;
    offset = zzUnpackAttribute(ZZ_ATTRIBUTE_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAttribute(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }

  /** the input device */
  private java.io.Reader zzReader;

  /** the current state of the DFA */
  private int zzState;

  /** the current lexical state */
  private int zzLexicalState = YYINITIAL;

  /** this buffer contains the current text to be matched and is
      the source of the yytext() string */
  private char zzBuffer[] = new char[ZZ_BUFFERSIZE];

  /** the textposition at the last accepting state */
  private int zzMarkedPos;

  /** the current text position in the buffer */
  private int zzCurrentPos;

  /** startRead marks the beginning of the yytext() string in the buffer */
  private int zzStartRead;

  /** endRead marks the last character in the buffer, that has been read
      from input */
  private int zzEndRead;

  /** number of newlines encountered up to the start of the matched text */
  private int yyline;

  /** the number of characters up to the start of the matched text */
  private int yychar;

  /**
   * the number of characters from the last newline up to the start of the 
   * matched text
   */
  private int yycolumn;

  /** 
   * zzAtBOL == true <=> the scanner is currently at the beginning of a line
   */
  private boolean zzAtBOL = true;

  /** zzAtEOF == true <=> the scanner is at the EOF */
  private boolean zzAtEOF;

  /** denotes if the user-EOF-code has already been executed */
  private boolean zzEOFDone;

  /* user code: */
    private Symbol symbol(int type, Object value){
        return new Symbol(type, yyline, yycolumn, value);
    }
    private Symbol symbol(int type){
        return new Symbol(type, yyline, yycolumn);
    }


  /**
   * Creates a new scanner
   * There is also a java.io.InputStream version of this constructor.
   *
   * @param   in  the java.io.Reader to read input from.
   */
  LexicoCup(java.io.Reader in) {
    this.zzReader = in;
  }

  /**
   * Creates a new scanner.
   * There is also java.io.Reader version of this constructor.
   *
   * @param   in  the java.io.Inputstream to read input from.
   */
  LexicoCup(java.io.InputStream in) {
    this(new java.io.InputStreamReader(in));
  }


  /**
   * Refills the input buffer.
   *
   * @return      <code>false</code>, iff there was new input.
   * 
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  private boolean zzRefill() throws java.io.IOException {

    /* first: make room (if you can) */
    if (zzStartRead > 0) {
      System.arraycopy(zzBuffer, zzStartRead,
                       zzBuffer, 0,
                       zzEndRead-zzStartRead);

      /* translate stored positions */
      zzEndRead-= zzStartRead;
      zzCurrentPos-= zzStartRead;
      zzMarkedPos-= zzStartRead;
      zzStartRead = 0;
    }

    /* is the buffer big enough? */
    if (zzCurrentPos >= zzBuffer.length) {
      /* if not: blow it up */
      char newBuffer[] = new char[zzCurrentPos*2];
      System.arraycopy(zzBuffer, 0, newBuffer, 0, zzBuffer.length);
      zzBuffer = newBuffer;
    }

    /* finally: fill the buffer with new input */
    int numRead = zzReader.read(zzBuffer, zzEndRead,
                                            zzBuffer.length-zzEndRead);

    if (numRead > 0) {
      zzEndRead+= numRead;
      return false;
    }
    // unlikely but not impossible: read 0 characters, but not at end of stream    
    if (numRead == 0) {
      int c = zzReader.read();
      if (c == -1) {
        return true;
      } else {
        zzBuffer[zzEndRead++] = (char) c;
        return false;
      }     
    }

	// numRead < 0
    return true;
  }

    
  /**
   * Closes the input stream.
   */
  public final void yyclose() throws java.io.IOException {
    zzAtEOF = true;            /* indicate end of file */
    zzEndRead = zzStartRead;  /* invalidate buffer    */

    if (zzReader != null)
      zzReader.close();
  }


  /**
   * Resets the scanner to read from a new input stream.
   * Does not close the old reader.
   *
   * All internal variables are reset, the old input stream 
   * <b>cannot</b> be reused (internal buffer is discarded and lost).
   * Lexical state is set to <tt>ZZ_INITIAL</tt>.
   *
   * @param reader   the new input stream 
   */
  public final void yyreset(java.io.Reader reader) {
    zzReader = reader;
    zzAtBOL  = true;
    zzAtEOF  = false;
    zzEOFDone = false;
    zzEndRead = zzStartRead = 0;
    zzCurrentPos = zzMarkedPos = 0;
    yyline = yychar = yycolumn = 0;
    zzLexicalState = YYINITIAL;
  }


  /**
   * Returns the current lexical state.
   */
  public final int yystate() {
    return zzLexicalState;
  }


  /**
   * Enters a new lexical state
   *
   * @param newState the new lexical state
   */
  public final void yybegin(int newState) {
    zzLexicalState = newState;
  }


  /**
   * Returns the text matched by the current regular expression.
   */
  public final String yytext() {
    return new String( zzBuffer, zzStartRead, zzMarkedPos-zzStartRead );
  }


  /**
   * Returns the character at position <tt>pos</tt> from the 
   * matched text. 
   * 
   * It is equivalent to yytext().charAt(pos), but faster
   *
   * @param pos the position of the character to fetch. 
   *            A value from 0 to yylength()-1.
   *
   * @return the character at position pos
   */
  public final char yycharat(int pos) {
    return zzBuffer[zzStartRead+pos];
  }


  /**
   * Returns the length of the matched text region.
   */
  public final int yylength() {
    return zzMarkedPos-zzStartRead;
  }


  /**
   * Reports an error that occured while scanning.
   *
   * In a wellformed scanner (no or only correct usage of 
   * yypushback(int) and a match-all fallback rule) this method 
   * will only be called with things that "Can't Possibly Happen".
   * If this method is called, something is seriously wrong
   * (e.g. a JFlex bug producing a faulty scanner etc.).
   *
   * Usual syntax/scanner level error handling should be done
   * in error fallback rules.
   *
   * @param   errorCode  the code of the errormessage to display
   */
  private void zzScanError(int errorCode) {
    String message;
    try {
      message = ZZ_ERROR_MSG[errorCode];
    }
    catch (ArrayIndexOutOfBoundsException e) {
      message = ZZ_ERROR_MSG[ZZ_UNKNOWN_ERROR];
    }

    throw new Error(message);
  } 


  /**
   * Pushes the specified amount of characters back into the input stream.
   *
   * They will be read again by then next call of the scanning method
   *
   * @param number  the number of characters to be read again.
   *                This number must not be greater than yylength()!
   */
  public void yypushback(int number)  {
    if ( number > yylength() )
      zzScanError(ZZ_PUSHBACK_2BIG);

    zzMarkedPos -= number;
  }


  /**
   * Contains user EOF-code, which will be executed exactly once,
   * when the end of file is reached
   */
  private void zzDoEOF() throws java.io.IOException {
    if (!zzEOFDone) {
      zzEOFDone = true;
      yyclose();
    }
  }


  /**
   * Resumes scanning until the next regular expression is matched,
   * the end of input is encountered or an I/O-Error occurs.
   *
   * @return      the next token
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  public java_cup.runtime.Symbol next_token() throws java.io.IOException {
    int zzInput;
    int zzAction;

    // cached fields:
    int zzCurrentPosL;
    int zzMarkedPosL;
    int zzEndReadL = zzEndRead;
    char [] zzBufferL = zzBuffer;
    char [] zzCMapL = ZZ_CMAP;

    int [] zzTransL = ZZ_TRANS;
    int [] zzRowMapL = ZZ_ROWMAP;
    int [] zzAttrL = ZZ_ATTRIBUTE;

    while (true) {
      zzMarkedPosL = zzMarkedPos;

      yychar+= zzMarkedPosL-zzStartRead;

      boolean zzR = false;
      for (zzCurrentPosL = zzStartRead; zzCurrentPosL < zzMarkedPosL;
                                                             zzCurrentPosL++) {
        switch (zzBufferL[zzCurrentPosL]) {
        case '\u000B':
        case '\u000C':
        case '\u0085':
        case '\u2028':
        case '\u2029':
          yyline++;
          zzR = false;
          break;
        case '\r':
          yyline++;
          zzR = true;
          break;
        case '\n':
          if (zzR)
            zzR = false;
          else {
            yyline++;
          }
          break;
        default:
          zzR = false;
        }
      }

      if (zzR) {
        // peek one character ahead if it is \n (if we have counted one line too much)
        boolean zzPeek;
        if (zzMarkedPosL < zzEndReadL)
          zzPeek = zzBufferL[zzMarkedPosL] == '\n';
        else if (zzAtEOF)
          zzPeek = false;
        else {
          boolean eof = zzRefill();
          zzEndReadL = zzEndRead;
          zzMarkedPosL = zzMarkedPos;
          zzBufferL = zzBuffer;
          if (eof) 
            zzPeek = false;
          else 
            zzPeek = zzBufferL[zzMarkedPosL] == '\n';
        }
        if (zzPeek) yyline--;
      }
      zzAction = -1;

      zzCurrentPosL = zzCurrentPos = zzStartRead = zzMarkedPosL;
  
      zzState = ZZ_LEXSTATE[zzLexicalState];


      zzForAction: {
        while (true) {
    
          if (zzCurrentPosL < zzEndReadL)
            zzInput = zzBufferL[zzCurrentPosL++];
          else if (zzAtEOF) {
            zzInput = YYEOF;
            break zzForAction;
          }
          else {
            // store back cached positions
            zzCurrentPos  = zzCurrentPosL;
            zzMarkedPos   = zzMarkedPosL;
            boolean eof = zzRefill();
            // get translated positions and possibly new buffer
            zzCurrentPosL  = zzCurrentPos;
            zzMarkedPosL   = zzMarkedPos;
            zzBufferL      = zzBuffer;
            zzEndReadL     = zzEndRead;
            if (eof) {
              zzInput = YYEOF;
              break zzForAction;
            }
            else {
              zzInput = zzBufferL[zzCurrentPosL++];
            }
          }
          int zzNext = zzTransL[ zzRowMapL[zzState] + zzCMapL[zzInput] ];
          if (zzNext == -1) break zzForAction;
          zzState = zzNext;

          int zzAttributes = zzAttrL[zzState];
          if ( (zzAttributes & 1) == 1 ) {
            zzAction = zzState;
            zzMarkedPosL = zzCurrentPosL;
            if ( (zzAttributes & 8) == 8 ) break zzForAction;
          }

        }
      }

      // store back cached position
      zzMarkedPos = zzMarkedPosL;

      switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
        case 36: 
          { return new Symbol(sym.Op_asigMult, yychar, yyline, yytext());
          }
        case 75: break;
        case 6: 
          { return new Symbol(sym.Comillas, yychar, yyline, yytext());
          }
        case 76: break;
        case 46: 
          { return new Symbol(sym.Cin, yychar, yyline, yytext());
          }
        case 77: break;
        case 34: 
          { return new Symbol(sym.Op_asigResta, yychar, yyline, yytext());
          }
        case 78: break;
        case 47: 
          { return new Symbol(sym.For, yychar, yyline, yytext());
          }
        case 79: break;
        case 51: 
          { return new Symbol(sym.Op_boolTrue, yychar, yyline, yytext());
          }
        case 80: break;
        case 71: 
          { return new Symbol(sym.Define, yychar, yyline, yytext());
          }
        case 81: break;
        case 43: 
          { return new Symbol(sym.Op_menorE, yychar, yyline, yytext());
          }
        case 82: break;
        case 39: 
          { return new Symbol(sym.Op_or, yychar, yyline, yytext());
          }
        case 83: break;
        case 32: 
          { return new Symbol(sym.Op_asigSuma, yychar, yyline, yytext());
          }
        case 84: break;
        case 14: 
          { return new Symbol(sym.Op_andB, yychar, yyline, yytext());
          }
        case 85: break;
        case 70: 
          { return new Symbol(sym.Default, yychar, yyline, yytext());
          }
        case 86: break;
        case 57: 
          { return new Symbol(sym.Main, yychar, yyline, yytext());
          }
        case 87: break;
        case 66: 
          { return new Symbol(sym.T_double, yychar, yyline, yytext());
          }
        case 88: break;
        case 21: 
          { return new Symbol(sym.Llave_a, yychar, yyline, yytext());
          }
        case 89: break;
        case 20: 
          { return new Symbol(sym.Parent_c, yychar, yyline, yytext());
          }
        case 90: break;
        case 44: 
          { return new Symbol(sym.Op_desIzq, yychar, yyline, yytext());
          }
        case 91: break;
        case 59: 
          { return new Symbol(sym.Break, yychar, yyline, yytext());
          }
        case 92: break;
        case 4: 
          { /*Ignore*/
          }
        case 93: break;
        case 7: 
          { return new Symbol(sym.Comillas_s, yychar, yyline, yytext());
          }
        case 94: break;
        case 67: 
          { return new Symbol(sym.Cadena, yychar, yyline, yytext());
          }
        case 95: break;
        case 68: 
          { return new Symbol(sym.Switch, yychar, yyline, yytext());
          }
        case 96: break;
        case 25: 
          { return new Symbol(sym.P_coma, yychar, yyline, yytext());
          }
        case 97: break;
        case 16: 
          { return new Symbol(sym.Op_not, yychar, yyline, yytext());
          }
        case 98: break;
        case 12: 
          { return new Symbol(sym.Multiplicacion, yychar, yyline, yytext());
          }
        case 99: break;
        case 28: 
          { return new Symbol(sym.Op_asigDiv, yychar, yyline, yytext());
          }
        case 100: break;
        case 1: 
          { return new Symbol(sym.ERROR, yychar, yyline, yytext());
          }
        case 101: break;
        case 55: 
          { return new Symbol(sym.Cout, yychar, yyline, yytext());
          }
        case 102: break;
        case 74: 
          { return new Symbol(sym.Namespace, yychar, yyline, yytext());
          }
        case 103: break;
        case 50: 
          { return new Symbol(sym.T_bool, yychar, yyline, yytext());
          }
        case 104: break;
        case 13: 
          { return new Symbol(sym.Modulo, yychar, yyline, yytext());
          }
        case 105: break;
        case 35: 
          { return new Symbol(sym.Op_decremento, yychar, yyline, yytext());
          }
        case 106: break;
        case 9: 
          { return new Symbol(sym.Igual, yychar, yyline, yytext());
          }
        case 107: break;
        case 54: 
          { return new Symbol(sym.Case, yychar, yyline, yytext());
          }
        case 108: break;
        case 2: 
          { return new Symbol(sym.Identificador, yychar, yyline, yytext());
          }
        case 109: break;
        case 24: 
          { return new Symbol(sym.Corchete_c, yychar, yyline, yytext());
          }
        case 110: break;
        case 61: 
          { return new Symbol(sym.T_float, yychar, yyline, yytext());
          }
        case 111: break;
        case 52: 
          { return new Symbol(sym.Else, yychar, yyline, yytext());
          }
        case 112: break;
        case 72: 
          { return new Symbol(sym.Iostream, yychar, yyline, yytext());
          }
        case 113: break;
        case 63: 
          { return new Symbol(sym.Scanf, yychar, yyline, yytext());
          }
        case 114: break;
        case 62: 
          { return new Symbol(sym.Using, yychar, yyline, yytext());
          }
        case 115: break;
        case 10: 
          { return new Symbol(sym.Suma, yychar, yyline, yytext());
          }
        case 116: break;
        case 42: 
          { return new Symbol(sym.Op_desDer, yychar, yyline, yytext());
          }
        case 117: break;
        case 53: 
          { return new Symbol(sym.T_char, yychar, yyline, yytext());
          }
        case 118: break;
        case 38: 
          { return new Symbol(sym.Op_and, yychar, yyline, yytext());
          }
        case 119: break;
        case 41: 
          { return new Symbol(sym.Op_mayorE, yychar, yyline, yytext());
          }
        case 120: break;
        case 45: 
          { return new Symbol(sym.T_int, yychar, yyline, yytext());
          }
        case 121: break;
        case 56: 
          { return new Symbol(sym.T_long, yychar, yyline, yytext());
          }
        case 122: break;
        case 73: 
          { return new Symbol(sym.Include, yychar, yyline, yytext());
          }
        case 123: break;
        case 29: 
          { return new Symbol(sym.If, yychar, yyline, yytext());
          }
        case 124: break;
        case 22: 
          { return new Symbol(sym.Llave_c, yychar, yyline, yytext());
          }
        case 125: break;
        case 31: 
          { return new Symbol(sym.Op_igual, yychar, yyline, yytext());
          }
        case 126: break;
        case 49: 
          { return new Symbol(sym.T_byte, yychar, yyline, yytext());
          }
        case 127: break;
        case 26: 
          { return new Symbol(sym.Punto, yychar, yyline, yytext());
          }
        case 128: break;
        case 58: 
          { return new Symbol(sym.Void, yychar, yyline, yytext());
          }
        case 129: break;
        case 19: 
          { return new Symbol(sym.Parent_a, yychar, yyline, yytext());
          }
        case 130: break;
        case 30: 
          { return new Symbol(sym.Do, yychar, yyline, yytext());
          }
        case 131: break;
        case 5: 
          { return new Symbol(sym.Division, yychar, yyline, yytext());
          }
        case 132: break;
        case 33: 
          { return new Symbol(sym.Op_incremento, yychar, yyline, yytext());
          }
        case 133: break;
        case 11: 
          { return new Symbol(sym.Resta, yychar, yyline, yytext());
          }
        case 134: break;
        case 18: 
          { return new Symbol(sym.Op_menor, yychar, yyline, yytext());
          }
        case 135: break;
        case 48: 
          { return new Symbol(sym.Std, yychar, yyline, yytext());
          }
        case 136: break;
        case 15: 
          { return new Symbol(sym.Op_orB, yychar, yyline, yytext());
          }
        case 137: break;
        case 40: 
          { return new Symbol(sym.Op_diferente, yychar, yyline, yytext());
          }
        case 138: break;
        case 60: 
          { return new Symbol(sym.Op_boolFalse, yychar, yyline, yytext());
          }
        case 139: break;
        case 17: 
          { return new Symbol(sym.Op_mayor, yychar, yyline, yytext());
          }
        case 140: break;
        case 65: 
          { return new Symbol(sym.Return, yychar, yyline, yytext());
          }
        case 141: break;
        case 64: 
          { return new Symbol(sym.While, yychar, yyline, yytext());
          }
        case 142: break;
        case 3: 
          { return new Symbol(sym.Numero, yychar, yyline, yytext());
          }
        case 143: break;
        case 37: 
          { return new Symbol(sym.Op_asigModulo, yychar, yyline, yytext());
          }
        case 144: break;
        case 69: 
          { return new Symbol(sym.Printf, yychar, yyline, yytext());
          }
        case 145: break;
        case 27: 
          { return new Symbol(sym.DPuntos, yychar, yyline, yytext());
          }
        case 146: break;
        case 8: 
          { return new Symbol(sym.Back, yychar, yyline, yytext());
          }
        case 147: break;
        case 23: 
          { return new Symbol(sym.Corchete_a, yychar, yyline, yytext());
          }
        case 148: break;
        default: 
          if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
            zzAtEOF = true;
            zzDoEOF();
              { return new java_cup.runtime.Symbol(sym.EOF); }
          } 
          else {
            zzScanError(ZZ_NO_MATCH);
          }
      }
    }
  }


}
