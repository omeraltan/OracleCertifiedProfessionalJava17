package org.ocp.studies.chapter01;

// Each primitive type has a wrapper class, which is an object type that corresponds to the primitive.

public class Test11_WrapperClasses {

    // boolean     -->      Boolean
    // byte        -->      Byte
    // short       -->      Short
    // int         -->      Integer
    // long        -->      Long
    // float       -->      Float
    // double      -->      Double
    // char        -->      Character

    public static void main(String[] args) {
        int primitive = Integer.parseInt("123");
        Integer wrapper = Integer.parseInt("123");

        int primitive2 = Integer.valueOf("123");
        Integer wrapper2 = Integer.valueOf("123");

        System.out.println("Primitive : " + primitive);
        System.out.println("Wrapper   : " + wrapper);

        System.out.println("Primitive2 : " + primitive2);
        System.out.println("Wrapper2   : " + wrapper2);

        Double apple = Double.valueOf("200.99");
        System.out.println(apple.byteValue());
        System.out.println(apple.shortValue());
        System.out.println(apple.intValue());
        System.out.println(apple.longValue());
        System.out.println(apple.doubleValue());

        Integer Integervalue = Integer.MAX_VALUE;

        System.out.println("Integer Max Value : " + Integervalue);

        Integer remaxValue = Integervalue.max(1, 100);
        System.out.println("Integer Remax Value : " + remaxValue);

        Integer reminValue = Integer.min(1, 100);
        System.out.println("Integer Remin Value : " + reminValue);

        Integer sumValue = Integer.sum(1, 100);

        System.out.println("Integer Sum Value : " + sumValue);

    }
}
