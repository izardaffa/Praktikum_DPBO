package com.izardaffa.dpbopraktikum.modul8.tp.soal2;

public class Appliance {
    protected String product;
    protected String place;

    public void turnOn() {
        System.out.println(product + " : On");
    }

    public void turnOff() {
        System.out.println(product + " : Off");
    }

    public void setProduct(String product) {
        this.product = product;
    }
}
