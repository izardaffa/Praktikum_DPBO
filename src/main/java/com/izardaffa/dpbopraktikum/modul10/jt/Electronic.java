package com.izardaffa.dpbopraktikum.modul10.jt;

import java.text.DecimalFormat;

public class Electronic extends PassengerGoods implements Taxable {
    private String type;

    public Electronic(String name, int quantity, double price, String type) {
        super(name, quantity, price);
        this.type = type;
    }

    @Override
    protected double calculatePrice() {
        return getPrice() * getQuantity();
    }

    @Override
    public double calculateTax() {
        return calculatePrice() * TAX_RATE;
    }

    @Override
    public void displayDetail() {
        DecimalFormat df = new DecimalFormat("#,###.00");
        System.out.println("Nama Barang     : " + getName());
        System.out.println("Jumlah          : " + getQuantity());
        System.out.println("Harga Total     : Rp " + df.format(calculatePrice()));
        System.out.println("Tipe            : " + type);
        System.out.println("Pajak           : Rp " + df.format(calculateTax()));
    }
}