package org.ocp.studies.chapter04;

public class Test09_String_Examle {
    public static void main(String[] args) {
        String alpha = "";
        for(char current = 'a'; current <= 'z'; current++)
            alpha += current;
        System.out.println(alpha);


        StringBuilder alpha2 = new StringBuilder();
        for(char current = 'a'; current <= 'z'; current++)
            alpha2.append(current);
        System.out.println(alpha);


         StringBuilder a = new StringBuilder("abc");
         StringBuilder b = a.append("de");
         b = b.append("f").append("g");
         System.out.println("a=" + a);
         System.out.println("b=" + b);

        System.out.println("------------------------");
        var sb = new StringBuilder("animals");
        String sub = sb.substring(sb.indexOf("a"), sb.indexOf("al"));
        int len = sb.length();
        char ch = sb.charAt(6);
        System.out.println(sub + " " + len + " " + ch);

        System.out.println("------------append()------------");
        var sb1 = new StringBuilder().append(1).append('c');
        sb1.append("-").append(true);
        System.out.println(sb1);

        System.out.println("------------insert()------------");
        var sb2 = new StringBuilder("animals");
        sb.insert(7, "-");
        sb.insert(0, "-");
        sb.insert(4, "-");
        System.out.println(sb2);

        System.out.println("------------delete()------------");
        var sb3 = new StringBuilder("abcdef");
        sb3.delete(1, 3);               // sb = adef
        // sb3.deleteCharAt(5);      // exception
        // System.out.println(sb3);

        var sb4 = new StringBuilder("abcdef");
        sb4.delete(1, 100); // sb = a
        System.out.println(sb4);

        System.out.println("------------replace()------------");
        var builder = new StringBuilder("pigeon dirty");
        builder.replace(3, 6, "sty");
        System.out.println(builder); // pigsty dirty

        var builder2 = new StringBuilder("pigeon dirty");
        builder2.replace(3, 100, "");
        System.out.println(builder2);

        System.out.println("------------reverse()------------");
        var sb5 = new StringBuilder("ABC");
        sb5.reverse();
        System.out.println(sb5);
    }
}
