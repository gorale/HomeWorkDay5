package com.company;

public class Employee {
    int id;
    String name;
    String department;
    int age;
    char gender;
    int role;
    String lastname;

    public Employee() {
        this(0, null, null, null, 0, '\u0000', 0);
    }

    public Employee(int id, String name, String lastname,int role){
        this(id, name, lastname, null, 0, '\u0000', role);

    }
    public Employee(int id){
        this(0, null, null, null, 0, '\u0000', 0);
        this.id = id;
    }

    public Employee(int id, String name, String lastname, String department, int age, char gender, int role) {
        this.id = id;
        this.name = name;
        this.lastname = lastname;

        this.department = department;
        this.age = age;
        this.gender = gender;
        this.role = role;

    }

    public void printInfo() {
        System.out.printf(
                "Id: %d, name: %s, lastname: %s, department: %s, age: %d, gender: %c, role: %d %n",

                this.id,
                this.name,
                this.lastname,
                this.department,
                this.age,
                this.gender,
                this.role
        );
    }

    public static void main(String[] args) {
        Employee user1 = new Employee(1, "Artur", "Araqelyan", "Accountant", 32, 'm', 1);
        Employee user2 = new Employee(2, "Arman", "Aleqsanyan", "Accountant", 34, 'm', 1);
        Employee user3 = new Employee(3, "Ani", "Setrakyan", "Accountant", 25, 'f', 1);
        Employee user4 = new Employee(4, "Gor", "Hovsepyan", "Manager", 45, 'm', 2);
        Employee user5 = new Employee(5, "Mariam", "Khachatryan", "Manager", 27, 'f', 2);
        Employee user6 = new Employee(8,"Gor","Alexanyan",1);
        Employee user7 = new Employee(9);
        Employee user8 = new Employee();
        user1.printInfo();
        user2.printInfo();
        user3.printInfo();
        user4.printInfo();
        user5.printInfo();
        user6.printInfo();
        user7.printInfo();
        user8.printInfo();

    }
}
