package org.ocp.studies.chapter03;

public class Test04_Switch_Example {
    public static void main(String[] args) {
        new Test04_Switch_Example().printSeason(1);
    }

    public void printSeason(int month) {
        switch(month) {
                case 1, 2, 3:       System.out.print("Winter");
                case 4, 5, 6:       System.out.print("Spring");
                default:            System.out.print("Unknown");
                case 7, 8, 9:       System.out.print("Summer");
                case 10, 11, 12:    System.out.print("Fall");
        }
    }

}
