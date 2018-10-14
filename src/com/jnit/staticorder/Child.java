package com.jnit.staticorder;

//parent first then child
//static inside parent and then static inside child
//instance initializers inside parent and then constructor inside parent
//instance initializers inside child and then constructor inside child
//super() calls parent constructor

public class Child extends Parent {

    private static int y = 30;

    static {
        System.out.println("I am inside child static initializer");
    }

    {
        System.out.println("I am inside child instance initializer 1");
    }

    Child(){
        super();
        System.out.println("I am inside child constructor");
    }

    static {
        System.out.println("I am inside child static initializer 2");
    }

    {
        System.out.println("I am inside child instance initializer 2");
    }

    public static void main(String[] args){
        new Child();

    }
}
