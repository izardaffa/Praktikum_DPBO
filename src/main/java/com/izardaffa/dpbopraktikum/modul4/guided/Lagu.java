/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.izardaffa.dpbopraktikum.modul4.guided;

/**
 *
 * @author M S I
 */
public class Lagu {
    String pencipta;
    String judul;
    
    void isiParam(String params) {
        judul = params;
        pencipta = "tidak diketahui";
    }
    
    void isiParam(String param1, String param2) {
        judul = param1;
        pencipta = param2;
    }
    
    void cetakKeLayar() {
        System.out.println("Judul : " + judul + ", pencipta : " + pencipta);
    }
}
