/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
/**
 *
 * @author user
 */
public class buku {
    private Connection koneksi;
 public buku() {
koneksi = KoneksiDB.getKoneksi();
 }
 public void insert(String kd, String jns, String jdl, String pngrng, String thn, int stk){
   PreparedStatement prepare = null;
 try{
     String sql= "INSERT INTO buku (kode,jenis,judul,pengarang,tahun,stok)VALUES(?,?,?,?,?,?)";
 prepare = koneksi.prepareStatement(sql);
 System.out.println("Prepare statement berhasil dibuat");
 prepare.setString(1, kd);
 prepare.setString(2, jns);
 prepare.setString(3, jdl);
 prepare.setString(4, pngrng);
 prepare.setString(5, thn);
 prepare.setInt(6, stk);
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
 public void update(String kd, String jns, String jdl, String pngrng, String thn, int stk){
PreparedStatement prepare = null;
 try{
 String sql="UPDATE buku SET jenis=?,judul=?,pengarang=?,tahun=?,stok=? WHERE kode=?";  
 prepare = koneksi.prepareStatement(sql);
 System.out.println("Prepare statement berhasil dibuat");
 prepare.setString(1, kd);
 prepare.setString(2, jns);
 prepare.setString(3, jdl);
 prepare.setString(4, pngrng);
 prepare.setString(5, thn);
 prepare.setInt(6, stk);
 prepare.executeUpdate();
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
 public void delete(String kd){
 PreparedStatement prepare = null;
 try{
 String sql="DELETE FROM buku WHERE Kode=?";
 prepare = koneksi.prepareStatement(sql);
 System.out.println("Prepare statement berhasil dibuat");
 prepare.setString(1, kd);
 prepare.executeUpdate();
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
 
