package com.izardaffa.dpbopraktikum.modul13.guided;

public class Suite extends RoomType {
    public Suite() {
        super(30, 260000);
    }

    @Override
    public String toString() {
        return "Suite room " + super.toString();
    }
}
