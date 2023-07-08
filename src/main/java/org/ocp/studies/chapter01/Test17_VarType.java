package org.ocp.studies.chapter01;

public class Test17_VarType {
    public void reassignment(){
        var number = 7;
        number = 4;
        // number = "five"; // DOES NOT COMPILE
    }

    public void doesThisCompile(boolean check) {
        // var question; // DOES NOT COMPILE
        // question = 1; // DOES NOT COMPILE
        // var answer;

        if (check) {
            // answer = 2; // DOES NOT COMPILE
        }else {
            // answer = 3; // DOES NOT COMPILE
        }
        // System.out.println(answer);
    }

    public void twoTypes() {
        // int a, var b = 3; // DOES NOT COMPILE
        // var n = null; // DOES NOT COMPILE
    }
}
