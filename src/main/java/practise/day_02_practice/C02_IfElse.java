package practise.day_02_practice;

import java.util.Locale;
import java.util.Scanner;

public class C02_IfElse {
    public static void main(String[] args) {
/*
Kullanicidan bir gun alin
Eger gun cuma ise "Muslumanlar Icin Kutsal Gun" ;
Eger gun cumartesi ise "Yahudiler icin Kutsal Gun"
Eger gun pazar ise "Hristyanlar icin Kutsal Gun"
 yazdiran kodu olusturunuz
 */
        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen gün ismi giriniz");
   String gün=scan.next().toLowerCase();

        if (gün.equals("cuma")) {
            System.out.println("Müslümanlar için Kutsal gün");
        } else if (gün.equals("cumartesi")) {
            System.out.println("Yahudiler için Kutsal gün");
        } else if (gün.equals("pazar")) {
            System.out.println("Hristiyanlar için Kutsal gün");
        }else{
            System.out.println("Kutsal bir gün değil");
        }

/*
Kullanıcıdan 3 karakterden daha uzun bir kelime sisteme girmesini isteyin
Eger kelimenin karakter sayısı 3 ve 3'den daha kucuk ise konsola "
3 Karakterden Daha Uzun Bir Kelime Girmelisiniz " yazdırınız
Degilse kelimenin basına ve sonuna, kelimenin son uc harfini ekleyerek yazdırınız
 */
        System.out.println("Lütfen 3 karakterden daha uzun bir kelime giriniz");
String kelime=scan.next();
if(kelime.length()<4){
    System.out.println("3 karakterden daha uzun bir kelime giriniz");
}else{
  String sonüçharf= kelime.substring(kelime.length()-3);
    System.out.println(sonüçharf+kelime+sonüçharf);

}



























    }//main
}//class

