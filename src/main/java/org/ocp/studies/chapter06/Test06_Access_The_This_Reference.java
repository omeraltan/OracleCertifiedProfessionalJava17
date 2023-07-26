package org.ocp.studies.chapter06;

public class Test06_Access_The_This_Reference {
    private String color;
    private int height;
    private int length;

    public void setData(int length, int theHeight){
        length = this.length;
        height = theHeight;
        this.color = "white";
    }

    public static void main(String[] args) {
        var b = new Test06_Access_The_This_Reference();
        b.setData(1,2);
        System.out.println(b.length + " " + b.height + " " + b.color);
    }
}
