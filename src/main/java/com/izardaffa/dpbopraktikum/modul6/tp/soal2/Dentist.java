/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.izardaffa.dpbopraktikum.modul6.tp.soal2;

/**
 *
 * @author M S I
 */
public class Dentist extends Doctor {
    public Dentist(String name) {
        super(name, "Kedokteran Gigi");
    }
    
    public void pullOutTooth() {
        System.out.println("Telah mencabut gigi.");
    }
}
