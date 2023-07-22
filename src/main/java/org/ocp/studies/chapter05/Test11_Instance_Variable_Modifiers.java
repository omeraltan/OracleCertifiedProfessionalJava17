package org.ocp.studies.chapter05;

public class Test11_Instance_Variable_Modifiers {

    //  Modifier            Description
    //  --------            -----------

    //  final               Specifies that the instance variable must be initialized with each instance of the class exactly once

    //  volatile            Instructs the JVM that the value in this variable may be modified by other threads

    //  transient           Used to indicate that an instance variable should not be serialized with the class


    final int age = 10;
    final int fishEaten;
    final String name;
    { fishEaten = 10; }
    public Test11_Instance_Variable_Modifiers() {
        name = "Robert";
    }

}
