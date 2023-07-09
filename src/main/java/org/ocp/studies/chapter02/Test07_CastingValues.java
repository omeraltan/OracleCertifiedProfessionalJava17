package org.ocp.studies.chapter02;

public class Test07_CastingValues {
    public static void main(String[] args) {

        int fur = (int)5;
        int hair = (short) 2;
        String type = (String) "Bird";
        short tail = (short)(4 + 10);
        // long feathers = 10(long); // DOES NOT COMPILE

        // float egg = 2.0 / 9;            // DOES NOT COMPILE
        // int tadpole = (int)5 * 2L;      // DOES NOT COMPILE
        // short frog = 3 - 2.0;           // DOES NOT COMPILE

        // int fish = 1.0;                         // DOES NOT COMPILE
        // short bird = 1921222;                   // DOES NOT COMPILE
        // int mammal = 9f;                        // DOES NOT COMPILE
        // long reptile = 192_301_398_193_810_323; // DOES NOT COMPILE

        int fish = (int)1.0;
        short bird = (short)1921222; // Stored as 20678
        int mammal = (int)9f;
        // long reptile = (long)192301398193810323;    // DOES NOT COMPILE
        long reptile = 192301398193810323L;

        // short mouse = 10;
        // short hamster = 3;
        // short capybara = mouse * hamster; // DOES NOT COMPILE

        short mouse = 10;
        short hamster = 3;
        short capybara = (short)(mouse * hamster);
        System.out.println(capybara);

        short mouse2 = 10;
        short hamster2 = 3;
        // short capybara2 = (short)mouse2 * hamster2;      // DOES NOT COMPILE
        // short capybara = 1 + (short)(mouse * hamster);   // DOES NOT COMPILE

        byte hat = 1;
        byte gloves = 7 * 10;
        short scarf = 5;
        short boots = 2 + 1;

        // short boots = 2 + hat; // DOES NOT COMPILE
        // byte gloves = 7 * 100; // DOES NOT COMPILE
    }
}
