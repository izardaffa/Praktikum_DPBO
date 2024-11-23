/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.izardaffa.dpbopraktikum.modul2.guided;

/**
 *
 * @author M S I
 */
public class IfElse {
    public static void main(String[] args) {
        int month = 6;
        String season;
        
        if (month == 12 || month == 1 || month == 2) {
            season = "dingin";
        } else if (month == 3 || month == 4 || month == 5) {
            season = "semi";
        } else if (month == 6 || month == 7 || month == 8) {
            season = "panas";
        } else if (month == 9 || month == 10 || month == 11) {
            season = "gugur";
        } else {
            season = "";
        }
        
        if (season == "") {
            System.out.println("Tidak ada bulan " + month);
        } else {
            System.out.println("Sekarang musim " + season);
        }
    }
}
