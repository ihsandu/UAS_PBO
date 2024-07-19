/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.sql.SQLException;
import java.sql.Connection;
import java.sql.DriverManager;
import com.mysql.cj.jdbc.Driver;

/**
 *
 * @author rizky
 */
public class koneksi {
    
    private static Connection koneksi;
    
    public static Connection getConnection() throws SQLException {
        
        if (koneksi == null ) {
            new Driver ();
            
            koneksi = DriverManager.getConnection("jdbc:mysql://localhost:3306/db_ngalembur", "root", "");
        }
        return koneksi;
    }
    
}
