package javaders.day22stringbuilder;

public class Sb01 {

    public static void main(String[] args) {

  /*

        1)"StringBuilder" String ureten bir Class'dir.
        2)"String"Class kiullanarak String uretiriz Java nicin "StringBuilder" Class' i olusturdu?
          "String"Class "immutable"(degistirilemez) String uretir, "StringBuilder" Class "mutable"(degistirilebilir) String uretir.
        3)"İmmutable" olmak demek orjinal değerin korunması,değiştirilemez olması demektir.
        "mutable"olmak demek orjinal değerin değiştirelebilir olması demektir.
        4)"capacity" Java'nın size verdiği data depolama yer sayısıdır.
        "lenght"ise size verilen data depolama yerinin kullanılan kısmıdır
        5)"Java"başlangıç olarak size capacity'i 16 olarak verir
        Siz verilen capacity'i aşarsanız Java yeni capacity'i varolanın 2 katının 2 fazlası olacak şekilde değiştirir


     */


            String s = "Java";

            s=s + "!";

            String u="Apex";
            String v="Apex";
            String y="C++";

            //StringBuilder nasıl oluşturulur
        StringBuilder t=new StringBuilder("Pyhton");
        System.out.println(t);//Pyhton

        //StringBuilderlara nasıl ekleme yapılabilir
        t.append("!").append("...");
        System.out.println(t);//Pyhton!//Pyhton!...

        //2.way
        StringBuilder r= new StringBuilder();
        System.out.println();

              r.append('c');
        System.out.println(r);//c

        //"capacity" ve "lenght"arasındaki fark nedir?
        StringBuilder sb1=new StringBuilder("Money");

        int capacity=sb1.capacity();
        System.out.println(capacity);//21

      int lengt=sb1.length();
        System.out.println(lengt);//5 "Money"==>5

            sb1.append("!").append("...................");
        int c=sb1.capacity();
        System.out.println(c);//21*2 + 2=44

        int ln=sb1.length();
        System.out.println(ln);//23

        //Default capacity'i değiştirebilir miyiz
        StringBuilder sb2=new StringBuilder(2);
        System.out.println(sb2.capacity());//2

      sb2.append("...");
        System.out.println(sb2.capacity());//6



















    }
}
