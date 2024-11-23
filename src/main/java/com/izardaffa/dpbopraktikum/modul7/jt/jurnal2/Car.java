/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.izardaffa.dpbopraktikum.modul7.jt.jurnal2;

/**
 *
 * @author M S I
 */
public class Car extends Vehicle {
    private int numDoors;

    public Car(String brand, int year, int numDoors) {
        super(brand, year);
        this.numDoors = numDoors;
    }

    @Override
    public void startEngine() {
        System.out.println("Car engine started with button.");
    }
    
    @Override
    public String toString() {
        return super.toString() + ", Doors: " + this.numDoors;
    }
}
