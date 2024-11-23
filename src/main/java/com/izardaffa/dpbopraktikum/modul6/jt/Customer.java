package com.izardaffa.dpbopraktikum.modul6.jt;

public class Customer {
    private int totalPrice;
    private String name;
    
    public Customer(String name) {
        this.name = name;
    }
    
    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public int getTotalPrice() {
        return this.totalPrice;
    }
    
    public void setTotalPrice(int totalPrice) {
        this.totalPrice = totalPrice;
    }
    
    public void buyBook(Book book, int quantity) {
        if (quantity <= 0) {
            System.out.println("[Error] 0 jilid Kurang, tidak dapat dibeli.");
        } else if (book.getStockQuantity() >= quantity) {
            book.setStockQuantity(book.getStockQuantity() - quantity);
            totalPrice += book.getPrice() * quantity;
            System.out.println("Anda telah membeli " + book.getTitle() + ". Jumlah total: Rp." + totalPrice);
        } else {
            System.out.println("[Error] Persediaan kurang. Jumlah persediaan saat ini: " + book.getStockQuantity() + " jilid");
        }
    }
    
    public void buyBook(SecondBook book) {
        if (book.getStockQuantity() > 0) {
            book.setStockQuantity(book.getStockQuantity() - 1);
            totalPrice += book.getPrice() - (book.getPrice() * (book.getDiscountRate() / 100));
            System.out.println("Anda telah membeli " + book.getTitle() + ". Jumlah total: Rp." + totalPrice);
        } else {
            System.out.println("[Error] Persediaan kurang. Jumlah persediaan saat ini: " + book.getStockQuantity() + " jilid");
        }
    }
    
    public String toString() {
        return String.format("Nama Pelanggan: %-20s Jumlah total: %s", name, MissionUtil.moneyFormat(this.totalPrice));
    }
}
