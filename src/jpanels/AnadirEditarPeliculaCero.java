/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jpanels;

import excel.ProgramasExcel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;

/**
 *
 * @author Juan
 */
public class AnadirEditarPeliculaCero extends javax.swing.JFrame {

    /**
     * Creates new form MenuFrame
     */
    public AnadirEditarPeliculaCero(String pelicula) {
        opc = pelicula.equalsIgnoreCase("");
        initComponents();
        OptimizarCodigo optimizarCodigo = new OptimizarCodigo();
        if (!opc) {
            rellenar(pelicula);
            peliculaAntigua = pelicula;
        }
        Menu e1 = new Menu();
        Volver e2 = new Volver();
        Ok e3 = new Ok();
        optimizarCodigo.OptimizarJLabel(notajLabel, jLabel1, jLabel2, jLabel3, jLabel4, jLabel5, jLabel6);
        optimizarCodigo.OptimizarBotones(MENUButton, VOLVERButton, OKButton);
        MENUButton.addActionListener(e1);
        VOLVERButton.addActionListener(e2);
        OKButton.addActionListener(e3);
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        OKButton = new javax.swing.JButton();
        PaisjTextField = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        GenerojTextField = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        ProductorjTextField = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        DirectorjTextField = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        notajLabel = new javax.swing.JLabel();
        VOLVERButton = new javax.swing.JButton();
        MENUButton = new javax.swing.JButton();
        NombrePelijTextField = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        notaJText = new javax.swing.JFormattedTextField();
        AnoJText = new javax.swing.JFormattedTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(750, 450));

        jPanel1.setPreferredSize(new java.awt.Dimension(750, 450));

        OKButton.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        OKButton.setText("OK");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setText("Pais:");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setText("Genero: ");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setText("Productor:");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setText("Año:");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("Director:");
        jLabel2.setToolTipText("");

        notajLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        notajLabel.setText("Nota:");

        VOLVERButton.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        VOLVERButton.setText("VOLVER");

        MENUButton.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        MENUButton.setText("MENU");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Nombre Pelicula: ");

        notaJText.setToolTipText("");
        notaJText.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                notaJTextKeyTyped(evt);
            }
        });

        AnoJText.setToolTipText("");
        AnoJText.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                AnoJTextKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(MENUButton)
                .addGap(215, 215, 215)
                .addComponent(VOLVERButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(OKButton)
                .addGap(29, 29, 29))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel5)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addComponent(notajLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(ProductorjTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 242, Short.MAX_VALUE)
                                    .addComponent(DirectorjTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 242, Short.MAX_VALUE)
                                    .addComponent(notaJText))
                                .addGap(18, 18, 18)
                                .addComponent(jLabel6))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(NombrePelijTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 52, Short.MAX_VALUE)
                                .addComponent(jLabel4)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(GenerojTextField)
                    .addComponent(PaisjTextField)
                    .addComponent(AnoJText, javax.swing.GroupLayout.DEFAULT_SIZE, 143, Short.MAX_VALUE))
                .addGap(65, 65, 65))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(PaisjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(NombrePelijTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))))
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(DirectorjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(9, 9, 9)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(GenerojTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(ProductorjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(80, 80, 80)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(notajLabel)
                            .addComponent(notaJText, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(AnoJText, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(64, 64, 64)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, 53, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(VOLVERButton)
                    .addComponent(MENUButton)
                    .addComponent(OKButton))
                .addGap(47, 47, 47))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 449, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void AnoJTextKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_AnoJTextKeyTyped
        if (AnoJText.getText().length() > 3) {
            evt.consume();
        }
    }//GEN-LAST:event_AnoJTextKeyTyped

    private void notaJTextKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_notaJTextKeyTyped
        if (notaJText.getText().length() > 4) {
            evt.consume();
        }
    }//GEN-LAST:event_notaJTextKeyTyped

    private class Menu implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e1) {
            MenuPrincipalFrame obj = new MenuPrincipalFrame();
            obj.setVisible(true);
            dispose();
        }

    }

    private class Volver implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e2) {
            if (opc) {
                AnadirPelicula obj = new AnadirPelicula();
                obj.setVisible(true);
                dispose();
            } else {
                MenuEditarEliminar obj = new MenuEditarEliminar(false);
                obj.setVisible(true);
                dispose();
            }

        }
    }

    private class Ok implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e3) {
            ArrayList arrayList = new ArrayList();
            boolean positivo = true;
            OptimizarCodigo optimizarCodigo = new OptimizarCodigo();
            if (NombrePelijTextField.getText().isEmpty()) {
                positivo = false;
                JOptionPane.showMessageDialog(jPanel1, "Campo Nombre Pelicula Vacío", "Error!", JOptionPane.ERROR_MESSAGE);
            } else {
                arrayList.add(NombrePelijTextField.getText());
            }
            if (GenerojTextField.getText().isEmpty()) {
                positivo = false;
                JOptionPane.showMessageDialog(jPanel1, "Campo Genero Vacío", "Error!", JOptionPane.ERROR_MESSAGE);
            } else {
                arrayList.add(GenerojTextField.getText());
            }
            if (DirectorjTextField.getText().isEmpty()) {
                positivo = false;
                JOptionPane.showMessageDialog(jPanel1, "Campo Director Vacío", "Error!", JOptionPane.ERROR_MESSAGE);
            } else {
                arrayList.add(DirectorjTextField.getText());
            }
            if (PaisjTextField.getText().isEmpty()) {
                positivo = false;
                JOptionPane.showMessageDialog(jPanel1, "Campo País Vacío", "Error!", JOptionPane.ERROR_MESSAGE);
            } else {
                arrayList.add(PaisjTextField.getText());
            }
            if (ProductorjTextField.getText().isEmpty()) {
                positivo = false;
                JOptionPane.showMessageDialog(jPanel1, "Campo Genero Vacío", "Error!", JOptionPane.ERROR_MESSAGE);
            } else {
                arrayList.add(ProductorjTextField.getText());
            }
            if (AnoJText.getText().isEmpty()) {
                positivo = false;
                JOptionPane.showMessageDialog(jPanel1, "Campo Años Vacío", "Error!", JOptionPane.ERROR_MESSAGE);
            } else {
                if ((optimizarCodigo.YearValido(AnoJText.getText()))) {
                    arrayList.add(AnoJText.getText());
                } else {
                    positivo = false;
                    JOptionPane.showMessageDialog(jPanel1, "Escriba un año correcto" + " (1888-"+Calendar.getInstance().get(Calendar.YEAR)+")\n Ejemplo: 2017", "Error!", JOptionPane.ERROR_MESSAGE);
                }
            }
            if (notaJText.getText().isEmpty()) {
                positivo = false;
                JOptionPane.showMessageDialog(jPanel1, "Campo Nota Vacío", "Error!", JOptionPane.ERROR_MESSAGE);
            } else {
                if ((optimizarCodigo.NotaValida(notaJText.getText()))) {
                    arrayList.add(notaJText.getText());
                } else {
                    positivo = false;
                    JOptionPane.showMessageDialog(jPanel1, "Escriba una nota correcta (0-10) \n Ejemplo: 8.7", "Error!", JOptionPane.ERROR_MESSAGE);
                }
            }
            if (positivo) {
                ProgramasExcel programasExcel = new ProgramasExcel();

                boolean seguir;

                seguir = optimizarCodigo.mensajeEditarAnadirPelicula(jPanel1, arrayList, datosPelicula);

                if (seguir) {
                    if (opc) {
                        try {
                            if (optimizarCodigo.OptimizarIF(programasExcel, arrayList)) {
                                programasExcel.comprobarColumnaPelicula("Pelicula", arrayList);
                            }
                        } catch (IOException ex) {
                            Logger.getLogger(AnadirEditarPeliculaCero.class.getName()).log(Level.SEVERE, null, ex);
                        } catch (InvalidFormatException ex) {
                            Logger.getLogger(AnadirEditarPeliculaCero.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    } else {
                        try {
                            if (!programasExcel.PerteneceNombreAHoja("Genero", arrayList.get(1).toString())) {
                                programasExcel.comprobarColumna("Genero", arrayList.get(1).toString());
                            }

                            if (!programasExcel.PerteneceNombreAHoja("Director", arrayList.get(2).toString())) {
                                programasExcel.comprobarColumna("Director", arrayList.get(2).toString());
                            }
                            if (!programasExcel.PerteneceNombreAHoja("Pais", arrayList.get(3).toString())) {
                                programasExcel.comprobarColumna("Pais", arrayList.get(3).toString());
                            }
                            if (!programasExcel.PerteneceNombreAHoja("Productor", arrayList.get(4).toString())) {
                                programasExcel.comprobarColumna("Productor", arrayList.get(4).toString());
                            }
                            programasExcel.EditarPelicula(arrayList, peliculaAntigua);

                        } catch (IOException ex) {
                            Logger.getLogger(AnadirEditarPeliculaCero.class.getName()).log(Level.SEVERE, null, ex);
                        } catch (InvalidFormatException ex) {
                            Logger.getLogger(AnadirEditarPeliculaCero.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    }
                    //}

                    if (opc) {
                        AnadirEditarPeliculaCero obj = new AnadirEditarPeliculaCero("");
                        obj.setVisible(true);
                        dispose();
                        JOptionPane.showMessageDialog(jPanel1, "Pelicula añadida correctamente", "Correcto", JOptionPane.INFORMATION_MESSAGE);
                    } else {
                        MenuEditarEliminar obj = new MenuEditarEliminar(false);
                        obj.setVisible(true);
                        dispose();
                        JOptionPane.showMessageDialog(jPanel1, "Pelicula editada correctamente", "Correcto", JOptionPane.INFORMATION_MESSAGE);

                    }
                }
            }
        }
    }
    

    private void rellenar(String pelicula) {
        try {
            ProgramasExcel programasExcel = new ProgramasExcel();

            datosPelicula = programasExcel.datosPelicula(pelicula);
            NombrePelijTextField.setText(datosPelicula.get(0).toString());
            GenerojTextField.setText(datosPelicula.get(1).toString());
            DirectorjTextField.setText(datosPelicula.get(2).toString());
            PaisjTextField.setText(datosPelicula.get(3).toString());
            ProductorjTextField.setText(datosPelicula.get(4).toString());
            AnoJText.setText(datosPelicula.get(5).toString());
            notaJText.setText(datosPelicula.get(6).toString());
        } catch (IOException ex) {
            Logger.getLogger(AnadirEditarPeliculaCero.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InvalidFormatException ex) {
            Logger.getLogger(AnadirEditarPeliculaCero.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
    private ArrayList datosPelicula;
    private String peliculaAntigua;
    private boolean opc;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JFormattedTextField AnoJText;
    private javax.swing.JTextField DirectorjTextField;
    private javax.swing.JTextField GenerojTextField;
    private javax.swing.JButton MENUButton;
    private javax.swing.JTextField NombrePelijTextField;
    private javax.swing.JButton OKButton;
    private javax.swing.JTextField PaisjTextField;
    private javax.swing.JTextField ProductorjTextField;
    private javax.swing.JButton VOLVERButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JFormattedTextField notaJText;
    private javax.swing.JLabel notajLabel;
    // End of variables declaration//GEN-END:variables
}
