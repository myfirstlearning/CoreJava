package com.jnit.staticorder;

public class OrderMain3 {


    private static int x = getX();

    static {
        x = 30;
    }

    static int getX(){
        return 20;
    }

    public static void main(String[] args){

        System.out.print(x);

    }
}
