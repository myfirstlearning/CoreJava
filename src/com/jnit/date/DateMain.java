package com.jnit.date;

import java.time.*;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;


//java.time -> LocalDate, LocalTime, LocalDateTime
//we cannot use new keyword on LD, LDT, LT
//yyyy-mm-ddThh:mm:ss:SSS
//immutable objects

public class DateMain {

    public static void main (String[] args){

        LocalDate today = LocalDate.now();
        System.out.println(today);
        LocalTime time =LocalTime.now();
        System.out.println(time);
        LocalDateTime dateTime = LocalDateTime.now();
        System.out.println(dateTime);
        System.out.println("********************************");
        //Create own Date
        LocalDate yesterday = LocalDate.of(2018,05,13);
        System.out.println(yesterday);
        LocalDateTime yesterdayDateTime = LocalDateTime.of(2018,05,13,3,23,45,23);
        System.out.println(yesterdayDateTime);
        //minus and plus operations
        LocalDate date_15 = today.minusDays(13);
        System.out.println(date_15);
        date_15 = today.minusWeeks(2);
        System.out.println(date_15);
        today.minusMonths(2);
        today.minusYears(2);
        //All at once
        today.minus(Period.of(1,2,5));
        //today = today.minus(Period.of(1,2,5));
        //Duartion -> time
        //today = today.minus(Duration.ofDays(10));
        //System.out.println(today);
        time = time.minus(Duration.ofHours(1));
        System.out.println(time);
        //chaining operations
        LocalDate date_16 = today.minusDays(15).minusMonths(2);
        yesterdayDateTime = yesterdayDateTime.minusDays(2).minusHours(2);
        System.out.println(date_16);
        //chaining not possible with periods
        //dont chain static methods
        Period period = Period.ofDays(10).ofWeeks(3);

        //Creating dates in Java7
        Date oldWay = new Date();
        System.out.println(oldWay.toString());

        //setting
        Calendar calendar = Calendar.getInstance();
        calendar.set(2018, Calendar.MAY,15);
        Date may = calendar.getTime();
        System.out.println(may);

        //or
        Calendar calenddar1 = new GregorianCalendar(2018, Calendar.JANUARY,1);
        Date jan = calenddar1.getTime();
        System.out.println(jan);



    }
}
