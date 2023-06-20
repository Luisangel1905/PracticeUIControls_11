/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.awt.HeadlessException;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author JorgeLPR
 */
public class UserDAO {
    
    public int login (String user, String password){
     
    int state = -1;
    if (user.equals("user") && password.equals("pass")) {
        state = 1;
    } else {
        state = 0;
    }
    return state;
}
    public int login1(String user, String cel, String pass1, String pass) {
    int state = -1;
    if (pass1.equals(pass)) {
        state = 1;
    } else {
        state = 0;
    }
    return state;
}
public boolean verificarNumeroRepetido(String numero) {
    ConnectionPoolMySQL connectionPool = new ConnectionPoolMySQL();
    connectionPool.getInfoArchivo();
    DoublyLinkedList dataList = ConnectionPoolMySQL.getDataList();

    boolean repetido = false;

    for (int i = 0; i < dataList.getSize(); i++) {
        String data = dataList.get(i);
        if (data.contains("Cel: " + numero)) {
            repetido = true;
            break;
        }
    }

    return repetido;
}

}