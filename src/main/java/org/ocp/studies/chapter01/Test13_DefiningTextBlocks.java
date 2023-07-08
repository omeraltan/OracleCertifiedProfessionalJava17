package org.ocp.studies.chapter01;

public class Test13_DefiningTextBlocks {

    //  Formatting              Meaning in regular String           Meaning in text block
    //  -----------             -------------------------           ---------------------
    //  \"                      "                                   "
    //  \"""                    n/a - Invalid                       """
    //  \"\"\"                  """                                 """
    //  Space (at end of line)  Space                               Ignored
    //  \s                      Two spaces                          Two spaces
    //  \(at end of line)       n/a - Invalid                       Omits new line on that line

    // Text blocks require a line break after the opening """, making this one invalid.
    // String blocks = """doe""";      // DOES NOT COMPILE

    String block = """
        doe \
        deer""";

    String block2 = """
        doe
        deer""";

    String block3 = """
        doe \n
        deer
        """;

    String block4 = """
        "doe\"\"\"
        \"deer\"""
        """;

    String block5 = """
        "doe \s doe \t doe doe Space
        deer
        """;


    public static void main(String[] args) {
        System.out.println(new Test13_DefiningTextBlocks().block);
        System.out.println("------------------------------------");
        System.out.println(new Test13_DefiningTextBlocks().block2);
        System.out.println("------------------------------------");
        System.out.println(new Test13_DefiningTextBlocks().block3);
        System.out.println("------------------------------------");
        System.out.println("*" + new Test13_DefiningTextBlocks().block4 + "*");
        System.out.println("------------------------------------");
        System.out.println(new Test13_DefiningTextBlocks().block5);
    }
}
