package org.ocp.studies.chapter03;

public class Test05_Switch_Example {
    final int getCookies() {
        return 4;
    }
    void feedAnimals() {
        final int bananas = 1;
        int apples = 2;
        int numberOfAnimals = 3;
        final int cookies = getCookies();
        switch(numberOfAnimals) {
            case bananas:
            // case apples:        // DOES NOT COMPILE
            // case getCookies():  // DOES NOT COMPILE
            // case cookies :      // DOES NOT COMPILE
            case 3 * 5 :
        }
    }

    public static void main(String[] args) {
        new Test05_Switch_Example().feedAnimals();
    }
}
