package com.jnit.exception;

//checkedExceptions -> IoException and its children(FileNotFound)
//try/catch is exception handler

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class CheckedExceptionMain {

    public static void main(String[] args) {
        System.out.println("Start");

        try {

            int i = divide(10, 0);

        } catch (IllegalArgumentException e) {
            e.printStackTrace();
            throw e;
        } finally {
            System.out.println("Finally");
        }
        System.out.println("End");
    }

    public static int divide(int a, int b) {
        if (b != 0) {
            return a/b;
        } else {
            throw new IllegalArgumentException("Divider should not be 0");
        }

    }

    public static void main2(String[] args) throws Exception{

        readFileAndWriteitoDb();
        test("Hello");
        try {
            teste("Hello");
        } catch (Exception e) {
            e.printStackTrace();
            throw e;
        }

        System.out.println("After try-catch");
    }

    //throw -> inside method body, throw both checked and unchecked
    // throws -> method signature -> checked exception
    public static void test(String s) throws RuntimeException{
        if(!s.startsWith("Hello")){
            //throw new IllegalArgumentException("Expecting to start with Hello");
            throw new RuntimeException("Expecting to start with Hello");
        }
    }

    //throws -> Exception and all of its children other than RunTimeException and its children
    public static void teste(String s) throws Exception{
        if(!s.startsWith("Hello")){
            throw new Exception("Expecting to start with Hello");
            //System.out.println("Hello"); -> dead code
        }
    }

    private static void readFileAndWriteitoDb() {
        try {
            FileReader reader = new FileReader(new File("abc.txt"));
            Connection connection = DriverManager.getConnection("");
        } catch (FileNotFoundException | SQLException e) {
            e.getMessage();
            System.out.println(e.getMessage());
            e.printStackTrace();
            try {
                FileReader reader = new FileReader(new File("bbc.txt"));
            } catch (FileNotFoundException e1) {
                e1.printStackTrace();
            }
        }


    }


}
