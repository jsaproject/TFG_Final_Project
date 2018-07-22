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
import java.util.Iterator;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;

/**
 *
 * @author Juan
 */
public class AnadirPeliculaDatos extends javax.swing.JFrame {

    /**
     * Creates new form MenuFrame
     */
    public AnadirPeliculaDatos() {

        initComponents();
        OptimizarCodigo optimizarCodigo = new OptimizarCodigo();
        optimizarCodigo.OptimizarBotones(MENUButton, VOLVERButton, OKButton);
        optimizarCodigo.OptimizarJLabel(notajLabel, jLabel1, jLabel2, jLabel3, jLabel4, jLabel5, jLabel6);
        Menu e1 = new Menu();
        Volver e2 = new Volver();

        Ok e3 = new Ok();
        jListYears.setListData(optimizarCodigo.devolver());
        String[] notas = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10"};
        jListNotas.setListData(notas);
        iniciarJList();
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
        jScrollPane6 = new javax.swing.JScrollPane();
        jListGeneros = new javax.swing.JList<>();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        jListProductores = new javax.swing.JList<>();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane7 = new javax.swing.JScrollPane();
        jListNotas = new javax.swing.JList<>();
        notajLabel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jListNombrePeliculas = new javax.swing.JList<>();
        jScrollPane3 = new javax.swing.JScrollPane();
        jListDirectores = new javax.swing.JList<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jListYears = new javax.swing.JList<>();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jListPaises = new javax.swing.JList<>();
        jLabel4 = new javax.swing.JLabel();
        VOLVERButton = new javax.swing.JButton();
        OKButton = new javax.swing.JButton();
        MENUButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(750, 450));
        setResizable(false);

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(750, 450));

        jListGeneros.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane6.setViewportView(jListGeneros);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setText("Genero: ");

        jListProductores.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane5.setViewportView(jListProductores);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setText("Productor:");

        jListNotas.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane7.setViewportView(jListNotas);

        notajLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        notajLabel.setText("Nota:");

        jListNombrePeliculas.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane1.setViewportView(jListNombrePeliculas);

        jListDirectores.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane3.setViewportView(jListDirectores);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("Director:");
        jLabel2.setToolTipText("");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Nombre Pelicula: ");

        jListYears.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane4.setViewportView(jListYears);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setText("Año:");

        jListPaises.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane2.setViewportView(jListPaises);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setText("Pais:");

        VOLVERButton.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        VOLVERButton.setText("VOLVER");

        OKButton.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        OKButton.setText("OK");

        MENUButton.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        MENUButton.setText("MENU");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(MENUButton)
                                .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(notajLabel)
                                .addGap(8, 8, 8)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(VOLVERButton)
                                .addGap(87, 87, 87))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(67, 67, 67)
                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addGap(18, 18, 18))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel5)
                                        .addGap(14, 14, 14))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel6)
                                        .addGap(4, 4, 4))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jScrollPane6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap())
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(OKButton)
                                .addGap(29, 29, 29))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(47, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(35, 35, 35)
                                .addComponent(jLabel2)
                                .addGap(34, 34, 34))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(32, 32, 32)
                                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(14, 14, 14)
                                .addComponent(notajLabel)))
                        .addGap(45, 45, 45))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(53, 53, 53)
                        .addComponent(jLabel5)
                        .addGap(59, 59, 59)
                        .addComponent(jLabel6)
                        .addGap(102, 102, 102)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(OKButton)
                    .addComponent(VOLVERButton)
                    .addComponent(MENUButton))
                .addGap(32, 32, 32))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(67, 67, 67)
                        .addComponent(jLabel1)
                        .addGap(50, 50, 50))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)))
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 422, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void iniciarJList() {
        try {
            ProgramasExcel programasExcel = new ProgramasExcel();
            ArrayList nombresHojas = programasExcel.nombresHojas();
            Iterator iterator = nombresHojas.iterator();
            int i = 1;
            while (iterator.hasNext()) {
                String toString = iterator.next().toString();
                String[] devolverNombres = programasExcel.devolverNombres(toString);
                switch (i) {
                    case 1:
                        if (devolverNombres != null) {
                            jListNombrePeliculas.setListData(devolverNombres);
                        }
                        break;
                    case 2:
                        if (devolverNombres != null) {
                            jListGeneros.setListData(devolverNombres);
                        }
                        break;
                    case 3:
                        if (devolverNombres != null) {
                            jListDirectores.setListData(devolverNombres);
                        }

                        break;
                    case 4:
                        if (devolverNombres != null) {
                            jListPaises.setListData(devolverNombres);
                        }
                        break;
                    default:
                        if (devolverNombres != null) {
                            jListProductores.setListData(devolverNombres);
                        }
                        break;
                }
                i++;
            }

        } catch (IOException ex) {
            Logger.getLogger(AnadirPeliculaDatos.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InvalidFormatException ex) {
            Logger.getLogger(AnadirPeliculaDatos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

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
            AnadirPelicula obj = new AnadirPelicula();
            obj.setVisible(true);
            dispose();
        }

    }

    private class Ok implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e1) {
            boolean positivo = true;
            ArrayList arrayList = new ArrayList();
            if (jListNombrePeliculas.isSelectionEmpty()) {
                positivo = false;
                JOptionPane.showMessageDialog(jPanel1, "Campo Nombre Pelicula Vacío", "Error!", JOptionPane.ERROR_MESSAGE);
            } else {
                arrayList.add(jListNombrePeliculas.getSelectedValue());
            }
            if (jListGeneros.isSelectionEmpty()) {
                positivo = false;
                JOptionPane.showMessageDialog(jPanel1, "Campo Género Vacío", "Error!", JOptionPane.ERROR_MESSAGE);
            } else {
                arrayList.add(jListGeneros.getSelectedValue());
            }
            if (jListDirectores.isSelectionEmpty()) {
                positivo = false;
                JOptionPane.showMessageDialog(jPanel1, "Campo Director Vacío", "Error!", JOptionPane.ERROR_MESSAGE);
            } else {
                arrayList.add(jListDirectores.getSelectedValue());
            }
            if (jListPaises.isSelectionEmpty()) {
                positivo = false;
                JOptionPane.showMessageDialog(jPanel1, "Campo País Vacío", "Error!", JOptionPane.ERROR_MESSAGE);
            } else {
                arrayList.add(jListPaises.getSelectedValue());
            }
            if (jListProductores.isSelectionEmpty()) {
                positivo = false;
                JOptionPane.showMessageDialog(jPanel1, "Campo Productor Vacío", "Error!", JOptionPane.ERROR_MESSAGE);
            } else {
                arrayList.add(jListProductores.getSelectedValue());
            }
            if (jListYears.isSelectionEmpty()) {
                positivo = false;
                JOptionPane.showMessageDialog(jPanel1, "Campo Años Vacío", "Error!", JOptionPane.ERROR_MESSAGE);
            } else {
                arrayList.add(jListYears.getSelectedValue());
            }
            if (jListNotas.isSelectionEmpty()) {
                positivo = false;
                JOptionPane.showMessageDialog(jPanel1, "Campo Nota Vacío", "Error!", JOptionPane.ERROR_MESSAGE);
            } else {
                arrayList.add(jListNotas.getSelectedValue());
            }
            if (positivo) {
                OptimizarCodigo optimizarCodigo = new OptimizarCodigo();
                ArrayList arraylist2 = null;
                boolean anadirPelicula = optimizarCodigo.mensajeEditarAnadirPelicula(jPanel1, arrayList, arraylist2);
                if (anadirPelicula) {
                    AnadirPeliculaDatos obj = new AnadirPeliculaDatos();
                    ProgramasExcel programasExcel = new ProgramasExcel();
                    try {

                        programasExcel.comprobarColumnaPelicula("Pelicula", arrayList);

                    } catch (IOException ex) {
                        Logger.getLogger(AnadirPeliculaDatos.class.getName()).log(Level.SEVERE, null, ex);
                    } catch (InvalidFormatException ex) {
                        Logger.getLogger(AnadirPeliculaDatos.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    obj.setVisible(true);
                    dispose();
                    JOptionPane.showMessageDialog(jPanel1, "Pelicula añadida correctamente", "Correcto", JOptionPane.INFORMATION_MESSAGE);
                }
            }
        }
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton MENUButton;
    private javax.swing.JButton OKButton;
    private javax.swing.JButton VOLVERButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JList<String> jListDirectores;
    private javax.swing.JList<String> jListGeneros;
    private javax.swing.JList<String> jListNombrePeliculas;
    private javax.swing.JList<String> jListNotas;
    private javax.swing.JList<String> jListPaises;
    private javax.swing.JList<String> jListProductores;
    private javax.swing.JList<String> jListYears;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JLabel notajLabel;
    // End of variables declaration//GEN-END:variables
}
