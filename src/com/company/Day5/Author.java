package com.company.Day5;

public class Author {
    String name;
    String email;

    public Author(String name,String email){
        this.name = name;
        this.email = email;
    }
    public void printAuthorInfo(){
        System.out.printf(
                "name: %s, email: %s",
                this.name,
                this.email
        );
    }


}
