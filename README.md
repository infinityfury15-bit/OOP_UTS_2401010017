# OOP_UTS_2401010017

# 📚 Sistem Perpustakaan Digital (Console-Based)

[![Java Version](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white)](https://www.oracle.com/java/)
[![OOP Concepts](https://img.shields.io/badge/OOP-Encapsulation-blue?style=for-the-badge)](https://en.wikipedia.org/wiki/Object-oriented_programming)
[![Maintenance](https://img.shields.io/badge/Maintained%3F-yes-green.svg?style=for-the-badge)](https://github.com/)

Program ini adalah aplikasi manajemen perpustakaan sederhana berbasis konsol yang dibangun menggunakan bahasa pemrograman **Java**. Proyek ini dirancang untuk menunjukkan implementasi dasar dari **Object-Oriented Programming (OOP)**, khususnya konsep *Encapsulation*.

## ✨ Fitur Utama
- 📖 **Cek Info Buku**: Menampilkan detail judul, penulis, jumlah stok, dan status ketersediaan.
- 📥 **Pinjam Buku**: Mengurangi stok buku secara otomatis dan memperbarui status ketersediaan.
- 📤 **Kembalikan Buku**: Menambah kembali stok buku ke dalam sistem.
- 🔐 **Tambah Stok (Admin)**: Fitur untuk memperbarui jumlah naskhah buku secara manual.
- 🛠️ **Logika Automatis**: Status buku akan berubah menjadi "Kosong" secara otomatis jika stok mencapai angka nol.

## 📂 Struktur File
Proyek ini terdiri dari dua kelas utama di dalam paket `utsoop`:
1.  **`Buku.java`**: *Blueprint* (Class) untuk objek buku. Mengandung atribut privat dan metode logika bisnis.
2.  **`UtsOop.java`**: Kelas utama (*Main Class*) yang menangani alur program dan interaksi pengguna melalui menu scanner.

## 💻 Cara Menjalankan Program

### Prasyarat
Pastikan Anda sudah menginstal **Java Development Kit (JDK)** di perangkat Anda.

### Langkah-langkah
1.  **Clone atau Download** file `Buku.java` dan `UtsOop.java`.
2.  Simpan file dalam struktur direktori yang benar: `utsoop/`.
3.  Buka terminal atau command prompt, lalu masuk ke folder tersebut.
4.  Kompilasi file Java:
    ```bash
    javac utsoop/*.java
    ```
5.  Jalankan program:
    ```bash
    java utsoop.UtsOop
    ```

## 🛠️ Analisis Kode (Konsep OOP)

### Encapsulation
Dalam `Buku.java`, semua properti menggunakan *access modifier* `private`:
```java
private String judul;
private String penulis;
private int stok;
private boolean tersedia;

=== Selamat Datang di Perpustakaan Digital ===

Menu:
1. Cek Info Buku
2. Pinjam Buku
3. Kembalikan Buku
4. Tambah Stok (Admin)
5. Keluar
Pilih opsi (1-5): 1

--------------------------------
Judul   : Pemrograman Java
Penulis : Budi Raharjo
Stok    : 2
Status  : Tersedia
