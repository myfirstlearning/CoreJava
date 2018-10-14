package com.jnit.staticorder;

//static variables and static initializers execute in the same order as they appear in the file
//instance initializers
public class OrderMain {

    private static int x = 10;

    static {
        x = 20;
    }

    public static void main(String[] args){
        System.out.print(x);
    }

    static {
        x = 30;
    }
}
