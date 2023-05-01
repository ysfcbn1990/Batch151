package javaders.introduction.day3scanner;

import java.util.Scanner;

public class Scanner03 {

    //Kullanıcıdan adresini alınız ve ekrana yazdırınız?
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("lütfen adresinizi giriniz...");
        //next() methodu kullanıcıdan tek kelimeli Stringi almak için kullanılır
        //nextLine() methodu ise kullanıcıdan çok kelimeli Stringi almak için kullanılır.

        String adres = input.nextLine();
        System.out.println(adres);


    }
}
