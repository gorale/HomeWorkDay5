package com.company;

public class Book {
    String name;
    String author;
    int price;

    public Book(String name,String author,int price){
        this.name =name;
        this.author = author;
        this.price = price;
    }

    public void printInfo(){
        System.out.println("Book name: "+this.name+" Author name: "+this.author+" price: "+this.price);
    }

    public static void main(String[] args) {

    }
}
