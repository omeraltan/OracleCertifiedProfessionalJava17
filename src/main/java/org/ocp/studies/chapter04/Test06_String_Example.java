package org.ocp.studies.chapter04;

public class Test06_String_Example {
    public static void main(String[] args) {
        System.out.println("----------indent()----------");
        var block = """
            a
             b
            c""";
        var concat = " a\n" + "  b\n" + " c";
        System.out.println(block.length());                 // 6
        System.out.println(concat.length());                // 9
        System.out.println(block.indent(1).length());    // 10
        System.out.println(concat.indent(-1).length());  // 7
        System.out.println(concat.indent(-4).length());  // 6
        System.out.println(concat.stripIndent().length());  // 6

        System.out.println("----------translateEscapes()----------");
        var str = "1\t2";
        System.out.println(str);                            // 1    2
        var str1 = "1\\t2";
        System.out.println(str1);                           // 1\t2
        System.out.println(str.translateEscapes());         // 1    2

        System.out.println("----------isEmpty()----------");
        System.out.println(" ".isEmpty());                  // false : prints false because the String is not empty
        System.out.println("".isEmpty());                   // true  : prints true because this time, there are no characters in the String

        System.out.println("----------isBlank()----------");
        System.out.println(" ".isBlank());                  // true  : print true because there are no characters other than whitespace present
        System.out.println("".isBlank());                   // true  : print true because there are no characters other than whitespace present

    }
}
