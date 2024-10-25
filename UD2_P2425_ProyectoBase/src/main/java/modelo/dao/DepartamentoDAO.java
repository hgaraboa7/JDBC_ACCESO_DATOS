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
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import modelo.vo.Departamento;

/**
 *
 * @author hector.garaboacasas
 */
public class DepartamentoDAO {

    

    public void listarlosdatos(Connection conn, JTextArea ta, JLabel lbltotaldep) throws SQLException {
        ta.setText("");
        String consulta="select * from Departamentos";
        //usar throws
        Statement sentencia=conn.createStatement();
        
        ResultSet rs=sentencia.executeQuery(consulta);
        
        while(rs.next()){
            
           ta.append(rs.getInt(1)+" "+rs.getString("dnombre")+" "+rs.getString(3)+"\n");
            
        }
        consulta="select count(*) from Departamentos";
        rs=sentencia.executeQuery(consulta);
        
       if(rs.next()){
           lbltotaldep.setText("total departamentos: "+rs.getInt(1)+"");
       }
        
        
     }

    public void listarlosdatospornumdep(Connection conn, int numdep, JTextArea txtArea, JLabel lbltotaldep) throws SQLException {
  
        //pepared se usa cuando hay parametros
        txtArea.setText("");
        String consulta="select * from Departamentos where dept_no=?";
        PreparedStatement sentencia=conn.prepareStatement(consulta);
        sentencia.setInt(1, numdep);

        //cuando es create se pone la sentenmcia en el execute
        //pero cuando es prepared, ya esta la consulta en la creacion del prepared
        //entonces el RS es solo executequery() por estar ya prperadada
        ResultSet rs=sentencia.executeQuery();
        
        if(rs.next()){
            txtArea.append(rs.getInt(1)+" "+rs.getString("dnombre")+" "+rs.getString(3)+"\n");
        }else{
             txtArea.append("No hay departamentos");
        }
        consulta="select count(*) from Departamentos";
        rs=sentencia.executeQuery(consulta);
        
         if(rs.next()){
           lbltotaldep.setText("total departamentos: "+rs.getInt(1)+"");
       }

    }

    public void mostrardosdatos(Connection conn, int numdep,JTextField locdep, JTextField nombredep) throws SQLException {
        
        locdep.setText("");
        nombredep.setText("");
         
        String consulta="select * from Departamentos where dept_no=?";
        PreparedStatement sentencia=conn.prepareStatement(consulta);
        sentencia.setInt(1, numdep);
        
        
        
        ResultSet rs=sentencia.executeQuery();
        
        if(rs.next()){
            nombredep.setText(rs.getString(2));
            locdep.setText(rs.getString(3));
            
            
        }else{
            JOptionPane.showMessageDialog(null, "no hay departamentos");
        }
        
        
        
        
     }

    public Departamento buscardepartamento(JTextField txtnumdep) {
        
        
        
        return null;
     }
    
}
