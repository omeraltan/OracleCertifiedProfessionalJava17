package org.ocp.studies.chapter06;

public class Test15_Default_Constructor_Tips {

}

class Mammal2{
    Mammal2(int age){

    }
}
class Seal extends Mammal2 {
    public Seal(){
        super(6);
    }
}       // DOES NOT COMPILE

/*class Elephant extends Mammal2{
    public Elephant() {}            // DOES NOT COMPILE
}*/
