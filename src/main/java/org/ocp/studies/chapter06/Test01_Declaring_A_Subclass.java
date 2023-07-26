package org.ocp.studies.chapter06;

public class Test01_Declaring_A_Subclass {
    public static void main(String[] args) {
        new Jaguar().printDetails();
    }
}

class BigCat {
    protected double size;
}
class Jaguar extends BigCat {
    public Jaguar() {
        size = 10.2;
    }
    public void printDetails() {
        System.out.print(size);
    }
}

class Spider {
    public void printDetails() {
        // System.out.println(size); // DOES NOT COMPILE
    }
}
