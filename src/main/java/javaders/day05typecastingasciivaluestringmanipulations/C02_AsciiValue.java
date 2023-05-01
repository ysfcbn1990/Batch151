package javaders.day05typecastingasciivaluestringmanipulations;

public class C02_AsciiValue {


    public static void main(String[] args) {


        /* javada char data tipini matematiksel işlemlerde kullanırsanız Ascii Table'daki sayısal değerleri alır


        Numering Data Type'lar;byte,short,int,long,float,double
        char==> karakterinin hem sayısal değer barındırır hem resim karakterini barındırır.
        boolean ise numering olmayan data tipidir
        Javada char data type'ne int değerde atanabilir,Sembol,Harf vs de atanabilir
        Çünkü char data type inin Ascii den gelen bir sayısal değeri birde resimsel karakteri vardır


        */


        /*
        Javada "+" sembolu iki int icin matematikteki gibi toplama islemi yapar
iki String data arasinda ya da bir String bir int arasinda ise yanyana yazdirir
Buna "Concatination" denir
Java metematik bilir islem onceligine gore calisir
  i)Uslu Sayilar
  ii)Parantez ici
  iii)carpma/bolme
  iv) toplama/cikarma

         */








        //"A" karakterinin Ascii değerini hesaplatan kodu yazdırın?

        int asciiA = 'A';
        System.out.println("asciiA = " + asciiA);//65

        int asciia ='a';
        System.out.println("asciia = " + asciia);//97


        int asciiunlem='!';
        System.out.println("asciiunlem = " + asciiunlem);//33

        int asciispace=' ';
        System.out.println("asciispace = " + asciispace);//32


        int asciiSembol='*';
        System.out.println("asciiSembol = " + asciiSembol);//42


        String isim="Zeki";
        char ch ='Z';
        int  intch ='Z';
        char sembol='*';
        char space=' ';
        char rakam ='9';
        char sayi= '0';

        //149.9999TL *2
        int deger=20;
        char smbl='$';
        System.out.println(deger+smbl);//$ sembolünün ascii tabledaki değeri 36+20 = 56


        int deger2=0;
        char smbl2='+';
        System.out.println(deger2+smbl2);//43
        System.out.println("deger2+smbl2 = " + deger2 + smbl2);// 0+
        System.out.println("deger2+smbl2 = " + (deger2 + smbl2));//43

        String name="Sezen";
        int number=998;
        System.out.println(name+number);//sezen998


        String name1="100";
        int number1=998;
        System.out.println(name1+number1);// 100998

        String name2="123";
        int number2=45;
        System.out.println(name2+number2);//12345 concatination uc ucaa ekleme yan yana yazdırır.

        String str1="Java";
        char ch3='G';
        int sayi1=5;
        System.out.println(str1+ch3+sayi1);//JavaG5
        System.out.println(str1+(ch3+sayi1));//Java76
        System.out.println(ch3+sayi1+str1);//76Java

        String sayiStr="123";
        String sayiStr2="45";
        System.out.println(sayiStr+sayiStr2);//12345

       int rakam1='1';
        System.out.println("rakam1 = " + rakam1);//1
        int rakam2='2';
        System.out.println("rakam2 = " + rakam2);//2

         char rakam3='3';
        System.out.println("rakam3 = " + rakam3);//3

        char rakam4='4';
        System.out.println("rakam4 = " + rakam4);//4

        System.out.println("rakam1+rakam2+rakam3+rakam4 = " + rakam1 + rakam2 + rakam3 + rakam4);//1234 yanyana yazdırma
        System.out.println("rakam1+rakam2+rakam3+rakam4 = " +( rakam1 + rakam2 + rakam3 + rakam4));//202 Ascii top

        //**************Asci Değerlerinden Faydalanılarak Neler Yapılabilir***********//

        byte b=5;
        char ch2='h';
        System.out.println("b>ch2 = " + (b > ch2));//false
        int dgr ='h';
        System.out.println(dgr);//104
        int ascii5='5';
        System.out.println(ascii5);//53

        long l=542168784578L;
        System.out.println(""+(ch2>l));//false

        float f=2.45648f;
        double d=2.19658;
        System.out.println("f>d = " + (f > d));//true

        byte sayi3=5;
        byte sayi4=6;
        System.out.println(sayi3<sayi4);

        System.out.println("b<f = " + (b < f));//false

     int sayiint =100;
     long sayilong=100l;
        System.out.println(""+(sayiint==sayilong));//true

     int sayiInt=200;
        System.out.println("sayiInt>=sayilong = " + (sayiInt >= sayilong));//true,

        int sayiInt3=9;
        char sayiChar='9';
        System.out.println("sayiInt3>=sayiChar = " + (sayiInt3 >= sayiChar));//False



    }//main
}//class
