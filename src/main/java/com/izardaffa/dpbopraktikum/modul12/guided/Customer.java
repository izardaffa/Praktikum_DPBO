package com.izardaffa.dpbopraktikum.modul12.guided;

import java.util.HashMap;

public class Customer {
    private String name;
    private int age;
    private HashMap<String, String> phone; // jenis dan nomor telepon

    public Customer(String name, int age, HashMap<String, String> phone) {
        this.name = name;
        this.age = age;
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public HashMap<String, String> getPhone() {
        return phone;
    }

    public void setPhone(HashMap<String, String> phone) {
        this.phone = phone;
    }
}
