/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.izardaffa.dpbopraktikum.modul7.jt.jurnal1;

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
    
    @Override
    public String toString() {
        return "Judul: " + this.title + ", Director: " + this.director + ", Genre: " + this.genre;
    }
}
