package org.ocp.studies.chapter06;

public class Test09_Creating_A_Constructor {
    public Test09_Creating_A_Constructor() {
        System.out.println("hop");
    }

    public static void main(String[] args) {
        new Test09_Creating_A_Constructor();
    }
}

class Bunny{
    public Bunny() {}
    // public bunny(){}        // DOES NOT COMPILE
    public void Bunny(){}   // DOES NOT CONSTRUCTOR. IT IS A VOID METHOD
}

class Bonobo{
    // public Bonobo(var food) {}  // DOES NOT COMPILE
}


