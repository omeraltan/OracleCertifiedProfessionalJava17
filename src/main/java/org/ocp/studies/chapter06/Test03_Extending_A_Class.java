package org.ocp.studies.chapter06;

 class Extending_A_Class {
    private int age;
    protected String name;
    public int getAge() {
        return age;
    }
    public void setAge(int newAge) {
        age = newAge;
    }
 }
public class Test03_Extending_A_Class extends Extending_A_Class{

    protected void setProperties(int age, String n) {
        setAge(age);
        name = n;
    }

    public void roar() {
        System.out.print(name + ", age " + getAge() + ", says: Roar!");
        // System.out.print("Lions age: " + age); // DOES NOT COMPILE
    }

    public static void main(String[] args) {
        var test = new Test03_Extending_A_Class();
        test.setProperties(3, "kion");
        test.roar();
    }
}
