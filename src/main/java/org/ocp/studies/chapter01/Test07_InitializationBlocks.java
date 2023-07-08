package org.ocp.studies.chapter01;

// Fields and instance initializer blocks are run in the order in which they appear in the file.
// The constructor runs after all fields and instance initializer blocks have run.

public class Test07_InitializationBlocks {

    private String name = "Fluffy";
    { System.out.println("setting field"); }
    public Test07_InitializationBlocks(){
        name = "Tiny";
        System.out.println("setting constructor");
    }

    public static void main(String[] args) {
        Test07_InitializationBlocks test = new Test07_InitializationBlocks();
        System.out.println(test.name);
    }

}
