/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import com.stripbandunk.jwidget.annotation.TableColumn;
/**
 *
 * @author Yasmine
 */
public class buku {
     @TableColumn(number=1, name ="id buku")
 private String id;
      @TableColumn(number=2, name ="kode buku")
 private String kode;
       @TableColumn(number=3, name ="jenis buku")
 private String jenis;
       @TableColumn(number=4, name ="judul buku") 
 private String judul;
        @TableColumn(number=5, name ="pengarang buku")
 private String pengarang;
         @TableColumn(number=6, name ="tahun buku")
 private String tahun;
 private int stok;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getKode() {
        return kode;
    }

    public void setKode(String kode) {
        this.kode = kode;
    }

    public String getJenis() {
        return jenis;
    }

    public void setJenis(String jenis) {
        this.jenis = jenis;
    }

    public String getJudul() {
        return judul;
    }

    public void setJudul(String judul) {
        this.judul = judul;
    }

    public String getPengarang() {
        return pengarang;
    }

    public void setPengarang(String pengarang) {
        this.pengarang = pengarang;
    }

    public String getTahun() {
        return tahun;
    }

    public void setTahun(String tahun) {
        this.tahun = tahun;
    }

    public int getStok() {
        return stok;
    }

    public void setStok(int stok) {
        this.stok = stok;
    }
    
}
