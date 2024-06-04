/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package zaky.driver;

/**
 *
 * @author mzaky
 */
public class Buku {
    private String judul;
    private String kodeBuku;
    private int kuantitas;
    private String produser = "zakyBook";

    private static int fic = 0;
    private static int nfc = 0;
    private static int txt = 0;

    public Buku(String judul, int kuantitas) {
        this.judul = judul;
        this.kuantitas = kuantitas;
    }

    public void setKodeBuku(String kodeBuku) {
        if (kodeBuku.matches("^(FIC|NFC|TXT)\\d{4}$")) {
            this.kodeBuku = kodeBuku;
        } else {
            String genre = "";
            if (kodeBuku.startsWith("FIC")) {
                fic++;
                genre = "FIC";
                this.kodeBuku = String.format("%s%04d", genre, fic);
            } else if (kodeBuku.startsWith("NFC")) {
                nfc++;
                genre = "NFC";
                this.kodeBuku = String.format("%s%04d", genre, nfc);
            } else if (kodeBuku.startsWith("TXT")) {
                txt++;
                genre = "TXT";
                this.kodeBuku = String.format("%s%04d", genre, txt);
            } else {
                this.kodeBuku = "OTH9999";
            }
        }
    }

    public String getProduser() {
        return this.produser;
    }

    public String getJudul() {
        return this.judul;
    }

    public String getGenre() {
        String genre;
        if (this.kodeBuku.startsWith("OTH")) {
            genre = "Tidak tersedia";
        } else {
            genre = this.kodeBuku.substring(0, 3);
            if (genre.equals("FIC")) {
                genre = "Fiksi";
            } else if (genre.equals("NFC")) {
                genre = "Nonfiksi";
            } else if (genre.equals("TXT")) {
                genre = "Textbook";
            }
        }
        return genre;
    }

    public int getKuantitas() {
        return this.kuantitas;
    }
}
