package org.ocp.studies.chapter03;

// Starting with Java 14, case values can now be combined:

public class Test01_Switch_Example {
    public static void main(String[] args) {

        String animal = "Colt";

        switch (animal){
            case "Horse", "Colt" :
                System.out.println("This is a Horse or Colt.");
                break;
            case "Dog" :
                System.out.println("This is a Dog.");
                break;
            case "Cat" :
                System.out.println("This is a Cat.");
                break;
        }

        System.out.println("------------------------------");

        // Prior to Java 14, the equivalent code would have been the following:

        switch (animal){
            case "Horse" : case "Colt" :
                System.out.println("This is a Horse or Colt.");
                break;
            case "Dog" :
                System.out.println("This is a Dog.");
                break;
            case "Cat" :
                System.out.println("This is a Cat.");
                break;
        }

    }
}
