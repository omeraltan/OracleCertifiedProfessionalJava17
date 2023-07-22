package org.ocp.studies.chapter05;

public class Test17_Static_Example {
    public static int count;
    public static void addGorilla(){count++;}
    public void babyGorilla(){count++;}
    public void announceBabies(){
        addGorilla();
        babyGorilla();
    }

    public static void announceBabiesToEveryone(){
        addGorilla();
        // babyGorilla();  // DOES NOT COMPILE
    }

    public int total;
    // public static double average = total / count;   // DOES NOT COMPILE
}
