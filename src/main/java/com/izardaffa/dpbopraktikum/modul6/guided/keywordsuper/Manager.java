/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.izardaffa.dpbopraktikum.modul6.guided.keywordsuper;

/**
 *
 * @author M S I
 */
public class Manager extends Employee {
    private String alamat;
    
    public Manager(String nama, String a) {
        super(nama);
        alamat = a;
    }
    
    public void tampilAlamat() {
        super.departement = "Personalia";
        super.tampilNama();
        
        System.out.println("Alamat: " + alamat);
        System.out.println("Departement: " + super.departement);
    }
    
    public static void main(String[] args) {
        Manager adi = new Manager("Adi", "Sukabumi");
        adi.tampilAlamat();
    }
}
