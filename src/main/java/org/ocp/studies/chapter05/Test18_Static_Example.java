package org.ocp.studies.chapter05;

public class Test18_Static_Example {
    private static int count;

    public Test18_Static_Example() {count++;}

    public static void main(String[] args) {
        var c1 = new Test18_Static_Example();
        var c2 = new Test18_Static_Example();
        var c3 = new Test18_Static_Example();
        System.out.println(count);
    }
}
