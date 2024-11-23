/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.izardaffa.dpbopraktikum.modul6.tp.soal3;

/**
 *
 * @author M S I
 */
public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat(3, "Persian", "Yanagi");
        Dog dog = new Dog(2, "Siberian Husky", "Momogi");
        
        System.out.println("Nama: " + cat.getName());
        System.out.println("Umur: " + cat.getAge() + " tahun");
        System.out.println("Tipe: " + cat.getKind());
        cat.run();
        cat.hunt();
        cat.play();
        
        System.out.println("");
        
        System.out.println("Nama: " + dog.getName());
        System.out.println("Umur: " + dog.getAge() + " tahun");
        System.out.println("Tipe: " + dog.getKind());
        dog.run();
        dog.hunt();
    }
}
