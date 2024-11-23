package com.izardaffa.dpbopraktikum.modul2.tp;

import java.util.Scanner;

public class perbandinganAngka {
    public static void main(String[] args) {
        Scanner intInput = new Scanner(System.in);
        int[] num = new int[11];

        for (int i = 0; i < 11; i++) {
            System.out.print("Masukkan angka ke-" + (i+1) + ": ");
            num[i] = intInput.nextInt();
        }

        System.out.println("");

        for (int i = 0; i < 10; i++) {
            System.out.print(num[i]);

            if (num[i] == num[10]) {
                System.out.print(" sama dengan ");
            } else if (num[i] > num[10]) {
                System.out.print(" lebih besar dari ");
            } else if (num[i] < num[10]) {
                System.out.print(" lebih kecil dari ");
            }

            System.out.println(num[10]);
        }
    }
}
