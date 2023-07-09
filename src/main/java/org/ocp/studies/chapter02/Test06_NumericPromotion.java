package org.ocp.studies.chapter02;

public class Test06_NumericPromotion {
    public static void main(String[] args) {
        // What is the data type of x * y?
        int x = 1;
        long y = 33;
        var z = x * y;
        System.out.println("The result z is then a long value : " + z);

        // What is the data type of x1 + y1?

        double x1 = 39.21;
        float y1 = 2.1f;
        var z1 = x1 + y1;
        System.out.println("The result z1 is then a double value : " + z1);

        // What is the data type of x2 * y2?

        short x2 = 10;
        short y2 = 3;
        var z2 = x2 * y2;
        System.out.println("The result z2 is then a int value : " + z2);

        // What is the data type of w3 * x3 / y3?

        short w3 = 14;
        float x3 = 13;
        double y3 = 30;
        var z3 = w3 * x3 / y3;
        System.out.println("The result z3 is then a double value : " + z3);
    }
}
