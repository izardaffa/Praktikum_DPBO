package com.izardaffa.dpbopraktikum.modul8.jt;

public class Motorcycle extends Vehicle {
    private double fuelConsumtion;
    private double distance;

    public Motorcycle(String plateNumber, double capacity, double fuelConsumtion, double distance) {
        super(plateNumber, capacity);
        this.fuelConsumtion = fuelConsumtion;
        this.distance = distance;
    }

    @Override
    public double calculateOperationalCost() {
        return fuelConsumtion * distance * 1.2;
    }
    
}