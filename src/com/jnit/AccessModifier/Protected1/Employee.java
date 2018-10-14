package com.jnit.AccessModifier.Protected1;

import com.jnit.AcessModifiers.Protected.Person;

public class Employee extends Person {

    public static void main(String[] args){

        Employee e = new Employee();
        e.city = "New Jersey";
        e.gender = 'M';

        Person p = new Person();
        p.city = "NJ";
        //p.gender = 'F'; cannot access protected because of parent reference

        Person p1 = new Employee(); //Upcasting
        p1.city = "New York";
        //p1.gender = 'F'; cannot access protected because of parent reference

        Employee e1 = (Employee) p1;//compiles but fails at runtime  //Downcast
        e1.city = "Chicago";
        e1.gender = 'M';

        //Employee e2 = new Person();

        Employee e3 = new Employee();
        p1 = e3;
        //p1.gender = 'F';
    }

}
