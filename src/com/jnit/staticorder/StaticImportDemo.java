package com.jnit.staticorder;

import static java.lang.Math.*;
public class StaticImportDemo {

    public static void main(String[] args){
        min(10,20);
        max(10,20);
        System.out.println(PI);
        Parent.print();
        Parent p = null;
        p.print();
    }

}
