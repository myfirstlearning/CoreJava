package com.jnit.encapsulation;

public class Main {

    public static void main(String[] args){
        Book b1 = new Book();
        b1.name = "Java";
        b1.setPrice(100);
        System.out.println(b1.getPrice());

        Book b2 = new Book();
        b2.name = "Java8";
        b2.setPrice(10000);
    }
}
