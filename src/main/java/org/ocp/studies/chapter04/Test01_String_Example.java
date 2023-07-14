package org.ocp.studies.chapter04;

public class Test01_String_Example {
    public static void main(String[] args) {
        String name = """
            Fluffy""";
        System.out.println(name);

        System.out.println(1 + 2);          // 3
        System.out.println("a" + "b");      // ab
        System.out.println("a" + "b" + 3);  // ab3
        System.out.println(1 + 2 + "c");    // 3c
        System.out.println("c" + 1 + 2);    // c12
        System.out.println("c" + null);     // cnull

        var s ="1";
        s +="2";
        s +=3;
        System.out.println(s);


    }
}
