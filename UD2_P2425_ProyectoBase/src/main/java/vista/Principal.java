/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package vista;

import controlador.controladorPrincipal;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 *
 * @author AD
 */
public class Principal extends javax.swing.JFrame {

    /**
     * Creates new form Principal
     */
    public Principal() {
        initComponents();
        controladorPrincipal.iniciaFactory();
    }
    
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        txtAreaDep = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtAreaEmp = new javax.swing.JTextArea();
        labeldep = new javax.swing.JLabel();
        txtnumdep = new javax.swing.JTextField();
        lbltotaldep = new javax.swing.JLabel();
        btnaceptar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtnumdep2 = new javax.swing.JTextField();
        txtnombredep = new javax.swing.JTextField();
        txtlocdep = new javax.swing.JTextField();
        lbltotalemp = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        txtAreaDep.setColumns(20);
        txtAreaDep.setRows(5);
        jScrollPane1.setViewportView(txtAreaDep);

        txtAreaEmp.setColumns(20);
        txtAreaEmp.setRows(5);
        jScrollPane2.setViewportView(txtAreaEmp);

        labeldep.setText("NºDep");

        lbltotaldep.setText("jLabel1");

        btnaceptar.setText("Aceptar");
        btnaceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnaceptarActionPerformed(evt);
            }
        });

        jLabel1.setText("nº departamento");

        jLabel2.setText("nombre");

        jLabel3.setText("localidad");

        txtnumdep2.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtnumdep2FocusLost(evt);
            }
        });
        txtnumdep2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnumdep2ActionPerformed(evt);
            }
        });

        txtnombredep.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnombredepActionPerformed(evt);
            }
        });

        txtlocdep.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtlocdepActionPerformed(evt);
            }
        });

        lbltotalemp.setText("jLabel4");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(txtnumdep2))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(66, 66, 66)
                        .addComponent(txtnombredep, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(60, 60, 60)
                        .addComponent(txtlocdep, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(148, 148, 148)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbltotaldep))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(labeldep)
                        .addGap(18, 18, 18)
                        .addComponent(txtnumdep, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnaceptar))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(lbltotalemp)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnaceptar)
                    .addComponent(txtnumdep, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labeldep))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(txtnumdep2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(txtnombredep, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(26, 26, 26)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel3)
                                    .addComponent(txtlocdep, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(lbltotaldep))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lbltotalemp)))
                .addContainerGap(233, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        
        //cerrar factory al cerrar ventana
        controladorPrincipal.cerrarFactory();
        
    }//GEN-LAST:event_formWindowClosed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
       
      //  controladorPrincipal.listardepartamentos();
      //  controladorPrincipal.listarempleados();
        
        
    }//GEN-LAST:event_formWindowOpened

    private void btnaceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnaceptarActionPerformed
      
        controladorPrincipal.listardepartamentopornum();
        
        controladorPrincipal.listarempleadopornumdep();
        
    }//GEN-LAST:event_btnaceptarActionPerformed

    private void txtnumdep2FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtnumdep2FocusLost
        
        controladorPrincipal.mostrardatos();
        
        
    }//GEN-LAST:event_txtnumdep2FocusLost

    private void txtnumdep2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnumdep2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnumdep2ActionPerformed

    private void txtnombredepActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnombredepActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnombredepActionPerformed

    private void txtlocdepActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtlocdepActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtlocdepActionPerformed

    public JTextField getTxtlocdep() {
        return txtlocdep;
    }

    public void setTxtlocdep(JTextField txtlocdep) {
        this.txtlocdep = txtlocdep;
    }

    public JTextField getTxtnombredep() {
        return txtnombredep;
    }

    public void setTxtnombredep(JTextField txtnombredep) {
        this.txtnombredep = txtnombredep;
    }

    public JTextField getTxtnumdep2() {
        return txtnumdep2;
    }

    public void setTxtnumdep2(JTextField txtnumdep2) {
        this.txtnumdep2 = txtnumdep2;
    }

    public JTextArea getTxtAreaDep() {
        return txtAreaDep;
    }

    public void setTxtAreaDep(JTextArea txtAreaDep) {
        this.txtAreaDep = txtAreaDep;
    }

    public JTextArea getTxtAreaEmp() {
        return txtAreaEmp;
    }

    public void setTxtAreaEmp(JTextArea TxtAreaEmp) {
        this.txtAreaEmp = TxtAreaEmp;
    }

    public JTextField getTxtnumdep() {
        return txtnumdep;
    }

    public void setTxtnumdep(JTextField txtnumdep) {
        this.txtnumdep = txtnumdep;
    }

    public JLabel getTxtTotaldep() {
        return lbltotaldep;
    }

    public void setTxtTotaldep(JLabel txtTotaldep) {
        this.lbltotaldep = txtTotaldep;
    }

    public JLabel getLbltotaldep() {
        return lbltotaldep;
    }

    public void setLbltotaldep(JLabel lbltotaldep) {
        this.lbltotaldep = lbltotaldep;
    }
    
    
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnaceptar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel labeldep;
    private javax.swing.JLabel lbltotaldep;
    private javax.swing.JLabel lbltotalemp;
    private javax.swing.JTextArea txtAreaDep;
    private javax.swing.JTextArea txtAreaEmp;
    private javax.swing.JTextField txtlocdep;
    private javax.swing.JTextField txtnombredep;
    private javax.swing.JTextField txtnumdep;
    private javax.swing.JTextField txtnumdep2;
    // End of variables declaration//GEN-END:variables
}
