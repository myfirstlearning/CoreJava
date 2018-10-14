package com.jnit.lamdas;

public class AppleHeavyWieghtPredicate implements ApplePredicate {

    @Override
    public boolean test(Apple apple) {
        return apple.getWeight() > 100;
    }
}
