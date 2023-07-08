package org.ocp.studies.chapter01;

public class Test14_IdentifyingIdentifiers {

    // Identifiers must begin with a letter, a currency symbol, or a _ symbol. Currency symbols include dollar ($), yuan (¥), euro (€), and so on.
    // Identifiers can include numbers but not start with them.
    // A single underscore _ is not allowed as an identifier.
    //You cannot use the same name as a Java reserved word. A reserved word is a special word that Java has held aside so that you are not allowed to use it.

    // For Example :

    static int a = 1;
    static int _a = 1;
    static int $ = 1;
    static int € = 1;
    static int €1 = 1;
    static int ₺1 = 1;
    static int ¥1 = 1;

    // The following examples are legal:

    long okidentifier;
    float $OK2Identifier;
    boolean _alsoOK1d3ntifi3r;
    char __SStillOkbutKnotsonice$;

    // These examples are not legal:

    // int 3DPointClass;       // identifiers cannot begin with a number
    // byte hollywood@vine;    // @ is not a letter, digit, $ or _
    // String *$coffee;        // * is not a letter, digit, $ or _
    // double public;          // public is a reserved word
    // short _;                // a single underscore is not allowed

    public static void main(String[] args) {
        System.out.println("Value a  : " + a);
        System.out.println("Value _a : " + _a);
        System.out.println("Value $  : " + $);
        System.out.println("Value €  : " + €);
        System.out.println("Value €1 : " + €1);
        System.out.println("Value ₺1 : " + ₺1);
        System.out.println("Value ¥1 : " + ¥1);
    }

}
