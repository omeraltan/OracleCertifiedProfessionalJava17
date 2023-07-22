package org.ocp.studies.chapter05;

public class Test14_Varargs_Example {
    public static void main(String[] args) {
        walkDog(1);
        walkDog(1,2);
        walkDog(1,2,3);
        walkDog(1, new int[]{4,5});
        walkDog(1,null);        // Triggers NullPointerException in walkDog()
    }

    public static void walkDog(int start, int... steps){
        System.out.println(steps.length);
    }
}
