package javaders.introduction.day04scannerwrapperoperators;

import java.util.Scanner;

public class Scanner01 {
    public static void main(String[] args) {

        //kullanıcıdan alacağınız 5 basamaklı bir sayının ilk iki ve son iki basamağındaki
        // rakamların toplamını yazdıran kodu yazınız?

        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen beş basamaklı bir sayı giriniz...");
        int number = input.nextInt();
        //bir sayının son rakamını alabilmek için o sayıyı 10'a bölüp kalanı alırız.
        //java bir tamsayıyı bir tamsayıya bölünce sonucu kesinlikle küsüratlı vermez.tam sayı olarak verir
        //ondalıklı kısmı iptal eder.java yuvarlama yapmaz,
        //Bir sayının son rakamını alabilmek için o sayıyı 10 bölüp kalanı almalıyız
        //% modulus operator solunda bulunan sayının sağında bulunan sayıya bölümünden kalanı verir.
        //Dolayısıyla %10 her zaman bize birler basamağında bulunan sayıyı verir.
        //ve javada bir tamsayıyı 10 abölersek birler basamağını silmiş oluruz.
       int lastDigit = number%10;
       //sayı küçült
       number = number/10;
       //sondan ikinci rakamı al
        int lastSecondDigit = number%10;
        //sayı küçült
        number =number/10;
        //sondan üçüncü rakamı al
        int lastThirdDigit = number%10;
         //sayı küçült
        number=number/10;
        //sondan dördüncü rakamı al
        int lastFourthDigit=number%10;
        //sayı küçült
        number= number/10;
        //sondan beşinci rakamını al
        int lastfifthDigit = number%10;
        //sayı küçült
        number = number/10;
        System.out.println(lastDigit+lastSecondDigit+lastFourthDigit+lastfifthDigit);


    }
}
