package org.ocp.studies.chapter04;

import java.util.Arrays;

public class Test14_Arrays_Example {
    public static void main(String[] args) {
        int[] numbers = { 6, 9, 1 };
        Arrays.sort(numbers);
        for (int i = 0; i < numbers.length; i++)
            System.out.print(numbers[i] + " ");
        System.out.println();
        String[] strings = { "10", "9", "100" };
        Arrays.sort(strings);
        for (String s : strings)
            System.out.print(s + " ");
        System.out.println();
        int[] numbers1 = {2,4,6,8};
        System.out.println(Arrays.binarySearch(numbers1, 2)); // 0
        System.out.println(Arrays.binarySearch(numbers1, 4)); // 1
        System.out.println(Arrays.binarySearch(numbers1, 1)); // -1
        System.out.println(Arrays.binarySearch(numbers1, 3)); // -2
        System.out.println(Arrays.binarySearch(numbers1, 9)); // -5
    }
}
