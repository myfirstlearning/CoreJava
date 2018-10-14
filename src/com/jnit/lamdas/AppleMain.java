package com.jnit.lamdas;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class AppleMain {


    public List<Apple> filterGreenApples(List<Apple> apples){

        List<Apple> greenApples = new ArrayList<>();
        for (Apple apple : apples){
            if("green".equals(apple.getColor())){
                greenApples.add(apple);
            }
        }
        return greenApples;
    }

    public List<Apple> filterApplesByWeighht(List<Apple> apples){

        List<Apple> heavyApples = new ArrayList<>();
        for (Apple apple : apples){
            if(apple.getWeight() > 100){
                heavyApples.add(apple);
            }
        }
        return heavyApples;
    }


    //strategy design pattern -> by behaviour we can break down the code

    public List<Apple> filterAppleByWieght(List<Apple> apples, String color, int weight, boolean filterCriteria){

        List<Apple> filteredApple = new ArrayList<>();
        for (Apple apple: apples){
            if(filterCriteria){
                if(apple.getWeight() > weight){
                    filteredApple.add(apple);
                } else {
                    if(color.equals(apple.getColor())){
                        filteredApple.add(apple);
                    }
                }
            }
        }
        return filteredApple;
    }

    public static List<Apple> filterAppleByWieght(List<Apple> apples, ApplePredicate predicate){

        List<Apple> filteredApple = new ArrayList<>();
        for (Apple apple: apples){
            if(predicate.test(apple)){
                filteredApple.add(apple);
            }
        }
        return filteredApple;
    }

    public static List<Apple> filterAppleByWieght1(List<Apple> apples, Predicate<Apple> predicate){

        List<Apple> filteredApple = new ArrayList<>();
        for (Apple apple: apples){
            if(predicate.test(apple)){
                filteredApple.add(apple);
            }
        }
        return filteredApple;
    }

    //Generics
    //T -> stands for any type
   /* public static List<T> filterItems(List<T> apples, Predicate<T> predicate){

        List<T> items = new ArrayList<T>();
        for (T t: apples){
            if(predicate.test(t)){
                items.add(t);
            }
        }
        return items;
    }*/

    public static void main(String[] args){
        List<Apple> apples = Arrays.asList(new Apple("green", 100),
                                            new Apple("green", 150),
                                            new Apple("green", 200));

        filterAppleByWieght(apples, new AppleGreenColorPredicate());
        filterAppleByWieght(apples, new AppleHeavyWieghtPredicate());

        // anonymous classes (classes doesn't have name)
        ApplePredicate redApplePredicate = new ApplePredicate() {
            @Override
            public boolean test(Apple apple) {
                return apple.getColor().equals("red");
            }
        };

        filterAppleByWieght(apples, redApplePredicate);

        //lamda's -> anonymous classes
        filterAppleByWieght(apples, (Apple apple) -> {return apple.getColor().equals("red");} );
        filterAppleByWieght(apples, (apple) -> {return apple.getColor().equals("red");} );
        filterAppleByWieght(apples, apple -> {return apple.getColor().equals("red");} );
        filterAppleByWieght(apples, apple -> apple.getColor().equals("red"));
        filterAppleByWieght(apples, apple -> {int x = 10; return apple.getColor().equals("red");});
        filterAppleByWieght(apples, a -> a.getColor().equals("red"));

        Calculator calculator = (a, b) -> {return a+b;};
        ApplePredicate1 applePredicate1 = (a, b, c) -> {return c.getColor().equals(a) && c.getWeight() == b;};

        Predicate<Apple> predicate = new Predicate<Apple>() {
            @Override
            public boolean test(Apple apple) {
                return apple.getColor().equals("red");
            }
        };

        filterAppleByWieght1(apples, t->t.getColor().equals("red"));


    }

}
