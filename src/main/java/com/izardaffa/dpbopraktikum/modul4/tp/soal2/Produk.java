package com.izardaffa.dpbopraktikum.modul4.tp.soal2;

import java.text.NumberFormat;
import java.util.Locale;

public class Produk {
    String namaProduk;
    double harga;
    int stok;
    
    Locale myIndonesianLocale = new Locale("in", "ID");
    NumberFormat formater = NumberFormat.getCurrencyInstance(myIndonesianLocale);
    
    Produk(String namaProduk, double harga, int stok) {
        this.namaProduk = namaProduk;
        this.harga = harga;
        this.stok = stok;
    }
    
    String getNamaProduk() {
        return this.namaProduk;
    }
    
    void setNamaProduk(String namaProduk) {
        this.namaProduk = namaProduk;
    }
    
    double getHarga() {
        return this.harga;
    }
    
    void setHarga(double Harga) {
        this.harga = harga;
    }
    
    int getStok() {
        return this.stok;
    }
    
    void setStok(int stok) {
        this.stok = stok;
    }
    
    void printProductInfo() {
        System.out.println("Nama Produk : " + this.namaProduk);
        System.out.println("Harga : " + formater.format(this.harga));
        System.out.println("Stok : " + this.stok + " unit");
    }
}
