package com.izardaffa.dpbopraktikum.modul4.tp.soal1;

import java.text.NumberFormat;
import java.util.Currency;
import java.util.Locale;

public class Publication {
    String title;
    int price;
    int page;
    
    Locale myIndonesianLocale = new Locale("in", "ID");
    NumberFormat formater = NumberFormat.getCurrencyInstance(myIndonesianLocale);
    
    String getTitle() {
        return title;
    }
    
    void setTitle(String title) {
        this.title = title;
    }
    
    int getPrice() {
        return price;
    }
    
    void setPrice(int price) {
        this.price = price;
    }
    
    int getPage() {
        return page;
    }
    
    void setPage(int page) {
        this.page = page;
    }
    
    void printHeader() {}
    
    void printBookInfo() {
        System.out.println(this.getTitle() + " (Price List: " + formater.format(this.getPrice()) + ")");
    }
}
