package javaders.day06typecastingstringmanipulation;

public class C01_StringManipulation {
    public static void main(String[] args) {
        String a = "Benim Tek Rakibim Dunku Ben*.";


        //******toUpperCase()*********
      String aUpper=a.toUpperCase();
        System.out.println("aUpper = " + aUpper);

        //aUpperCase =TEK RAKIBIM DUNKU BEN

        //********** toLowerCase() *******
        String aLower=a.toLowerCase();
        System.out.println("aLower = " + aLower);
        //aLower = tek rakibim dünkü ben


        //********** charAt() *************
        System.out.println("ilk karakter: "+(a.charAt(0)));//T
        System.out.println("a.charAt(10) = " + a.charAt(10));//m

        //a Stringindeki baştan ikinci ve sondan ikinci karakteri alınız ve yanyana yazdırınız
         char firstChar=a.charAt(1);

         char lastSecondChar=a.charAt(20);
        System.out.println(firstChar+" "+lastSecondChar);//en

        //********** lenght() *************
        //a Stringinde bulunan karakter sayısını bulunuz
        System.out.println("a.length() = " + a.length());//23

        //********** substring() *************
        //a Stringindeki ilk 4 karakteri alınız
      String sub1=a.substring(0,4);//0 dahil 4 hariçtir[0,4)==>0.index,1.index,2.index,3.index alınır
        //4.index'den itibaren alınmaz

        System.out.println("sub1 = " + sub1);//Beni

        //a stringindeki 4.index dahil 7. index hariç yazdırınız
        String sub2=a.substring(4,7);
        System.out.println("sub2 = " + sub2);// m T

        //"Benim Tek Rakibim Dunku Ben*."

        //a Stringindeki "Rakib" kelimesini alınız

        String rakib=a.substring(10,15);
        System.out.println("rakib = " + rakib);
        System.out.println(a.substring(10,15));//Rakib

        System.out.println("a.substring(10) = " + a.substring(10));//Rakibim Dunku Ben*.

        //********** contains() *************

        //a Stringinde "bim" kelimesinin olup olmadığını kontrol ediniz

       boolean varmi= a.contains("bim");
        System.out.println("varmi = " + varmi);//true

        //********** startWith() *************

        //a Stringinin T harfiyle başlayıp başlamadığını kontrol ediniz

        System.out.println("a.startsWith(\"T\") = " + a.startsWith("T"));//false
        System.out.println("a.startsWith(\"Tek\",6) = " + a.startsWith("Tek", 6));
       //ilk 6 karakteri at sonrası Tek kelimesiyle başlayıp başlamadığını
        // true yada false döndürür
        //prefix başlangıç  offset :at gitsin

        //üniversite numaraları yıl + bölüm kodu + giriş sırası olarak düzenlenen bir okulda
        //öğrenci ümranın Hukuk fakültesinde okuyup okumadığını gösteren kodu yazınız?
        /*
        Sınıf 22   Hukuk 33  Bilgisayar 44  Eczacılık 55  Maliye 66 kimyamühendisliği 77
         */

        String str="20105501";
        System.out.println("str.startsWith(\"33\",4) = " + str.startsWith("33", 4));
        //false
        System.out.println("str.startsWith(\"55\",4) = " + str.startsWith("55", 4));
        //true

    }//main


}  //class





