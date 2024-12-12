package com.izardaffa.dpbopraktikum.modul12.guided;

import java.util.ArrayList;
import java.util.HashMap;

public class CustomerBiz implements ICustomerBiz {

    private ArrayList<Customer> customers;

    @Override
    public void initializeCustomer() {
        customers = new ArrayList<>();

        // Pelanggan 1
        HashMap<String, String> phone1 = new HashMap<>();
        phone1.put("HP", "081234567890");
        customers.add(new Customer("Lee", 28, phone1));

        // Pelanggan 2
        HashMap<String, String> phone2 = new HashMap<>();
        phone2.put("HP", "021234567");
        customers.add(new Customer("Park", 34, phone2));

        // Pelanggan 3
        HashMap<String, String> phone3 = new HashMap<>();
        phone3.put("OFFICE", "081234567890");
        customers.add(new Customer("Choi", 25, phone3));

        // Pelanggan 4
        HashMap<String, String> phone4 = new HashMap<>();
        phone4.put("OFFICE", "021234567");
        customers.add(new Customer("Hong", 27, phone4));
    }

    @Override
    public void printAllCustomer() {
        System.out.println("======== Informasi Pelanggan ========");
        for (int i = 0; i < customers.size(); i++) {
            Customer customer = customers.get(i);
            System.out.print((i + 1) + ". ");
            System.out.print("Nama: " + customer.getName() + " ");
            System.out.print("Usia: " + customer.getAge() + " ");

            // Menampilkan jenis nomor telepon dan nilainya
            customer.getPhone().forEach((type, number) -> {
                System.out.print("Nomor Telepon : [" + type + "] " + number + "] ");
            });
            System.out.println();
        }
        System.out.println("======================================");
    }

    @Override
    public void insertCustomer(String name, int age, HashMap<String, String> phone) {
        customers.add(new Customer(name, age, phone));
        System.out.println("Pelanggan berhasil ditambahkan!");
    }

    @Override
    public void changeAge(int number, int age) {
        if (number >= 1 && number <= customers.size()) {
            customers.get(number - 1).setAge(age);
            System.out.println("Usia berhasil diperbarui!");
        } else {
            System.out.println("Error: Nomor pelanggan tidak valid.");
        }
    }

    @Override
    public void changePhone(int number, HashMap<String, String> phone) {
        if (number >= 1 && number <= customers.size()) {
            customers.get(number - 1).setPhone(phone);
            System.out.println("Nomor telepon berhasil diperbarui!");
        } else {
            System.out.println("Error: Nomor pelanggan tidak valid.");
        }
    }

    @Override
    public void deleteCustomer(int number) {
        if (number >= 1 && number <= customers.size()) {
            customers.remove(number - 1);
            System.out.println("Pelanggan berhasil dihapus!");
        } else {
            System.out.println("Error: Nomor pelanggan tidak valid.");
        }
    }

    @Override
    public int getCustomerNumber() {
        return customers.size();
    }
}
