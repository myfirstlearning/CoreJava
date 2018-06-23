package com.java8;

import java.io.File;
import java.io.FileFilter;

public class FirstLambda {

    public static void main(String[] args) {

        /*FileFilter filter = new FileFilter() {

            @Override
            public boolean accept(File pathname) {
                return pathname.getName().endsWith(".java");
            }
        };*/

        //java8 Features
        FileFilter FilterLambda = (File pathname) -> pathname.getName().endsWith(".java");

        File dir = new File("F:/Test");

        File[] files = dir.listFiles(FilterLambda);

        for (File f : files) {
            System.out.println(f);
        }


        int score = 100;
        if (score > 90) {
            System.out.println("The Score is present");
            System.out.println(score);
            score = 0;
        }
        System.out.println(score);

        int myVariable = 100;
        myVariable++;
        ++myVariable;
        System.out.println(myVariable);
    }
}
