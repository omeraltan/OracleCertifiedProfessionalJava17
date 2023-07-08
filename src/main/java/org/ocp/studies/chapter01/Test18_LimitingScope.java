package org.ocp.studies.chapter01;

public class Test18_LimitingScope {
    public void eatIfHungry(boolean hungry) {
        if (hungry) {
            int bitesOfCheese = 1;
        }
        // System.out.println(bitesOfCheese); // DOES NOT COMPILE
    }

    public void eatIfHungry2(boolean hungry) {
        if (hungry) {
            int bitesOfCheese = 1;
            {
                var teenyBit = true;
                System.out.println(bitesOfCheese);
            }
        }
        // System.out.println(teenyBit); // DOES NOT COMPILE
    }
}
