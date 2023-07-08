package org.ocp.studies.chapter01;

public class Test16_VarType {
    public void whatTypeAmI() {
        var name = "Hello";
        var size = 7;

        System.out.println(name);
        System.out.println(size);
    }

    public static void main(String[] args) {
        new Test16_VarType().whatTypeAmI();
    }
}

// Local variable type inference works with local variables and not instance variables.
class VarKeyword {
    // var tricky = "Hello"; // DOES NOT COMPILE
}
