package com.izardaffa.dpbopraktikum.modul10.guided;

public class Driver {
    public static void main(String[] args) {
        // Membuat objek Electronic
        Electronic electronic = new Electronic("Smartphone", 2, 18000000.0, "iPhone 14");
        // Memanggil method displayDetail()
        electronic.displayDetail();
        System.out.println();

        // Membuat objek Food
        Food food = new Food("Lamington", 4, 75.0, 350.0);
        // Memanggil method displayDetail()
        food.displayDetail();
        System.out.println();

        // Membuat objek Cigarette
        Cigarette cigarette = new Cigarette("Dunhill Blue", 30, 60000.0, 20);
        // Memanggil method displayDetail()
        cigarette.displayDetail();
    }
}
