package com.izardaffa.dpbopraktikum.modul10.tp;

public class Lebah extends Serangga implements BisaTerbang {
    private Koordinat3D posisi;

    public Lebah(String warna, int x, int y, int z) {
        super(warna);
        this.posisi = new Koordinat3D(x, y, z);
    }

    @Override
    public void gerak(int[] sumbu) {
        posisi.setX(sumbu[0]);
        posisi.setY(sumbu[1]);
        posisi.setZ(sumbu[2]);
    }

    @Override
    public void info() {
        System.out.println("Posisi lebah : ");
        System.out.println("\tx : " + posisi.getX());
        System.out.println("\ty : " + posisi.getY());
        System.out.println("\tz : " + posisi.getZ());
        System.out.println();
    }

    @Override
    public void terbang(int x, int y, int z) {
        posisi.setX(x);
        posisi.setY(y);
        posisi.setZ(z);
    }
}
