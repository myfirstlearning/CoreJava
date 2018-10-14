package com.jnit.StaticKeyWord;

//static -> only one per class(not one per object)
//all the objects will share one single copy of x
//static initializers -> set values for your static variables
public class StaticDemo {

    public static int x = 10; //static variables
    public int y=20; //instance variables

    //utility methods -> no need an object to call static methods
    //a static method cannot access non-static method
    //a non static can call static/non static
    //utility method doesn't require state to operate on
    //Math
    public static void print(){
        System.out.println(x);
    }

    //static initializers -> they get executed first
    static{
        System.out.println("Static Intializers");
    }

    public static int add(int a, int b){
        return a + b;
        //nonstatic();
    }

    public void nonstatic(){
        print();
        add(10,50);
    }

    public static void main(String[] args){
        System.out.print("Main method");
        StaticDemo sd = new StaticDemo();
        sd.x=25;
        sd.y=30;
        System.out.println(x);
        System.out.println(sd.x);
        System.out.println(sd.y);

        StaticDemo sd1 = new StaticDemo();
        sd1.x=35;
        sd1.y=40;
        System.out.println(sd1.x);
        System.out.println(sd1.y);
        System.out.println(Math.max(12,15));


    }
}
