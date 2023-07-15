package org.ocp.studies.chapter04;

import java.util.Arrays;
// What is the output of the following? (Choose all that apply.)
public class Test37_Question {
    public static void main(String[] args) {
        var arr = new String[] { "PIG", "pig", "123"};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.binarySearch(arr, "Pippa"));
    }

    /*
        A. [pig, PIG, 123]
        B. [PIG, pig, 123]
        C. [123, PIG, pig]
        D. [123, pig, PIG]
        E. -3
        F. -2
        G. The results of binarySearch() are undefined in this example.
     */
}
