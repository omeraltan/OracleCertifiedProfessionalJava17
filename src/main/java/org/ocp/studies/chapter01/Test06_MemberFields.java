package org.ocp.studies.chapter01;

public class Test06_MemberFields {
    int numberEggs;
    public static void main(String[] args) {
        Test06_MemberFields mother = new Test06_MemberFields();
        mother.numberEggs = 1;
        System.out.println(mother.numberEggs);
    }
}
