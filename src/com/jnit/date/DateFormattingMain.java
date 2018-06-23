package com.jnit.date;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;


//DateTimeFormatter

public class DateFormattingMain {

    public static void main(String[] args){

        LocalDate date = LocalDate.of(2020, Month.JANUARY, 20);
        System.out.println(date.getDayOfWeek()); // MONDAY
        System.out.println(date.getMonth()); // JANUARY
        System.out.println(date.getYear()); // 2020
        System.out.println(date.getDayOfYear()); // 20

        LocalDate date1 = LocalDate.now();

        System.out.println(date1);
        System.out.println(date1.format(DateTimeFormatter.ISO_DATE));

        DateTimeFormatter shortDateTime = DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT);
        System.out.println(shortDateTime.format(date1)); // 5/15/18
        //System.out.println(shortDateTime.format(time)); //unsupportedTemporalTypeException
        DateTimeFormatter mediumDateTime1 = DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM);
        System.out.println(mediumDateTime1.format(date1)); //May 15, 2018 (NOV)
        DateTimeFormatter longDateTime1 = DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG);
        System.out.println(longDateTime1.format(date1)); //May 15, 2018(NOV -> NOVEMBER)
        DateTimeFormatter fullDateTime1 = DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL);
        System.out.println(fullDateTime1.format(date1)); // Tuesday, May 15, 2018

        //TimeFormat
        LocalDateTime dt = LocalDateTime.now();
        DateTimeFormatter timeFormatter = DateTimeFormatter.ofLocalizedTime(FormatStyle.SHORT);
        System.out.println(timeFormatter.format(dt)); // 10:54 PM

        //Custom Formatter
        DateTimeFormatter customFormatter = DateTimeFormatter.ofPattern("yyyy/MM/dd");
        String convertedDate = customFormatter.format(dt);
        System.out.println(customFormatter.format(dt));
        System.out.println(convertedDate);

        //Parse date from string to date object
        LocalDate dateParse = LocalDate.parse(convertedDate,customFormatter);
        System.out.println(dateParse);

    }
}
