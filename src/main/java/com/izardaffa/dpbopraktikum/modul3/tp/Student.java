/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.izardaffa.dpbopraktikum.modul3.tp;

/**
 *
 * @author M S I
 */
public class Student {
    String studentName;
    String studentId;
    int korean;
    int english;
    int math;
    
    Student(String studentName, String studentId, int korean, int english, int math) {
        this.studentName = studentName;
        this.studentId = studentId;
        this.korean = korean;
        this.english = english;
        this.math = math;
    }
    
    public double calculateAverage() {
        double average = (korean + english + math) / 3;
        return average;
    }
    
    public void getStudentInfo() {
        System.out.println("Nama murid: " + studentName);
        System.out.println("ID murid: " + studentId);
        System.out.println("Nilai Bahasa Korea: " + korean);
        System.out.println("Nilai Bahasa Inggris: " + english);
        System.out.println("Nilai Matematika: " + math);
    }
    
    public void setCourseNumber(String newId) {
        studentId = newId;
    }
}
