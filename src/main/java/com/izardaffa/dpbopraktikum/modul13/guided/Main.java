package com.izardaffa.dpbopraktikum.modul13.guided;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        PensionBiz pensionBiz = new PensionBiz();
        pensionBiz.initializeRoomData();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Periksa seluruh ruangan");
            System.out.println("2. Check-in");
            System.out.println("3. Check-out");
            System.out.println("0. Selesai");
            System.out.print("Pilih opsi: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    pensionBiz.roomList();
                    break;
                case 2:
                    System.out.print("Masukkan nomor kamar: ");
                    String roomId = scanner.nextLine();
                    System.out.print("Masukkan nama tamu: ");
                    String custName = scanner.nextLine();
                    System.out.print("Masukkan nomor telepon: ");
                    String custPhone = scanner.nextLine();
                    try {
                        pensionBiz.checkIn(roomId, custName, custPhone);
                    } catch (Exception e) {
                        System.out.println("Error: " + e.getMessage());
                    }
                    break;
                case 3:
                    System.out.print("Masukkan nomor kamar: ");
                    String checkoutRoomId = scanner.nextLine();
                    try {
                        pensionBiz.checkOut(checkoutRoomId);
                    } catch (Exception e) {
                        System.out.println("Error: " + e.getMessage());
                    }
                    break;
                case 0:
                    System.out.println("Program selesai.");
                    scanner.close();
                    return;
                default:
                    System.out.println("Opsi tidak valid. Silakan coba lagi.");
            }
        }
    }
}
