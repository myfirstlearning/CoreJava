package com.jnit.overloading;
//this() -> call one constructor from other constructor
public class Student {

     String name;
     int age;
     String nameOfSchool;
     Address address;

    public Student(){

    }

    public Student(String name, int age){
        this.name = name;
        this.age = age;
    }

    public Student(String name, int age, String nameOfSchool){
        this.name = name;
        this.age = age;
        this.nameOfSchool = nameOfSchool;
    }

    public Student(String name, int age, String nameOfSchool, Address address){
        this.name = name;
        this.age = age;
        this.nameOfSchool = nameOfSchool;
        this.address = address;
    }

    public static void main(String[] args){
        Student s1 = new Student();
        s1.name = "Ravi";
        s1.age = 29;
        s1.nameOfSchool = "GOV";

        Student s2 = new Student("Paul", 10);


    }

}
