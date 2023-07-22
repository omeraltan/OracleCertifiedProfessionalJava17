package org.ocp.studies.chapter05;

public class Test26_Passing_Data_Among_Methods {
    public static void main(String[] args) {
        var name = new StringBuilder("Webby");
        speak(name);
        System.out.print(name); // WebbyGeorgette
    }

    public static void speak(StringBuilder s) {
        s.append("Georgette");
    }
}
