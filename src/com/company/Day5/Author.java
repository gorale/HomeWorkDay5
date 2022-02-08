package com.company.Day5;

public class Author {
    String name;
    String email;

    public Author(String name,String email){
        this.name = name;
        this.email = email;
    }
    public void printInfo(){
        System.out.printf(
                "name: %s, email: %s",
                this.name,
                this.email
        );
    }

    public static void main(String[] args) {
        Author author = new Author("Arman","author@gmail.com");
        author.printInfo();
    }
}
