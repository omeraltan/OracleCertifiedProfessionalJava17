package org.ocp.studies.chapter05;

public class Test15_Static_Example {
    String name;
    static String nameOfTallestPenguin;

    public static int count = 0;

    public static void main(String[] args) {
        var p1 = new Test15_Static_Example();
        p1.name = "Lilly";
        p1.nameOfTallestPenguin = "Lilly";
        var p2 = new Test15_Static_Example();
        p2.name = "Willy";
        p2.nameOfTallestPenguin = "Willy";

        System.out.println(p1.name);                    // Lilly
        System.out.println(p1.nameOfTallestPenguin);    // Willy
        System.out.println(p2.name);                    // Willy
        System.out.println(p2.nameOfTallestPenguin);


        System.out.println(count);

        for (String test: args) {
            System.out.println("Test Main Method: " + test);
        }
    }
}

class Testter {
    static String[] test = new String[]{"TestMainStatic"};
    public static void main(String[] args) {
        Test15_Static_Example.main(test);
    }
}
