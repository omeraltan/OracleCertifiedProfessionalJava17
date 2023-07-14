package org.ocp.studies.chapter04;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Test15_Arrays_Example {
    public static void main(String[] args) {
        System.out.println(Arrays.compare(new int[] {1}, new int[] {2}));

        System.out.println("------------compare()-------------");
        int[] a = new int[]{1,2};
        int[] b = new int[]{1};
        System.out.println(Arrays.compare(a,b)); // 1
        int[] c = new int[]{1,2};
        int[] d = new int[]{1,2};
        System.out.println(Arrays.compare(c,d)); // 0
        String[] e = new String[]{"a"};
        String[] f = new String[]{"aa"};
        System.out.println(Arrays.compare(e,f)); // -1
        String[] g = new String[]{"a"};
        String[] h = new String[]{"A"};
        System.out.println(Arrays.compare(g,h)); // 1
        String[] i = new String[]{"a"};
        String[] j = new String[]{null};
        System.out.println(Arrays.compare(i,j)); // 1
    }
}
