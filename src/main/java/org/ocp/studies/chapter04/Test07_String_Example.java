package org.ocp.studies.chapter04;

public class Test07_String_Example {
    public static void main(String[] args) {
        System.out.println("---------format(), formatted()---------");
        var name = "Kate";
        var orderId = 5;
        System.out.println("Hello " + name + ", order " + orderId + " is ready");
        System.out.println(String.format("Hello %s, order %d is ready", name, orderId));
        System.out.println("Hello %s, order %d is ready".formatted(name, orderId));

        //      Symbol              Description
        //      ------              -----------
        //      %s                  Applies to any type, commonly String values
        //      %d                  Applies to integer values like int and long
        //      %f                  Applies to floating-point values like float and double
        //      %n                  Inserts a line break using the system-dependent line separator

        var name1 = "James";
        var score1 = 90.25;
        var total1 = 100;

        System.out.println("%s:%n Score: %f out of %d".formatted(name1, score1, total1));


        // var str = "Food: %d tons".formatted(2.0); // IllegalFormatConversionException
        // System.out.println(str);

        System.out.println("---------Using format() with Flags---------");

        var pi = 3.14159265359;
        System.out.format("[%f]",pi);
        System.out.println();
        System.out.format("[%12.8f]",pi);
        System.out.println();
        System.out.format("[%012f]",pi);
        System.out.println();
        System.out.format("[%12.2f]",pi);
        System.out.println();
        System.out.format("[%.3f]",pi);
    }
}
