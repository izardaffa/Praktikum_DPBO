/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.izardaffa.dpbopraktikum.modul6.tp.soal1;

/**
 *
 * @author M S I
 */
public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat(3, "Persian", "Yanagi");
        
        System.out.println("Nama: " + cat.name);
        System.out.println("Umur: " + cat.age + " tahun");
        System.out.println("Tipe: " + cat.kind);
        cat.run();
        cat.hunt();
        cat.play();
    }
}
