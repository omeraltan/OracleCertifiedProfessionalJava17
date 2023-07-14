package org.ocp.studies.chapter04;

public class Test10_Understanding_Equality {
    public static void main(String[] args) {
        var one = new StringBuilder();
        var two = new StringBuilder();
        var three = one.append("a");
        System.out.println(one == two);         // false
        System.out.println(one == three);       // true

        var x = "Hello World";
        var z = " Hello World".trim();
        System.out.println(x.equals(z));        // true

        var name = "a";
        var builder = new StringBuilder("a");
        // System.out.println(name == builder); // DOES NOT COMPILE

        StringBuilder name1 = new StringBuilder("a");
        var builder1 = name1;
        System.out.println(name1 == builder1); // DOES NOT COMPILE

    }
}
