package org.ocp.studies.chapter06;

public class Test18_Initializing_Final_Fields {
    private final int volume;
    private final String name = "The Mouse House";  // Declaration assignment
    {
        volume = 10;                                // Instance initializer assignment
    }
}
