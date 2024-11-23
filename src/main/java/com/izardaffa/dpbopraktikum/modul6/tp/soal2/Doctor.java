/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.izardaffa.dpbopraktikum.modul6.tp.soal2;

/**
 *
 * @author M S I
 */
public class Doctor {
    private String name;
    private String departement;
    
    public Doctor(String name, String departement) {
        this.name = name;
        this.departement = departement;
    }
    
    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public String getDepartement() {
        return this.departement;
    }
    
    public void setDepartement(String departement) {
        this.departement = departement;
    }
    
    public void treatPatient() {
        System.out.println("Telah merawat pasien.");
    }
}
