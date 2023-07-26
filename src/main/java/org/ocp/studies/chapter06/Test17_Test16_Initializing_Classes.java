package org.ocp.studies.chapter06;

class Initil2{ static {
    System.out.print("A"); }
}

class HippoFriend extends Initil2 {

    public static void main(String[] args) {
        System.out.print("C");
        new Test17_Test16_Initializing_Classes();
    }

}

public class Test17_Test16_Initializing_Classes {

    static {
        System.out.print("B");
    }
}
