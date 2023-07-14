package org.ocp.studies.chapter04;

public class Test04_String_Example {
    public static void main(String[] args) {

        var name = "animals";
        System.out.println(name.toUpperCase());
        System.out.println("Abc123".toUpperCase());

        System.out.println("abc".equals("ABC"));    // false
        System.out.println("ABC".equals("ABC"));    // true
        System.out.println("abc".equalsIgnoreCase("ABC"));  // true

        System.out.println("abc".startsWith("a"));  // true
        System.out.println("abc".startsWith("A"));  //  false
        // System.out.println("abc".startsWith('A')); // compile time error

        System.out.println("abc".endsWith("c"));    // true
        System.out.println("abc".endsWith("a"));    // false

        System.out.println("abc".contains("b"));    // true
        System.out.println("abc".contains("B"));    // false
        System.out.println("abcb".contains("b"));   // true

        System.out.println("abcabc".replace('a','A'));   // AbcAbc
        System.out.println("abcabc".replace("a","A"));  // AbcAbc
        System.out.println("abcabc".replace("abc","ABx"));
    }
}
