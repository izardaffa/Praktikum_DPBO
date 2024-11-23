/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.izardaffa.dpbopraktikum.modul8.guided;

/**
 *
 * @author M S I
 */
public class Burung extends Binatang {
    private String nama;
    
    Burung(String nama) {
        super("Burung");
        this.nama = nama;
    }

    @Override
    protected void suara() {
        System.out.println("Cukurukuk");
    }
    
    public String toString() {
        return super.toString() + " " + nama;
    }
}
