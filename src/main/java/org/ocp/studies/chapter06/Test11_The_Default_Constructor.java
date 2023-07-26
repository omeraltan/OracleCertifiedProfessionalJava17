package org.ocp.studies.chapter06;

public class Test11_The_Default_Constructor {
    public static void main(String[] args) {
        var r1 = new Rabbit1();
        var r2 = new Rabbit2();
        var r3 = new Rabbit3(true);
        // var r4 = new Rabbit4();      DOES NOT COMPILE
    }
}

class Rabbit1 {}
class Rabbit2 {
    public Rabbit2() {}
}
class Rabbit3 {
    public Rabbit3(boolean b) {}
}
class Rabbit4 { private Rabbit4() {}
}
