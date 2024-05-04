package com.jobsheet10.praktikum02;
public class Nasabah {
    String norek;
    String nama;
    String alamat;
    int umur;
    double saldo;
    Nasabah[] data;
    int front;
    int rear;
    int size;
    int max;
    Nasabah(String norek, String nama, String alamat, int umur, double saldo) {
        this.norek = norek;
        this.nama = nama;
        this.alamat = alamat;
        this.umur = umur;
        this.saldo = saldo;
    }
    Nasabah() {

    }
}