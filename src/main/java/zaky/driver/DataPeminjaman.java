/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package zaky.driver;

/**
 *
 * @author mzaky
 */
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DataPeminjaman {
    private String namaPeminjam;
    private Buku[] daftarBuku;
    private LocalDateTime tanggalPinjam;

    public DataPeminjaman(String nama) {
        namaPeminjam = nama;
    }

    public void setDaftarBuku(Buku[] listBuku) {
        daftarBuku = listBuku;
    }

    public void mulaiPinjamBuku_1302213067() {
        tanggalPinjam = LocalDateTime.now();
    }

    public String waktuPengembalian_1302213067() {
        LocalDateTime tanggalKembali = tanggalPinjam.plusHours(100);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        return tanggalKembali.format(formatter);
    }

    public void tampilkanDaftarBuku_1302213067() {
        System.out.println("User " + namaPeminjam + " dengan deadline " + waktuPengembalian_1302213067());
        System.out.println("Harus mengembalikan buku-buku berikut ini:");
        for (Buku buku : daftarBuku) {
            System.out.println("Judul " + buku.getJudul() + " dengan genre " + buku.getGenre() + " berjumlah " + buku.getKuantitas());
        }
    }
}
