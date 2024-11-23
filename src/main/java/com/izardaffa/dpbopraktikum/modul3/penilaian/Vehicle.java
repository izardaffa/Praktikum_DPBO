/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.izardaffa.dpbopraktikum.modul3.penilaian;

/**
 *
 * @author M S I
 */
public class Vehicle {
    String plateNumber;
    double speed;
    int numWheels;
    String vehicleType;
    
    Vehicle(String plateNumber, double speed) {
        this.plateNumber = plateNumber;
        this.speed = speed;
    }
    
    Vehicle(String plateNumber, double speed, int numWheels, String vehicleType) {
        this.plateNumber = plateNumber;
        this.speed = speed;
        this.numWheels = numWheels;
        this.vehicleType = vehicleType;
    }
    
    double calculateTravelTime(double distance) {
        return distance / speed;
    }
    
    double calculateTravelTime(double distance, double customSpeed) {
        return distance / customSpeed;
    }
    
    void displayInfo() {
        System.out.println("Plate Number: " + this.plateNumber);
        System.out.println("Speed: " + this.speed + " km/h");
        System.out.println("Number of Wheels: " + this.numWheels);
        System.out.println("Vehicle Type: " + this.vehicleType);
    }
}
