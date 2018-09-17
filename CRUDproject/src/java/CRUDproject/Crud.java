/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CRUDproject;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.ejb.Stateless;

/**
 *
 * @author mac
 */
@WebService(serviceName = "Crud")
@Stateless()
public class Crud {
    
     /**
     * Web service operation
     * @param id
     * @param username
     * @param password
     * @throws java.lang.Exception
     */
    @WebMethod(operationName = "insertData")
    public void insertData(@WebParam(name = "id") int id, @WebParam(name = "username") String username, @WebParam(name = "password") String password) throws Exception {
        int id_no = id;
        String user_name = username;
        String pass_word = password;
        DbConnection obj_DbConnection=new DbConnection();
	Connection connection=obj_DbConnection.get_connection();
	PreparedStatement ps;
        
	try {
		String query="INSERT INTO user(id,name,password) VALUES (?,?,?)";
		ps=connection.prepareStatement(query);
		ps.setInt(1, id_no);
		ps.setString(2, user_name);
		ps.setString(3, pass_word);
		ps.executeUpdate();
                
                System.out.println("A new user has been added to the database!");
	} catch (SQLException e) {
		System.out.println(e);
	}finally{
        	if (connection != null) connection.close();
        }
    }

    @WebMethod(operationName = "readData")
    public void readData(@WebParam(name = "username") String username, @WebParam(name = "password") String password) throws Exception {
        String user_name = username;
        String pass_word = password;
        
        DbConnection obj_DbConnection=new DbConnection();
	Connection connection=obj_DbConnection.get_connection();
	PreparedStatement ps = null;
	ResultSet rs = null;
	try {
		String query="SELECT * from user WHERE name = ? AND password = ?";
		ps=connection.prepareStatement(query);
                ps.setString(1, user_name);
                ps.setString(2, pass_word);

		rs=ps.executeQuery();
		while(rs.next()){
		System.out.println("Identity number -"+rs.getString("id"));
		System.out.println("Username -"+rs.getString("name"));
		System.out.println("Password -"+rs.getString("password"));
		}
	} catch(SQLException e){
                System.out.println(e);
        }finally{
      		if (connection != null) connection.close();
        }
    }

    @WebMethod(operationName = "updateData")
    public void updateData(@WebParam(name = "old_id") int old_id, @WebParam(name = "new_id") int new_id, @WebParam(name = "new_username") String new_username, @WebParam(name = "new_password") String new_password) throws Exception {
        int id1 = old_id;
        int id2 = new_id;
        String user_name = new_username;
        String pass_word = new_password;
        
        DbConnection obj_DbConnection=new DbConnection();
	Connection connection=obj_DbConnection.get_connection();
	PreparedStatement ps = null;
        try {
		String query="UPDATE user SET id=?,name=?,password=? WHERE id=?";
		ps=connection.prepareStatement(query);
		ps.setInt(1, id2);
		ps.setString(2, user_name);
		ps.setString(3, pass_word);
		ps.setInt(4, id1);
		ps.executeUpdate();
                System.out.println("User details successfully updated!");
	} catch(SQLException e){
                System.out.println(e);
       
        }finally{
                if (connection != null) connection.close();
        }
    }
    
    @WebMethod(operationName = "deleteData")
    public void deleteData(@WebParam(name = "username") String username) throws Exception {
           String user_name = username;
        DbConnection obj_DbConnection=new DbConnection();
	Connection connection=obj_DbConnection.get_connection();
	PreparedStatement ps=null;
	try {
		String query="DELETE FROM user WHERE name=?";
		ps=connection.prepareStatement(query);
		ps.setString(1, user_name);
		ps.executeUpdate();
                System.out.println("User deleted successfully!");
	}catch(SQLException e){
                System.out.println(e);
        }finally{
      		if (connection != null) connection.close();

        }
    }
}
