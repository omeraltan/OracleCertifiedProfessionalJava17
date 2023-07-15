package org.ocp.studies.chapter04;
// How many of these lines contain a compiler error? (Choose all that apply.)
public class Test35_Question {
    public static void main(String[] args) {
        int one = Math.min(5, 3);
        long two = Math.round(5.5);
        double three = Math.floor(6.9);
        var doubles = new double[] {one, two, three};

        // Answer : 0

        System.out.println(one);
        System.out.println(two);
        System.out.println(three);
    }
}
