package com.company;

public class Person {
    String name;
    int age;
    String address;


    public Person(String userName,int userAge,String userAddress){
        this.name = userName;
        this.age = userAge;
        this.address = userAddress;

    }
    public Person(){

    }


    public static void main(String[] args) {
        Person user1 = new Person();
        user1.name = "Gor";
        user1.age = 24;
        user1.address = "Armenia";
        System.out.println(user1.name+ " "+user1.age+ " "+user1.address);
        Person user2 = new Person("Gagik",45,"Iraq");
        System.out.println(user2.name+ " "+user2.age+ " "+user2.address);
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
