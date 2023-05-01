package javaders.day08stringmanipulations;

import java.util.Scanner;

public class www {
    public static void main(String[] args) {
        //Ex. Bir String'in hiç karakter içermediğini gösteren kodu yazınız?
        String str=" ";
 boolean bosMU=str.length()==0;
   boolean bosmu=str.isEmpty();
        System.out.println(bosmu);
boolean space=str.replace(" ","").length()==0;
        System.out.println("space = " + space);
        boolean space1=str.isBlank();
        System.out.println("space1 = " + space1);


        //Ex.Bir stringde  a,i ,e karakterlerinin ilk görünümlerinin indexleri toplamını ekrana yazdırınız
        String r ="Java is easy to Learn";
       int a=r.indexOf('a');
       int i=r.indexOf('i');
       int e=r.indexOf('e');
        System.out.println("e+i+a = " + (e+i+a));
        //Ex: Bir Stringde Java kelimesinin ilk olarak kaçıncı indexde kullanıldığını gösteren kodu yazınız
        String u="Ah Java vah Java sen ne guzel seysin Java";
       int java= u.indexOf("Java");
        System.out.println("java = " + java);
     int pyhton=u.indexOf("pyhton");
        System.out.println("pyhton = " + pyhton);
        //Ex.Bir stringde  a,i ,e karakterlerinin son görünümlerinin indexleri toplamını ekrana yazdırınız
        String v ="Java is easy to Learn";
        int a1=v.lastIndexOf('a');
        int i1=v.lastIndexOf('i');
        int e1=v.lastIndexOf('e');
        System.out.println("a1+i1+e1 = " +( a1+i1+e1));


    }





}
