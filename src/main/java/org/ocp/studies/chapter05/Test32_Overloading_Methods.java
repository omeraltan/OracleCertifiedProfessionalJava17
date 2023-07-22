package org.ocp.studies.chapter05;

public class Test32_Overloading_Methods {
    public void fly(String s) {
        System.out.print("string");
    }
    public void fly(Object o) {
        System.out.print("object");
    }

    public static void main(String[] args) {
        var p = new Test32_Overloading_Methods();
        p.fly("test");
        System.out.print("-");
        p.fly(56);
    }
}
