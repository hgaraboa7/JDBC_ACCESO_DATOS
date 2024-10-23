/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JTextArea;

/**
 *
 * @author hector.garaboacasas
 */
public class EmpleadoDAO {
    
     public void listarlosdatos(Connection conn, JTextArea ta) throws SQLException {
        ta.setText("");
        String consulta="select * from Empleados";
        //usar throws
        Statement sentencia=conn.createStatement();
        
        ResultSet rs=sentencia.executeQuery(consulta);
        
        while(rs.next()){
            
           ta.append(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3)+"\n");
            
        }
        
        ta.append("FiNAL DE CONSULTA");
     }
    
    
}
