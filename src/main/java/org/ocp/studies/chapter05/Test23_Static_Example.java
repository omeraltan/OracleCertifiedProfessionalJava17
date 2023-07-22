package org.ocp.studies.chapter05;

// import static java.util.Arrays; // DOES NOT COMPILE

import static java.util.Arrays.asList;
// static import java.util.Arrays.*;  // DOES NOT COMPILE
public class Test23_Static_Example {
    public static void main(String[] args) {
        // Arrays.asList("one"); // DOES NOT COMPILE
        asList("one","two");
    }
}
