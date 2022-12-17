/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLDataException;
import java.sql.SQLException;
/**
 *
 * @author user
 */
public class buku {
  public static void main(String[] args) {
 Connection koneksi = KoneksiDB.getKoneksi();
 PreparedStatement prepare = null;
 try{
String sql="SELECT * FROM buku";
 prepare = koneksi.prepareStatement(sql);
 System.out.println("Prepare statement berhasil dibuat");
 }catch(SQLException ex){
 System.out.println("Prepare statement gagal dibuat");
 System.out.println("Pesan : "+ex.getMessage());
 }finally{
 if (prepare != null){
 try{
 prepare.close();
 System.out.println("Prepare statement berhasil ditutup");
 }catch(SQLException ex){
 System.out.println("Pesan : "+ex.getMessage());
 }
 }
 }
 }
 }
