package com.jnit.overloading;

//Overloading -> compile time polymorphism -> one thing exists in different formats
//Method overloading and Constructor overloading
//same name for methods with different args types
//same namefor constructor with different args types
public class Calculator {

    //Method Overloading
    public int add(int x){
        return 2+x;
    }

    //public long add(int y){//Doesn't work}

    public int add(int x, int y){
    return x + y;
    }


    public static void main(String[] args){}


}
