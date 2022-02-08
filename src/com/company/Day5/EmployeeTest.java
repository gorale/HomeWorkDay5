package com.company.Day5;

public class EmployeeTest {
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
