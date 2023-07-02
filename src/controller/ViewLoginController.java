/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyEvent;
import javafx.stage.Stage;
import javafx.stage.Window;
import javafx.stage.WindowEvent;
import javax.swing.JOptionPane;
import model.UserDAO;
import model.ConnectionPoolMySQL;

/**
 * FXML Controller class
 *
 * @author JorgeLPR
 */
public class ViewLoginController implements Initializable {

    private UserDAO model = new UserDAO();
    
    @FXML
    private TextField txtUser;
      @FXML
    private TextField  tex1;
                @FXML
    private TextField tex2;
              @FXML
    private TextField tex3;
              @FXML
    private TextField tex4;
     
    @FXML
    private TextField txtUser1;
        
    @FXML
    private TextField txtUser1_;
    @FXML
    private PasswordField txtPassword;
    @FXML
    private PasswordField txtPassword1;
    @FXML
    private PasswordField txtPassword1_;
    @FXML
    private Button btnLogin;
    @FXML
    private Button ing;
    @FXML
    private Button fin0,fin,fin1,fin2,fin21,domi,pago,targe;
     
     @FXML
    private Button compra;
    @FXML
    private Button cam;
    @FXML
    private Button vol;
     @FXML
    private Button ubi;
         @FXML
    private Button agre,agre1,agre2;
     @FXML
    private Button crea;
      @FXML
    private Button crea1;
      @FXML
    private Button cod;
    @FXML
    private void eventKey(KeyEvent event){
        
        Object evt = event.getSource();
        
        if(evt.equals(txtUser)){
            
            if(event.getCharacter().equals(" ")){
                event.consume();
            }
        
        }else if(evt.equals(txtPassword)){

            if(event.getCharacter().equals(" ")){
                event.consume();
            }            
        
        }
        
        
        
    }
     @FXML
    private void eventKey1(KeyEvent event){
        
        Object evt = event.getSource();
        
        if(evt.equals(txtUser1)){
            
            if(event.getCharacter().equals(" ")){
                event.consume();
            }
        
        }else if(evt.equals(txtPassword1)){

            if(event.getCharacter().equals(" ")){
                event.consume();
            }            
        
        }
                if(evt.equals(txtUser1_)){
            
            if(event.getCharacter().equals(" ")){
                event.consume();
            }
        
        }else if(evt.equals(txtPassword1_)){

            if(event.getCharacter().equals(" ")){
                event.consume();
            }            
        
        }
        
        
    }
    @FXML
    private void P(ActionEvent event){
        
    Object evt = event.getSource();

        if(evt.equals(ing)){
                                
       

                      
                        
                        loadStage("/view/ViewLogin.fxml", event);
                    }
    }
    @FXML
    private void compra(ActionEvent event){
        
    Object evt = event.getSource();

        if(evt.equals(compra)){
                                
       

                      
                        
                        loadStage("/view/Viewcompra.fxml", event);
                    }
    }
     @FXML
    private void finc(ActionEvent event){
        
    Object evt = event.getSource();

        if(evt.equals(fin)){
                                
       

                      
                        
                        loadStage("/view/ViewFin.fxml", event);
                    }
    }  @FXML
    private void finc1(ActionEvent event){
        
    Object evt = event.getSource();

        if(evt.equals(fin1)){
                                
       

                      
                        
                        loadStage("/view/ViewPrincipal.fxml", event);
                    }
    }
     @FXML
    private void finc2(ActionEvent event){
        
    Object evt = event.getSource();
    if(evt.equals(targe)){
                                
       

                      
                        
                        loadStage("/view/Viewtarge.fxml", event);
                    }
     if(evt.equals(pago)){
                                
       

                      
                        
                        loadStage("/view/Viewpago.fxml", event);
                    }
     if(evt.equals(domi)){
                                
       

                      
                        
                        loadStage("/view/Viewdomi.fxml", event);
                    }
    if(evt.equals(fin0)){
                                
       

                      
                        
                        loadStage("/view/ViewPrincipal.fxml", event);
                    }
 if(evt.equals(fin21)){
                                
       

                      
                        
                        loadStage("/view/ViewPrincipal.fxml", event);
                    }
        if(evt.equals(fin2)){
                                
       

                      
                        
                        loadStage("/view/ViewPrincipal.fxml", event);
                    }
    }
     @FXML
    private void ubi1(ActionEvent event){
        
    Object evt = event.getSource();

        if(evt.equals(ubi)){
                                
       

                      
                        
                        loadStage("/view/Viewubi.fxml", event);
                    }
    }
       @FXML
    private void agre1(ActionEvent event){
        
    Object evt = event.getSource();

        if(evt.equals(agre)){
                                
       

                      
                        
                        loadStage("/view/Viewagre.fxml", event);
        }
         if(evt.equals(agre1)){
                                
       

                      
                        
                        loadStage("/view/Viewagre.fxml", event);
        }
         if(evt.equals(agre2)){
                                
       

                      
                        
                        loadStage("/view/Viewagre.fxml", event);
        }
    }
    @FXML
    private void camb(ActionEvent event){
        
    Object evt = event.getSource();

        if(evt.equals(cam)){
                                
       

                      
                        
                        loadStage("/view/ViewCorreo.fxml", event);
                    }
    }
    @FXML
    private void volver(ActionEvent event){
        
    Object evt = event.getSource();

        if(evt.equals(vol)){
                                
       

                      
                        
                        loadStage("/view/ViewPrincipal.fxml", event);
                    }
                    }
    @FXML
    private void creaT(ActionEvent event){
        
    Object evt = event.getSource();

        if(evt.equals(crea)){
                                
       

                      
                       
            
            
                        loadStage("/view/ViewCorreo.fxml", event);
                    }
                    }   
    
     @FXML
    private void creaT1(ActionEvent event){
       
    Object evt = event.getSource();

        if(evt.equals(crea1)){
                                
       

                      
                        
                        loadStage("/view/ViewCreate_2.fxml", event);
                    }
                    }              
    
   @FXML
private void codi(ActionEvent event) {
    Object evt = event.getSource();

    if (evt.equals(cod)) {
        if (!txtUser1.getText().isEmpty() && !txtUser1_.getText().isEmpty()
                && !txtPassword1.getText().isEmpty() && !txtPassword1_.getText().isEmpty()) {

            String user = txtUser1.getText();
            String cel = txtUser1_.getText();
            String pass = txtPassword1.getText();
            String pass1 = txtPassword1_.getText();
            int state = model.login1(user, cel, pass1, pass);
       
        
            if (state != -1) {
                
                if (state == 1) {
                    
                  
                    
         ConnectionPoolMySQL connectionPool = new ConnectionPoolMySQL();
                    connectionPool.addDataToList(user, cel, pass, pass1);
                    connectionPool.addDataToStack(user, cel, pass, pass1);
                    connectionPool.setRegistrarArchivo(user, cel, pass, pass1);
                    JOptionPane.showMessageDialog(null, "Cuenta creada");
                    loadStage("/view/ViewCreate_1.fxml", event);

                } else {
                    JOptionPane.showMessageDialog(null, "Error al crear la cuenta, intente nuevamente",
                            "ADVERTENCIA", JOptionPane.WARNING_MESSAGE);
                }
            }
        } else {
            JOptionPane.showMessageDialog(null, "Error al crear la cuenta, intente nuevamente",
                    "ADVERTENCIA", JOptionPane.WARNING_MESSAGE);
        }
    }
}

    @FXML
    private void eventAction(ActionEvent event){
        
        Object evt = event.getSource();

        if(evt.equals(btnLogin)){
                                
            if(!txtUser.getText().isEmpty() && !txtPassword.getText().isEmpty()){
            
                String user = txtUser.getText();
                String pass = txtPassword.getText();
             
                int state = model.login(user, pass);
                
                if(state!=-1){

                    if(state == 1){

                        JOptionPane.showMessageDialog(null, "Datos correctos puede ingresar al sistema");
                        
                        loadStage("/view/ViewPrincipal.fxml", event);

                    }else{
                        JOptionPane.showMessageDialog(null, "Error al iniciar sesión datos de acceso incorrectos", 
                                                            "ADVERTENCIA", JOptionPane.WARNING_MESSAGE);                
                    }

                }                

            
            }else{            
                    JOptionPane.showMessageDialog(null, "Error al iniciar sesión datos de acceso incorrectos", 
                                                        "ADVERTENCIA", JOptionPane.WARNING_MESSAGE);                                
            }
        
        }
    
    }
    
    
    
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
    private void loadStage(String url, Event event){
            
        try {
    
            //((Node)(event.getSource())).getScene().getWindow().hide();    
            
            
            Object eventSource = event.getSource(); 
            Node sourceAsNode = (Node) eventSource ;
            Scene oldScene = sourceAsNode.getScene();
            Window window = oldScene.getWindow();
            Stage stage = (Stage) window ;
            stage.hide();
                        
            Parent root = FXMLLoader.load(getClass().getResource(url));
            Scene scene = new Scene(root);              
            Stage newStage = new Stage();
            newStage.setScene(scene);
            newStage.show();  
                                    
            newStage.setOnCloseRequest(new EventHandler<WindowEvent>() {
                @Override
                public void handle(WindowEvent event) {
                    Platform.exit();
                }
            });  

        } catch (IOException ex) {
            Logger.getLogger(ViewLoginController.class.getName()).log(Level.SEVERE, null, ex);
        }
                
    }    
    
    
}
