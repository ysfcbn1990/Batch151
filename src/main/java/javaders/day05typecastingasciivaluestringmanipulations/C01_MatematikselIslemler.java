package javaders.day05typecastingasciivaluestringmanipulations;

public class C01_MatematikselIslemler {
    /*
-Javada farkli data type'lari arasinda islem yapiliyorsa
    sonuc buyuk olan data type'inin turunde olur.

            -Karsilastirma operatorlerinde sonuc hep boolean doner.

< Kucuktur
 > Buyuktur
== Esittir
!= Esit degildir
<= Kucuk esittir
>= Buyuk esittir.
 &&  and (ve) operatoru
|| or (veya) operatoru
    */



    public static void main(String[] args) {


        System.out.println(4*(5+2)/3);//9
        // int/int sonuç ==> int olacağı için 9.333333334 yerine virgülden sonrasını siler
        //ve tam sayı kısmını alır biz ekranda 9 rakamını görürüz


        System.out.println(6*16/8);//12


        double sonuc=4*(2+5)/3;
        System.out.println("sonuc = " + sonuc);//9.0

        double sonuc2=4.0*(2+5)/3;
        System.out.println("sonuc2 = " + sonuc2);// 9.333333333333334


        System.out.println(4*(1+5)/3);//8

        int sayi1=5;
        int sayi2=2;
        double sayi3=2;

        System.out.println(sayi1/sayi2);//2 normalde 2.5 ancak int/int =int olacağı için tamsayı kısmı alınır
        //virgülden sonrası atılır

        System.out.println(sayi1/sayi3);//2.5

        System.out.println(sayi1+sayi3/sayi2);//6.0

        boolean first=2<4;
        boolean second=2+6 !=8;
        boolean third = 2+3*5<20;

        System.out.println("first = " + first); //t
        System.out.println("second = " + second);//f
        System.out.println("third = " + third);//t

        System.out.println(first && second);//false
        System.out.println(first || second || third);//true



    }//main
    }//class
