package org.ocp.studies.chapter03;


public class Test11_Switch_Example {
    enum Season {WINTER, SPRING, SUMMER, FALL}
    public static void main(String[] args) {
        String value = new Test11_Switch_Example().getWeather(Season.WINTER);
        System.out.println(value);
    }

    String getWeather(Season value) {
        return switch(value) {
            case WINTER -> "Cold";
            case SPRING -> "Rainy";
            case SUMMER -> "Hot";
            case FALL -> "Warm";
        };
    }
}
