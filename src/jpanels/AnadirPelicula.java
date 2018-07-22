/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jpanels;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JButton;

/**
 *
 * @author Juan
 */
public class AnadirPelicula extends javax.swing.JFrame {

    /**
     * Creates new form MenuFrame
     */
    public AnadirPelicula() {
        initComponents();

        Menu e1 = new Menu();
        Volver e2 = new Volver();
        Cero e3 = new Cero();
        Existente e4 = new Existente();
        MENUButton.addActionListener(e1);
        VOLVERButton.addActionListener(e2);
        ANADIRCero.addActionListener(e3);
        ANADIRExistente.addActionListener(e4);
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
        ANADIRCero = new javax.swing.JButton();
        ANADIRExistente = new javax.swing.JButton();
        MENUButton = new javax.swing.JButton();
        VOLVERButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(750, 450));
        setResizable(false);

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.setRequestFocusEnabled(false);

        ANADIRCero.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        ANADIRCero.setText("Añadir de cero");

        ANADIRExistente.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        ANADIRExistente.setText("Añadir pelicula con datos ya incluidos");

        MENUButton.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        MENUButton.setText("MENU");

        VOLVERButton.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        VOLVERButton.setText("VOLVER");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(MENUButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(VOLVERButton))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(174, 174, 174)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ANADIRExistente)
                            .addComponent(ANADIRCero, javax.swing.GroupLayout.PREFERRED_SIZE, 369, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 177, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addComponent(ANADIRExistente, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(ANADIRCero, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 61, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(MENUButton, javax.swing.GroupLayout.DEFAULT_SIZE, 52, Short.MAX_VALUE)
                    .addComponent(VOLVERButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public class Menu implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e1) {
            MenuPrincipalFrame obj = new MenuPrincipalFrame();
            obj.setVisible(true);
            dispose();
        }

    }

    public class Volver implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e2) {
            MenuAnadirFrame obj = new MenuAnadirFrame();
            obj.setVisible(true);
            dispose();
        }
    }

    public class Existente implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e4) {
            AnadirPeliculaDatos obj = new AnadirPeliculaDatos();
            obj.setVisible(true);
            dispose();
        }
    }

    public class Cero implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e3) {
            AnadirEditarPeliculaCero obj = new AnadirEditarPeliculaCero("");
            obj.setVisible(true);
            dispose();
        }
    }

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ANADIRCero;
    private javax.swing.JButton ANADIRExistente;
    private javax.swing.JButton MENUButton;
    private javax.swing.JButton VOLVERButton;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
