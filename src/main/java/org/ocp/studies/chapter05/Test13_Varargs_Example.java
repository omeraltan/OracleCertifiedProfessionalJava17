package org.ocp.studies.chapter05;

public class Test13_Varargs_Example {
    // Pass an array
    static int[] data = new int[] {1, 2, 3};

    public static void main(String[] args) {
        walk1(data);
        run(11,77);
    }

    public static void walk1(int... steps) {
        int[] step2 = steps; // Not necessary, but shows steps is of type int[]
        System.out.println("Array Length: " + step2.length);
    }

    public static void run(int... steps){
        System.out.println("Array index 1 value: " + steps[1]);
    }
}
