/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
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
        
       
     }
     
       public void listarlosdatospornumdep(Connection conn, int numdep, JTextArea txtArea) throws SQLException {
  
     
        txtArea.setText("");
        String consulta="select * from empleados where dept_no=?";
        PreparedStatement sentencia=conn.prepareStatement(consulta);
        sentencia.setInt(1, numdep);

        
        ResultSet rs=sentencia.executeQuery();
        
        
        
        //error por type forward only
        
//        if(!rs.next()){
//           txtArea.append("no hay empleados en ese departamento") ;
//        }
//        rs.first();

        
        int contador=0;

        while(rs.next()){
            txtArea.append(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3)+rs.getString("dept_no")+"\n");
            contador++;
        } 
        
        if(contador==0){
         txtArea.append("no hay empleados en ese departamento");   
        }
        


    }
    
    
}
