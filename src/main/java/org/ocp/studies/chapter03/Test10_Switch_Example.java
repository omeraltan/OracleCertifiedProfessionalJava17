package org.ocp.studies.chapter03;

public class Test10_Switch_Example {
    public static void main(String[] args) {
        getValue1();
        getValue2();
    }

    public static void getValue1(){
        int fish = 5;
        int length = 12;
        var name = switch(fish) {
            case 1 -> "Goldfish";
            // case 2 -> {}                            // DOES NOT COMPILE
            // case 3 -> {
                // if(length > 10) yield "Blobfish";
            // }                                       // DOES NOT COMPILE
            default -> "Swordfish";
        };
        System.out.println(name);
    }

    public static void getValue2(){
        int fish = 3;
        int length = 9;
        var name = switch(fish)
        {
            case 1 -> "Goldfish";
            case 2 -> "Fish";
            case 3 ->
            {
                if(length > 10) yield "Blobfish";
                else if (length > 21)  yield "Blob2Fish";
                else yield "Fish";
            }
            default -> "Swordfish";
        };
        System.out.println(name);
    }
}
