package com.izardaffa.dpbopraktikum.modul2.tp;

import java.util.Arrays;
import java.util.Scanner;

public class sortInt {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        int[] num = new int[3];

        for (int i = 0; i < 3; i++) {
            System.out.print("Masukkan angka ke-" + (i+1) + ": ");
            num[i] = myObj.nextInt();
        }

        System.err.print("\nInput\t");
        for (int i = 0; i < 3; i++) {
            System.out.print(num[i] + " ");
        }

        Arrays.sort(num);

        System.err.print("\nOutput\t");
        for (int i = 0; i < 3; i++) {
            System.out.print(num[i] + " ");
        }
    }
}
