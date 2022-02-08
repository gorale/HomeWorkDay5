package com.company;

public class Employee {
    int id;
    String name;
    String department;
    int age;
    char gender;

    public Employee(int id,String name,String department,int age,char gender){
        this.id = id;
        this.name = name;
        this.department = department;
        this.age = age;
        this.gender = gender;

    }
    public void printInfo(){
        System.out.println("Employee Id: "+this.id+" name: "+this.name+" department: "+this.department+" age: "+this.age+" gender: "+this.gender);
    }

    public static void main(String[] args) {
        Employee user1 = new Employee(1,"Artur","Accountant",32,'m');
        Employee user2= new Employee(2,"Arman","Accountant",34,'m');
        Employee user3= new Employee(3,"Ani","Accountant",25,'f');
        Employee user4= new Employee(4,"Gor","Manager",45,'m');
        Employee user5= new Employee(5,"Mariam","Manager",27,'f');

        user1.printInfo();
        user2.printInfo();
        user3.printInfo();
        user4.printInfo();
        user5.printInfo();

    }
}
