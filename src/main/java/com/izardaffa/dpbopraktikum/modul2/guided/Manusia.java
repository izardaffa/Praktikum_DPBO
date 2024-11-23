/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.izardaffa.dpbopraktikum.modul2.guided;

/**
 *
 * @author M S I
 */
public class Manusia {
    private String  nama;
    private int tinggi;
    
    void setInfo(String nama, int tinggi) {
        this.nama = nama;
        this.tinggi = tinggi;
    }
    
    void info() {
        System.out.println(this.nama + " tingginya " + this.tinggi + "cm");
    }
}
