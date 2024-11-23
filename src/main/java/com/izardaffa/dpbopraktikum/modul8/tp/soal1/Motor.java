package com.izardaffa.dpbopraktikum.modul8.tp.soal1;

public class Motor extends Kendaraan {
    public Motor(String namaKendaraan) {
        super(namaKendaraan);
    }

    @Override
    public String getInfo() {
        return "Motor: " + namaKendaraan;
    }
}
