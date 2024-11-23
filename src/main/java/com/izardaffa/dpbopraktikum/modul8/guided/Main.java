/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.izardaffa.dpbopraktikum.modul8.guided;

import java.util.Random;

/**
 *
 * @author M S I
 */
public class Main {
    public static void main(String[] args) {
        Binatang[] peliharaanku = {
           new Burung("Perkutut"),
           new Kucing("Oren"),
        };
        
        Binatang kesayangan;
        Random binatangku = new Random();
        kesayangan = peliharaanku[binatangku.nextInt(peliharaanku.length)];
        
        System.out.println("Binatang kesayangan teman-teman : " + kesayangan);
        System.out.print("Suaranya ");
        kesayangan.suara();
    }
}
