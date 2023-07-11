package org.ocp.studies.chapter03;

public class Test09_Switch_Example {
    public static void main(String[] args) {
        int fish = 3;
        int length = 12;
        var name = switch(fish)
        {
            case 1 -> "Goldfish";
            case 2 -> {yield "Trout";}
            case 3 -> {
                if(length > 10){
                    yield "Blobfish";
                }
                else{
                    yield "Green";
                }
            }
            default -> "Swordfish";
        };
        System.out.println(name);
    }
}
