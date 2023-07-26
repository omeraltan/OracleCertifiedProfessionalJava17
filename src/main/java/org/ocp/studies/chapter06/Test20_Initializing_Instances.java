package org.ocp.studies.chapter06;

// What the following application outputs:
public class Test20_Initializing_Instances {
    private String name = "BestZoo";
    { System.out.print(name + "-"); }
    private static int COUNT = 0;
    static { System.out.print(COUNT + "-"); }
    static { COUNT += 10; System.out.print(COUNT + "-"); }
    public Test20_Initializing_Instances() {
        System.out.print("z-");
    }

    public static void main(String[] args) {
        new Test20_Initializing_Instances();
    }
}

    // 0-10-BestZoo-z-
