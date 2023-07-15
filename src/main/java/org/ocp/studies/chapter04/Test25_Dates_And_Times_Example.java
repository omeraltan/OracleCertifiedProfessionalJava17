package org.ocp.studies.chapter04;

import java.time.*;
import java.time.temporal.ChronoUnit;

public class Test25_Dates_And_Times_Example {
    public static void main(String[] args) {
        var one = LocalTime.of(5,15);
        var two = LocalTime.of(6,30);
        var date = LocalDate.of(2016,1,20);
        System.out.println(ChronoUnit.HOURS.between(one,two));      // 1 HOUR
        System.out.println(ChronoUnit.MINUTES.between(one,two));    // 75 MINUTES
        // System.out.println(ChronoUnit.MINUTES.between(one,date));   // Exception -> DateTimeException

        // You can truncate any object with a time element. For example:
        LocalTime time = LocalTime.of(3,12,45);
        System.out.println(time);
        LocalTime truncated = time.truncatedTo(ChronoUnit.MINUTES);
        System.out.println(truncated);

        LocalTime time2 = LocalTime.of(3,45,12,34);
        System.out.println(time2);
        LocalTime truncated2 = time2.truncatedTo(ChronoUnit.SECONDS);
        System.out.println(truncated2);

        // Using a Duration works the same way as using a Period. For example:
        var date3 = LocalDate.of(2022, 1, 20);
        var time3 = LocalTime.of(6, 15);
        var dateTime = LocalDateTime.of(date, time);
        var duration = Duration.ofHours(6);
        System.out.println(dateTime.plus(duration)); // 2022–01–20T12:15
        System.out.println(time3.plus(duration)); // 12:15
        // System.out.println(date3.plus(duration)); // UnsupportedTemporalTypeException

        // Period vs. Duration
        var date4 = LocalDate.of(2022, 5, 25);
        var period4 = Period.ofDays(1);
        var days4 = Duration.ofDays(1);

        System.out.println(date4.plus(period4));
        // System.out.println(date4.plus(days4)); // Unsupported unit: Seconds

        var date5 = LocalDateTime.of(2022,5,22,12,34,2);
        var days5 = Duration.ofDays(1);
        System.out.println(date5.plus(days5));

        // Where to use Duration and Period
        //                      Can use with Period?                        Can use with Duration?
        // LocalDate            Yes                                         No
        // LocalDateTime        Yes                                         Yes
        // LocalTime            No                                          Yes
        // ZonedDateTime        Yes                                         Yes
    }
}
