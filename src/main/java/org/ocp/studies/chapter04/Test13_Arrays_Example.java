package org.ocp.studies.chapter04;

public class Test13_Arrays_Example {
    public static void main(String[] args) {
        String[] bugs = { "cricket", "beetle", "ladybug" };
        String[] alias = bugs;
        System.out.println(bugs.equals(alias)); // true
        System.out.println(bugs.toString());    // [Ljava.lang.String;@160bc7c0
    }
}
