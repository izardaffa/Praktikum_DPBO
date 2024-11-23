package com.izardaffa.dpbopraktikum.modul6.jt;

public class Book {
    private String title;
    private String author;
    private int price;
    private int stockQuantity;
    
    public Book(String title, String author, int price, int stockQuantity) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.stockQuantity = stockQuantity;
    }
    
    public String getTitle() {
        return this.title;
    }
    
    public String getAuthor() {
        return this.author;
    }
    
    public int getStockQuantity() {
        return this.stockQuantity;
    }
    
    public void setStockQuantity(int stockQuantity) {
        this.stockQuantity = stockQuantity;
    }
    
    public int getPrice() {
        return this.price;
    }
    
    @Override
    public String toString() {
        return String.format("Judul: %-25s Penulis: %-20s Harga: %-20s Persediaan: %s Jilid%n", 
                this.getTitle(), this.getAuthor(), MissionUtil.moneyFormat(this.getPrice()), this.getStockQuantity());
    }
}
