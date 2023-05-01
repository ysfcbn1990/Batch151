package javaders.day03methodcreationscanner;

import java.util.Scanner;

public class C02_Scanner {
    public static void main(String[] args) {
        /*
        Kullanıcıdan data almak için Scanner classından scan/input/scanner objesi oluştururuz
        Bu şekilde kullanıcıyı yönlendirerek gerekli dataları elde ederiz





         */

        //1.Adım:Object oluştuma

        Scanner input = new Scanner(System.in);

        //2.Adım:Kulanıcıya ne yapacağını söylüyoruz

        System.out.println("Lutfen cinsiyetinizi K/E şeklinde giriniz");

        //3.Adım:Kullanıcıdan alınan data yapısına büyüklüğüne uygun bir Variable'nın içine yerleeştirilir.

        char cinsiyet = input.next().charAt(0);

        //4.Adım:Ekranda görebilmek için ve kullanıcınında verdiği bilgileri teyit edebilmek için yazdırıyoruz

        System.out.println("cinsiyet = " + cinsiyet);


        //Kullanıcıya cinsiyetini , adını ,memleketini ,yaşını,boyunu ,ülkesini sevip sevmediğini,maaşını soran bir program yazınız?

        System.out.println("Lutfen cinsiyetinizi K/E şeklinde giriniz");
        char gender = input.next().charAt(0);

        System.out.println("Lutfen adınızı giriniz");
        String isim = input.next();

        System.out.println("Lutfen memleketinizi söyleyiniz");
        String country = input.next();

        System.out.println("Lutfen yaşınızı giriniz");
        byte yas = input.nextByte();

        System.out.println("Lutfen boyunuzu giriniz");
        short boy = input.nextShort();

        System.out.println("Lutfen ülkenizi sevip sevmediğinizi giriniz");
        boolean sevgı = input.nextBoolean();

        System.out.println("Lutfen maaşınızı giriniz");
        long maas = input.nextLong();

        System.out.println("************* Gonul Hanım*************");
        System.out.println("isim = " + isim + "\ncountry :" + country + "\nyas :" + yas + "\nboy : " + boy + "\nsevgı : " + sevgı + "\nmaas : " + maas);


    }

}
