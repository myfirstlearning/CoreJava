package com.jnit.staticorder;

public class OrderMain4 {

    private static OrderMain4 m1 = new OrderMain4();

    public OrderMain4(){
        System.out.println("Inside Constructor");
    }

    static {
        System.out.print("Inside static block ");
    }

    public static void main(String[] args){
        new OrderMain4();
    }
}
