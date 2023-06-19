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
    boolean repetido = false;

    try {
        File archivo = new File("C:\\Users\\Usuario\\Music\\Nueva carpeta.txt");
        FileReader fr = new FileReader(archivo);
        BufferedReader br = new BufferedReader(fr);

        String linea;

        while ((linea = br.readLine()) != null) {
            if (linea.contains("Cel: " + numero)) {
                repetido = true;
                break;
            }
        }

        br.close();
        fr.close();
    } catch (Exception e) {
        e.printStackTrace();
    }

    return repetido;
}

}