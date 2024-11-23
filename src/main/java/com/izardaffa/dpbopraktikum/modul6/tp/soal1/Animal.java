/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.izardaffa.dpbopraktikum.modul6.tp.soal1;

/**
 *
 * @author M S I
 */
public class Animal {
    int age;
    String kind;
    
    public Animal(int age, String kind) {
        this.age = age;
        this.kind = kind;
    }
    
    public int getAge() {
        return this.age;
    }
    
    public void setAge(int age) {
        this.age = age;
    }
    
    public String getKind() {
        return this.kind;
    }
    
    public void setKind(String kind) {
        this.kind = kind;
    }
    
    public void run() {
        System.out.println("Lari!!");
    }
}
