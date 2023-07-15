package org.ocp.studies.chapter04;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;

public class Test23_Dates_And_Times_Example {
    public static void main(String[] args) {
        var annually = Period.ofYears(1);                           // every one year
        var quarterly = Period.ofMonths(3);                         // every 3 months
        var everyThreeWeeks = Period.ofWeeks(3);                    // every 3 weeks
        var everyOtherDay = Period.ofDays(1);                       // every 2 days
        var everyYearAndWeek = Period.of(1,0,7); // every year and 7 days

        // Test chaining methods of Periods:

        var wrong = Period.ofYears(1).ofWeeks(1);
        System.out.println(wrong);  // P7D

        var wrong2 = Period.ofWeeks(1).ofYears(1);
        System.out.println(wrong2); // P1Y

        System.out.println(Period.of(1,2,3));   // P1Y2M3D
        System.out.println(Period.ofMonths(3)); //P3M
        System.out.println("-------------------------------------");
        var date = LocalDate.of(2022, 1, 20);
        var time = LocalTime.of(6, 15);
        var dateTime = LocalDateTime.of(date, time);
        var period = Period.ofMonths(1);
        System.out.println(date.plus(period)); // 2022–02–20
        System.out.println(dateTime.plus(period)); // 2022–02–20T06:15
        // System.out.println(time.plus(period)); // Exception

    }
}
