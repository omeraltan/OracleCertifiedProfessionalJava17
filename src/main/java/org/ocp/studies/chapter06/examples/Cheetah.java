package org.ocp.studies.chapter06.examples;

class Speedster {
    int numSpots;
}
public class Cheetah extends Speedster{
    int numSpots;

    public Cheetah(int numSpots){
        // INSERT CODE HERE
        super.numSpots = numSpots;
    }

    public static void main(String[] args) {
        Speedster s = new Cheetah(50);
        System.out.println(s.numSpots);
    }
}
