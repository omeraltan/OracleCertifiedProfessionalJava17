package org.ocp.studies.chapter04;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

public class Test21_Dates_And_Times_Example {
    public static void main(String[] args) {

        // LocalDate: plusDays, plusWeeks, plusMonths, plusYears

        var date = LocalDate.of(2022, Month.JANUARY, 20);
        System.out.println(date);               // 2022–01–20
        date = date.plusDays(2);
        System.out.println(date);               // 2022–01–22
        date = date.plusWeeks(1);
        System.out.println(date);               // 2022–01–29
        date = date.plusMonths(1);
        System.out.println(date);               // 2022–02–28
        date = date.plusYears(5);
        System.out.println(date);               // 2027–02–28

        System.out.println("--------------------------------");
        // LocalDateTime: minusSeconds, minusMinutes, minusHours, minusDays

        var date2 = LocalDate.of(2024, Month.JANUARY, 20);
        var time2 = LocalTime.of(5, 15);
        var dateTime = LocalDateTime.of(date2,time2);
        System.out.println(dateTime);               // 2024–01–20T05:15
        dateTime = dateTime.minusDays(1);
        System.out.println(dateTime);               // 2024–01–19T05:15
        dateTime = dateTime.minusHours(10);
        System.out.println(dateTime);               // 2024–01–18T19:15
        dateTime = dateTime.minusSeconds(30);
        System.out.println(dateTime);               // 2024–01–18T19:14:30


    }
}
