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
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;

/**
 *
 * @author Juan
 */
public class AnadirPeliculaCero extends javax.swing.JFrame {

    /**
     * Creates new form MenuFrame
     */
    public AnadirPeliculaCero() {
        initComponents();
        Menu e1 = new Menu();
        Volver e2 = new Volver();
        Ok e3 = new Ok();
        OptimizarCodigo optimizarCodigo = new OptimizarCodigo();
        optimizarCodigo.OptimizarJLabel(notajLabel, jLabel1, jLabel2, jLabel3, jLabel4, jLabel5, jLabel6);
        optimizarCodigo.OptimizarBotones(MENUButton, VOLVERButton, OKButton);
        MENUButton.addActionListener(e1);
        VOLVERButton.addActionListener(e2);
        OKButton.addActionListener(e3);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {




        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);




        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(MENUButton)
                                .addGap(129, 129, 129)
                                .addComponent(VOLVERButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(OKButton))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(234, 234, 234)
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(AnojTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 30, Short.MAX_VALUE)))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(DirectorjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(NombrePelijTextField)))
                        .addGap(24, 24, 24)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(PaisjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(25, 25, 25))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ProductorjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(GenerojTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(notajLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(notaJText, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(NombrePelijTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PaisjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(5, 5, 5)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(50, 96, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(ProductorjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6)
                            .addComponent(GenerojTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(DirectorjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5)
                            .addComponent(AnojTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(notajLabel)
                    .addComponent(notaJText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(MENUButton)
                    .addComponent(VOLVERButton)
                    .addComponent(OKButton))
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
        public void actionPerformed(ActionEvent e1) {
            AnadirPelicula obj = new AnadirPelicula();
            obj.setVisible(true);
            dispose();
        }

    }

    public class Ok implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e1) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(NombrePelijTextField.getText());
            arrayList.add(GenerojTextField.getText());
            arrayList.add(DirectorjTextField.getText());
            arrayList.add(PaisjTextField.getText());
            arrayList.add(ProductorjTextField.getText());
            arrayList.add(AnojTextField.getText());
            arrayList.add(notaJText.getText());

            AnadirPeliculaCero obj = new AnadirPeliculaCero();
            ProgramasExcel programasExcel = new ProgramasExcel();
            try {
                if (!programasExcel.PerteneceNombreAHoja("Nombre Pelicula", arrayList.get(0).toString())) {
                    programasExcel.comprobarColumna("Nombre Pelicula", arrayList.get(0).toString());
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
                    programasExcel.comprobarColumnaPelicula("Pelicula", arrayList);
                } else {
                    obj.setVisible(false);

                }
            } catch (IOException ex) {
                Logger.getLogger(AnadirVariado.class.getName()).log(Level.SEVERE, null, ex);
            } catch (InvalidFormatException ex) {
                Logger.getLogger(AnadirVariado.class.getName()).log(Level.SEVERE, null, ex);
            }
            obj.setVisible(true);
            dispose();
        }

    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private JTextField AnojTextField = new JTextField();
    private JTextField DirectorjTextField = new JTextField();
    private JTextField GenerojTextField= new JTextField();
    private JButton MENUButton= new JButton();
    private JTextField NombrePelijTextField= new JTextField();
    private JButton OKButton= new JButton();
    private JTextField PaisjTextField= new JTextField();
    private JTextField ProductorjTextField= new JTextField();
    private JButton VOLVERButton = new JButton();
    private JLabel jLabel1 = new JLabel();
    private JLabel jLabel2= new JLabel();
    private JLabel jLabel3= new JLabel();
    private JLabel jLabel4= new JLabel();
    private JLabel jLabel5= new JLabel();
    private JLabel jLabel6= new JLabel();
    private JTextField notaJText= new JTextField();
    private JLabel notajLabel= new JLabel();
    // End of variables declaration//GEN-END:variables
}
