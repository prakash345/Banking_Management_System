/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ashu
 */
import java.sql.*;
import javax.swing.JOptionPane;


public class javaconnect {
    Connection conn = null;
    public static Connection ConnecrDb()
    {
        try{
            Class.forName("org.sqlite.JDBC");
            Connection conn = DriverManager.getConnection("jdbc:sqlite:E:\\BANKING_MANAGEMENT\\BANKING_MANAGEMENT_SYSTEM\\bank1");
            return conn;
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
        return null;
            
        }
    
        
    
    
    
}
