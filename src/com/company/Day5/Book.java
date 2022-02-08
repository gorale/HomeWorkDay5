package com.company.Day5;

public class Book {
    String name;
    Author author;
    int price;


    public Book(String name,String author,int price){
        this.name =name;
        this.author.name = author;
        this.price = price;
    }


    public void printInfo(){
        System.out.printf("name : %s, author: %s, price: %d",
                this.name,
                this.author.name,
                this.price
        );
    }

    public static void main(String[] args) {
        Book book1 = new Book("Book_name", "Tumanyan",5600);
        book1.printInfo();

    }
}
