package com.company.Day5;


public class PersonTest {

    public static void main(String[] args) {
        Person user1 = new Person();
        user1.name = "Gor";
        user1.age = 24;
        user1.address = "Armenia";
        user1.printInfo(user1);
        Person user2 = new Person("Gagik",45,"Iraq");
        user2.printInfo(user2);
    }
}
