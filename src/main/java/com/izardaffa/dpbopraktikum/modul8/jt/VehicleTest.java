package com.izardaffa.dpbopraktikum.modul8.jt;

public class VehicleTest {
    public static void main(String[] args) {
        Vehicle[] vehicles = {
            new Truck("B 1234 CD", 10000, 0.2, 500),
            new Van("D 5678 EF", 2000, 10.0, 15),
            new Motorcycle("R 5173 VUE", 100, 4.0, 100),
            new HeavyDutyTruck("H 8080 HP", 50000, 10.0, 500),
        };

        for (Vehicle vehicle : vehicles) {
            vehicle.displayInfo();
        }
    }
}
