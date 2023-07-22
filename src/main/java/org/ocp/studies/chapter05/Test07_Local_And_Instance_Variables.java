package org.ocp.studies.chapter05;

public class Test07_Local_And_Instance_Variables {
    int hunger = 4;

    public int feedZooAnimals() {
        int snack = 10;             // Local variable

        if(snack > 4)
        {
            long dinnerTime = snack++;
            hunger--;
        }
        return snack;
    }
}
