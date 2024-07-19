/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import com.mysql.cj.jdbc.Driver;

public class KoneksiL {
    
    public static Connection con;
    public static Statement stm;
    
    public void config() throws SQLException{
        try {
            String url = "jdbc:mysql://localhost/db_ngalembur";
            String user = "root";
            String pass = "";
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection(url,user,pass);
            stm = con.createStatement();
            System.out.println("Koneksi Berhasil");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(KoneksiL.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
