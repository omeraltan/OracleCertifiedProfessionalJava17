package org.ocp.studies.chapter01;

public class Test05_Constructor {
    int numEggs = 12;
    String name;

    public Test05_Constructor() {
        name = "Duke";
    }

    public static void main(String[] args) {
        System.out.println(new Test05_Constructor().name);
    }
}
