/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proje;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import org.apache.derby.jdbc.Driver42;

/**
 *
 * @author HP
 */
public class Connecter {
    public static Connection connect() {
        Connection con = null;
        try {
            con = DriverManager.getConnection("jdbc:derby://localhost:1527/yoneticidb", "hrnbdm", "1234");
            return con;
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Bağlantı hatası");
        }
        return null;
        
    }
    
}
