package org.ocp.studies.chapter04;
// What is included in the output of the following code? (Choose all that apply.)
public class Test38_Question {
    public static void main(String[] args) {
        var base = "ewe\nsheep\\t";
        System.out.println("Base : \n" + base);
        System.out.println("----------------");
        int length = base.length();
        int indent = base.indent(2).length();
        System.out.println("indent : \n" + base.indent(2));
        System.out.println("----------------");
        int translate = base.translateEscapes().length();
        System.out.println("translate : \n" + base.translateEscapes());
        var formatted = "%s %S %S".formatted(length,indent,translate);
        System.out.format(formatted);

        /*
            A. 10       true
            B. 11       true
            C. 12
            D. 13
            E. 14
            F. 15
            G. 16       true
         */
    }
}
