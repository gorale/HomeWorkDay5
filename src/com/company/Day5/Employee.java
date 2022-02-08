package com.company.Day5;

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


}
