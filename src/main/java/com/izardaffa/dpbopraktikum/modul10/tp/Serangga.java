package com.izardaffa.dpbopraktikum.modul10.tp;

public abstract class Serangga {
    private final int jumlahKaki = 6;
    private String warna;

    public Serangga(String warna) {
        this.warna = warna;
    }

    public abstract void gerak(int[] sumbu);

    public int getJumlahKaki() {
        return jumlahKaki;
    }

    public String getWarna() {
        return warna;
    }

    public abstract void info();

    public void setWarna(String warna) {
        this.warna = warna;
    }
}
