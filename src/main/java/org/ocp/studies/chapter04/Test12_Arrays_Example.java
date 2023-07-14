package org.ocp.studies.chapter04;

import java.util.Arrays;

public class Test12_Arrays_Example {
    public static void main(String[] args) {
        int[] numbers = new int[3];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] += 42;
        }
        int[] moreNumbers = new int[]{42,55,99};

        for (int num : numbers) {
            System.out.print(num + " ");
        }
        System.out.println();
        for (int num : moreNumbers) {
            System.out.print(num + " ");
        }
        System.out.println();
        int[] moreNumbers2 = {42,55,99};
        System.out.println("-------------------");
        int[] numAnimals;
        int [] numAnimals2;
        int []numAnimals3;
        int numAnimals4[];
        int numAnimals5 [];

        System.out.println("--------------------");
        int[] ids, types;
        ids = new int[]{42,32};
        types = new int[]{42,32,34,56};
        System.out.println(Arrays.stream(ids).count());
        System.out.println(Arrays.stream(types).count());

        int ids2[], types2;
        ids2 = new int[]{42,32};
        types2 = 56;
        System.out.println(Arrays.stream(ids2).count());
        System.out.println(types2);
    }
}
