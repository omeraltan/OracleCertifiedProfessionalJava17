package org.ocp.studies.chapter04;
// Which of the following return 5 when run independently? (Choose all that apply.)
public class Test33_Question {
    public static void main(String[] args) {
        var string = "12345";
        var builder = new StringBuilder("12345");

        System.out.println(builder.charAt(4));                                        // 5
        System.out.println(builder.replace(2,4,"6").charAt(3));         // 5
        System.out.println(builder.replace(2,5,"6").charAt(2));         // 6
        System.out.println(string.charAt(5));                                         // StringIndexOutOfBoundsException
        // System.out.println(string.length);                                         // not legal length method -> length()

    }
}
