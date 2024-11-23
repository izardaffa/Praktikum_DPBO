/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.izardaffa.dpbopraktikum.modul7.jt.jurnal2;

/**
 *
 * @author M S I
 */
public abstract class Vehicle {
    private String brand;
    private int year;
    
    public Vehicle(String brand, int year) {
        this.brand = brand;
        this.year = year;
    }
    
    public abstract void startEngine();
    
    @Override
    public String toString() {
        return "Brand: " + this.brand + ", Year: " + this.year;
    }
}
