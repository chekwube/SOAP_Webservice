/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CRUDproject;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
/**
 *
 * @author mac
 */
public class DbConnection {
    
    public Connection get_connection(){
    Connection connection=null;
    try {
      Class.forName("com.mysql.jdbc.Driver");              
      connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/CRUDproject","root", "");
    } catch (ClassNotFoundException | SQLException e) {
      System.out.println(e);
    }
      return connection;
    }
}
