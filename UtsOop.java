/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package utsoop;
import java.util.Scanner;

/**
 *
 * @author raditya-maheswara
 */
public class UtsOop {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Inisialisasi Objek
        Buku buku1 = new Buku("Pemrograman Java", "Budi Raharjo", 2);
        Scanner input = new Scanner(System.in);
        boolean berjalan = true;

        System.out.println("=== Selamat Datang di Perpustakaan Digital ===");

        while (berjalan) {
            System.out.println("\nMenu:");
            System.out.println("1. Cek Info Buku");
            System.out.println("2. Pinjam Buku");
            System.out.println("3. Kembalikan Buku");
            System.out.println("4. Tambah Stok (Admin)");
            System.out.println("5. Keluar");
            System.out.print("Pilih opsi (1-5): ");

            int pilihan = input.nextInt();

            switch (pilihan) {
                case 1:
                    buku1.tampilkanInfo();
                    break;
                case 2:
                    buku1.pinjamBuku();
                    break;
                case 3:
                    buku1.kembalikanBuku();
                    break;
                case 4:
                    System.out.print("Masukkan jumlah stok tambahan: ");
                    int jumlah = input.nextInt();
                    buku1.tambahStok(jumlah);
                    break;
                case 5:
                    berjalan = false;
                    System.out.println("Terima kasih telah menggunakan sistem kami.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid!");
            }
        }
        input.close();
    }
}
