/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.izardaffa.dpbopraktikum.modul7.jt.jurnal2;

/**
 *
 * @author M S I
 */
public class Motorcycle extends Vehicle {
    private String type;

    public Motorcycle(String brand, int year, String type) {
        super(brand, year);
        this.type = type;
    }

    @Override
    public void startEngine() {
        System.out.println("Motorcycle engine started with key.");
    }
    
    @Override
    public String toString() {
        return super.toString() + ", Type: " + this.type;
    }
}
