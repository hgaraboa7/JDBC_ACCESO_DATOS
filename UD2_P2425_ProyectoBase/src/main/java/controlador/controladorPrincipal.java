/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import controlador.factory.DAOFactory;
import java.sql.Connection;
import java.util.logging.Level;
import java.util.logging.Logger;
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
            depDAO.listarlosdatos(conn,ventana.getTxtArea());
            
             
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
            empDAO.listarlosdatos(conn,ventana.getTxtArea2());
            
             
            mySQLFactory.releaseConnection(conn);
            
        } catch (Exception ex) {
            Logger.getLogger(controladorPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
     
     
        
     }

}
