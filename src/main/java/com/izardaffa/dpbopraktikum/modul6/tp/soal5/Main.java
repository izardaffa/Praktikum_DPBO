/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.izardaffa.dpbopraktikum.modul6.tp.soal5;

/**
 *
 * @author M S I
 */
public class Main {
    public static void main(String[] args) {
        FundAccount account = new FundAccount("111-2222", "Hatari", 5000000, 4.7);
        
        account.openAccount();
        System.out.println("Nomor rekening: " + account.getNumber());
        System.out.println("Pemilik akun: " + account.getName());
        System.out.println("Saldo: Rp" + account.getBalance());
        System.out.println("Tingkat pengembalian: " + account.getEaringRate() + "%");
        account.earnMoney();
    }
}
