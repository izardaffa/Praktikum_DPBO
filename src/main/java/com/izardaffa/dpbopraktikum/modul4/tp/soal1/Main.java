package com.izardaffa.dpbopraktikum.modul4.tp.soal1;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int jumlahBuku1;
        int jumlahBuku2;
        int totalPembelian;
        
        Publication buku1 = new Publication();
        Publication buku2 = new Publication();
        
        Locale myIndonesianLocale = new Locale("in", "ID");
        NumberFormat formater = NumberFormat.getCurrencyInstance(myIndonesianLocale);
        
        Scanner scanner = new Scanner(System.in);
        
        buku1.title = "Kaiju No. 8";
        buku1.price = 45000;
        buku1.page = 90;
        
        buku2.title = "Sword Art Online";
        buku2.price = 98000;
        buku2.page = 200;
        
        System.out.println("===== Mencari Informasi Buku =====\n");
        
        buku1.printBookInfo();
        buku2.printBookInfo();
        
        System.out.println("\n====================\n");
        
        System.out.print(buku1.getTitle() + " - Pembelian Jilid: ");
        jumlahBuku1 = scanner.nextInt();
        
        System.out.print(buku2.getTitle() + " - Pembelian Jilid: ");
        jumlahBuku2 = scanner.nextInt();
        
        System.out.println("\n====================\n");
        
        System.out.println(buku1.getTitle() + " " + jumlahBuku1 + " Jilid (" + formater.format(buku1.price * jumlahBuku1) + ")");
        System.out.println(buku2.getTitle() + " " + jumlahBuku2 + " Jilid (" + formater.format(buku2.price * jumlahBuku2) + ")");
        
        System.out.println("\n====================\n");
        
        totalPembelian = (buku1.price * jumlahBuku1) + (buku2.price * jumlahBuku2);
        System.out.println("Jumlah Total Pembelian: " + formater.format(totalPembelian));
    }
}
