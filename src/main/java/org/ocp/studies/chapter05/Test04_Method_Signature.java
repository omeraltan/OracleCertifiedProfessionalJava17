package org.ocp.studies.chapter05;

public class Test04_Method_Signature {
    public void visitZoo(String name, int waitTime) {}
    // public void visitZoo(String attraction, int rainFall) {} // DOES NOT COMPILE

    public void visitZoo2(String name, int waitTime) {}
    public void visitZoo2(int rainFall, String attraction) {}
}
