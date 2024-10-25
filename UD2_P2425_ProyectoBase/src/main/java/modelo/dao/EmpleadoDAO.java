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
import javax.swing.JLabel;
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
        PreparedStatement sentencia=conn.prepareStatement(consulta, ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
        
        /*
        String consulta2="select count(*) from Empleados where dept_no=?";
        PreparedStatement sentencia2=conn.prepareStatement(consulta2);
        */
        
        sentencia.setInt(1, numdep);

        ResultSet rs=sentencia.executeQuery();
        
        /*
        sentencia2.setInt(1,numdep);
        
        ResultSet rs2=sentencia2.executeQuery();
        */
        
        
        
        
       if(!rs.next()){
          txtArea.append("no hay empleados en ese departamento") ;
          return;
       }
        rs.beforeFirst();

        /*



        int contador=0;

        while(rs.next()){
            txtArea.append(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3)+rs.getString("dept_no")+"\n");
            contador++;
        } 
        
        if(contador==0){
         txtArea.append("no hay empleados en ese departamento");   
        }
        */
        
        
        
        while(rs.next()){
            txtArea.append(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3)+rs.getString("dept_no")+"\n");
            
        } 
        
       /* if((rs2.next())&&(rs2.getInt(1)==0)){
            
           txtArea.append("no hay empleados en ese departamento");
       }*/
        
       
        
        
        
        
        


    }
        
        
        
    
    
}
