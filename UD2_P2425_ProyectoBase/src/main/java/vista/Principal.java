/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package vista;

import controlador.controladorPrincipal;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import modelo.vo.Departamento;

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
        //que lleve el focus
        jLabel1.requestFocusInWindow();
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
        cmbDepartamento = new javax.swing.JComboBox<>();
        btninsertar = new javax.swing.JButton();
        btnBorrarCascada = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        btnMostrarDep = new javax.swing.JButton();
        btnBorrarRestring = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        txtAreaDep.setEditable(false);
        txtAreaDep.setColumns(20);
        txtAreaDep.setRows(5);
        jScrollPane1.setViewportView(txtAreaDep);

        txtAreaEmp.setEditable(false);
        txtAreaEmp.setColumns(20);
        txtAreaEmp.setRows(5);
        jScrollPane2.setViewportView(txtAreaEmp);

        labeldep.setText("NºDep");

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

        cmbDepartamento.setToolTipText("");
        cmbDepartamento.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cmbDepartamentoMouseClicked(evt);
            }
        });
        cmbDepartamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbDepartamentoActionPerformed(evt);
            }
        });

        btninsertar.setText("Insertar");
        btninsertar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btninsertarActionPerformed(evt);
            }
        });

        btnBorrarCascada.setText("Borrar Cascada");
        btnBorrarCascada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBorrarCascadaActionPerformed(evt);
            }
        });

        btnModificar.setText("modificar");
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });

        btnMostrarDep.setText("Mostrar Departamento");
        btnMostrarDep.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMostrarDepActionPerformed(evt);
            }
        });

        btnBorrarRestring.setText("Borrar Restring.");
        btnBorrarRestring.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBorrarRestringActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(btnMostrarDep))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel1)
                            .addGap(18, 18, 18)
                            .addComponent(txtnumdep2))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel2)
                            .addGap(66, 66, 66)
                            .addComponent(txtnombredep))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel3)
                            .addGap(60, 60, 60)
                            .addComponent(txtlocdep))
                        .addComponent(jScrollPane1)
                        .addComponent(cmbDepartamento, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lbltotaldep, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbltotalemp, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(labeldep)
                                .addGap(18, 18, 18)
                                .addComponent(txtnumdep, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnaceptar))
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(btnModificar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnBorrarCascada, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btninsertar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addComponent(btnBorrarRestring)))
                .addContainerGap(164, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(74, 74, 74)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtnumdep2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btninsertar)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtnombredep, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnBorrarCascada)
                        .addComponent(btnBorrarRestring)))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtlocdep, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnModificar))
                .addGap(85, 85, 85)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnaceptar)
                        .addComponent(txtnumdep, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(labeldep))
                    .addComponent(cmbDepartamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(22, 22, 22)
                        .addComponent(lbltotaldep, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnMostrarDep))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addComponent(lbltotalemp, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(103, Short.MAX_VALUE))
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
      
      controladorPrincipal.listardepartamentoscombobox();
        
        
    }//GEN-LAST:event_formWindowOpened

    private void btnaceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnaceptarActionPerformed
      
        controladorPrincipal.listardepartamentopornum();
        
        controladorPrincipal.listarempleadopornumdep();
        
    }//GEN-LAST:event_btnaceptarActionPerformed

    private void txtnumdep2FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtnumdep2FocusLost
        
        //comentado porque resulta molesto
      //  controladorPrincipal.mostrardatos();
        
        
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

    private void btninsertarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btninsertarActionPerformed
        
        
        controladorPrincipal.insertarcomprobandoSaveoint();
        
       // controladorPrincipal.insertarcomprobando();
        
       // controladorPrincipal.insertarsincomprobar();
        controladorPrincipal.listardepartamentoscombobox();
        
        
        
        
    
        
        
    }//GEN-LAST:event_btninsertarActionPerformed

    private void btnBorrarCascadaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBorrarCascadaActionPerformed
       
        //controladorPrincipal.borrarsincomprobar();
        
        controladorPrincipal.guardarHistorico();
        
        controladorPrincipal.borrarCascada();
        
        
        controladorPrincipal.listardepartamentoscombobox();
        
        
       
        
        
    }//GEN-LAST:event_btnBorrarCascadaActionPerformed

    private void cmbDepartamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbDepartamentoActionPerformed
      //solucionar error despues de realizar insercion, borrado modif, al actualizar el combo otras vez
        //da java.lang.NullPointerException: 
        
        
        controladorPrincipal.listarempleadopornumdepcombobox();
    }//GEN-LAST:event_cmbDepartamentoActionPerformed

    private void cmbDepartamentoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cmbDepartamentoMouseClicked
       
    }//GEN-LAST:event_cmbDepartamentoMouseClicked

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        
         controladorPrincipal.modificarcomprobando();
        
        controladorPrincipal.listardepartamentoscombobox();
        
       
        
        
    }//GEN-LAST:event_btnModificarActionPerformed

    private void btnMostrarDepActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMostrarDepActionPerformed
      
        controladorPrincipal.mostrardatos();
        controladorPrincipal.listardepartamentopornum();
       controladorPrincipal.listarempleadopornumdepcombobox();
        
    }//GEN-LAST:event_btnMostrarDepActionPerformed

    private void btnBorrarRestringActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBorrarRestringActionPerformed
       
        controladorPrincipal.guardarHistorico();
        
        controladorPrincipal.borrarRestringido();
       
       controladorPrincipal.listardepartamentoscombobox();
       
       
    }//GEN-LAST:event_btnBorrarRestringActionPerformed

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

    public JLabel getLbltotalemp() {
        return lbltotalemp;
    }

    public void setLbltotalemp(JLabel lbltotalemp) {
        this.lbltotalemp = lbltotalemp;
    }

    public JComboBox<Departamento> getCmbDepartamento() {
        return cmbDepartamento;
    }

    public void setCmbDepartamento(JComboBox<Departamento> cmbDepartamento) {
        this.cmbDepartamento = cmbDepartamento;
    }
    
    
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBorrarCascada;
    private javax.swing.JButton btnBorrarRestring;
    private javax.swing.JButton btnModificar;
    private javax.swing.JButton btnMostrarDep;
    private javax.swing.JButton btnaceptar;
    private javax.swing.JButton btninsertar;
    private javax.swing.JComboBox<Departamento> cmbDepartamento;
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
