package org.ocp.studies.chapter04;

import java.time.Duration;
import java.time.temporal.ChronoUnit;

public class Test24_Dates_And_Times_Example {
    public static void main(String[] args) {
        System.out.println("---------Duration: ofDays(), ofHours(), ofMinutes(), ofSeconds(), ofMillis(), ofMonos()--------");
        var daily = Duration.ofDays(1);                 // PT24H
        var hourly = Duration.ofHours(1);               // PT1H
        var everyMinute = Duration.ofMinutes(1);        // PT1M
        var everyTenSeconds = Duration.ofSeconds(10);   // PT10S
        var everyMilli = Duration.ofMillis(1);          // PT0.001S
        var everyNano = Duration.ofNanos(1);            // PT0.000000001S
        System.out.println("---------Duraton: ChronoUnit.DAYS, ChronoUnit.HOURS, ChronoUnit.MINUTES, ChronoUnit.SECONDS, ChronoUnit.MILLIS, ChronoUnit.NANOS--------");
        var daily1 = Duration.of(1, ChronoUnit.DAYS);
        var hourly1 = Duration.of(1, ChronoUnit.HOURS);
        var everyMinute1 = Duration.of(1, ChronoUnit.MINUTES);
        var everyTenSeconds1 = Duration.of(10, ChronoUnit.SECONDS);
        var everyMilli1 = Duration.of(1, ChronoUnit.MILLIS);
        var everyNano1 = Duration.of(1, ChronoUnit.NANOS);
    }
}
