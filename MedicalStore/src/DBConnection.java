/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package medicalstore;
import  java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author Shrestha
 */
public class DBConnection {
    public static Connection cn;
    public static void FillConnection ()
    {
        try{
            Class.forName("com.mysql.jdbc.Driver");
            cn= DriverManager.getConnection("jdbc:mysql://localhost/medicalstore", "root", "");
        }
    catch(Exception Ex){
        JOptionPane.showMessageDialog(null, Ex);
    }
    }
}
