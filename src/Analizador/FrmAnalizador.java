package Analizador;

import java.awt.Color;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.StringReader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.logging.Level;
import java.util.logging.Logger;
import java_cup.runtime.Symbol;
import javax.swing.JFileChooser;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.io.Reader;

/**
 *
 * @author mdelgadoh  iu
 */
public class FrmAnalizador extends javax.swing.JFrame {

    /**
     * Creates new form FrmAnalizador
     */
    public FrmAnalizador() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnALexico = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        Resultado = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtAnalizarLex = new javax.swing.JTextArea();
        btnArchivo = new javax.swing.JButton();
        btnBorrar = new javax.swing.JButton();
        btnASintactico = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtAnalizarSin = new javax.swing.JTextArea();
        btnBorrarSin = new javax.swing.JButton();
        btnBorrarCod = new javax.swing.JButton();
        btnGenIntermedio = new javax.swing.JButton();
        btnEjecutar = new javax.swing.JButton();
        btnGenEnsamblador = new javax.swing.JButton();
        btnGenObjeto = new javax.swing.JButton();
        btnGenEjecutable = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnALexico.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btnALexico.setText("Análisis Léxico");
        btnALexico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnALexicoActionPerformed(evt);
            }
        });

        Resultado.setColumns(20);
        Resultado.setRows(5);
        jScrollPane1.setViewportView(Resultado);

        txtAnalizarLex.setColumns(20);
        txtAnalizarLex.setRows(5);
        jScrollPane2.setViewportView(txtAnalizarLex);

        btnArchivo.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btnArchivo.setText("Abrir Fuente");
        btnArchivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnArchivoActionPerformed(evt);
            }
        });

        btnBorrar.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btnBorrar.setText("Borrar");
        btnBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBorrarActionPerformed(evt);
            }
        });

        btnASintactico.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btnASintactico.setText("Análisis Sintaxis");
        btnASintactico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnASintacticoActionPerformed(evt);
            }
        });

        txtAnalizarSin.setColumns(20);
        txtAnalizarSin.setRows(5);
        jScrollPane3.setViewportView(txtAnalizarSin);

        btnBorrarSin.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btnBorrarSin.setText("Borrar");
        btnBorrarSin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBorrarSinActionPerformed(evt);
            }
        });

        btnBorrarCod.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btnBorrarCod.setText("Borrar");
        btnBorrarCod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBorrarCodActionPerformed(evt);
            }
        });

        btnGenIntermedio.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btnGenIntermedio.setText("Intermedio");
        btnGenIntermedio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGenIntermedioActionPerformed(evt);
            }
        });

        btnEjecutar.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btnEjecutar.setText("Ejecutar");
        btnEjecutar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEjecutarActionPerformed(evt);
            }
        });

        btnGenEnsamblador.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btnGenEnsamblador.setText("Ensamblador");
        btnGenEnsamblador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGenEnsambladorActionPerformed(evt);
            }
        });

        btnGenObjeto.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btnGenObjeto.setText("Objeto");
        btnGenObjeto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGenObjetoActionPerformed(evt);
            }
        });

        btnGenEjecutable.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btnGenEjecutable.setText("Ejecutable");
        btnGenEjecutable.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGenEjecutableActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnArchivo, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 79, Short.MAX_VALUE)
                        .addComponent(btnBorrarCod))
                    .addComponent(btnASintactico)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(btnBorrarSin)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 368, Short.MAX_VALUE)
                            .addComponent(jScrollPane1))))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnALexico)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnBorrar, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane2))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnGenIntermedio)
                .addGap(18, 18, 18)
                .addComponent(btnGenEnsamblador)
                .addGap(18, 18, 18)
                .addComponent(btnGenObjeto)
                .addGap(18, 18, 18)
                .addComponent(btnGenEjecutable)
                .addGap(18, 18, 18)
                .addComponent(btnEjecutar)
                .addContainerGap(73, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnBorrar)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnArchivo)
                        .addComponent(btnBorrarCod)
                        .addComponent(btnALexico, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnASintactico)
                            .addComponent(btnBorrarSin))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane2))
                .addGap(18, 18, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnGenIntermedio)
                    .addComponent(btnGenEnsamblador)
                    .addComponent(btnGenObjeto)
                    .addComponent(btnEjecutar)
                    .addComponent(btnGenEjecutable))
                .addGap(22, 22, 22))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void analizarLexico() throws IOException {
        int cont = 1;

        String expr = (String) Resultado.getText();
        Lexico lexicos = new Lexico(new StringReader(expr));
        String resultado = "LINEA " + cont + "\t\tSIMBOLO\n";
        while (true) {
            Tokens token = lexicos.yylex();
            if (token == null) {
                txtAnalizarLex.setText(resultado);
                return;
            }
            switch (token) {
                case Linea:
                    cont++;
                    resultado += "LINEA " + cont + "\n";
                    break;
                case Comillas:
                    resultado += "  <Comillas>\t\t" + lexicos.lexemas + "\n";
                    break;
                case Cadena:
                    resultado += "  <Tipo de dato>\t" + lexicos.lexemas + "\n";
                    break;
                case T_int:
                    resultado += "  <Reservada int>\t" + lexicos.lexemas + "\n";
                    break;
                case T_byte:
                    resultado += "  <Reservada byte>\t" + lexicos.lexemas + "\n";
                    break;
                case T_char:
                    resultado += "  <Reservada char>\t" + lexicos.lexemas + "\n";
                    break;
                case T_long:
                    resultado += "  <Reservada long>\t" + lexicos.lexemas + "\n";
                    break;
                case T_float:
                    resultado += "  <Reservada float>\t" + lexicos.lexemas + "\n";
                    break;
                case T_bool:
                    resultado += "  <Reservada bool>\t" + lexicos.lexemas + "\n";
                    break;
                case T_double:
                    resultado += "  <Reservada double>\t" + lexicos.lexemas + "\n";
                    break;
                case If:
                    resultado += "  <Reservada if>\t" + lexicos.lexemas + "\n";
                    break;
                case Else:
                    resultado += "  <Reservada else>\t" + lexicos.lexemas + "\n";
                    break;
                case While:
                    resultado += "  <Reservada while>\t" + lexicos.lexemas + "\n";
                    break;
                case Switch:
                    resultado += "  <Reservada Switch>\t" + lexicos.lexemas + "\n";
                    break;
                case Case:
                    resultado += "  <Reservada Case>\t" + lexicos.lexemas + "\n";
                    break;
                case Default:
                    resultado += "  <Reservada Default>\t" + lexicos.lexemas + "\n";
                    break;
                case Back:
                    resultado += "  <backslash>\t" + lexicos.lexemas + "\n";
                    break;
                case Cout:
                    resultado += "  <Reservada cout>\t" + lexicos.lexemas + "\n";
                    break;
                case Cin:
                    resultado += "  <Reservada cin>\t" + lexicos.lexemas + "\n";
                    break;
                case Igual:
                    resultado += "  <Operador igual>\t" + lexicos.lexemas + "\n";
                    break;
                case Suma:
                    resultado += "  <Operador suma>\t" + lexicos.lexemas + "\n";
                    break;
                case Resta:
                    resultado += "  <Operador resta>\t" + lexicos.lexemas + "\n";
                    break;
                case Multiplicacion:
                    resultado += "  <Operador multiplicacion>\t" + lexicos.lexemas + "\n";
                    break;
                case Division:
                    resultado += "  <Operador division>\t" + lexicos.lexemas + "\n";
                    break;
                case Modulo:
                    resultado += "  <Operador modulo>\t" + lexicos.lexemas + "\n";
                    break;
                case Op_and:
                    resultado += "  <Operador logico AND>\t" + lexicos.lexemas + "\n";
                    break;                    
                case Op_or:
                    resultado += "  <Operador logico OR>\t" + lexicos.lexemas + "\n";
                    break;                    
                case Op_not:
                    resultado += "  <Operador logico NOT>\t" + lexicos.lexemas + "\n";
                    break;                    
                case Op_andB:
                    resultado += "  <Operador binario AND>\t" + lexicos.lexemas + "\n";
                    break;                    
                case Op_orB:
                    resultado += "  <Operador binario OR>\t" + lexicos.lexemas + "\n";
                    break;                    
                case Op_incremento:
                    resultado += "  <Operador incremento>\t" + lexicos.lexemas + "\n";
                    break;
                case Op_decremento:
                    resultado += "  <Operador decremento>\t" + lexicos.lexemas + "\n";
                    break;
                case Op_mayor:
                    resultado += "  <Operador  Mayor que>\t" + lexicos.lexemas + "\n";
                    break;
                case Op_menor:
                    resultado += "  <Operador  Menor que>\t" + lexicos.lexemas + "\n";
                    break;
                case Op_igual:
                    resultado += "  <Operador  Igual que>\t" + lexicos.lexemas + "\n";
                    break;
                case Op_diferente:
                    resultado += "  <Operador  Diferente que >\t" + lexicos.lexemas + "\n";
                    break;
                case Op_mayorE:
                    resultado += "  <Operador  Mayor o igual que>\t" + lexicos.lexemas + "\n";
                    break;
                case Op_menorE:
                    resultado += "  <Operador  Menor o igual que>\t" + lexicos.lexemas + "\n";
                    break;
                case Op_desIzq:
                    resultado += "  <Operador desplazamiento izq. >\t" + lexicos.lexemas + "\n";
                    break;
                case Op_desDer:
                    resultado += "  <Operador desplazamiento der.>\t" + lexicos.lexemas + "\n";
                    break;
                case Op_asigSuma:
                    resultado += "  <Operador atribucion y suma>\t" + lexicos.lexemas + "\n";
                    break;
                case Op_asigResta:
                    resultado += "  <Operador atribucion y resta>\t" + lexicos.lexemas + "\n";
                    break;
                case Op_asigMult:
                    resultado += "  <Operador atribucion y multiplicación>\t" + lexicos.lexemas + "\n";
                    break;
                case Op_asigDiv:
                    resultado += "  <Operador atribucion y división>\t" + lexicos.lexemas + "\n";
                    break;
                case Op_asigModulo:
                    resultado += "  <Operador atribucion y modulo>\t" + lexicos.lexemas + "\n";
                    break;
                case Op_boolTrue:
                    resultado += "  <Operador booleano True>\t" + lexicos.lexemas + "\n";
                    break;
                case Op_boolFalse:
                    resultado += "  <Operador booleano False>\t" + lexicos.lexemas + "\n";
                    break;
                case Parentesis_a:
                    resultado += "  <Parentesis de apertura>\t" + lexicos.lexemas + "\n";
                    break;
                case Parentesis_c:
                    resultado += "  <Parentesis de cierre>\t" + lexicos.lexemas + "\n";
                    break;
                case Llave_a:
                    resultado += "  <Llave de apertura>\t" + lexicos.lexemas + "\n";
                    break;
                case Llave_c:
                    resultado += "  <Llave de cierre>\t" + lexicos.lexemas + "\n";
                    break;
                case Corchete_a:
                    resultado += "  <Corchete de apertura>\t" + lexicos.lexemas + "\n";
                    break;
                case Corchete_c:
                    resultado += "  <Corchete de cierre>\t" + lexicos.lexemas + "\n";
                    break;
                case Main:
                    resultado += "  <Reservada main>\t" + lexicos.lexemas + "\n";
                    break;
                case Void:
                    resultado += "  <Reservada void>\t" + lexicos.lexemas + "\n";
                    break;
                case Break:
                    resultado += "  <Reservada break>\t" + lexicos.lexemas + "\n";
                    break;
                case Printf:
                    resultado += "  <Reservada printf>\t" + lexicos.lexemas + "\n";
                    break; 
                case Scanf:
                    resultado += "  <Reservada scanf>\t" + lexicos.lexemas + "\n";
                    break;                      
                case P_coma:
                    resultado += "  <Punto y coma>\t" + lexicos.lexemas + "\n";
                    break;
                case Punto:
                    resultado += "  <Punto>\t\t" + lexicos.lexemas + "\n";
                    break;
                case Identificador:
                    resultado += "  <Identificador>\t\t" + lexicos.lexemas + "\n";
                    break;
                case Numero:
                    resultado += "  <Numero>\t\t" + lexicos.lexemas + "\n";
                    break;
                case Using:
                    resultado += "  <Using>\t\t" + lexicos.lexemas + "\n";
                    break;
                case Namespace:
                    resultado += "  <Namespace>\t\t" + lexicos.lexemas + "\n";
                    break;
                case Std:
                    resultado += "  <STD>\t\t" + lexicos.lexemas + "\n";
                    break;
                case Include:
                    resultado += "  <Reservada #inlude>\t\t" + lexicos.lexemas + "\n";
                    break;
                case DPuntos:
                    resultado += "  <Dos puntos>\t\t" + lexicos.lexemas + "\n";
                    break;
                case Return:
                    resultado += "  <Return>\t\t" + lexicos.lexemas + "\n";
                    break;
                case Define:
                    resultado += "  <Definición de constante>\t\t" + lexicos.lexemas + "\n";
                    break;
                case Iostream:
                    resultado += "  <Definición de lib. IOSstream>\t\t" + lexicos.lexemas + "\n";
                    break;
                case ERROR:
                    resultado += "  <Simbolo no definido>\n";
                    break;
                default:
                    resultado += "  < " + lexicos.lexemas + " >\n";
                    break;
            }
        }
    }

    private void btnALexicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnALexicoActionPerformed
        try {
            analizarLexico();
        } catch (IOException ex) {
            Logger.getLogger(FrmAnalizador.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnALexicoActionPerformed

    private void btnArchivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnArchivoActionPerformed
        JFileChooser escoger = new JFileChooser(System.getProperty("user.dir"));
        escoger.showOpenDialog(null);
        
        try {
            File arc = new File(escoger.getSelectedFile().getAbsolutePath());
            String ST = new String(Files.readAllBytes(arc.toPath()));
            Resultado.setText(ST);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(FrmAnalizador.class.getName()).log(Level.SEVERE, null, ex);
        } catch(NullPointerException ex){
            System.out.println("Archivo no seleccionado");
        } catch (IOException ex) {
            Logger.getLogger(FrmAnalizador.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnArchivoActionPerformed

    private void btnBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBorrarActionPerformed
        txtAnalizarLex.setText(null);
    }//GEN-LAST:event_btnBorrarActionPerformed

    private void btnASintacticoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnASintacticoActionPerformed
        String ST = Resultado.getText();
        Sintaxis s = new Sintaxis(new Analizador.LexicoCup(new StringReader(ST)));

        try {
            s.parse();
            txtAnalizarSin.setText("Analisis realizado correctamente");
            txtAnalizarSin.setForeground(new Color(25, 111, 61));
        } catch (Exception ex) {
            Symbol sym = s.getS();
            txtAnalizarSin.setText("Error de sintaxis. Linea: " + (sym.right + 1) + " Columna: " + (sym.left + 1) + ", Texto: \"" + sym.value + "\"");
            txtAnalizarSin.setForeground(Color.red);
        }
    }//GEN-LAST:event_btnASintacticoActionPerformed

    private void btnBorrarSinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBorrarSinActionPerformed
        txtAnalizarSin.setText(null);
    }//GEN-LAST:event_btnBorrarSinActionPerformed

    private void btnBorrarCodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBorrarCodActionPerformed
        Resultado.setText(null);
    }//GEN-LAST:event_btnBorrarCodActionPerformed

    private void btnGenIntermedioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGenIntermedioActionPerformed
        //Escribir Archivo
        FileWriter fw = null;
        
        try
        {
            Path archivo = Paths.get("Programa.cpp");
            Files.delete(archivo);

            fw = new FileWriter("Programa.cpp",true);
            fw.flush();
            fw.write(Resultado.getText());

        }
        catch (IOException ex) 
            {
                ex.printStackTrace();
            } 
            finally 
            {
               if (fw!=null)
               {  
                   try {
                       fw.close();
                   } catch (IOException ex) {
                       Logger.getLogger(FrmAnalizador.class.getName()).log(Level.SEVERE, null, ex);
                   }
               }
            }
        
        // Ejecución
        try {
            
            String[] array = { "cmd", "/C", "start", 
            "1_Intermedio.bat" };
            Runtime.getRuntime().exec(array);
            System.out.println("1. Creación de Archivo intermedio.");
        } catch (IOException ex) {
            Logger.getLogger(FrmAnalizador.class.getName()).log(Level.SEVERE, null, ex);
        }      
        /*
        try {
            String[] intermedio = {"1_Intermedio.bat"};
            Runtime.getRuntime().exec(intermedio);
            String[] gassembler = {"2_Ensamblador.bat"};
            Runtime.getRuntime().exec(gassembler);
            System.out.println("Ejecucion del convertidor de cpp a assembler");
        } catch (IOException ex) {
             System.out.println(ex);
        }
        */
    }//GEN-LAST:event_btnGenIntermedioActionPerformed

    private void btnEjecutarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEjecutarActionPerformed
       
        try {
            
            String[] array = { "cmd", "/C", "start", 
            "5_Correr.bat" };
            Runtime.getRuntime().exec(array);
            
        } catch (IOException ex) {
            Logger.getLogger(FrmAnalizador.class.getName()).log(Level.SEVERE, null, ex);
        }


    }//GEN-LAST:event_btnEjecutarActionPerformed

    private void btnGenEnsambladorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGenEnsambladorActionPerformed

        try {
            
            String[] array = { "cmd", "/C", "start", 
            "2_Ensamblador.bat" };
            Runtime.getRuntime().exec(array);
            System.out.println("2. Creación de Ensamblador.");
        } catch (IOException ex) {
            Logger.getLogger(FrmAnalizador.class.getName()).log(Level.SEVERE, null, ex);
        }  
        
        /*
        try {
            String[] gobjeto = {"3_Objeto.bat"};
            Runtime.getRuntime().exec(gobjeto);
            String[] gejecutable = {"4_Ejecutable.bat"};
            Runtime.getRuntime().exec(gejecutable);
            System.out.println("Ejecucion del convertidor de cpp a assembler");
        } catch (IOException ex) {
            System.out.println(ex);
        }
        */
    }//GEN-LAST:event_btnGenEnsambladorActionPerformed

    private void btnGenObjetoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGenObjetoActionPerformed
      
        try {
            
            String[] array = { "cmd", "/C", "start", 
            "3_Objeto.bat" };
            Runtime.getRuntime().exec(array);
            System.out.println("3. Creación de Objetos.");
        } catch (IOException ex) {
            Logger.getLogger(FrmAnalizador.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_btnGenObjetoActionPerformed

    private void btnGenEjecutableActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGenEjecutableActionPerformed
      
        try {
            
            String[] array = { "cmd", "/C", "start", 
            "4_Ejecutable.bat" };
            Runtime.getRuntime().exec(array);
            System.out.println("4. Creación de Ejecutable.");
        } catch (IOException ex) {
            Logger.getLogger(FrmAnalizador.class.getName()).log(Level.SEVERE, null, ex);
        } 
        
    }//GEN-LAST:event_btnGenEjecutableActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) throws IllegalAccessException {
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmAnalizador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new FrmAnalizador().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea Resultado;
    private javax.swing.JButton btnALexico;
    private javax.swing.JButton btnASintactico;
    private javax.swing.JButton btnArchivo;
    private javax.swing.JButton btnBorrar;
    private javax.swing.JButton btnBorrarCod;
    private javax.swing.JButton btnBorrarSin;
    private javax.swing.JButton btnEjecutar;
    private javax.swing.JButton btnGenEjecutable;
    private javax.swing.JButton btnGenEnsamblador;
    private javax.swing.JButton btnGenIntermedio;
    private javax.swing.JButton btnGenObjeto;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextArea txtAnalizarLex;
    private javax.swing.JTextArea txtAnalizarSin;
    // End of variables declaration//GEN-END:variables
}
