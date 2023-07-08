package org.ocp.studies.chapter01;

public class Test12_DefiningTextBlocks {

    String eyeTest = "\"Java Study Guide\"\n     by Scott & Jeanne";

    String pyramid = """
          *
         * *
        * * *
        """;


    public static void main(String[] args) {
        System.out.println(new Test12_DefiningTextBlocks().eyeTest);
        System.out.println("-------------------------------------");
        System.out.println(new Test12_DefiningTextBlocks().pyramid);
    }

}
