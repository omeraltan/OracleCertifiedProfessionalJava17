package org.ocp.studies.chapter05;

public class Test24_Passing_Data_Among_Methods {
    public static void main(String[] args) {
        int num = 4;
        newNumber(num);
        System.out.println(num);        // 4
    }

    public static void newNumber(int num){
        num = 8;
    }
}
