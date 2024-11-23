package com.izardaffa.dpbopraktikum.modul8.tp.soal2;

public class Main {
    public static void main(String[] args) {
        Television tv = new Television(24);
        tv.setProduct("Television");
        tv.turnOn();
        tv.turnOff();

        Audio audio = new Audio("White");
        audio.setProduct("Audio");
        audio.turnOn();
        audio.turnOff();
    }
}
