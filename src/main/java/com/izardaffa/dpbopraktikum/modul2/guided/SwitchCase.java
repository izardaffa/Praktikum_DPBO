/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.izardaffa.dpbopraktikum.modul2.guided;

/**
 *
 * @author M S I
 */
public class SwitchCase {
    public static void main(String[] args) {
        int hari = 7;
        String hariString;
        
        switch (hari) {
            case 1:
                hariString = "Senin";
                break;
            case 2:
                hariString = "Selasa";
                break;
            case 3:
                hariString = "Rabu";
                break;
            case 4:
                hariString = "Kamis";
                break;
            case 5:
                hariString = "Jumat";
                break;
            case 6:
                hariString = "Sabtu";
                break;
            case 7:
                hariString = "Minggu";
                break;
            default:
                hariString = "";
                break;
        }
        
        if (hariString == "") {
            System.out.println("Tidak ada hari " + hari);
        } else {
            System.out.println("Sekarang hari " + hariString);
        }
    }
}
