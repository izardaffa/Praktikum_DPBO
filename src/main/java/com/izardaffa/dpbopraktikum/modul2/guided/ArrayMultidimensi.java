/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.izardaffa.dpbopraktikum.modul2.guided;

/**
 *
 * @author M S I
 */
public class ArrayMultidimensi {
    public static void main(String[] args) {
        double m[][];
        m = new double[4][4];
        
        m[0][0] = 1;
        m[1][1] = 3;
        m[2][2] = 5;
        m[3][3] = 7;
        
        System.out.println(m[0][0] + " " + m[0][1] + " " + m[0][2] + " " + m[0][3]);
        System.out.println(m[1][0] + " " + m[1][1] + " " + m[1][2] + " " + m[1][3]);
        System.out.println(m[2][0] + " " + m[2][1] + " " + m[2][2] + " " + m[2][3]);
        System.out.println(m[3][0] + " " + m[3][1] + " " + m[3][2] + " " + m[3][3]);
    }
}
