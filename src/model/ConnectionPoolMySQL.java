package model;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Stack;
import javax.swing.JOptionPane;

public class ConnectionPoolMySQL {
    private static DoublyLinkedList dataList = new DoublyLinkedList();
    private static Stack<String> dataStack = new Stack<>();

    public static void addDataToList(String user, String cel, String pass, String pass1) {
        String data = "User: " + user + ", Cel: " + cel + ", Pass: " + pass + ", Pass1: " + pass1;
        dataList.insertLast(data);
    }

    public static void addDataToStack(String user, String cel, String pass, String pass1) {
        String data = "User: " + user + ", Cel: " + cel + ", Pass: " + pass + ", Pass1: " + pass1;
        dataStack.push(data);
    }

    public void setRegistrarArchivo(String user, String cel, String pass, String pass1) {
        FileWriter fichero = null;
        PrintWriter pw = null;

        try {
            fichero = new FileWriter("C:/Prueba/prueba.txt");
            pw = new PrintWriter(fichero);

            if (user == null || user.isEmpty() || cel == null || cel.isEmpty() ||
                    pass == null || pass.isEmpty() || pass1 == null || pass1.isEmpty()) {
                pw.println("Datos incompletos!");
            } else {
                pw.println("User: " + user);
                pw.println("Cel: " + cel);
                pw.println("Pass: " + pass);
                pw.println("Pass1: " + pass1);
            }

            JOptionPane.showMessageDialog(null, "Datos guardados al archivo!", "Información", JOptionPane.INFORMATION_MESSAGE);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Información: \n" + e.getMessage(), "Error!", JOptionPane.WARNING_MESSAGE);
        } finally {
            try {
                if (fichero != null)
                    fichero.close();
            } catch (Exception e2) {
                JOptionPane.showMessageDialog(null, "Información: \n" + e2.getMessage(), "Error!", JOptionPane.WARNING_MESSAGE);
            }
        }
    }

    public void getInfoArchivo() {
        File archivo = null;
        FileReader fr = null;
        BufferedReader br = null;

        try {
            archivo = new File("C:/Prueba/prueba.txt");
            fr = new FileReader(archivo);
            br = new BufferedReader(fr);

            String linea;
            StringBuilder datos = new StringBuilder();

            while ((linea = br.readLine()) != null) {
                datos.append(linea).append("\n");
            }

            if (datos.length() == 0) {
                JOptionPane.showMessageDialog(null, "El archivo no tiene registros!", "Información", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(null, "Datos cargados del archivo:\n" + datos.toString(), "Información", JOptionPane.INFORMATION_MESSAGE);
            }

            setRegistrarArchivo(null, null, null, null);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Información: \n" + e.getMessage(), "Error!", JOptionPane.WARNING_MESSAGE);
        } finally {
            try {
                if (fr != null)
                    fr.close();
            } catch (Exception e2) {
                JOptionPane.showMessageDialog(null, "Información: \n" + e2.getMessage(), "Error!", JOptionPane.WARNING_MESSAGE);
            }
        }
    }
}
