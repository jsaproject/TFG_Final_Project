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
import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.LayoutStyle;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;

/**
 *
 * @author Juan
 */
public class MenuEliminar extends JFrame {

    /**
     * Creates new form MenuEditar
     */
    public MenuEliminar() {
        initComponents();
        EditarNombrePeliculaSub e1 = new EditarNombrePeliculaSub();
        EditarGeneroSub e2 = new EditarGeneroSub();
        EditarDirectorSub e3 = new EditarDirectorSub();
        EditarPaisSub e4 = new EditarPaisSub();
        EditarProductorSub e5 = new EditarProductorSub();
        OKSub e6 = new OKSub();
        ListSelectionSub e7 = new ListSelectionSub();
        Lista.addListSelectionListener(e7);
        MENUButton e8 = new MENUButton();
        EditarNombrePelicula.addActionListener(e1);
        EditarGenero.addActionListener(e2);
        EditarDirector.addActionListener(e3);
        EditarPais.addActionListener(e4);
        EditarProductor.addActionListener(e5);
        okButton.addActionListener(e6);
        menuButton.addActionListener(e8);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ListaElementos = new JScrollPane();
        Lista = new JList();
        EditarProductor = new JButton();
        EditarDirector = new JButton();
        EditarPais = new JButton();
        EditarNombrePelicula = new JButton();
        EditarGenero = new JButton();
        okButton = new JButton();
        menuButton = new JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Lista.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        ListaElementos.setViewportView(Lista);

        EditarProductor.setText("Productores");
        EditarProductor.setToolTipText("");

        EditarDirector.setText("Directores");


        EditarPais.setText("Paises");

        EditarNombrePelicula.setText("Nombre Pelicula");

        EditarGenero.setText("Géneros");

        okButton.setText("OK");

        menuButton.setText("MENU");


        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(81, 81, 81)
                        .addComponent(EditarNombrePelicula)
                        .addGap(59, 59, 59)
                        .addComponent(EditarGenero))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(98, 98, 98)
                        .addComponent(ListaElementos, GroupLayout.PREFERRED_SIZE, 188, GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(159, 159, 159)
                        .addComponent(EditarDirector))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                            .addComponent(menuButton)
                            .addComponent(EditarProductor))))
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 58, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addGroup(GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(EditarPais)
                        .addGap(43, 43, 43))
                    .addGroup(GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(okButton)
                        .addGap(33, 33, 33))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(EditarProductor)
                    .addComponent(EditarDirector)
                    .addComponent(EditarPais))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(EditarNombrePelicula)
                    .addComponent(EditarGenero))
                .addGap(18, 18, 18)
                .addComponent(ListaElementos, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(okButton)
                    .addComponent(menuButton))
                .addContainerGap(12, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

//GEN-FIRST:event_EditarDirectorActionPerformed
    // TODO add your handling code here:
//GEN-LAST:event_EditarDirectorActionPerformed

//GEN-FIRST:event_menuButtonActionPerformed
    // TODO add your handling code here:
//GEN-LAST:event_menuButtonActionPerformed

    /**
     * @param args the command line arguments
     */
    public class MENUButton implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e2) {
            MenuPrincipalFrame obj = new MenuPrincipalFrame();
            obj.setVisible(true);
            dispose();
        }

    }

    public class ListSelectionSub implements ListSelectionListener {

        @Override
        public void valueChanged(ListSelectionEvent e7) {
            decision = Lista.getSelectedValue().toString();
        }

    }

    public class OKSub implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e6) {
            ProgramasExcel pex = new ProgramasExcel();
            try {
                pex.peliculaExistente(variable, decision);
                pex.removerFila(variable, decision);
            } catch (IOException ex) {
                Logger.getLogger(MenuEliminar.class.getName()).log(Level.SEVERE, null, ex);
            } catch (InvalidFormatException ex) {
                Logger.getLogger(MenuEliminar.class.getName()).log(Level.SEVERE, null, ex);
            }
            MenuEliminar obj = new MenuEliminar();
            obj.setVisible(true);
            dispose();
        }

    }

    private void rellenar() {
        ProgramasExcel pex = new ProgramasExcel();
        Lista.removeAll();
        try {
            String[] devolverNombres = pex.devolverNombres(variable);
            if (devolverNombres != null) {
                Lista.setListData(devolverNombres);
            }
        } catch (IOException ex) {
            Logger.getLogger(MenuEliminar.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InvalidFormatException ex) {
            Logger.getLogger(MenuEliminar.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public class EditarNombrePeliculaSub implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e1) {

            variable = nombre_pelicula;
            celda = 0;
            rellenar();
            /*MenuAnadirFrame obj = new MenuAnadirFrame();
            obj.setVisible(true);
            dispose();*/
        }

    }

    public class EditarGeneroSub implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e2) {

            variable = var_genero;
            celda = 1;
            rellenar();
            /*MenuAnadirFrame obj = new MenuAnadirFrame();
            obj.setVisible(true);
            dispose();*/
        }

    }

    public class EditarDirectorSub implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e3) {
            variable = var_director;
            celda = 2;
            rellenar();
            /*MenuAnadirFrame obj = new MenuAnadirFrame();
            obj.setVisible(true);
            dispose();*/
        }

    }

    public class EditarPaisSub implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e4) {
            variable = var_pais;
            celda = 3;
            rellenar();
            /*MenuAnadirFrame obj = new MenuAnadirFrame();
            obj.setVisible(true);
            dispose();*/
        }

    }

    public class EditarProductorSub implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e5) {

            variable = var_productor;
            celda = 4;
            rellenar();

        }
    }
    private int celda = 0;
    private static final String nombre_pelicula = "Nombre Pelicula";
    private static final String var_pelicula = "Pelicula";
    private static final String var_genero = "Genero";
    private static final String var_director = "Director";
    private static final String var_pais = "Pais";
    private static final String var_productor = "Productor";
    private String decision;
    private String variable;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private JButton EditarDirector;
    private JButton EditarGenero;
    private JButton EditarNombrePelicula;
    private JButton EditarPais;
    private JButton EditarProductor;
    private JList Lista;
    private JScrollPane ListaElementos;
    private JButton menuButton;
    private JButton okButton;
    // End of variables declaration//GEN-END:variables
}
