package org.ocp.studies.chapter05;

public class Test29_Passing_Data_Among_Methods {
    public void climb(long t) {}
    public void swing(Integer u) {}
    public void jump(int v) {}

    public static void main(String[] args) {
        var c = new Test29_Passing_Data_Among_Methods();
        c.climb(123);
        c.swing(123);
        // c.jump(123L); // DOES NOT COMPILE
    }
}
