package org.ocp.studies.chapter05;

public class Test31_Overloading_Methods {
    public void fly(int numMiles) {}
    public void fly(short numFeet) {}
    public boolean fly() { return false; }
    public void fly(int numMiles, short numFeet) {}
    void fly(short numFeet, int numMiles) throws Exception {}

    // public int fly(int numMiles) { return 1; } // DOES NOT COMPILE

    // public static void fly(int numMiles) {}    // DOES NOT COMPILE

    // public void fly(int numKilometers) {}      // DOES NOT COMPILE
}
