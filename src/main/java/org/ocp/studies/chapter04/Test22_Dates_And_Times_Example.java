package org.ocp.studies.chapter04;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;

public class Test22_Dates_And_Times_Example {

    /*
    public static void main(String[] args) {
        var start = LocalDate.of(2022, Month.JANUARY,1);
        var end = LocalDate.of(2022, Month.MARCH, 30);
        performAnimalEnrichment(start,end);
    }

    private static void performAnimalEnrichment(LocalDate start, LocalDate end){
        var upTo = start;
        while (upTo.isBefore(end)){
            System.out.println("give new toy: " + upTo);
            upTo = upTo.plusMonths(1);
        }
    }
    */

    public static void main(String[] args) {
        var start = LocalDate.of(2022, Month.JANUARY, 1);
        var end = LocalDate.of(2022, Month.MARCH, 30);
        var period = Period.ofMonths(1);
        performAnimalEnrichment(start,end,period);
    }

    private static void performAnimalEnrichment(LocalDate start, LocalDate end, Period period){
        var upTo = start;
        while (upTo.isBefore(end)){
            System.out.println("give new toy: " + upTo);
            upTo = upTo.plus(period);
        }
    }
}
