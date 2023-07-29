package org.ocp.studies.chapter06.examples;

class Bird2 {
    int feathers = 0;
    Bird2(int x) { this.feathers = x; }
    Bird2 fly() {
        return new Bird2(1);
    }
}

class Parrot extends Bird2 {
    protected Parrot(int y) { super(y); }
    protected Parrot fly() {
        return new Parrot(2);
    }
}

public class Macaw extends Parrot{
    public Macaw(int z) { super(z); }
    public Macaw fly() {
        return new Macaw(3);
    }

    public static void main(String[] args) {
        Bird2 p = new Macaw(4);
        System.out.print(((Parrot)p.fly()).feathers);
    }
}
