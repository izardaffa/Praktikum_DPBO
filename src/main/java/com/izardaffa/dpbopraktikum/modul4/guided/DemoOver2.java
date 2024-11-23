/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.izardaffa.dpbopraktikum.modul4.guided;

/**
 *
 * @author M S I
 */
public class DemoOver2 {
    public static void main(String[] args) {
        Lagu d, e;
        d = new Lagu();
        e = new Lagu();
        
        d.isiParam("Lagu 1");
        e.isiParam("kepastian yang kutunggu", "GiGi");
        
        d.cetakKeLayar();
        e.cetakKeLayar();
    }
}
