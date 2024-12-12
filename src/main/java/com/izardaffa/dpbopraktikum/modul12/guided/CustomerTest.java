package com.izardaffa.dpbopraktikum.modul12.guided;

import java.util.HashMap;
import java.util.Scanner;

public class CustomerTest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ICustomerBiz customerBiz = new CustomerBiz();
        customerBiz.initializeCustomer();

        while (true) {
            printMenu();
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline character

            switch (choice) {
                case 1 ->
                    customerBiz.printAllCustomer();
                case 2 -> {
                    System.out.print("Masukkan nama : ");
                    String name = scanner.nextLine();
                    System.out.print("Masukan usia : ");
                    int age = scanner.nextInt();
                    scanner.nextLine(); // Consume newline character

                    if (age < 0) {
                        System.out.println("Error: Usia tidak bisa negatif.");
                        break;
                    }

                    HashMap<String, String> phone = new HashMap<>();
                    System.out.print("Masukkan jenis telepon (HP / OFFICE): ");
                    String type = scanner.nextLine();
                    System.out.print("Masukkan nomor telepon : ");
                    String number = scanner.nextLine();
                    phone.put(type.toUpperCase(), number);

                    customerBiz.insertCustomer(name, age, phone);
                }
                case 3 -> {
                    System.out.print("Masukkan nomor pelanggan : ");
                    int number = scanner.nextInt();
                    System.out.print("Masukan usia baru : ");
                    int age = scanner.nextInt();

                    if (age < 0) {
                        System.out.println("Error: Usia tidak bisa negatif.");
                        break;
                    }

                    customerBiz.changeAge(number, age);
                }
                case 4 -> {
                    System.out.print("Masukkan nomor pelanggan : ");
                    int number = scanner.nextInt();
                    scanner.nextLine(); // Consume newline character

                    HashMap<String, String> phone = new HashMap<>();
                    System.out.print("Masukkan jenis telepon baru (HP / OFFICE): ");
                    String type = scanner.nextLine();
                    System.out.print("Masukkan nomor telepon baru : ");
                    String newNumber = scanner.nextLine();
                    phone.put(type.toUpperCase(), newNumber);

                    customerBiz.changePhone(number, phone);
                }
                case 5 -> {
                    System.out.print("Masukkan nomor pelanggan : ");
                    int number = scanner.nextInt();
                    customerBiz.deleteCustomer(number);
                }
                case 9 -> {
                    System.out.println("End Bye~ Bye~.");
                    return;
                }
                default ->
                    System.out.println("Pilihan tidak valid. Silakan coba lagi.");
            }
        }
    }

    private static void printMenu() {
        System.out.println("\n======== Program Manajemen Pelanggan ========");
        System.out.println("1. Mendapat informasi semua pelanggan");
        System.out.println("2. Tambah informasi pelanggan");
        System.out.println("3. Ubah usia pelanggan");
        System.out.println("4. Ubah nomor telepon pelanggan");
        System.out.println("5. Hapus informasi pelanggan");
        System.out.println("9. Keluar sistem");
        System.out.print("## Input Menu :  ");
    }
}
