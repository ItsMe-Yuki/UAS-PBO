/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import com.mysql.cj.jdbc.Driver;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
/**
 *
 * @author Yasmine
 */
public class koneksi {
 public static void main(String[] args) {
 try {
 Driver driver = new Driver();
 DriverManager.registerDriver(driver);
 System.out.println("Berhasil meregistrasi driver");
   
}
catch(SQLException ex){
 System.out.println("Gagal meregistrasi driver");
 System.out.println("Pesan : "+ex.getMessage());
 }
 try {
 String url="jdbc:mysql://localhost:3306/db_perpus";
 String user="root";
 String pass="";
 Connection koneksi = DriverManager.getConnection(url, user, pass);
 System.out.println("Koneksi ke database berhasil");
 }
 catch(SQLException ex){
 System.out.println("Koneksi ke database gagal");
 System.out.println("Pesan : "+ex.getMessage());
 }
 }
}