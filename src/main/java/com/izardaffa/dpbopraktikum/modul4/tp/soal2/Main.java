/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.izardaffa.dpbopraktikum.modul4.tp.soal2;

/**
 *
 * @author M S I
 */
public class Main {
    public static void main(String[] args) {
        ProdukManager manager = new ProdukManager();
        
        Produk produk1 = new Produk("Smartphone", 4999000, 20);
        Produk produk2 = new Produk("Laptop", 9999000, 10);
        Produk produk3 = new Produk("PS5", 6999000, 5);
        
        System.out.println("--- Informasi Produk 1 ---");
        manager.tampilkanInformasiProduk(produk1);
        System.out.println("");
        
        System.out.println("--- Informasi Produk 2 ---");
        manager.tampilkanInformasiProduk(produk2);
        System.out.println("");
        
        System.out.println("--- Informasi Produk 3 ---");
        manager.tampilkanInformasiProduk(produk3);
        System.out.println("");
    }
}
