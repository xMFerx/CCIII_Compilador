package Analizador;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Analizadores {
    public static void main(String[] args) throws Exception {
        // Rutas de los archivos de definición léxica y sintáctica
        String path = "src/Analizador/Lexico.flex";
        String path1 = "src/Analizador/LexicoCup.flex";
        System.out.println(path1);

        // Rutas y opciones para la generación del analizador sintáctico con Java Cup
        String[] pathSintaxis = {"-parser", "Sintaxis", "src/Analizador/Sintaxis.cup"};

        // Llamada a la función para generar los analizadores
        generarAnalizador(path, path1, pathSintaxis);
    }

    public static void generarAnalizador(String path, String path1, String[] pathSintaxis) throws IOException, Exception {
        // Generación del analizador léxico a partir del archivo de definición Lexico.flex
        File arc;
        arc = new File(path);
        JFlex.Main.generate(arc);

        // Generación del analizador léxico a partir del archivo de definición LexicoCup.flex
        arc = new File(path1);
        JFlex.Main.generate(arc);

        // Generación del analizador sintáctico a partir del archivo de definición Sintaxis.cup
        java_cup.Main.main(pathSintaxis);

        // Movimiento y manejo de archivos generados
        Path pathSymbol = Paths.get("src/Analizador/sym.java");
        if (Files.exists(pathSymbol)) {
            Files.delete(pathSymbol);
        }
        Files.move(Paths.get("sym.java"), Paths.get("src/Analizador/sym.java"));

        Path pathSintaxis1 = Paths.get("src/Analizador/Sintaxis.java");
        if (Files.exists(pathSintaxis1)) {
            Files.delete(pathSintaxis1);
        }
        Files.move(Paths.get("Sintaxis.java"), Paths.get("src/Analizador/Sintaxis.java"));
    }
}

