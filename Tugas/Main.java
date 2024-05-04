package com.jobsheet10.tugas;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Queue antrianKlinik = new Queue(5);
        int pilihan;
        do {
            System.out.println("\n===============( MENU )===============");
            System.out.println("1. Tambah Pasien");
            System.out.println("2. Hapus Pasien Terdepan");
            System.out.println("3. Lihat Pasien Terdepan");
            System.out.println("4. Lihat Pasien Terbelakang");
            System.out.println("5. Cari Pasien Berdasarkan Nama");
            System.out.println("6. Lihat Daftar Seluruh Pasien");
            System.out.println("0. Keluar");
            System.out.print("Pilihan Anda: ");
            pilihan = scanner.nextInt();
            switch (pilihan) {
                case 1:
                    tambahPasien(antrianKlinik, scanner);
                    break;
                case 2:
                    antrianKlinik.dequeue();
                    break;
                case 3:
                    antrianKlinik.peek();
                    break;
                case 4:
                    antrianKlinik.peekRear();
                    break;
                case 5:
                    cariPasien(antrianKlinik, scanner);
                    break;
                case 6:
                    antrianKlinik.daftarPasien();
                    break;
                case 0:
                    System.out.println("Terima kasih!");
                    break;
                default:
                    System.out.println("Pilihan tidak valid. Silakan pilih lagi.");
                    break;
            }
        } while (pilihan != 0);
        scanner.close();
    }
    public static void tambahPasien(Queue antrian, Scanner scanner) {
        System.out.println("\nMasukkan Data Pasien Baru:");
        System.out.print("Nama: ");
        String nama = scanner.next();
        System.out.print("Nomor ID: ");
        int noID = scanner.nextInt();
        System.out.print("Jenis Kelamin (L/P): ");
        char jenisKelamin = scanner.next().charAt(0);
        System.out.print("Umur: ");
        int umur = scanner.nextInt();
        Pasien pasienBaru = new Pasien(nama, noID, jenisKelamin, umur);
        antrian.enqueue(pasienBaru);
    }
    public static void cariPasien(Queue antrian, Scanner scanner) {
        System.out.print("Masukkan Nama Pasien yang Ingin Dicari: ");
        String namaCari = scanner.next();
        antrian.peekPosition(namaCari);
    }
}