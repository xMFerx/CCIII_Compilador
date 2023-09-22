package SoloLexico;

//María Fernanda Pérez Hernandez - 20211020002
//Juan Esteban Carrillo Garcia - 20212020147

public enum Tokens {
    // Tipos de datos
    Int,
    Doble,
    Char,
    Float,
    Long,
    Short,
    Unsigned,
    Signed,

    // Palabras clave de control de flujo
    IF,
    ELSE,
    WHILE,
    FOR,
    DO,
    SWITCH,
    CASE,
    DEFAULT,
    BREAK,
    CONTINUE,
    RETURN,

    // Palabras clave y modificadores
    CONST,
    VOLATILE,
    STATIC,
    EXTERN,
    REGISTER,
    TYPEDEF,

    // Operadores de asignación
    ASSIGN_ADD,    // +=
    ASSIGN_SUB,    // -=
    ASSIGN_MUL,    // *=
    ASSIGN_DIV,    // /=
    ASSIGN_MOD,    // %=
    ASSIGN_AND,    // &=
    ASSIGN_OR,     // |=
    ASSIGN_XOR,    // ^=
    ASSIGN_LEFT,   // <<=
    ASSIGN_RIGHT,  // >>=

    // Operadores incremento/decremento
    INCREMENT,     // ++
    DECREMENT,     // --

    // Operadores ternarios
    QUESTION_MARK, // ?
    COLON,         // :

    // Operadores de bits
    BITWISE_AND,   // &
    BITWISE_OR,    // |
    BITWISE_XOR,   // ^
    BITWISE_NOT,   // ~

    // Operadores de desplazamiento
    SHIFT_LEFT,    // <<
    SHIFT_RIGHT,   // >>

    // Otros símbolos
    AMPERSAND,     // &
    PIPE,          // |
    TILDE,         // ~
    ARROW,         // ->

    // Constantes booleanas
    TRUE,
    FALSE,

    // Símbolos del preprocesador
    DEFINE,
    INCLUDE,
    IFDEF,
    IFNDEF,
    ENDIF,
    ERROR,
    PRAGMA,

    // Otros tokens
    Main,
    Identificador,
    Numero,
    Cadena,
    Comillas,
    P_coma,
    Parent_a,
    Parent_c,
    Llave_a,
    Llave_c,
    Corchete_a,
    Corchete_c,
    Porcentaje,

    // Operadores aritméticos
    Igual,         // =
    Suma,          // +
    Resta,         // -
    Multiplicacion,// *
    Division,      // /

    // Otros tokens
    Linea,
    SIZEOF,
}

