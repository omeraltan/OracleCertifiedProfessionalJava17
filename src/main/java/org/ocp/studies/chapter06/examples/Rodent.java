package org.ocp.studies.chapter06.examples;

public class Rodent {
    public Rodent(Integer x) {}
    protected static Number chew() throws Exception {
        System.out.println("Rodent is chewing");
        return 1;
    }
}

class Beaver extends Rodent {

    public Beaver() {
        super(1);
    }

    public static Number chew() throws RuntimeException {
        System.out.println("Beaver is chewing on wood");
        return 2;
    }
}
