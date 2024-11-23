/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.izardaffa.dpbopraktikum.modul6.guided.inheritance;

/**
 *
 * @author M S I
 */
public class DemoInheritance {
    public static void main(String[] args) {
        A superclass = new A();
        B subclass = new B();
        
        System.out.println("superclass: ");
        
        superclass.x = 3;
        superclass.y = 4;
        superclass.tampilXY();
        
        System.out.println("subclass: ");
        
        subclass.x = 1;
        subclass.y = 2;
        subclass.tampilXY();
        
        subclass.z = 5;
        subclass.jumlahXY();
    }
}
