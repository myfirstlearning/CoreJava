package com.jnit.staticorder;

public class Parent {

    private static int x = 20;

    static {
        System.out.println("I am inside parent static initializer");
    }

    {
        System.out.println("I am inside parent instance initializer 1");
    }

    Parent(){
        System.out.println("I am inside parent constructor");
    }

    static {
        System.out.println("I am inside parent static initializer 2");
    }

    {
        System.out.println("I am inside parent instance initializer 2");
    }

    public static void print(){
        System.out.println("In Parent");
    }
}
