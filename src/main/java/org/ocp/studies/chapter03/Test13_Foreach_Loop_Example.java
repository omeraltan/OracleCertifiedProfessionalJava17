package org.ocp.studies.chapter03;

import java.util.ArrayList;
import java.util.List;

public class Test13_Foreach_Loop_Example {
    public static void main(String[] args) {
        List<String> test = new ArrayList<>();
        test.add("Omer");
        test.add("Ebru");
        test.add("Adil");
        test.add("Elif");
        printNames(test);
    }

    public static void printNames(List<String> names) {
        for(var name : names)
            System.out.println(name);
    }
}
