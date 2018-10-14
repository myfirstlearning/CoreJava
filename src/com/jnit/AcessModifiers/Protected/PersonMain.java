package com.jnit.AcessModifiers.Protected;

public class PersonMain {

    public static void main(String[] args){

        Person p1 = new Person();
        p1.gender = 'M';
        p1.name = "Ravi";
        p1.setAge(25);
        //p1.age = 25;

    }

}
