/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Aditya
 */
import java.sql.*;
import javax.swing.JOptionPane;

public class JavaConnectIssue {
Connection conn1;
 
 public static Connection ConnecrDb(){
    try{
        Class.forName("org.sqlite.JDBC");
        Connection conn1=DriverManager.getConnection("jdbc:sqlite:C:\\Users\\Aditya\\Documents\\NetBeansProjects\\Library Management System\\Issue.db");
        return conn1;
     }catch(Exception e){
        JOptionPane.showMessageDialog(null,e);
        return null;
    }
  }
}
