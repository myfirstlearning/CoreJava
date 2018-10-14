package com.jnit.session.Methods;

public class VarArgsMain {


    public static void test(int a, int b){

    }

    //variable arguments
    public static void test(int...arr){

    }

      //Doesn't compile
      //VarArgs should be at last
//    public static void test(String...arr, int x){
//
//    }

    public static void test(int x, String...arr){

    }

    public static void main(String[] args){

        //test(10);
        test(10,2);
        test(10,2,30);
        test(10,2,20,40);
        test(new int[]{10,20,30});
    }

}
