package com.jnit.staticorder;

//static variables, static initializers as they appear in the file
//instance variables, instance initializers as they appear in the file
//constructor executed last
public class OrderMain2 {

    private static int x = 10;
    private int y = 30;

    static {
        x = 20;
    }

    //instance intializer
    {
        y = 40;
        System.out.print(y);
    }

    public OrderMain2(){
        System.out.print("I am inside constructor");
    }

    public static void main(String[] args){

        System.out.print(x);
        //System.out.print(y);
        new OrderMain2();
    }

    static {
        x = 30;
    }
}
