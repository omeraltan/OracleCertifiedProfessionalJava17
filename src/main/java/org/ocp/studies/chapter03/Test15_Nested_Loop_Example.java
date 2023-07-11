package org.ocp.studies.chapter03;

public class Test15_Nested_Loop_Example {
    public static void main(String[] args) {
        int[][] myComplexArray = {{5,2,1,3},{3,9,8,9},{5,7,12,7}};

        for(int[] mySimpleArray : myComplexArray) {
            for(int i=0; i<mySimpleArray.length; i++) {
                System.out.print(mySimpleArray[i]+"\t");
            }
            System.out.println();
        }
    }
}
