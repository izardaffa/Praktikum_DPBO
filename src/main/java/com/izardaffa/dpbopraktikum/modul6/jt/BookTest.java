package com.izardaffa.dpbopraktikum.modul6.jt;

public class BookTest {
    public static void main(String[] args) {
        Book[] book = {
            new Book("Kaijuu No 8", "Naoya Matsumoto", 45000, 5),
            new Book("Gotoubun no Hanayome", "Negi Haruba", 40000, 5),
            new Book("Love Live", "Sunrise", 98000, 5),
        };
        
        SecondBook[] secondBook = {
            new SecondBook("Another", "Yukito Ayatsuji", 45000, "Xavier", 20),
            new SecondBook("Tonikawa", "Hata Kenjiro", 25000, "Clover", 50),
        };
        
        Customer[] customer = {
            new Customer("Ilham"),
            new Customer("Farhan"),
        };
        
        System.out.println("\n===[ INFORMASI BUKU ]===");
        for (int i = 0; i < book.length; i++) {
            System.out.println(book[i].toString());
        }
        System.out.println("========================\n");
        
        customer[0].buyBook(book[1], 3);
        customer[0].buyBook(book[0], 0);
        customer[0].buyBook(secondBook[0]);
        customer[0].buyBook(book[0], 3);
        
        customer[1].buyBook(secondBook[0]);
        customer[1].buyBook(book[1], 1);
        
        System.out.println("\n===[ INFORMASI BUKU ]===");
        for (int i = 0; i < book.length; i++) {
            System.out.println(book[i].toString());
        }
        System.out.println("========================\n");
        
        System.out.println("\n===[ INFORMASI PEMBELIAN]===");
        for (int i = 0; i < customer.length; i++) {
            System.out.println(customer[i].toString());
        }
        System.out.println("============================\n");
    }
}
