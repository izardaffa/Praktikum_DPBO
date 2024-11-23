/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.izardaffa.dpbopraktikum.modul7.jt.jurnal1;

/**
 *
 * @author M S I
 */
public class Main {
    public static void main(String[] args) {
        SfMovie[] sfMovie = {
            new SfMovie("Avatar", "James Cameron"),
            new SfMovie("AI", "Steven Spielberg"),
        };
        
        for (int i = 0; i < sfMovie.length; i++) {
            System.out.println(sfMovie[i].toString());
        }
    }
}
