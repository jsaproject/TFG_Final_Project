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
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;

/**
 *
 * @author Juan
 */
public class MenuEditar extends javax.swing.JFrame {

    /**
     * Creates new form MenuEditar
     */
    public MenuEditar() {
        initComponents();
        EditarProductorSub e1 = new EditarProductorSub();
        EditarDirectorSub e2 = new EditarDirectorSub();
        EditarListaSub e7 = new EditarListaSub();
        EditarProductor.addActionListener(e1);
        EditarDirector.addActionListener(e2);
        Lista.addListSelectionListener(e7);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ListaElementos = new javax.swing.JScrollPane();
        Lista = new javax.swing.JList();
        EditarProductor = new javax.swing.JButton();
        EditarDirector = new javax.swing.JButton();
        EditarPais = new javax.swing.JButton();
        EditarMusica = new javax.swing.JButton();
        EditarNombrePelicula = new javax.swing.JButton();
        EditarGenero = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Lista.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        ListaElementos.setViewportView(Lista);

        EditarProductor.setText("Productores");
        EditarProductor.setToolTipText("");

        EditarDirector.setText("Directores");
        EditarDirector.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditarDirectorActionPerformed(evt);
            }
        });

        EditarPais.setText("Paises");

        EditarMusica.setText("Musica");

        EditarNombrePelicula.setText("Nombre Pelicula");

        EditarGenero.setText("Géneros");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(EditarProductor)
                    .addComponent(EditarMusica))
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ListaElementos, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(EditarDirector)
                            .addComponent(EditarNombrePelicula))
                        .addGap(55, 55, 55)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(EditarGenero)
                            .addComponent(EditarPais))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(EditarProductor)
                    .addComponent(EditarDirector)
                    .addComponent(EditarPais))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(EditarMusica)
                    .addComponent(EditarNombrePelicula)
                    .addComponent(EditarGenero))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addComponent(ListaElementos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void EditarDirectorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditarDirectorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EditarDirectorActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MenuEditar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuEditar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuEditar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuEditar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuEditar().setVisible(true);
            }
        });
    }

    public class EditarListaSub implements ListSelectionListener{

        @Override
        public void valueChanged(ListSelectionEvent e7) {
            if (e7.getValueIsAdjusting()){
                decision = Lista.getSelectedValue().toString();
            }
        
    }
    }
    
    public class EditarProductorSub implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e1) {
            ProgramasExcel pex = new ProgramasExcel();
            variable="Productor";
            Lista.removeAll();
            try {
                String[] devolverNombres = pex.devolverNombres(variable);
                if (devolverNombres!=null){
                    Lista.setListData(devolverNombres);
                }
            } catch (IOException ex) {
                Logger.getLogger(MenuEditar.class.getName()).log(Level.SEVERE, null, ex);
            } catch (InvalidFormatException ex) {
                Logger.getLogger(MenuEditar.class.getName()).log(Level.SEVERE, null, ex);
            }
            /*MenuAnadirFrame obj = new MenuAnadirFrame();
            obj.setVisible(true);
            dispose();*/
        }

    }

        public class EditarDirectorSub implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e2) {
            ProgramasExcel pex = new ProgramasExcel();
            variable="Director";
            Lista.removeAll();
            try {
                String[] devolverNombres = pex.devolverNombres(variable);
                if (devolverNombres!=null){
                    Lista.setListData(devolverNombres);
                }
            } catch (IOException ex) {
                Logger.getLogger(MenuEditar.class.getName()).log(Level.SEVERE, null, ex);
            } catch (InvalidFormatException ex) {
                Logger.getLogger(MenuEditar.class.getName()).log(Level.SEVERE, null, ex);
            }
            /*MenuAnadirFrame obj = new MenuAnadirFrame();
            obj.setVisible(true);
            dispose();*/
        }

    }
    private String decision;
    private String variable;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton EditarDirector;
    private javax.swing.JButton EditarGenero;
    private javax.swing.JButton EditarMusica;
    private javax.swing.JButton EditarNombrePelicula;
    private javax.swing.JButton EditarPais;
    private javax.swing.JButton EditarProductor;
    private javax.swing.JList Lista;
    private javax.swing.JScrollPane ListaElementos;
    // End of variables declaration//GEN-END:variables
}
