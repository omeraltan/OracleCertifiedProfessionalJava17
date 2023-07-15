package org.ocp.studies.chapter04;

import java.time.*;

public class Test26_Dates_And_Times_Example {
    public static void main(String[] args) {
        var now = Instant.now();
        System.out.println(now);
        var later = Instant.now();
        var duration = Duration.between(now,later);
        System.out.println(duration.toMillis());

        System.out.println("--------------------");
        var date = LocalDate.of(2022,5,25);
        var time = LocalTime.of(11,55,00);
        var zone = ZoneId.of("US/Eastern");
        var zonedDateTime = ZonedDateTime.of(date,time,zone);
        var instant = zonedDateTime.toInstant();
        System.out.println(zonedDateTime);
        System.out.println(instant);
    }
}
