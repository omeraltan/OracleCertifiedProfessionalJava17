package org.ocp.studies.chapter06;

class Primate {
    public Primate() {
        System.out.print("Primate-");
    }
}
class Ape extends Primate {
    public Ape(int fur) {
        System.out.print("Ape1-");
    }
    public Ape() {
        System.out.print("Ape2-");
    }
}

public class Test21_Initializing_Instances extends Ape {
    public Test21_Initializing_Instances(){
        super(2);
        System.out.print("Chimpanzee-");
    }

    public static void main(String[] args) {
        new Test21_Initializing_Instances();
    }
}

//  Primate-Ape1-Chimpanzee-
