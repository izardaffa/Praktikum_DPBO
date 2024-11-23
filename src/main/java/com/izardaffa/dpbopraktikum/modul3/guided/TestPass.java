/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.izardaffa.dpbopraktikum.modul3.guided;

/**
 *
 * @author M S I
 */
public class TestPass {
    int i, j;
    
    TestPass(int a, int b) {
        i = a;
        j = b;
    }
    
    void calculate(int m, int n) {
        m = m + 10;
        n = n / 2;
    }
    
    void calculate(TestPass e) {
        e.i = e.i + 10;
        e.j = e.j / 2;
    }
}
