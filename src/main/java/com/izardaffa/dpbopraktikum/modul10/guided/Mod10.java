package com.izardaffa.dpbopraktikum.modul10.guided;

public class Mod10 {
    public static void main(String[] args) {
        // Electronic example
        Electronic electronic = new Electronic("iPhone 14", 2, 15000000, "Smartphone");
        electronic.displayDetail();
        System.out.println();

        // Food example
        Food food = new Food("Lamington", 1, 30000, 3.5);
        food.displayDetail();
        System.out.println();

        // Cigarette example
        Cigarette cigarette = new Cigarette("Marlboro", 20, 135000, 20);
        cigarette.displayDetail();
    }
}