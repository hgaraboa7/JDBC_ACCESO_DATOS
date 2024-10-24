/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import controlador.factory.DAOFactory;
import java.sql.Connection;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import modelo.dao.DepartamentoDAO;
import modelo.dao.EmpleadoDAO;
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
    
    public static Principal ventana = new Principal();

    public static void iniciar() {
        ventana.setVisible(true);
        ventana.setLocationRelativeTo(null);
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
            depDAO.listarlosdatospornumdep(conn,Integer.parseInt(ventana.getTxtnumdep().getText().trim()), ventana.getTxtAreaDep());
             
            mySQLFactory.releaseConnection(conn);
        } catch(NumberFormatException ex1){
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
           
            //pasar solo numero int Integer.parseInt(ventana.getTxtnumdep().getText().trim()
            empDAO.listarlosdatospornumdep(conn,Integer.parseInt(ventana.getTxtnumdep().getText().trim()), ventana.getTxtAreaEmp());
             
            mySQLFactory.releaseConnection(conn);
        } catch(NumberFormatException ex1){
            JOptionPane.showMessageDialog(null, "entrada de datos incorrecta");
        } catch (Exception ex) {
            Logger.getLogger(controladorPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }

}
}
