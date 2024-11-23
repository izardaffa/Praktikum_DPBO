package com.izardaffa.dpbopraktikum.modul8.jt;

public class Van extends Vehicle {
    private double hourlyRate;
    private double hoursUsed;

    public Van(String plateNumber, double capacity, double hourlyRate, double hoursUsed) {
        super(plateNumber, capacity);
        this.hourlyRate = hourlyRate;
        this.hoursUsed = hoursUsed;
    }

    @Override
    public double calculateOperationalCost() {
        return hourlyRate * hoursUsed;
    }
    
}
