/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.izardaffa.dpbopraktikum.modul6.tp.soal3;

/**
 *
 * @author M S I
 */
public class Dog extends Animal {
    private String name;
    
    public Dog(int age, String kind, String name) {
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
        System.out.println("Tangkap rusa!!");
    }
    
    public void run() {
        System.out.println("Lari dengan kecepatan 40km/jam");
    }
}
