/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.izardaffa.dpbopraktikum.modul2.guided;

import java.util.Arrays;

/**
 *
 * @author M S I
 */
public class Coba {
    public static void main(String[] args) {
        //        3 file: main, array, manusia (object)
        // Percabangan
//        int month = 4;
//        String season;
//        
//        if (month == 12 || (month <= 1 && month >= 2)) {
//            season = "Winter";
//        } else if (month <= 3 && month >= 5) {
//            season = "Autumn";
//        } else if (month <= 6 && month >= 8) {
//            season = "Summer";
//        } else if (month <= 9 && month >= 11) {
//            season = "Fall";
//        } else {
//            season = "";
//        }
//        
//        if (season != "") {
//            System.out.println("Ima wa " + season + " desu.");
//        } else {
//            System.out.println("Ngga ada bulan " + month);
//        }

        int m[][];
        m = new int[4][4];
        
        m[0][0] = 1;
        m[0][1] = 2;
        m[1][1] = 3;
        m[2][2] = 5;
        m[3][3] = 7;

//        int[][] m = { 
//            {1, 2, 3, 4}, 
//            {1, 2, 3, 4},
//            {1, 2, 3, 4}, 
//            {1, 2, 3, 4},
//        };
        
        System.out.println(m[0][0] + " " + m[0][1] + " " + m[0][2] + " " + m[0][3]);
        System.out.println(m[1][0] + " " + m[1][1] + " " + m[1][2] + " " + m[1][3]);
        System.out.println(m[2][0] + " " + m[2][1] + " " + m[2][2] + " " + m[2][3]);
        System.out.println(m[3][0] + " " + m[3][1] + " " + m[3][2] + " " + m[3][3]);
        
//        int[][][] n = {
//            {
//                {1, 2, 3, 4},
//                {11, 22, 33, 44},
//            },
//            {
//                {5, 6, 7, 8},
//            },
//        };

        double z[][][] = {
            {
                {0.00, 0.01, 0.02, 0.03},
                {1.00, 1.01, 1.02, 1.03},
            },
            {
                {1.00, 1.01, 1.02, 1.03},
                {1.00, 1.01, 1.02, 1.03},
            }
        };
        
        System.out.println(Arrays.deepToString(z));
        System.out.println(z[0][0][1]);
        
//        double n[];
//        n = new double[]
    }
}
