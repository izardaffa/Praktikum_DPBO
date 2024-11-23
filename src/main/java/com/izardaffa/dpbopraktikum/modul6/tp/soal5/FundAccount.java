/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.izardaffa.dpbopraktikum.modul6.tp.soal5;

/**
 *
 * @author M S I
 */
public class FundAccount extends Account {
    private double earningRate;
    
    public FundAccount(String number, String name, int balance, double earningRate) {
        super(number, name, balance);
        this.earningRate = earningRate;
    }

    @Override
    void openAccount() {
        System.out.println("Buka akun.");
    }
    
    public double getEaringRate() {
        return this.earningRate;
    }
    
    public void earnMoney() {
        System.out.println("Keuntungan telah diperoleh.");
    }
}
