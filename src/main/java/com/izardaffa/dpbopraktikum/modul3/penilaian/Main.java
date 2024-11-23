/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.izardaffa.dpbopraktikum.modul3.penilaian;

/**
 *
 * @author M S I
 */
public class Main {
    public static void main(String[] args) {
        Vehicle truck = new Vehicle("R 5173 VUE", 155);
        Vehicle car = new Vehicle("R 8000 PHP", 120, 4, "Car");
        
        truck.displayInfo();
        System.out.println("Travel time for " + truck.speed + " km: " + truck.calculateTravelTime(5) + " hours");
        
        System.out.println("");
        
        car.displayInfo();
        System.out.println("Travel time for " + truck.speed + " km: " + truck.calculateTravelTime(500) + " hours");
        System.out.println("Travel time for " + truck.speed + " km with custom speed : " + truck.calculateTravelTime(5) + " hours");
    }
}
