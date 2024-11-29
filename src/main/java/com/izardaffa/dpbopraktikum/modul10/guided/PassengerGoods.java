package com.izardaffa.dpbopraktikum.modul10.guided;

public abstract class PassengerGoods {
    private String name;
    private int quantity;
    private double price;

    public PassengerGoods(String name, int quantity, double price) {
        this.name = name;
        this.quantity = quantity;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getPrice() {
        return price;
    }

    protected abstract double calculatePrice();

    public abstract void displayDetail();
}