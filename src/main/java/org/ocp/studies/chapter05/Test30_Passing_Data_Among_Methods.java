package org.ocp.studies.chapter05;

public class Test30_Passing_Data_Among_Methods {
    public void rest(Integer x) {
        System.out.print("long");
    }

    public void rest2(Long x) {
        System.out.print("long");
    }

    public static void main(String[] args) {
        var g = new Test30_Passing_Data_Among_Methods();
        g.rest(8);
        // g.rest2(8);     // DOES NOT COMPILE
        g.rest2(8L);
        g.rest2(Long.valueOf(8));
        // g.rest2(8);     // DOES NOT COMPILE
    }
}
