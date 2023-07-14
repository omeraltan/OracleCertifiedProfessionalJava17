package org.ocp.studies.chapter04;

public class Test19_Math_API_Example {
    public static void main(String[] args) {
        System.out.println("----------min(), max()-----------");
        int max = Math.max(3,7);
        int min = Math.min(3,5);
        long longMax = Math.max(123123,131233);
        long longMin = Math.min(234455,454545);
        float floatMax = Math.max(23234f,4434f);
        float floatMin = Math.min(12323f,45567f);
        double doubleMax = Math.max(12323.3,121223.4);
        double doubleMin =  Math.min(12323.4,34343.5);

        System.out.println("int max value : " + max);
        System.out.println("int min value : " + min);
        System.out.println("long max value : " + longMax);
        System.out.println("long min value : " + longMin);
        System.out.println("float max value : " + floatMax);
        System.out.println("float min value : " + floatMin);
        System.out.println("double max value : " + doubleMax);
        System.out.println("double min value : " + doubleMin);

        System.out.println("----------round()-----------");
        long low = Math.round(123.45); // 123
        long high = Math.round(123.50); // 124
        int fromFloatLow = Math.round(123.45f); // 123
        int fromFloatHigh = Math.round(123.50f); // 124

        System.out.println("Round double value low : " + low);
        System.out.println("Round double value high : " + high);
        System.out.println("Round float value low : " + fromFloatLow);
        System.out.println("Round float value high : " + fromFloatHigh);

        System.out.println("----------ceil(), floor()-----------");
        double c = Math.ceil(3.14);  // 4.0
        double f = Math.floor(3.14); // 3.0

        System.out.println("ceil() method signature : " + c);
        System.out.println("floor() method signature : " + f);

        System.out.println("----------pow()-----------");
        double squared = Math.pow(5, 2); // 25.0
        System.out.println("pow() method signature : " + squared);

        System.out.println("----------random()-----------");
        double num = Math.random();
        System.out.println("random() method signature : " + num);
    }
}
