/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.izardaffa.dpbopraktikum.modul4.guided;

/**
 *
 * @author M S I
 */
public class DemoManusia {
    public static void main(String[] args) {
        Manusia arrMns[] = new Manusia[3];
        Manusia objMns1 = new Manusia();
        
        objMns1.setNama("Kazusa");
        objMns1.setUmur(17);
        
        Manusia objMns2 = new Manusia("Airi");
        Manusia objMns3 = new Manusia("Natsu", 17);
        
        arrMns[0] = objMns1;
        arrMns[1] = objMns2;
        arrMns[2] = objMns3;
        
        for(int i = 0; i < 3; i++) {
            System.out.println("Nama : " + arrMns[i].getNama());
            System.out.println("Umur: " + arrMns[i].getUmur());
            System.out.println("");
        }
    }
}
