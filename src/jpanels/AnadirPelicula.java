/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jpanels;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
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
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        MENUButton = new JButton();
        VOLVERButton = new JButton();
        ANADIRExistente = new JButton();
        ANADIRCero = new JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        MENUButton.setText("MENU");

        VOLVERButton.setText("VOLVER");

        ANADIRExistente.setText("Añadir pelicula con datos ya incluidos");

        ANADIRCero.setText("Añadir de cero");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(MENUButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(VOLVERButton))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(156, 156, 156)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(ANADIRExistente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(ANADIRCero, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 81, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(81, 81, 81)
                .addComponent(ANADIRExistente)
                .addGap(38, 38, 38)
                .addComponent(ANADIRCero)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 101, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(MENUButton)
                    .addComponent(VOLVERButton))
                .addContainerGap())
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
            AnadirPeliculaCero obj = new AnadirPeliculaCero();
            obj.setVisible(true);
            dispose();
        }
    }

    /**
     * @param args the command line arguments
     */


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private JButton ANADIRCero;
    private JButton ANADIRExistente;
    private JButton MENUButton;
    private JButton VOLVERButton;
    // End of variables declaration//GEN-END:variables
}