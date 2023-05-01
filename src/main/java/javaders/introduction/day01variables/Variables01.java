package javaders.introduction.day01variables;


public class Variables01 {

    public static void main(String[] args) {
        //java bu satırı okumaz.Kendimize veya baskasına acıklamadır.
        /*
        java bu satırlarıda okumaz
         */

        //variable olusturma
        //data type  +  variable name + atama operatoru + data + noktalı virgul
        int               age               =              13     ;

        //java cumlesi == Statement
        //Data type + Variable Name = Variable declaration
        //Assigment operator(atama operatoru) +variable degeri = Assignment
        //eger variable declaration yapar,assignment yapmazsanız java kendi degerlerini ( default == varsayılan ) koyar
        //default degerler sayılar icin sifirdir.
        //Dilbisindeki nokta ne ise java daki noktali virgul ayni seydir ve statementin bittiğini gosterir
        //Javada esittir demek "==".yani matematikte "=" java da"=="

        /*
        Java da temelde iki tip data vardır.
        1)primitive data type;
        char,boolean,byte,short,int,long,float,double
        2)non-primitive data type
         String
         */

        //Ornek 1 : ogrenci ismi icin variable olusturup deger olarak Ali Can atayiniz
        //Stringlere verilen degerler daima cift tırnak icinde olmalidir.
        String studentName = "Ali Can" ;

        // String bir deger olusturup ama herhangi bir atama yapmazsak java o variable a default olarak "null" koyar
        //null demek 0 demek degil, 0 da coding te bir degerdir
        // null demek içi bos obje demektir
        //yani icinde variable veya method bulunmayan default obje demektir.
        // {}

        //char data type:
        //Tek karakterler icin kullanilir. ornegin == A, x, ?, 5
        //Ornek 2 : char data typenda bir ismin ilk harfi olarak bir variable olusturunuz ve bir deger atayiniz
        //Note:char data typenda degerler tek tırnak icine konulmalidir

        char isminIlkHarfi = 'A' ;


        //boolean data type :
        //boolean 'lar sadece iki farklı deger alabilir; true (dogru) yada false (yanlıs)
        //Ornek 3 : boolean data typenda emekli misin icin bir variable olusturun ve false degerini atayınız
        boolean emeklimisin = false ;

        //byte data type
        //tam sayılar icindir.hafızada 1 byte yer kaplar
        //byte: -128 den +127 ye kadar tamsayı degerleri icin kullanilir
        //Ornek4 : byte data typenda ögrenci yası icin bir variable olusturun ve bir deger atayınız
        byte ageOfStudent = 18 ;

        //short data type :
        //tam sayılar icindir.hafızada 2 byte yer kaplar
        //short : -32768 ile +32767 arasındaki tam sayılar icin kullanılır
        // Ornek 5 : Site nufusu icin bir variable olusturun ve bir deger atayınız
        short siteNufusu = 1560 ;

        //Int data type:
        // tam sayılar icindir hafızda 4 byte yer kaplar
        //int.-2,147,483,648 ile +2,147,483,647 arasındaki sayılar icindir
        //Ornek 6:Ulke nufusu icin bir variable olusturun ve bir deger atayınız
        int countrypopulation = 56748888 ;

        //Long data type
        //tam sayılar icindir hafızada 8 byte yer kaplar,
        //long:-9,223,372,036,854,808 ile 9,223,372,036,854,807 arasindaki sayılar icindir
        //Ornek 7.Insan vucudundaki hücre sayısı icin variable olusturup deger atayınız
        //Note: bir deger long ise sonuna "L"(tercih edilir) veya "l" konulur
        long hucreSayisi = 657778977887L ;

        //Eger longa atadıgınız deger int'lerin aralıgında ise sonuna "l" koymaya gerek yok
        //long dememize ragmen sonuna "l" koymazsak eger int aralıgında ise java onu int kabul eder.

        //float data type:
        //float data type virgullu sayılar(ondalıklı sayılar==decimal numbers) icin kullanılır.
        //Note: java ondalıklı sayıları yani decimal numbersı otomatik olarak double kabul eder.
        //eger float data type olmasında ısrar ederseniz sonuna "F" yada küçük "f" koymalısınız.
        //float hafızada 4 byte yer kaplar
        //Ornegin fiyatlandırmalar icin tercih edilir(11,99)
        //Ornek 8: Gömlek ve ayakkabı fiyatları icin 2 tane variable olusturup toplam fiyatı ekrana yazdırınız.
        float shirtPrice = 12.99F;
        float shoesPrice = 15.99f;

        System.out.println(shirtPrice + shoesPrice);
       // System.out.println();yazdırmanın kısa yolu sout yaz ve enter a bas

        int a = 12 ;
        int b = 13 ;
        System.out.print(a);
        System.out.print(b);

        //System.out.println();ekrana yazdırır ve pointer ı bir sonraki satıra koyar
        //System.out.print();ekrana yazdırır ve pointer i aynı satırda tutar

        //double data type
        //double data type virgullu sayılar (ondalıklı sayılar == decimal numbers )için kullanılır
        //double memoryde daha fazla yer kaplar(8byte),virgülden sonraki rakam daha fazla alır.
        //Ornek hücre agırlığı ve amipin agırlıgı icin double data typende variable olusturup farklarını ekrana yazdırınız
         double hucreAgirligi = 0.0000056 ;
         double amipAgirligi = 0.00000000000078 ;
        System.out.println(hucreAgirligi - amipAgirligi);


        }
}

