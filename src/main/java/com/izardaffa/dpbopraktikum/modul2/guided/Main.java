/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.izardaffa.dpbopraktikum.modul2.guided;

/**
 *
 * @author M S I
 */
public class Main {
    public static void main(String[] args) {
        Manusia [] manusia = new Manusia[4];
        
        for (int i = 0; i < manusia.length; i++) {
            manusia[i] = new Manusia();
        }
        
        manusia[0].setInfo("Hermawan", 180);
        manusia[1].setInfo("Suciati", 160);
        manusia[2].setInfo("Boy", 170);
        manusia[3].setInfo("Neneng", 165);
        
        manusia[0].info();
        manusia[1].info();
        manusia[2].info();
        manusia[3].info();
    }
}
