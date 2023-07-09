package org.ocp.studies.chapter02;

public class Test08_CompoundAssignmentOperators {
    public static void main(String[] args) {
        int camel = 2, giraffe = 3;
        camel = camel * giraffe;    // Simple assignment operator
        camel *= giraffe;           // Compound assignment operator
        System.out.println(camel);


        // long goat = 10;
        // int sheep = 5;
        // sheep = sheep * goat; // DOES NOT COMPILE

        long goat = 10;
        int sheep = 5;
        sheep *= goat;
        System.out.println(sheep);

        long wolf = 5;
        long coyote = (wolf=3);
        System.out.println(wolf);   // 3
        System.out.println(coyote); // 3

        boolean healthy = false;
        if(healthy = true)
            System.out.print("Good!");
    }
}
