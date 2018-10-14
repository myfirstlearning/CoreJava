package com.jnit.session.Methods;

//accessmodifiers(optional) optionalspecifier(optional) returntype nameofthemethod(params if any(optional)) throws Exception(optional){}

import java.util.Arrays;

public class Main {

    static void main(){
        System.out.println("Main");
        return;
    }

    static String sayHello(String test){
        if(test.equals("hello")) {
            return "Hello Again!";
        }else{
            return "not hello";
        }
    }

    //Widening/narrowing rules
    //byte, short, int, long, float, double
    static long test(int x){
        x = x + 10;
        return x;
    }

    static void test(StringBuffer sb){
        sb.append("world");

    }

    static String test(String s){
        s = s.concat("World");
        return s;
    }
    //pass by value(pass by copy)
    //pass by reference (pass by copy of reference)

    static void test(int[] arr){
        arr[0] = 10;
    }

    public static void main(String[] args){
        System.out.println("Hello");
        main();
        sayHello("hello");
        int i = 10;
        long result = test(i);
        System.out.println(result);
        test(i);
        StringBuffer sb = new StringBuffer("Welcome");
        test(sb);
        System.out.println(sb);
        String s = "Hello New";
        s = test(s);
        System.out.println(s);
        int arr[] = {1,2,3};
        test(arr);
        System.out.println(Arrays.toString(arr));

    }



}
