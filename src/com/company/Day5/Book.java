package com.company.Day5;

public class Book {
    String name;
    Author author;
    int price;


    public Book(String name,Author author,int price){
        this.name =name;
        this.author = author;
        this.price = price;
    }


    public void printInfo(){
        System.out.printf("name : %s, author: %s, price: %d \n",
                this.name,
                author.name,
                this.price
        );
    }


}
