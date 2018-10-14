package com.jnit.design;

//private and static methods cannot be inherited
public class Animal {

    private String name;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void eat(){
        System.out.println("Dog is eating");
    }
}
