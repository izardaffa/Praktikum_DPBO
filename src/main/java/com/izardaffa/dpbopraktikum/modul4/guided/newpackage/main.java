/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.izardaffa.dpbopraktikum.modul4.guided.newpackage;

import com.izardaffa.dpbopraktikum.modul4.guided.hargapulsa.hargapulsa;
import com.izardaffa.dpbopraktikum.modul4.guided.hargatoken.hargatoken;

/**
 *
 * @author M S I
 */
public class main {
    public static void main(String[] args) {
        hargatoken objectToken = new hargatoken();
        objectToken.info();
        
        System.out.println("");
        
        hargapulsa objectPulsa = new hargapulsa();
        objectPulsa.info();
    }
}
