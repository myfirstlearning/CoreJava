package com.jnit.varargs;


//int -> Integer -> Object
//int -> float (widening)
//int -> float -> Float
//int -> Float (NotPossible)
public class VarArgMain {

    public static void test(int x){
    System.out.println(x);
    }

    public static void test(int x, String...s){
        System.out.println(x);
    }

    public static void test(Integer x){}



    public static void test(Object x){}

    public static void main(String[] args){

        int x = 10;
        test(x);
    }

}
