/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.izardaffa.dpbopraktikum.modul6.tp.soal4;

/**
 *
 * @author M S I
 */
public class Movie {
    private String title;
    private String director;
    private String genre;
    
    public Movie(String title, String director, String genre) {
        this.title = title;
        this.director = director;
        this.genre = genre;
    }
    
    public String toString() {
        return "Judul: " + this.title + ", Director: " + this.director + ", Genre: " + this.genre;
    }
}
