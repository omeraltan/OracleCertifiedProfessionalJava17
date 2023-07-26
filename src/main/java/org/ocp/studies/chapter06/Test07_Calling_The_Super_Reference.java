package org.ocp.studies.chapter06;

public class Test07_Calling_The_Super_Reference {
    public static void main(String[] args) {
        var croco = new Crocodile();
        System.out.println(croco.getSpeed());
        System.out.println(croco.getSpeedSuperClass());
    }
}

class Reptile {
    protected int speed = 10;
}

class Crocodile extends Reptile{
    protected int speed = 20;
    public int getSpeed(){
        return speed;
    }
    public int getSpeedSuperClass(){
        return super.speed;
    }
}
