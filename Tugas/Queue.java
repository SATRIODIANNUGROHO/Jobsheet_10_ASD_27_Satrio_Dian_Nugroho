package com.jobsheet10.tugas;
public class Queue {
    Pasien[] antrian;
    int front;
    int rear;
    int size;
    int max;
    public Queue(int n) {
        max = n;
        antrian = new Pasien[max];
        front = 0;
        rear = -1;
        size = 0;
    }
    public boolean isEmpty() {
        return size == 0;
    }
    public boolean isFull() {
        return size == max;
    }
    public void enqueue(Pasien pasien) {
        if (!isFull()) {
            rear = (rear + 1) % max;
            antrian[rear] = pasien;
            size++;
            System.out.println("Pasien " + pasien.getNama() + " telah ditambahkan ke dalam antrian.");
        } else {
            System.out.println("Antrian sudah penuh.");
        }
    }
    public Pasien dequeue() {
        if (!isEmpty()) {
            Pasien pasienKeluar = antrian[front];
            front = (front + 1) % max;
            size--;
            System.out.println("Pasien " + pasienKeluar.getNama() + " telah keluar dari antrian.");
            return pasienKeluar;
        } else {
            System.out.println("Antrian kosong.");
            return null;
        }
    }
    public void print() {
        if (!isEmpty()) {
            System.out.println("Daftar Pasien dalam Antrian:");
            int current = front;
            for (int i = 0; i < size; i++) {
                System.out.println(antrian[current].toString());
                current = (current + 1) % max;
            }
        } else {
            System.out.println("Antrian kosong.");
        }
    }
    public void peek() {
        if (!isEmpty()) {
            System.out.println("Pasien paling depan: " + antrian[front].toString());
        } else {
            System.out.println("Antrian kosong.");
        }
    }
    public void peekRear() {
        if (!isEmpty()) {
            System.out.println("Pasien paling belakang: " + antrian[rear].toString());
        } else {
            System.out.println("Antrian kosong.");
        }
    }
    public void peekPosition(String nama) {
        if (!isEmpty()) {
            for (int i = 0; i < size; i++) {
                int index = (front + i) % max;
                if (antrian[index].getNama().equals(nama)) {
                    System.out.println("Posisi antrian " + nama + " adalah: " + (i + 1));
                    return;
                }
            }
            System.out.println("Pasien " + nama + " tidak ditemukan dalam antrian.");
        } else {
            System.out.println("Antrian kosong.");
        }
    }
    public void daftarPasien() {
        if (!isEmpty()) {
            System.out.println("Daftar Seluruh Pasien dalam Antrian:");
            int current = front;
            for (int i = 0; i < size; i++) {
                System.out.println(antrian[current].toString());
                current = (current + 1) % max;
            }
        } else {
            System.out.println("Antrian kosong.");
        }
    }
}