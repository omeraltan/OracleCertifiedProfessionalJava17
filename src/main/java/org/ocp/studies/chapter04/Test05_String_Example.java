package org.ocp.studies.chapter04;

public class Test05_String_Example {
    public static void main(String[] args) {
        System.out.println("----------trim()----------");
        System.out.println("abc ".trim() + "def");
        System.out.println("abc ".trim() + " def ".trim() + "ghı");

        System.out.println("----------strip()----------");
        System.out.println(" abc ".strip());        // abc
        System.out.println("\t a b c\n".strip());   // a b c

        System.out.println("----------stripLeading()----------");
        String text = " abc\t ";
        System.out.println(text.trim().length());           // 3
        System.out.println(text.strip().length());          // 3
        System.out.println(text.stripLeading().length());   // 5 First, remember that \t is a single character.
        System.out.println(text.stripTrailing().length());  // 4


    }
}
