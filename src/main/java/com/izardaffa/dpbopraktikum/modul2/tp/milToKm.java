package com.izardaffa.dpbopraktikum.modul2.tp;

import java.util.Scanner;

public class milToKm {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        double miles;

        System.out.print("Enter miles: ");
        miles = myObj.nextDouble();
        
        double kilo = miles * 1.6;
        System.out.println(miles + " miles is " + kilo + " kilometer");
    }
}