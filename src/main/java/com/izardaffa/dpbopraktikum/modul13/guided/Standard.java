package com.izardaffa.dpbopraktikum.modul13.guided;

public class Standard extends RoomType {
    public Standard() {
        super(14, 80000);
    }

    @Override
    public String toString() {
        return "Standar room " + super.toString();
    }
}
