/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package secure;
import java.awt.HeadlessException;
import java.sql.*;
import javax.swing.*;
/**
 *
 * @author Bilal
 */
public class MySqlConnect {

    
    Connection conn= null;
    static String url = "jdbc:mysql://localhost:3306/";
    static String dbase = "onlinebilling";
    public static Connection ConnectDB(){
        
        try{             
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/onlinebilling","root","eyedk75A");
            JOptionPane.showMessageDialog(null,"Connected to database");
            return conn;
        
        }catch(ClassNotFoundException | SQLException | HeadlessException e){
            JOptionPane.showMessageDialog(null, e);
            return null;
        }
    
    }
}

