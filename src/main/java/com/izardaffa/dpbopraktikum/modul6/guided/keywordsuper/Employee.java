/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.izardaffa.dpbopraktikum.modul6.guided.keywordsuper;

/**
 *
 * @author M S I
 */
public class Employee {
    private String name;
    String departement;
    
    public Employee(String a) {
        name = a;
    }
    
    public void tampilNama() {
        System.out.println("Nama: " + name);
    }
}
