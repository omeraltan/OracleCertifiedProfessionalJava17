package org.ocp.studies.chapter05;

public class Test19_Static_Example {
    private static final int NUM_BUCKETS= 45;

    public static void main(String[] args) {
        // NUM_BUCKETS = 5; // DOES NOT COMPILE
    }

    final static String name = "Ronda";
    static final int bamboo;
    // static final double height; // DOES NOT COMPILE

    static {bamboo = 5;}
}
