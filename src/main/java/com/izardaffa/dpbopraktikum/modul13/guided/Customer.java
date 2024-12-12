package com.izardaffa.dpbopraktikum.modul13.guided;

public class Customer {
    private String name;
    private String phone;

    public Customer(String name, String phone) {
        this.name = name;
        this.phone = phone;
    }

    @Override
    public String toString() {
        return String.format("Tamu saat ini - [%s] CNS [no.tlp] %s", name, phone);
    }
}
