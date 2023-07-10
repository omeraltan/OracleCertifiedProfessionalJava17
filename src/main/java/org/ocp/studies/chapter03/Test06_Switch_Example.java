package org.ocp.studies.chapter03;

public class Test06_Switch_Example {
    public static void main(String[] args) {
        new Test06_Switch_Example().printDayOfWeek(3);
    }

    public void printDayOfWeek(int day) {
        var result = switch(day)
        {
            case 0 -> "Sunday";
            case 1 -> "Monday";
            case 2 -> "Tuesday";
            case 3 -> "Wednesday";
            case 4 -> "Thursday";
            case 5 -> "Friday";
            case 6 -> "Saturday";
            default -> "Invalid value";
        };
        System.out.print(result);
    }
}
