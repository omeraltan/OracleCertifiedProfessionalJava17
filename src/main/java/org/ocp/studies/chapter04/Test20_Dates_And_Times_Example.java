package org.ocp.studies.chapter04;

import java.time.*;

public class Test20_Dates_And_Times_Example {
    public static void main(String[] args) {
        System.out.println("Local Date Now : " + LocalDate.now());
        System.out.println("Local Time Now : " + LocalTime.now());
        System.out.println("Local Date Time Now : " + LocalDateTime.now());
        System.out.println("Zoned Date Time Now : " + ZonedDateTime.now());
        System.out.println("----------------------");
        // Both of these examples create the same date:
        var date1 = LocalDate.of(2022, Month.JANUARY, 20);
        var date2 = LocalDate.of(2022, 1, 20);
        System.out.println("Local Date : " + date1);
        System.out.println("Local Date : " + date2);
        System.out.println("----------------------");
        var time1 = LocalTime.of(6, 15);                                // hour and minute
        var time2 = LocalTime.of(6, 15, 30);                     // + seconds
        var time3 = LocalTime.of(6, 15, 30, 200);   // + nanoseconds
        System.out.println("Local Time Hour And Minute : " + time1);
        System.out.println("Local Time Seconds : " + time2);
        System.out.println("Local Time Nano Seconds : " + time3);
        System.out.println("----------------------");
        // You can combine dates and times into one object:
        var dateTime1 = LocalDateTime.of(2022, Month.JANUARY, 20, 6, 15, 30);
        var dateTime2 = LocalDateTime.of(date1, time1);
        System.out.println("Local Date Time : " + dateTime1);
        System.out.println("Local Date Time : " + dateTime2);
        System.out.println("----------------------");
        var zone = ZoneId.of("US/Eastern");
        var zoned1 = ZonedDateTime.of(2022, 1, 20, 6, 15, 30, 200, zone);
        var zoned2 = ZonedDateTime.of(date1, time1, zone);
        var zoned3 = ZonedDateTime.of(dateTime1, zone);
        System.out.println("Zoned Date Time : " + zoned1);
        System.out.println("Zoned Date Time : " + zoned2);
        System.out.println("Zoned Date Time : " + zoned3);

    }
}
