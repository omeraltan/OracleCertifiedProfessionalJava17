package org.ocp.studies.chapter02;

public class Test04_ComplementAndNegationOperators {
    public static void main(String[] args) {

        boolean isAnimalAsleep = false;
        System.out.println(isAnimalAsleep); // false
        isAnimalAsleep = !isAnimalAsleep;
        System.out.println(isAnimalAsleep); // true

        System.out.println("----------------------------");

        //   bitwise complement operator (~) : It can only be applied to integer numeric types such as byte, short, char, int, and long.

        int value = 3;                  // Stored as 0011
        int complement = ~value;        // Stored as 1100
        System.out.println(value);      // 3
        System.out.println(complement); // -4

        //  to find the bitwise complement of a number, multiply it by negative one and then subtract one.

        System.out.println("Bitwise Complement : " + (-1 * value - 1)); // -4
        System.out.println("Bitwise Complement : " +  (-1 * complement - 1)); // 3

        double zooTemperature = 1.21;
        System.out.println(zooTemperature); // 1.21
        zooTemperature = -zooTemperature;
        System.out.println(zooTemperature); // -1.21
        zooTemperature = -(-zooTemperature);
        System.out.println(zooTemperature); // -1.21

        // int pelican = !5;           // DOES NOT COMPILE
        // boolean penguin = -true;    // DOES NOT COMPILE
        // boolean peacock = !0;       // DOES NOT COMPILE

    }
}
