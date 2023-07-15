package org.ocp.studies.chapter04;

import java.util.Arrays;

// Which of the following fill in the blank to print a positive integer? (Choose all that apply.)
public class Test39_Question {
    public static void main(String[] args) {
        String[] s1 = { "Camel", "Peacock", "Llama"};
        String[] s2 = { "Camel", "Llama", "Peacock"};
        String[] s3 = { "Camel"};
        String[] s4 = { "Camel", null};

        System.out.println(Arrays.compare(s1,s2));      // positive number
        System.out.println(Arrays.mismatch(s1,s2));     // positive number
        System.out.println(Arrays.compare(s3,s4));      // negative number
        System.out.println(Arrays.mismatch(s3,s4));     // positive number
    }
}
