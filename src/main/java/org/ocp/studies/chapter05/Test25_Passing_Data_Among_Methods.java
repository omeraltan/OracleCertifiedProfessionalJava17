package org.ocp.studies.chapter05;

public class Test25_Passing_Data_Among_Methods {
    public static void main(String[] args) {
        String name = "Webby";
        speak(name);
        System.out.print(name);
    }

    public static void speak(String name) {
        name = "Georgette"; }
}
