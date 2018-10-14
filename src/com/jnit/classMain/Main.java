package com.jnit.classMain;

public class Main {

    public static void main(String[] args){

        ClassMain cls = new ClassMain(); //("vijay","kandi");
        System.out.println("Details :" + " " + cls.getId() + " " + cls.getfName() + " " + cls.getlName());

        ClassMain cls2 = new ClassMain("srikanth",
                "Akkula");
        System.out.println("Details :" + " " + cls2.getId() + " " + cls2.getfName() + " " + cls2.getlName() );

        ClassMain cls1 = new ClassMain();
        cls1.setId(10);
        cls1.setfName("vinesh");
        cls1.setlName("Akkula");
        System.out.println("Details :" + " " + cls1.getId() + " " + cls1.getfName() + " " + cls1.getlName());
    }

}
