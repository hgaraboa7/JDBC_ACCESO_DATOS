/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import controlador.factory.DAOFactory;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import modelo.dao.DepartamentoDAO;
import modelo.dao.EmpleadoDAO;
import modelo.vo.Departamento;
import vista.Principal;

/**
 *
 * @author Acceso a datos
 */
public class controladorPrincipal {
    public static DAOFactory mySQLFactory;
    //declara los objetos DAO
    
    
    public static DepartamentoDAO depDAO;
    public static EmpleadoDAO empDAO;
    
    
    static DefaultComboBoxModel modelocombo=new DefaultComboBoxModel();
    
    public static Principal ventana = new Principal();

    public static void iniciar() {
        ventana.setVisible(true);
        ventana.setLocationRelativeTo(null);
        
        ventana.getCmbDepartamento().setModel(modelocombo);
    }

    public static void iniciaFactory() {
        mySQLFactory = DAOFactory.getDAOFactory(DAOFactory.MYSQL);
        //inicializa los objetos DAO
        depDAO=mySQLFactory.getDepartamentoDAO();
        
       empDAO=mySQLFactory.getEmpleadoDAO();
    }

    public static void cerrarFactory() {
        try {
            mySQLFactory.shutdown();
        } catch (Exception ex) {
            Logger.getLogger(controladorPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static void listardepartamentos() {
     // en el controlador es donde va la logica
     
     
        try {
            Connection conn;
            conn= mySQLFactory.getConnection();
            depDAO.listarlosdatos(conn,ventana.getTxtAreaDep(), ventana.getLbltotaldep());
            
             
            mySQLFactory.releaseConnection(conn);
            
        } catch (Exception ex) {
            Logger.getLogger(controladorPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
     
     
        
     }
    
    public static void listarempleados() {
     // en el controlador es donde va la logica
     
     
        try {
            Connection conn;
            conn= mySQLFactory.getConnection();
            empDAO.listarlosdatos(conn,ventana.getTxtAreaEmp());
            
             
            mySQLFactory.releaseConnection(conn);
            
        } catch (Exception ex) {
            Logger.getLogger(controladorPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
     
     
        
     }

    public static void listardepartamentopornum() {
        if(ventana.getTxtnumdep().getText().isEmpty()){
                JOptionPane.showMessageDialog(null,"faltan datos");
                return;
            }
        try {
            //siempre conectar y desconectar
            Connection conn;
            conn= mySQLFactory.getConnection();
           
            //pasar solo numero int Integer.parseInt(ventana.getTxtnumdep().getText().trim()
            depDAO.listarlosdatospornumdep(conn,Integer.parseInt(ventana.getTxtnumdep().getText().trim()), ventana.getTxtAreaDep(), ventana.getLbltotaldep());
             
            mySQLFactory.releaseConnection(conn);
        } catch(NumberFormatException ex1){
            
            //salta este primero antes del de insertar
            JOptionPane.showMessageDialog(null, "entrada de datos incorrecta");
        } catch (Exception ex) {
            Logger.getLogger(controladorPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
     }
    
      public static void listarempleadopornumdep() {
        if(ventana.getTxtnumdep().getText().isEmpty()){
                JOptionPane.showMessageDialog(null,"faltan datos");
                return;
            }
        try {
            //siempre conectar y desconectar
            Connection conn;
            conn= mySQLFactory.getConnection();
            
            //existe departamento?
            
            Departamento d=depDAO.buscardepartamento(ventana.getTxtnumdep());
            
            
            
           
            
            empDAO.listarlosdatospornumdep(conn,Integer.parseInt(ventana.getTxtnumdep().getText().trim()), ventana.getTxtAreaEmp(),  ventana.getLbltotalemp());
             
            mySQLFactory.releaseConnection(conn);
        }  catch (Exception ex) {
            Logger.getLogger(controladorPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }

}

    public static void mostrardatos() {
        
        if(ventana.getTxtnumdep2().getText().isEmpty()){
                JOptionPane.showMessageDialog(null,"faltan datos");
                return;
            }
        
        try {
           
            Connection conn;
            conn= mySQLFactory.getConnection();
           
          
            depDAO.mostrardosdatos(conn,Integer.parseInt(ventana.getTxtnumdep2().getText().trim()),ventana.getTxtlocdep(), ventana.getTxtnombredep() );
             
            mySQLFactory.releaseConnection(conn);
        } catch(NumberFormatException ex1){
            JOptionPane.showMessageDialog(null, "entrada de datos incorrecta");
        } catch (Exception ex) {
            Logger.getLogger(controladorPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        
        
        
        
        
     }

    public static void listardepartamentoscombobox() {
        
       
        
        try {
            Connection conn;
            conn= mySQLFactory.getConnection();
            
            depDAO.listarlosdatoscombobox(conn, ventana.getLbltotaldep(), modelocombo);
            
            
            
             
            mySQLFactory.releaseConnection(conn);
        } catch (Exception ex) {
            Logger.getLogger(controladorPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
     }

    public static void listarempleadopornumdepcombobox() {
        
        
        try {
            Connection conn;
            conn= mySQLFactory.getConnection();
            //combobox
            empDAO.listarlosdatospornumdep(conn, ventana.getCmbDepartamento().getItemAt(ventana.getCmbDepartamento().getSelectedIndex()).getDept_no(), ventana.getTxtAreaEmp(),  ventana.getLbltotalemp());
           
            
             
            mySQLFactory.releaseConnection(conn);
        } catch (Exception ex) {
            Logger.getLogger(controladorPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        
      }

    public static void insertarsincomprobar() {
        
        Connection conn=null;
        
        if(ventana.getTxtnumdep2().getText().isEmpty()|| ventana.getTxtnombredep().getText().isEmpty()||ventana.getTxtlocdep().getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "faltan datos");
            return;
        }
        
        try {
            conn=mySQLFactory.getConnection();
            //insertamos directamente
            // depDAO.insertar(conn, Integer.valueOf(ventana.getTxtnumdep2().getText()),ventana.getTxtnombredep().getText(),ventana.getTxtlocdep().getText());
            
           JOptionPane.showMessageDialog(null, depDAO.insertar(conn, Integer.valueOf(ventana.getTxtnumdep2().getText()),
                     ventana.getTxtnombredep().getText(),ventana.getTxtlocdep().getText())+ " registros afectados");
         
            conn.commit();
           
      } catch (SQLException ex) {
            try{
                switch(ex.getErrorCode()){
                case 1062->
                JOptionPane.showMessageDialog(null, "El departamento ya existe");
                default->{
                
                }
                
                
            }
                conn.rollback();
            }catch (SQLException ex1) {
                 Logger.getLogger(controladorPrincipal.class.getName()).log(Level.SEVERE, null, ex1);
            }
            
      }catch(NumberFormatException ex1){
          try{
              conn.rollback();
          }catch (SQLException ex) {
                 Logger.getLogger(controladorPrincipal.class.getName()).log(Level.SEVERE, null, ex);
            }
          JOptionPane.showMessageDialog(null, "Error en formato de datos");
          limpiardatos();
            
            
        } catch (Exception ex2) {
            try{
                conn.rollback();
            }catch(SQLException ex){
                 Logger.getLogger(controladorPrincipal.class.getName()).log(Level.SEVERE, null, ex);
            }
           
        }finally {
            mySQLFactory.releaseConnection(conn);
        }
    }

    private static void limpiardatos() {
        ventana.getTxtnumdep2().setText("");
        ventana.getTxtnombredep().setText("");
        ventana.getTxtlocdep().setText("");
        
      }

    public static void borrarsincomprobar() {
  
        Connection conn=null;
         if(ventana.getTxtnumdep2().getText().isEmpty()|| ventana.getTxtnombredep().getText().isEmpty()||ventana.getTxtlocdep().getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "faltan datos");
            return;
        }
        
        try {
            conn=mySQLFactory.getConnection();
            
             JOptionPane.showMessageDialog(null, depDAO.borrar(conn, Integer.valueOf(ventana.getTxtnumdep2().getText()))+ " registros afectados");
         
            conn.commit();
            
        } catch (Exception ex) {
            Logger.getLogger(controladorPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
             
         
        
        
    
    
    }
        
}
