package org.ocp.studies.chapter06;

public class Test05_Accessing_The_This_Reference {

    private String color = null;

    public void setColor(String color) {
        color = color;
    }

    public static void main(String... unused) {
        var f = new Test05_Accessing_The_This_Reference();
        f.setColor("PINK");
        System.out.println(f.color); // null
    }
}
