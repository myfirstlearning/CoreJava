package com.jnit.exception;

import com.jnit.object.Student;

//checked exceptions - compiler checked exceptions
//unchecked exceptions - runtime exceptions
//Exception hierarchy(Throwable -> exception - runtimeexception, error)
//Finally, custom exception creations, exceptions in Inheritance, system.exit and return

public class ExceptionMain {

    public static void main(String[] args) {

        //null pointer, indexoutofbounds, Illegalargument, Illegalstate...

        Student s1 = null;
        s1.play();
        //String s = null;
        //s.concat("Hello");
        //exception stack trace[Exception in thread "main" java.lang.NullPointerException
        //	at com.jnit.exception.ExceptionMain.main(ExceptionMain.java:18)]

        int[] number = {1,2,3,4,4,5};
        number[10] = 200; //ArrayIndexOutOfBoundException

        String  s = "hello";
        System.out.println(s.charAt(6)); //StringIndexOutOfBoundException




    }

}
