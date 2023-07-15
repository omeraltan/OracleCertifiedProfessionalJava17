package org.ocp.studies.chapter04;

// What is the result of the following code?
public class Test31_Question {
    public static void main(String[] args) {
        var sb = new StringBuilder();
        sb.append("aaa").insert(1, "bb").insert(4, "ccc");
        System.out.println(sb);

        // a    a   a
        // 0    1   2

        // a    b   b   a   a
        // 0    1   2   3   4

        // a    b   b   a   c   c   c   a
        // 0    1   2   3   4   5   6   7

    }
}
