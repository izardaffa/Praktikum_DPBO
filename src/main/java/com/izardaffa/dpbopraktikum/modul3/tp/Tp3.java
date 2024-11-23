/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.izardaffa.dpbopraktikum.modul3.tp;

/**
 *
 * @author M S I
 */
public class Tp3 {

    public static void main(String[] args) {
        Student student1 = new Student("Nizar Daffa Maulana", "17131", 80, 90, 70);
        
        System.out.println("Sebelum ganti ID");
        student1.getStudentInfo();
        
        student1.setCourseNumber("17130");
        
        System.out.println("\nSetelah ganti ID");
        student1.getStudentInfo();
        
        System.out.println("Nilai rata-rata: " + student1.calculateAverage() + "\n");
    }
}
