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

    public static void main(String[] args) {
        Employee user1 = new Employee(1,"Artur","Accountant",32,'m');
        Employee user2= new Employee(2,"Arman","Accountant",34,'m');
        Employee user3= new Employee(3,"Ani","Accountant",25,'f');
        Employee user4= new Employee(4,"Gor","Manager",45,'m');
        Employee user5= new Employee(5,"Mariam","Manager",27,'f');

        System.out.println("User 1: "+user1.id+ " "+user1.name+ " "+user1.department+ " "+user1.age+ " "+user1.gender);
        System.out.println("User 2: "+user2.id+ " "+user2.name+ " "+user2.department+ " "+user2.age+ " "+user2.gender);
        System.out.println("User 3: "+user3.id+ " "+user3.name+ " "+user3.department+ " "+user3.age+ " "+user3.gender);
        System.out.println("User 4: "+user4.id+ " "+user4.name+ " "+user4.department+ " "+user4.age+ " "+user4.gender);
        System.out.println("User 5: "+user5.id+ " "+user5.name+ " "+user5.department+ " "+user5.age+ " "+user5.gender);

    }
}
