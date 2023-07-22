package org.ocp.studies.chapter05;

import java.util.List;

import static java.util.Arrays.asList;
public class Test22_Static_Example {
    public static void main(String[] args) {
        List<String> list = asList("one","two");
        for (String test:list) {
            System.out.println(test);
        }
    }
}
