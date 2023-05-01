package javaders.day06typecastingstringmanipulation;

public class TypeCasting {

    public static void main(String[] args) {

        //***********Explicit Narrowing************///
        /*
        Explicit Narrowing yaparken dikkat edilmeli.çünkü çok ciddi data kaybı hatta data datanın değişmesine neden olabilir.
        Eğer dönüştürmeye çalıştığımız variable'ın sınırları dışında ise java sayıyı mod işlemine alır ve kalanı yazdırır.
        Kalan bölenin yarısından fazla ise kalan sayıyı java küçültmek ister ve bölümü 1 büyülterek kalanı '-'işaretli olacak şekilde yazdırır.
         */



        //short data tipinde bir variable oluşturup byte data tipine çeviren kodu yazınız

        short num=260;
        byte numByte= (byte) num;
        System.out.println("numByte = " + numByte);//4

        short num2=1023;
        byte numByte2= (byte) num2;
        System.out.println("numByte2 = " + numByte2);//-1

        short num3=1000;
        byte numByte3= (byte) num3;
        System.out.println("numByte3 = " + numByte3);//-24


        int sayi=8880;
        short shortSayi= (short) sayi;//-32768 + 32768 +  0
        System.out.println("shortSayi = " + shortSayi);//8880


    }//main

}//class
