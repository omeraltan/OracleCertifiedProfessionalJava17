package org.ocp.studies.chapter06;

public class Test19__Initializing_Final_Fields {
    private final int volume;
    private final String name;
    public Test19__Initializing_Final_Fields(){
        this.name = "Empty House";              // Constructor assignment
    }
    {
        volume = 10;                            // Instance initializer assignment
    }
}
