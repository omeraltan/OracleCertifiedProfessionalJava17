package org.ocp.studies.chapter04;

public class Test36_Question {
    public static void main(String[] args) {

        var numbers = "012345678".indent(1);
        //      0   1   2   3   4   5   6   7   8
        //
        System.out.println(numbers);
        numbers = numbers.stripLeading();
        System.out.println(numbers.substring(1, 3));
        System.out.println(numbers.substring(7, 7));
        System.out.print(numbers.substring(7));
    }
}
