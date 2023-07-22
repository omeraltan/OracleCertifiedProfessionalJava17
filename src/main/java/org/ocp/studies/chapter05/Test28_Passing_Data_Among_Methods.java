package org.ocp.studies.chapter05;

public class Test28_Passing_Data_Among_Methods {
    public static void main(String[] args) {
        int quack = 5;
        Integer quackquack = Integer.valueOf(quack); // Convert int to Integer
        int quackquackquack = quackquack.intValue(); // Convert Integer to int

        Integer quackquack2  = 5;                     // Autoboxing
        int quackquackquack2 = quackquack2;           // Unboxing

        Short tail = 8;                             // Autoboxing
        Character p = Character.valueOf('p');
        char paw = p;                               // Unboxing
        Boolean nose = true;                        // Autoboxing
        Integer e = Integer.valueOf(9);
        long ears = e;                              // Unboxing, then implicit casting

        // Long badGorilla = 8; // DOES NOT COMPILE
        Long badGorilla = 8L;   //

        // What do you think happens if you try to unbox a null?

        Character elephant = null;
        char badElephant = elephant; // NullPointerException



    }
}
