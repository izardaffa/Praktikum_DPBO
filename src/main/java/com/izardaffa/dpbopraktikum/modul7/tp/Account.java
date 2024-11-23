/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.izardaffa.dpbopraktikum.modul7.tp;

/**
 *
 * @author M S I
 */
public abstract class Account {
    private String number;
    private String name;
    private int balance;
    
    public Account(String number, String name, int balance) {
        this.number = number;
        this.name = name;
        this.balance = balance;
    }
    
    public String getNumber() {
        return this.number;
    }
    
    public String getName() {
        return this.name;
    }
    
    public int getBalance() {
        return this.balance;
    }
    
    abstract void openAccount();
}
