package com.jnit.finalKeyword;

import java.util.ArrayList;
import java.util.List;

public class FinalMain {

    public static final int x;
    public static final int y=30;

    static {
        x=10;
        //y=40;
    }

    public static void main(String[] args){
        final List<String> colors = new ArrayList<>();
        colors.add("red");
        colors.add("yellow");
        colors.remove("red");
    }

}
