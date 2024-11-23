/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.izardaffa.dpbopraktikum.modul6.tp.soal1;

/**
 *
 * @author M S I
 */
public class Cat extends Animal {
    String name;
    
    public Cat(int age, String kind, String name) {
        super(age, kind);
        this.name = name;
    }
    
    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public void hunt() {
        System.out.println("Tangkap tikus!!");
    }
    
    public void play() {
        System.out.println("Mainan sangat menyenangkan!!");
    }
}
