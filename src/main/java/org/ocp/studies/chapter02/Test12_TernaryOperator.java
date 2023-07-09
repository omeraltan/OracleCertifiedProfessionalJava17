package org.ocp.studies.chapter02;

public class Test12_TernaryOperator {
    public static void main(String[] args) {
        int owl = 5;
        int food = owl < 2 ? 3 : 4;
        System.out.println(food); // 4

        int food1 = owl < 4 ? owl > 2 ? 3 : 4 : 5;
        int food2 = (owl < 4 ? ((owl > 2) ? 3 : 4) : 5);

        System.out.println("Food1 : " + food1);
        System.out.println("Food2 : " + food2);

        int stripes = 7;
        System.out.println((stripes > 5) ? 21 : "Zebra");
        // int animal = (stripes < 9) ? 3 : "Horse"; // DOES NOT COMPILE

        int sheep = 1;
        int zzz = 1;
        int sleep = zzz<10 ? sheep++ : zzz++;
        System.out.println("Result is " + sheep + "," + zzz); // 2,1

        int sheep1 = 1;
        int zzz1 = 1;
        int sleep1 = sheep1>=10 ? sheep1++ : zzz1++;
        System.out.print("Result is " + sheep1 + "," + zzz1); // 1,2
    }
}
