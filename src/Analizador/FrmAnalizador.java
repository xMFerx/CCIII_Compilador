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

        jPanel1 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Resultado = new javax.swing.JTextArea();
        btnArchivo = new javax.swing.JButton();
        btnBorrarCod = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        btnALexico = new javax.swing.JButton();
        btnBorrar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtAnalizarLex = new javax.swing.JTextArea();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtAnalizarSin = new javax.swing.JTextArea();
        btnASintactico = new javax.swing.JButton();
        btnBorrarSin = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        btnGenIntermedio = new javax.swing.JButton();
        btnGenEnsamblador = new javax.swing.JButton();
        btnGenObjeto = new javax.swing.JButton();
        btnGenEjecutable = new javax.swing.JButton();
        btnEjecutar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(170, 170, 145));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jPanel6.setBackground(new java.awt.Color(171, 167, 171));

        jPanel2.setBackground(new java.awt.Color(204, 6, 62));

        Resultado.setColumns(20);
        Resultado.setRows(5);
        jScrollPane1.setViewportView(Resultado);

        btnArchivo.setBackground(new java.awt.Color(226, 217, 194));
        btnArchivo.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btnArchivo.setText("Abrir Fuente");
        btnArchivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnArchivoActionPerformed(evt);
            }
        });

        btnBorrarCod.setBackground(new java.awt.Color(226, 217, 194));
        btnBorrarCod.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btnBorrarCod.setText("Borrar");
        btnBorrarCod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBorrarCodActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(btnArchivo)
                        .addGap(18, 18, 18)
                        .addComponent(btnBorrarCod)))
                .addContainerGap(29, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnArchivo)
                    .addComponent(btnBorrarCod))
                .addGap(39, 39, 39)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48))
        );

        jPanel3.setBackground(new java.awt.Color(232, 85, 53));

        btnALexico.setBackground(new java.awt.Color(226, 217, 194));
        btnALexico.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btnALexico.setText("Análisis Léxico");
        btnALexico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnALexicoActionPerformed(evt);
            }
        });

        btnBorrar.setBackground(new java.awt.Color(226, 217, 194));
        btnBorrar.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btnBorrar.setText("Borrar");
        btnBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBorrarActionPerformed(evt);
            }
        });

        txtAnalizarLex.setColumns(20);
        txtAnalizarLex.setRows(5);
        jScrollPane2.setViewportView(txtAnalizarLex);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(90, 90, 90)
                .addComponent(btnALexico)
                .addGap(18, 18, 18)
                .addComponent(btnBorrar, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(69, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(66, 66, 66))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(35, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBorrar)
                    .addComponent(btnALexico))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39))
        );

        jPanel4.setBackground(new java.awt.Color(253, 148, 7));

        txtAnalizarSin.setColumns(20);
        txtAnalizarSin.setRows(5);
        jScrollPane3.setViewportView(txtAnalizarSin);

        btnASintactico.setBackground(new java.awt.Color(226, 217, 194));
        btnASintactico.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btnASintactico.setText("Análisis Sintaxis");
        btnASintactico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnASintacticoActionPerformed(evt);
            }
        });

        btnBorrarSin.setBackground(new java.awt.Color(226, 217, 194));
        btnBorrarSin.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btnBorrarSin.setText("Borrar");
        btnBorrarSin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBorrarSinActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap(43, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addComponent(btnASintactico)
                        .addGap(31, 31, 31)
                        .addComponent(btnBorrarSin)
                        .addGap(167, 167, 167))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 587, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30))))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnASintactico, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnBorrarSin))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16))
        );

        jPanel5.setBackground(new java.awt.Color(16, 137, 139));

        btnGenIntermedio.setBackground(new java.awt.Color(226, 217, 194));
        btnGenIntermedio.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btnGenIntermedio.setText("Intermedio");
        btnGenIntermedio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGenIntermedioActionPerformed(evt);
            }
        });

        btnGenEnsamblador.setBackground(new java.awt.Color(226, 217, 194));
        btnGenEnsamblador.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btnGenEnsamblador.setText("Ensamblador");
        btnGenEnsamblador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGenEnsambladorActionPerformed(evt);
            }
        });

        btnGenObjeto.setBackground(new java.awt.Color(226, 217, 194));
        btnGenObjeto.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btnGenObjeto.setText("Objeto");
        btnGenObjeto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGenObjetoActionPerformed(evt);
            }
        });

        btnGenEjecutable.setBackground(new java.awt.Color(226, 217, 194));
        btnGenEjecutable.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btnGenEjecutable.setText("Ejecutable");
        btnGenEjecutable.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGenEjecutableActionPerformed(evt);
            }
        });

        btnEjecutar.setBackground(new java.awt.Color(226, 217, 194));
        btnEjecutar.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btnEjecutar.setText("Ejecutar");
        btnEjecutar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEjecutarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(btnGenIntermedio)
                .addGap(18, 18, 18)
                .addComponent(btnGenEnsamblador)
                .addGap(18, 18, 18)
                .addComponent(btnGenObjeto)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnGenEjecutable)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnEjecutar)
                .addContainerGap(26, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnGenIntermedio)
                    .addComponent(btnGenEnsamblador)
                    .addComponent(btnGenObjeto)
                    .addComponent(btnGenEjecutable)
                    .addComponent(btnEjecutar))
                .addContainerGap(17, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(124, 124, 124)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(68, 68, 68)
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(47, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 32, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 82, Short.MAX_VALUE))
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
    // Se muestra el diálogo de selección de archivo
    escoger.showOpenDialog(null);
    
    try {
        // Se obtiene la ruta absoluta del archivo seleccionado y se crea un objeto File
        File arc = new File(escoger.getSelectedFile().getAbsolutePath());
        // Se lee el contenido del archivo en forma de bytes y se convierte a una cadena
        String ST = new String(Files.readAllBytes(arc.toPath()));
        // Se establece el contenido de la cadena en algún componente de interfaz de usuario llamado "Resultado"
        Resultado.setText(ST);
    } catch (FileNotFoundException ex) {
        // Manejo de la excepción si el archivo no se encuentra
        Logger.getLogger(FrmAnalizador.class.getName()).log(Level.SEVERE, null, ex);
    } catch(NullPointerException ex){
        // Manejo de la excepción si no se selecciona ningún archivo
        System.out.println("Archivo no seleccionado");
    } catch (IOException ex) {
        // Manejo de otras excepciones de lectura de archivos
        Logger.getLogger(FrmAnalizador.class.getName()).log(Level.SEVERE, null, ex);
    }
    }//GEN-LAST:event_btnArchivoActionPerformed

    private void btnBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBorrarActionPerformed
        //Método para boorar el cuadro de texto
        txtAnalizarLex.setText(null);
    }//GEN-LAST:event_btnBorrarActionPerformed

    private void btnASintacticoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnASintacticoActionPerformed
        String ST = Resultado.getText();
        Sintaxis s = new Sintaxis(new Analizador.LexicoCup(new StringReader(ST)));
        //Método que lee el cuadro de texto "resultado e invoca el analizador sintactico
        try {
            s.parse();
            //Si el analizado sintactico se ejecuta orrectamente coloca el siguiente texto
            txtAnalizarSin.setText("Analisis realizado correctamente");
            txtAnalizarSin.setForeground(new Color(25, 111, 61));
        } catch (Exception ex) {
            //Si el analizado sintactico fallta se coloca el siguiente texto
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
        
        //Método para crear el archivo del programa en un .cpp
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
    }//GEN-LAST:event_btnGenIntermedioActionPerformed

    private void btnEjecutarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEjecutarActionPerformed
        try {
            // Se crea un array de strings con los elementos necesarios para ejecutar un archivo por lotes en el sistema Windows
            String[] array = { "cmd", "/C", "start", "5_Correr.bat" };

            // Se utiliza Runtime.getRuntime().exec() para ejecutar el comando especificado en el array
            Runtime.getRuntime().exec(array);

        } catch (IOException ex) {
            // En caso de que ocurra una excepción de E/S durante la ejecución, se registra el error
            Logger.getLogger(FrmAnalizador.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnEjecutarActionPerformed

    private void btnGenEnsambladorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGenEnsambladorActionPerformed
        //Método que implementa la métodologia para crear archivos del método anterior
        try {
            String[] array = { "cmd", "/C", "start", 
            "2_Ensamblador.bat" };
            Runtime.getRuntime().exec(array);
            System.out.println("2. Creación de Ensamblador.");
        } catch (IOException ex) {
            Logger.getLogger(FrmAnalizador.class.getName()).log(Level.SEVERE, null, ex);
        }  
    }//GEN-LAST:event_btnGenEnsambladorActionPerformed

    private void btnGenObjetoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGenObjetoActionPerformed
       //Método que implementa la métodologia para crear archivos del método anterior
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
       //Método que implementa la métodologia para crear archivos del método anterior
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
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextArea txtAnalizarLex;
    private javax.swing.JTextArea txtAnalizarSin;
    // End of variables declaration//GEN-END:variables
}
