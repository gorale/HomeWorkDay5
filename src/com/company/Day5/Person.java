package com.company.Day5;

public class Person {
    String name;
    int age;
    String address;


    public Person(String userName,int userAge,String userAddress){
        this.name = userName;
        this.age = userAge;
        this.address = userAddress;

    }
    public static void printInfo(Person person){
        System.out.println(person.name + " "+person.age+" "+person.address);
    }
    public Person(){
        super();
    }




//    public void setInfo(String userName,int userAge,String userAddress){
//        name = userName;
//        age = userAge;
//        address = userAddress;
//    }
//    public void printInfo(){
//        System.out.println(this.name + " "+this.age+" "+this.address);
//    }
//
//    public static void main(String[] args) {
//        Person user1 = new Person();
//        user1.setInfo("Gor",24,"Armenia");
//        user1.printInfo();
//        Person user2 = new Person();
//        user2.setInfo("Alik",43,"Iran");
//        user2.printInfo();
//
//
//
//    }
}
