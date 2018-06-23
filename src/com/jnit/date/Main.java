package com.jnit.date;

import java.time.Duration;
import java.time.LocalDate;
import java.time.Period;

public class Main {

    public static void main(String[] args){
        LocalDate date = LocalDate.now();
        System.out.println(date);
        LocalDate date1 = date.minus(Period.ofDays(10));
        System.out.println(date1);
        LocalDate date_16 = date.minusDays(15).minusMonths(2);
        System.out.println(date_16);
    }
}
