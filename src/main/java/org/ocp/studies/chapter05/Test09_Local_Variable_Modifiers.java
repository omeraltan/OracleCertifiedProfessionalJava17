package org.ocp.studies.chapter05;

public class Test09_Local_Variable_Modifiers {
    boolean isWeekend = true;
    void testMethod(){
        final int rest;
        if (isWeekend)
            rest = 5;
        // System.out.println(rest);   // DOES NOT COMPILE
    }

    public void zooAnimalCheckup() {
        final int rest = 5;
        final AnimalTest giraffe = new AnimalTest();
        final int[] friends = new int[5];
        giraffe.setName("George");
        friends[2] = 2;

        //rest = 6;         // DOES NOT COMPILE
        // giraffe = new Animal();  // DOES NOT COMPILE
        giraffe.setName("Ömer");
        // AnimalTest animal = new AnimalTest().setName("Ömer"); // DOES NOT COMPILE


    }
}

class AnimalTest{
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
