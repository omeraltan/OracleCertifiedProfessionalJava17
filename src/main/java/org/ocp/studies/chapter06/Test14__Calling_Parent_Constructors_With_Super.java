package org.ocp.studies.chapter06;

public class Test14__Calling_Parent_Constructors_With_Super {

}

class Animal2{
    private int age;
    private String name;

    public Animal2(int age, String name) {
        super();
        this.age = age;
        this.name = name;
    }

    public Animal2(int age){
        super();
        this.age = age;
        this.name = null;
    }
}

class Gorilla extends Animal2{
    public Gorilla(int age){
        super(age, "Gorilla");
    }

    public Gorilla(){
        super(5);
    }

}
