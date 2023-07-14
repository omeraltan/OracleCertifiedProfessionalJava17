package org.ocp.studies.chapter04;

public class Test08_String_Example {
    public static void main(String[] args) {
        var start ="AniMal   ";
        var trimmed = start.trim();
        var lowercase = trimmed.toLowerCase();
        var result = lowercase.replace('a', 'A');
        System.out.println(result);

        String result2 = "AniMaL ".trim().toLowerCase().replace('a', 'A');
        System.out.println(result2);

        String a = "abc";
        String b = a.toUpperCase();
        b = b.replace("B", "2").replace('C', '3');
        System.out.println("a=" + a);
        System.out.println("b=" + b);
    }
}
