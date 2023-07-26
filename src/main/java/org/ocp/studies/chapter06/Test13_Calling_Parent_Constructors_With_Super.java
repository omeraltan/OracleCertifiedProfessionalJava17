package org.ocp.studies.chapter06;

public class Test13_Calling_Parent_Constructors_With_Super {
    public static void main(String[] args) {
        new Zebra();
    }
}

class Animal {
    private int age;
    public Animal(int age) {
        super(); // Refers to constructor in java.lang.Object
        this.age = age;
        System.out.println("Animal one parameter constructor");
    }
}

class Zebra extends Animal {
    public Zebra(int age)
    {
        super(age);     // Refers to constructor in Animal
        System.out.println("Zebra one parameter constructor");
    }
    public Zebra() {
        this(4);    // Refers to constructor in Zebra with int argument
        System.out.println("Zebra no-args constructor");
    }
}
