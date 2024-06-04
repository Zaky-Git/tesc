/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package zaky.driver;

/**
 *
 * @author mzaky
 */
public class Driver {
    public static void main(String[] args) {

        Buku buku1 = new Buku("Hari Poter", 5);
        Buku buku2 = new Buku("Setengah Koala", 3);
        Buku buku3 = new Buku("Literature", 2);

        buku1.setKodeBuku("FIC0001");
        buku2.setKodeBuku("NFC0001");
        buku3.setKodeBuku("TXT0001");
        buku3.setKodeBuku("TXT0001");
        buku3.setKodeBuku("TXT0001");
        buku3.setKodeBuku("TXT0001");
        buku3.setKodeBuku("TXT0001");
        buku3.setKodeBuku("TXT0001");
        buku3.setKodeBuku("TXT0001");
        buku3.setKodeBuku("TXT0001");
        buku3.setKodeBuku("TXT0001");
        buku3.setKodeBuku("TXT0001");
        buku3.setKodeBuku("TXT0001");
        buku3.setKodeBuku("TXT0001");
        buku3.setKodeBuku("TXT0001");
        buku3.setKodeBuku("TXT0001");
        buku3.setKodeBuku("TXT0001");

        DataPeminjaman dataPinjam = new DataPeminjaman("Zaky");

        Buku[] daftarBuku = { buku1, buku2, buku3 };
        dataPinjam.setDaftarBuku(daftarBuku);

        dataPinjam.mulaiPinjamBuku_1302213067();

        dataPinjam.tampilkanDaftarBuku_1302213067();

    }
}
