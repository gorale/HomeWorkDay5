package com.company.Day5;


public class PersonTest {

    int id;
    String name;
    static int i=0;

    public PersonTest(){
        this(0,null);

    }

    public PersonTest(int id,String name){
        this.id = id;
        this.name = name;
        i++;

    }


    public static void main(String[] args) {
        PersonTest person1 = new PersonTest(1,"Arman");

        PersonTest person2 = new PersonTest(2,"Gagik");
        PersonTest person3 = new PersonTest(3,"Vardan");


        System.out.println(PersonTest.i);

    }
}
