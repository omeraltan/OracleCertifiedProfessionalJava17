package org.ocp.studies.chapter02;

public class Test11_LogicalOperators {
    public static void main(String[] args) {

        boolean eyesClosed = true;
        boolean breathingSlowly = true;

        boolean resting = eyesClosed | breathingSlowly;
        boolean asleep = eyesClosed & breathingSlowly;
        boolean awake = eyesClosed ^ breathingSlowly;

        System.out.println(resting); // true
        System.out.println(asleep); // true
        System.out.println(awake); // false

        boolean eyesClosed1 = true;
        boolean breathingSlowly1 = false;

        boolean resting1 = eyesClosed1 | breathingSlowly1;
        boolean asleep1 = eyesClosed1 & breathingSlowly1;
        boolean awake1 = eyesClosed1 ^ breathingSlowly1;

        System.out.println(resting1); // true
        System.out.println(asleep1); // false
        System.out.println(awake1); // true

        int hour = 10;
        boolean zooOpen = true || (hour < 4);
        System.out.println(zooOpen); // true

        int rabbit = 6;
        boolean bunny = (rabbit >= 6) || (++rabbit <= 7);
        System.out.println("Rabbit : " + rabbit);
    }
}
