package org.ocp.studies.chapter04;

public class Test34_Question {

    public static void main(String[] args) {
        int[] a = new int[3];
        int[] b = new int[3];
        System.out.println(a.equals(b));

        int[] c = new int[]{1,2,3};
        int[] d = new int[]{1,2,3};
        System.out.println(c.equals(d));

        int[] e = new int[]{1,2};
        int[] f = new int[]{1,2,3};
        System.out.println(e.equals(f));

        int[] g = new int[]{4,5,6};
        int[] h = new int[]{1,2,3};
        System.out.println(g.equals(h));

        String[] i = new String[]{"1","2","3"};
        int[] j = new int[]{1,2,3};
        System.out.println(i.equals(j));
    }
}
