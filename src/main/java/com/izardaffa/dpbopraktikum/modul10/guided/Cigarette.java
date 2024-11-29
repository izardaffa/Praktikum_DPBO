package com.izardaffa.dpbopraktikum.modul10.guided;

import java.text.DecimalFormat;

public class Cigarette extends PassengerGoods implements Taxable {
    private int piecesPerPack;

    public Cigarette(String name, int quantity, double price, int piecesPerPack) {
        super(name, quantity, price);
        this.piecesPerPack = piecesPerPack;
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
        System.out.println("Pieces per Pack : " + piecesPerPack);
        System.out.println("Pajak           : Rp " + df.format(calculateTax()));
    }
}