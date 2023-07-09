package org.ocp.studies.chapter01;

public class Test20_DefiningTextBlocks {
    private int numForks;
    public static void main(String[] args) {
        int numKnives;
        System.out.print("""
            "# forks = " + numForks +
            " # knives = " + numKnives +
            # cups = 0""");
        System.out.println("---------------");
        var blocky = """
            squirrel \s
            pigeon \
            termite""";
        System.out.print(blocky);
    }
}
