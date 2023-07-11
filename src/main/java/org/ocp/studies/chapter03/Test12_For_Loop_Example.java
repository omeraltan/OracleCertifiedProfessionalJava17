package org.ocp.studies.chapter03;

// Adding Multiple Terms to the for Statement
public class Test12_For_Loop_Example {
    public static void main(String[] args) {

        int x = 0;

        for(long y = 0, z = 4; x < 5 && y < 10; x++, y++) {
            System.out.print(y + " ");
        }
        System.out.println();
        System.out.print(x + " ");
    }
}
