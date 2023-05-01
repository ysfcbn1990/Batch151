package javaders.day05typecastingasciivaluestringmanipulations;

public class C03_TypeCasting {


    public static void main(String[] args) {

        /*
        Numeric data type'lerinin birbirine dönüştürülmesine Type Casting denir
        Numeric dat type2ları;byte-short-int-long-float-double
        Küçük data type'larının büyük data type'larına dönüştürülmesine
        Auto Widening(Otomatik Genişletme)denir===>Küçük kutunun büyük kutu içerisine yerleştirilmesi
        Büyük kutunun küçük kutuya dönüştürülmesinde Java sorumluluğu kabul etmez.
        Data kaybı olabileceği için code'u yazanlara bırakır.Buna"Explicit Narrowin"(Açıktan Daraltma) denir





              */

byte age=13;
int ageInt=age;//bu Auto widening denir.Otomatik Genişletme

        //long data type 'inin shorta çevirelim
        long population=1234;
        short populationShort= (short) population;//Explicit Narrowing denir.Açıktan Daraltma

        //int data type'ni float data typenina çeviriniz

        int boy=170;
        float boyFloat=boy;

        //short data typeni byte data type na çevirelim
        short numberShort=195;
        byte numberByte= (byte) numberShort;


   short num=128;
   byte ab= (byte) num;
        System.out.println(ab);

    }//main
}//class
