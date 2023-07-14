package org.ocp.studies.chapter04;

public class Test11_String_Pool {
    public static void main(String[] args) {
        System.out.println("-------string pool---------");
        var x = "Hello World";
        var y = "Hello World";
        System.out.println(x == y); // true
        System.out.println("-------string pool---------");
        var x1 = "Hello World";
        var z1 = " Hello World".trim(); // a new String object is created.
        System.out.println(x1 == z1); // false
        System.out.println("-------string pool---------");
        var singleString = "hello world";
        var concat = "hello ";
        concat += "world"; // new Object : +=
        System.out.println(singleString == concat); // false
        System.out.println("-------string pool---------");
        var x2 = "Hello World";
        var y2 = new String("Hello World");
        System.out.println(x2 == y2); // false
        System.out.println("-------string pool intern()---------");
        var name = "Hello World";
        var name2 = new String("Hello World").intern();
        System.out.println(name == name2); // true
        System.out.println("-------string pool intern()---------");
        var first = "rat" + 1;
        var second = "r" + "a" + "t" + "1";
        var third = "r" + "a" + "t" + new String("1");
        System.out.println(first == second);
        System.out.println(first == second.intern());
        System.out.println(first == third);
        System.out.println(first == third.intern());
    }
}
