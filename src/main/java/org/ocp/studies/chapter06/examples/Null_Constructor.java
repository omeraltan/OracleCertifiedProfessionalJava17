package org.ocp.studies.chapter06.examples;

class Howler {
    public Howler(long shadow) {
        this((short)1);
    }
    private Howler(int moon) {
        super();
    }
}
class Wolf extends Howler {
    protected Wolf(String stars) {
        super(2L);
    }
    public Wolf() {
        this(null);
    }
}
public class Null_Constructor {
    public static void main(String[] args) {
        new Wolf();
    }
}
