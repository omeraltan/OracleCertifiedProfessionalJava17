package org.ocp.studies.chapter04;

import java.util.Arrays;
public class Test16_Arrays_Example {
    public static void main(String[] args) {
        System.out.println(Arrays.mismatch(new int[] {1}, new int[] {1}));              // -1
        System.out.println(Arrays.mismatch(new String[] {"a"}, new String[] {"A"}));    // 0
        System.out.println(Arrays.mismatch(new int[] {1, 2}, new int[] {1}));           // 1

        // Method                When arrays contain the same data               When arrays are different
        // ------                ---------------------------------               -------------------------
        // equals()              true                                            false
        // compare()             0                                               Positive or negative number
        // mismatch()            -1                                              Zero or positive index
    }
}
