/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.izardaffa.dpbopraktikum.modul6.tp.soal2;

/**
 *
 * @author M S I
 */
public class Main {
    public static void main(String[] args) {
        Dentist dentist = new Dentist("Dokter Konguan");
        
        System.out.println(dentist.getDepartement() + ": " + dentist.getName());
        dentist.treatPatient();
        dentist.pullOutTooth();
    }
}
