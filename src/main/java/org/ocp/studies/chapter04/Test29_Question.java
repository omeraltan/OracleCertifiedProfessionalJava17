package org.ocp.studies.chapter04;

// Which of these array declarations are not legal? (Choose all that apply.)
public class Test29_Question {
    public static void main(String[] args) {
        int[][] scores = new int[5][];                      // legal
        Object[][][] cubbies = new Object[3][0][5];         // legal
        //String beans[] = new beans[6];                      // not legal
        java.util.Date[] dates[] = new java.util.Date[2][]; // legal
        //int[][] types = new int[];                          // not legal
        // int[][] java = new int[][];                         // not legal
    }
}
