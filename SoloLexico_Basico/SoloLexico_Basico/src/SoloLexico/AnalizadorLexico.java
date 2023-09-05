package SoloLexico;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 *
 * @author mdelgado
 */
public class AnalizadorLexico {
    public static void main(String[] args) throws Exception {
        String caminoJFLEX= "../SoloLexico_Basico/src/SoloLexico/Lexico.flex";

        generarLex(caminoJFLEX);
    }
    public static void generarLex(String caminoJFLEX) throws IOException, Exception {
        File arc; 
        arc = new File(caminoJFLEX);
        JFlex.Main.generate(arc);       
    }
}
