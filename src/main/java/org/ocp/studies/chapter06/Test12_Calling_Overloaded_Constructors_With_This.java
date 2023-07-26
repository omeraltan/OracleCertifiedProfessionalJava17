package org.ocp.studies.chapter06;

public class Test12_Calling_Overloaded_Constructors_With_This {
    public static void main(String[] args) {
        Hamster hamster = new Hamster(12);
        System.out.println(hamster.color);
        System.out.println(hamster.weight);
    }
}

class Hamster {
    public String color;
    public int weight;

    public String test;

    public Hamster(int weight) { // Second constructor this.weight = weight;
        this(weight, "brown");
    }

    public Hamster(int weight, String color) { // First constructor
        // Comment may be first row
        this(weight, color, "Omer");    // it must be first row
        System.out.println(weight +  color);
    }

    public Hamster(int weight, String color, String test){
        this.weight = weight;
        this.color = color;
        this.test = test;
    }
}
