package org.ocp.studies.chapter05;

public class Test35_Overloading_Methods {
    public static String glide(String s) {
        return "1";
    }
    public static String glide(String... s) {
        return "2";
    }
    public static String glide(Object o) {
        return "3";
    }
    public static String glide(String s, String t) {
        return "4";
    }

    public static void main(String[] args) {
        System.out.print(glide("a"));
        System.out.print(glide("a","b"));
        System.out.print(glide("a","b","c"));

        final var a = new Test();
        a.name = "Ömer";
        //a = new Test();
    }

}

class Test{
    public static String name;


}
