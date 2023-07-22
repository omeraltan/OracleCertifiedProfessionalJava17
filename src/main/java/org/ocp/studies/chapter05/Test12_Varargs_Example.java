package org.ocp.studies.chapter05;

public class Test12_Varargs_Example {
    public void walk1(int... steps) {}
    public void walk2(int start, int... steps) {}
    // public void walk3(int... steps, int start) {} // DOES NOT COMPILE
    // public void walk4(int... start, int... steps) {} // DOES NOT COMPILE
}
