package practise.day_02_practice;

import java.util.Scanner;

public class C03_IfElse {
    public static void main(String[] args) {
        /*
Kullanıcıdan ayrı ayrı iki kelime sisteme girmesini isteyin.
Eger İlk kelimenin karakter sayısı çift ise,
 ikinci kelimeyi birinci kelimenin ortasına koyun.
İlk kelimenin karakter sayısı tek ise, konsola
"ilk kelimenin ortasina ikinci kelimeyi koyamazsin cunku ilk kelime tek karakterli" yazdırın.
*/

        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen ilk kelimeyi giriniz");
        String ilk=scan.next();
        System.out.println("Lütfen ikinci kelimeyi giriniz");
        String iki=scan.next();
        if((ilk.length())%2==0){
         String yeni=(ilk.substring(0,ilk.length()/2))+iki+(ilk.substring(ilk.length()/2,ilk.length()));
            System.out.println(yeni);
        }else{
            System.out.println("ilk kelimenin ortasina ikinci kelimeyi koyamazsin cunku ilk kelime tek karakterli");
        }




    }
}
