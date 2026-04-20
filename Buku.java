/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utsoop;

/**
 *
 * @author raditya-maheswara
 */
public class Buku {
    // 4 Properties dengan access modifier private (Encapsulation)
    private String judul;
    private String penulis;
    private int stok;
    private boolean tersedia;

    // Constructor
    public Buku(String judul, String penulis, int stok) {
        this.judul = judul;
        this.penulis = penulis;
        this.stok = stok;
        this.tersedia = stok > 0;
    }

    // 4 Methods utama
    
    // Method 1: Menampilkan info buku
    public void tampilkanInfo() {
        System.out.println("--------------------------------");
        System.out.println("Judul   : " + judul);
        System.out.println("Penulis : " + penulis);
        System.out.println("Stok    : " + stok);
        System.out.println("Status  : " + (tersedia ? "Tersedia" : "Kosong"));
    }

    // Method 2: Proses Pinjam
    public void pinjamBuku() {
        if (tersedia && stok > 0) {
            stok--;
            System.out.println("Berhasil meminjam buku: " + judul);
            if (stok == 0) tersedia = false;
        } else {
            System.out.println("Maaf, stok buku '" + judul + "' sedang habis.");
        }
    }

    // Method 3: Proses Kembali
    public void kembalikanBuku() {
        stok++;
        tersedia = true;
        System.out.println("Terima kasih! Buku '" + judul + "' telah dikembalikan.");
    }

    // Method 4: Update Stok Manual
    public void tambahStok(int jumlah) {
        if (jumlah > 0) {
            this.stok += jumlah;
            this.tersedia = true;
            System.out.println("Stok berhasil diperbarui.");
        }
    }
}
