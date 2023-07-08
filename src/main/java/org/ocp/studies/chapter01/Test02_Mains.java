package org.ocp.studies.chapter01;

// Different types Main method

public class Test02_Mains {

    //public static void main(String[] args) {
        //System.out.println("Hello World");
    //}

    //public static void main(String options[]){
        //System.out.println("Hello World-2");
    //}

    public static void main(String ...friends){
        System.out.println(friends[0]);
        System.out.println(friends[1]);
    }

    //public final static main(final String ...frineds){
        //System.out.println("Hello World-4");
    //}

    // javac Test02_Mains.java --> java compiler sonucu ilgili java sınıfının class'ı oluşur. --> Test02_Mains.class
    // java Test02_Mains.java  --> terminalden bu kodun yazılması sonucu ilgili main metodu çalışır.
    // java Test02_Mains.java Ömer Ebru --> bu komutun çıktısı: Ömer Ebru olur.
    // java Test02_Mains.java "Ömer Deneme" "Ebru Deneme" --> bu komutun çıktısı: Ömer Deneme Ebru Deneme olur.
}
