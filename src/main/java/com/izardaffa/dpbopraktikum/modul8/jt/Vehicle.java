package com.izardaffa.dpbopraktikum.modul8.jt;

public abstract class Vehicle {
    protected String plateNumber;
    protected double capacity;

    public Vehicle(String plateNumber, double capacity) {
        this.plateNumber = plateNumber;
        this.capacity = capacity;
    }

    public abstract double calculateOperationalCost();

    public void displayInfo() {
        double cost = calculateOperationalCost();
        System.out.println("Vehicle Plate Number: " + plateNumber + ", Capacity: " + capacity + " kg, Operational Cost: $ " + cost);
    }
}
