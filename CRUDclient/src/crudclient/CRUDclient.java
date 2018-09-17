/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package crudclient;

import crudproject.Exception_Exception;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author mac
 */
public class CRUDclient {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            int id = 2508;
            int oldId = 2578;
            int newId = 2577;
            String username = "julius";
            String password = "okeke123";
            String newUsername = "chekwube";
            String newPassword = "okeke12345";
            
            deleteData(username);          
            insertData(id, username, password);
            readData(username, password);
            updateData(oldId, newId, newUsername, newPassword);
        } catch (Exception_Exception e) {
            System.out.println(e);
        }
    }

    private static void deleteData(java.lang.String username) throws Exception_Exception {
        crudproject.Crud_Service service = new crudproject.Crud_Service();
        crudproject.Crud port = service.getCrudPort();
        port.deleteData(username);
    }

    private static void insertData(int id, java.lang.String username, java.lang.String password) throws Exception_Exception {
        crudproject.Crud_Service service = new crudproject.Crud_Service();
        crudproject.Crud port = service.getCrudPort();
        port.insertData(id, username, password);
    }

    private static void readData(java.lang.String username, java.lang.String password) throws Exception_Exception {
        crudproject.Crud_Service service = new crudproject.Crud_Service();
        crudproject.Crud port = service.getCrudPort();
        port.readData(username, password);
    }

    private static void updateData(int oldId, int newId, java.lang.String newUsername, java.lang.String newPassword) throws Exception_Exception {
        crudproject.Crud_Service service = new crudproject.Crud_Service();
        crudproject.Crud port = service.getCrudPort();
        port.updateData(oldId, newId, newUsername, newPassword);
    }
    
}
