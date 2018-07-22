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
import java.util.logging.Level;
import java.util.logging.Logger;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;

/**
 *
 * @author Juan
 */
public class MenuPrincipalFrame extends javax.swing.JFrame {

    /**
     * Creates new form MenuFrame
     */
    public MenuPrincipalFrame() {
        initComponents();
        ProgramasExcel programasExcel = new ProgramasExcel();
        try {
            programasExcel.comprobarExcel();
            
        } catch (IOException ex) {
            Logger.getLogger(MenuPrincipalFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
        Anadir e1 = new Anadir();
        Editar e2 = new Editar();
        Eliminar e3 = new Eliminar();
        Importar e4 = new Importar();
        ANADIRButton.addActionListener(e1);
        EDITARButton.addActionListener(e2);
        ELIMINARButton.addActionListener(e3);
        IMPORTARButton.addActionListener(e4);
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
        ELIMINARButton = new javax.swing.JButton();
        EDITARButton = new javax.swing.JButton();
        ANADIRButton = new javax.swing.JButton();
        IMPORTARButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));

        ELIMINARButton.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        ELIMINARButton.setText("ELIMINAR");

        EDITARButton.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        EDITARButton.setText("EDITAR");

        ANADIRButton.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        ANADIRButton.setText("AÑADIR");
        ANADIRButton.setToolTipText("");

        IMPORTARButton.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        IMPORTARButton.setText("IMPORTAR");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(269, 269, 269)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(IMPORTARButton, javax.swing.GroupLayout.DEFAULT_SIZE, 151, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(ELIMINARButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(ANADIRButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(EDITARButton, javax.swing.GroupLayout.DEFAULT_SIZE, 151, Short.MAX_VALUE)))
                .addContainerGap(326, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addComponent(ANADIRButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addComponent(EDITARButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44)
                .addComponent(ELIMINARButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44)
                .addComponent(IMPORTARButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(66, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public class Anadir implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e1) {
            MenuAnadirFrame obj = new MenuAnadirFrame();
            obj.setVisible(true);
            dispose();
        }

    }

    public class Editar implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e2) {
            MenuEditarEliminar obj = new MenuEditarEliminar(false);
            obj.setVisible(true);
            dispose();
        }

    }

    public class Eliminar implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e3) {
            MenuEditarEliminar obj = new MenuEditarEliminar(true);
            obj.setVisible(true);
            dispose();
        }

    }
    
        public class Importar implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e4) {
            MenuImportar obj = new MenuImportar();
            obj.setVisible(true);
            dispose();
        }

    }

    /**
     * @param args the command line arguments
     */


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ANADIRButton;
    private javax.swing.JButton EDITARButton;
    private javax.swing.JButton ELIMINARButton;
    private javax.swing.JButton IMPORTARButton;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
