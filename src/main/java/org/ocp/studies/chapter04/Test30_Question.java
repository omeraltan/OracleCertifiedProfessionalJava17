package org.ocp.studies.chapter04;

//  Which of the following are output by this code? (Choose all that apply.)
public class Test30_Question {
    public static void main(String[] args) {
        var s = "Hello";
        var t = new String(s);
        var z = new String(t);
        if ("Hello".equals(s)) System.out.println("one");       // true
        if (t == s) System.out.println("two");
        if (t.intern() == s) System.out.println("three");       // true
        if ("Hello" == s) System.out.println("four");           // true
        if ("Hello".intern() == t) System.out.println("five");
        if (z.intern() == s) System.out.println("six");         // true
    }
}
