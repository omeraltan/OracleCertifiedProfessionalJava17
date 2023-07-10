package org.ocp.studies.chapter03;

public class Test03_Switch_Example {
    public static void main(String[] args) {
        new Test03_Switch_Example().printDayOfWeek(7);
    }

    public void printDayOfWeek(int day) {
        switch (day) {
            case 0:
                System.out.print("Sunday");
                break;
            case 1:
                System.out.print("Monday");
                break;
            case 2:
                System.out.print("Tuesday");
                break;
            case 3:
                System.out.print("Wednesday");
                break;
            case 4:
                System.out.print("Thursday");
                break;
            case 5:
                System.out.print("Friday");
                break;
            case 6:
                System.out.print("Saturday");
                break;
            default:
                System.out.print("Invalid value");
                break;
        }
    }
}
