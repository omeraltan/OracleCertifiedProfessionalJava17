package org.ocp.studies.chapter06;

abstract class Mammal3{
    abstract CharSequence chew();
    public Mammal3() {
        System.out.println(chew()); // Does this line compile?
    }
}

public class Test22_Creating_Constructors_In_Abstract_Classes extends Mammal3{

    String chew() { return "yummy!"; }

    public static void main(String[] args) {
        new Test22_Creating_Constructors_In_Abstract_Classes();
    }
}
