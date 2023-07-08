package org.ocp.studies.chapter01;

public class Test15_UninitializedLocalVariables {

    public void findAnswer(boolean check) {
        int answer;
        int otherAnswer;
        int onlyOneBranch;

        if (check) {
            onlyOneBranch = 1;
            answer = 1;
        } else {
            answer = 2;
        }
        System.out.println(answer);
        //System.out.println(onlyOneBranch); // DOES NOT COMPILE
    }
}
