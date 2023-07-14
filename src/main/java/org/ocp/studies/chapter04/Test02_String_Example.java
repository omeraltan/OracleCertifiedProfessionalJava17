package org.ocp.studies.chapter04;

public class Test02_String_Example {
    public static void main(String[] args) {

        //    a   n   i   m   a   l   s
        //    0   1   2   3   4   5   6

        // length() method example :

        var name = "animals";
        System.out.println("Length value    : " + name.length());
        System.out.println("-------------charAt()------------");
        // charAt() method example :

        var name1 = "animals";
        System.out.println("Result          : " + name1.charAt(3));  // m
        System.out.println("Result          : " + name1.charAt(6) ); // s
        //System.out.println("Result          : " + name1.charAt(7) ); // exception String index out of range: 7
        System.out.println("-------------indexOf()------------");

        // indexOf() method example :

        var name2 = "animals";
        System.out.println("Result          : " + name2.indexOf('a') );                     // 0
        System.out.println("Result          : " + name2.indexOf("al") );                    // 4
        System.out.println("Result          : " + name2.indexOf('a', 4) );     // 4
        System.out.println("Result          : " + name2.indexOf("al", 5) );    // -1
        // Unlike charAt(), the indexOf() method doesn’t throw an exception if it can’t find a match, instead returning –1
    }
}
