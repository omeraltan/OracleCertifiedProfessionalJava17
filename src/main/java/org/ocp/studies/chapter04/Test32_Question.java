package org.ocp.studies.chapter04;

// How many of these lines contain a compiler error? (Choose all that apply.)
public class Test32_Question {
    public static void main(String[] args) {
        // double one = Math.pow(1, 2);
        // int two = Math.round(1.0);
        // float three = Math.random();
        // var doubles = new double[] {one, two, three};

        double result = Math.pow(2,3);
        int result2 = (int) Math.pow(2,3);
        long result3 = (long) Math.pow(2,3);
        float result4 = (float) Math.pow(2,3);
        System.out.println(result);
        System.out.println(result2);
        System.out.println(result3);
        System.out.println(result4);
    }
}
