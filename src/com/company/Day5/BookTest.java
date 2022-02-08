package com.company.Day5;

public class BookTest {
    public static void main(String[] args) {
        Author author = new Author("Tumanyan","dadadad@gmail.com");
        Book book1 = new Book("Book_name1",author,5600);
        Book book2 = new Book("Book_name2",author,6000);
        book1.printInfo();
        book2.printInfo();

    }
}
