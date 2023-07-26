package org.ocp.studies.chapter06;

// What does the following program print?
class Initil{
    static { System.out.print("A"); }
}

public class Test16_Initializing_Classes extends Initil{
    public static void main(String[] args) {
        System.out.print("C");
        new Test16_Initializing_Classes();
        new Test16_Initializing_Classes();
        new Test16_Initializing_Classes();
    }
    static {
        System.out.print("B");
    }
}
