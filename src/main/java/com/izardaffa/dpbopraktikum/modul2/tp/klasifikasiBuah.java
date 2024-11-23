package com.izardaffa.dpbopraktikum.modul2.tp;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class klasifikasiBuah {
    public static void main(String[] args) {
        Scanner intIn = new Scanner(System.in);
        Scanner strIn = new Scanner(System.in);
        int n;

        System.out.print("Masukkan jumlah buah: ");
        n = intIn.nextInt();

        String[] buah = new String[n];

        System.out.println();

        for (int i = 0; i < n; i++) {
            System.out.print("Masukkan buah ke-" + (i + 1) + ": ");
            buah[i] = strIn.nextLine();
        }

        Map<String, Integer> jumlahString = new HashMap<>();

        for (String s : buah) {
            if (jumlahString.containsKey(s)) {
                jumlahString.put(s, jumlahString.get(s) + 1);
            } else {
                jumlahString.put(s, 1);
            }
        }

        System.out.println("");

        for (Map.Entry<String, Integer> entry : jumlahString.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
