package org.ocp.studies.chapter06;

public class Test10_Creating_A_Constructor {
    public static void main(String[] args) {

    }
}

class Turtle{
    private String name;

    public Turtle() {
        name = "John Doe";
    }

    public Turtle(int age){

    }

    public Turtle(long age){

    }

    public Turtle(String newName, String... favoriteFoods){
        name = newName;
    }
}
