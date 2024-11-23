/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.izardaffa.dpbopraktikum.modul4.guided;

/**
 *
 * @author M S I
 */
public class Manusia {
    private String nama;
    private int umur;
    
    public Manusia() {
        nama = "";
    }
    
    public Manusia(String a) {
        nama = a;
    }
    
    public Manusia(String a, int b) {
        nama = a;
        umur = b;
    }
    
    public void setNama(String a) {
        nama = a;
    }
    
    public String getNama() {
        return nama;
    }
    
    public void setUmur(int b) {
        umur = b;
    }
    
    public int getUmur() {
        return umur;
    }
}
