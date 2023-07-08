package org.ocp.studies.chapter01;

public class Test09_LiteralsAndUnderScores {

    long max = 3123456789l;
    long max2 = 3123456789L;

    int value = 1250456789;

    float fvalue = 2456789.00F;

    double dvalue = 5456789.00;

    int million1 = 1000000;
    int million2 = 1_000_000;

    // double notAtStart = _1000.00;            // DOES NOT COMPILE
    // double notAtEnd = 1000.00_;              // DOES NOT COMPILE
    // double notByDecimal = 1000_.00;          // DOES NOT COMPILE
    // double annoyingButLegal = 1_00_0.0_0;
    // double reallyUgly = 1__________2;

    public static void main(String[] args) {
        System.out.println(new Test09_LiteralsAndUnderScores().max);
        System.out.println(new Test09_LiteralsAndUnderScores().max2);
        System.out.println(new Test09_LiteralsAndUnderScores().value);
        System.out.println(new Test09_LiteralsAndUnderScores().fvalue);
        System.out.println(new Test09_LiteralsAndUnderScores().dvalue);
        System.out.println(new Test09_LiteralsAndUnderScores().million1);
        System.out.println(new Test09_LiteralsAndUnderScores().million2);
    }

}
