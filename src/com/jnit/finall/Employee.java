package com.jnit.finall;
import java.io.FileNotFoundException;

//same method in parent and child method is called overriding
//parent has exception - child doesn't - valid
//parent doesn't have exception - child shouldn't have it

public class Employee extends Person {

    @Override
    public void test() throws FileNotFoundException {

    }
}
