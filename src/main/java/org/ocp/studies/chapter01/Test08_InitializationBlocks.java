package org.ocp.studies.chapter01;

public class Test08_InitializationBlocks {
    public Test08_InitializationBlocks() {
        number = 5;
    }

    public static void main(String[] args) {
        Test08_InitializationBlocks test = new Test08_InitializationBlocks();
        System.out.println(test.number);
    }

    private int number = 3;
    { number = 4; }
}
