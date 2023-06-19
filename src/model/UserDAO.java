/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.awt.HeadlessException;
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
}