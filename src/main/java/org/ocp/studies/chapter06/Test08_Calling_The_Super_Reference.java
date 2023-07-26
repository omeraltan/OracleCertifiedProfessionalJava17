package org.ocp.studies.chapter06;

public class Test08_Calling_The_Super_Reference {
    public static void main(String[] args) {
        new Beetle().printData();
    }
}

class Insect {
    protected int numberOfLegs = 4;
    String label = "buggy";
}

class Beetle extends Insect {
    protected int numberOfLegs = 6;
    short age = 3;
    public void printData() {
        System.out.println(this.label);
        System.out.println(super.label);
        System.out.println(this.age);
        // System.out.println(super.age);      // DOES NOT COMPILE
        System.out.println(numberOfLegs);
    }
}
