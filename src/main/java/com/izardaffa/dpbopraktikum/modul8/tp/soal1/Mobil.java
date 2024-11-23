package com.izardaffa.dpbopraktikum.modul8.tp.soal1;

public class Mobil extends Kendaraan {
    public Mobil(String namaKendaraan) {
        super(namaKendaraan);
    }

    @Override
    public String getInfo() {
        return "Mobil: " + namaKendaraan;
    }
}
