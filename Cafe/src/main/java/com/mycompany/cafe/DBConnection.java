/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.cafe;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ponic
 */
public class DBConnection {

   public static Connection getConnectionDB() throws SQLException{
     
       try {
           Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/cafe","root","");
            System.out.print(conn);
            return conn;
       } catch (ClassNotFoundException ex) {
           Logger.getLogger(DBConnection.class.getName()).log(Level.SEVERE, null, ex);
       }
      
       return null;
   }
   
}


  

 