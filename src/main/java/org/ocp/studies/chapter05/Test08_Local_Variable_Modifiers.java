package org.ocp.studies.chapter05;

public class Test08_Local_Variable_Modifiers {
    public void zooAnimalCheckup(boolean isWeekend) { final int rest;
        if(isWeekend)
            rest = 5;
        else rest = 20;
        System.out.print(rest);
        final var giraffe = new Animal();
        final int[] friends = new int[5];
        // rest = 10;               // DOES NOT COMPILE
        // giraffe = new Animal();  // DOES NOT COMPILE
        // friends = null;          // DOES NOT COMPILE
    }
}

class Animal{

}
