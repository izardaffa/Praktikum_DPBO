package com.izardaffa.dpbopraktikum.modul12.guided;

import java.util.HashMap;

public interface ICustomerBiz {
    void initializeCustomer();
    void printAllCustomer();
    void insertCustomer(String name, int age, HashMap<String, String> phone);
    void changeAge(int number, int age);
    void changePhone(int number, HashMap<String, String> phone);
    void deleteCustomer(int number);
    int getCustomerNumber();
}
