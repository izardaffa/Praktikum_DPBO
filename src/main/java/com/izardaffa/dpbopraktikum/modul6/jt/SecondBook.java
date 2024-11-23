package com.izardaffa.dpbopraktikum.modul6.jt;

public class SecondBook extends Book {
    private String seller;
    private int discountRate;
    
    public SecondBook(String title, String author, int price, String seller, int discountRate) {
        super(title, author, price, 1);
        this.seller = seller;
        this.discountRate = discountRate;
    }
    
    public int getDiscountRate() {
        return this.discountRate;
    }
    
    @Override
    public String toString() {
        return super.toString() + String.format(" Tingkat diskon: %-25s% Penjual: %-20s%n", this.getDiscountRate(), this.seller);
    }
}
