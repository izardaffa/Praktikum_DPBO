/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.izardaffa.dpbopraktikum.modul7.jt.jurnal2;

/**
 *
 * @author M S I
 */
public class Main {
    public static void main(String[] args) {
        Vehicle car = new Car("Toyota", 2021, 4);
        
        car.startEngine();
        System.out.println(car.toString());
        
        Vehicle motorcycle = new Motorcycle("Yamaha", 2020, "Sport");
        
        motorcycle.startEngine();
        System.out.println(motorcycle.toString());
    }
}
