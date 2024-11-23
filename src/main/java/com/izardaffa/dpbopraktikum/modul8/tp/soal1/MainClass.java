package com.izardaffa.dpbopraktikum.modul8.tp.soal1;

public class MainClass {
    public static void main(String[] args) {
        Kendaraan[] kendaraanList = new Kendaraan[3];

        kendaraanList[0] = new Kendaraan("Kendaraan Umum");
        kendaraanList[1] = new Mobil("Toyota");
        kendaraanList[2] = new Motor("Yamaha");

        for (Kendaraan kd : kendaraanList) {
            System.out.println(kd.getInfo());
        }
    }
}
