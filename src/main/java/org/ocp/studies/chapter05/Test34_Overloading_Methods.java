package org.ocp.studies.chapter05;

public class Test34_Overloading_Methods {
    public void fly(int i) {
        System.out.print("int");
    }
    public void fly(Integer I){
        System.out.print("Integer");
    }
    public void fly(long l) {
        System.out.print("long");
    }

    public static void main(String[] args) {
        var p = new Test34_Overloading_Methods();
        p.fly(123);
        System.out.print("-");
        p.fly(123L);
    }
}
