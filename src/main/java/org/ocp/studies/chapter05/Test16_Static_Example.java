package org.ocp.studies.chapter05;

public class Test16_Static_Example {
    private String name = "Sammy";
    public static void first(){}
    public static void second(){}
    public void third(){System.out.println(name);}

    public static void main(String[] args) {
        first();
        second();
        // third();        // DOES NOT COMPILE
    }
}
