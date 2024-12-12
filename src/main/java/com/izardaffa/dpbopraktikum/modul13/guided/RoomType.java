package com.izardaffa.dpbopraktikum.modul13.guided;

public class RoomType {
    private int size;
    private int price;

    public RoomType(int size, int price) {
        this.size = size;
        this.price = price;
    }

    public int getSize() {
        return size;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return String.format("(%dm2/%dwon)", size, price);
    }
}
