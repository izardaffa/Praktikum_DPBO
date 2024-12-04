package com.izardaffa.dpbopraktikum.modul10.tp;

public class DriverSerangga {
    public static void main(String[] args) {
        Semut S = new Semut("hitam", 60, 80);
        System.out.println("Warna semut : " + S.getWarna() + "\n");
        S.info();
        S.gerak(new int[]{ 70, 90 });
        S.info();

        Lebah L = new Lebah("kuning", 20, 30, 40);
        System.out.println("Warna lebah : " + L.getWarna() + "\n");
        L.info();
        L.terbang(55, 65, 75);
        L.info();
        L.gerak(new int[]{ 25, 35, 45 });
        L.info();
    }
}
