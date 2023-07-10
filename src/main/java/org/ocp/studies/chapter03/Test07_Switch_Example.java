package org.ocp.studies.chapter03;

public class Test07_Switch_Example {
    public static void main(String[] args) {
        String test = new Test07_Switch_Example().printSeason(3);
        System.out.println(test);
    }

    public String printSeason(int month) {
        var result = switch(month)
            {
                case 1, 2, 3 -> "Winter";
                case 4, 5, 6 -> "Spring";
                case 7, 8, 9 -> "Summer";
                case 10, 11, 12 -> "Fall";
                default -> "Invalid";
            };
        return result;
    }
}
