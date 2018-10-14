package com.jnit.varargs;

public class VarArgMain1 {

    public static void test(int...arr){
        System.out.println(arr[0]);
    }

    public static void main(String[] args){

        test(10);
    }

}
