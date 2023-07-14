package org.ocp.studies.chapter04;

public class Test03_String_Example {
    public static void main(String[] args) {
        //      a    n   i   m   a   l   s
        //      0    1   2   3   4   5   6

        System.out.println("----------substring()----------");
        var name = "animals";
        System.out.println(name.substring(3));          // mals
        System.out.println(name.substring(name.indexOf('m')));    // mals
        System.out.println(name.substring(3,4));                  // m
        System.out.println(name.substring(3,7));                  // mals
        System.out.println(name.substring(3,3));                  // empty string
        System.out.println(name.substring(3,2));                  // exception
        System.out.println(name.substring(3,8));                  // exception
    }
}
