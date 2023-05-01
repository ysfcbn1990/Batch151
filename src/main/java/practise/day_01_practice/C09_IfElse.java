package practise.day_01_practice;

import java.util.Scanner;

public class C09_IfElse {

    public static void main(String[] args) {
        /*
        Kullanıcıdan sisteme bir numara girmesini isteyin.

        Eger numara sıfırdan küçükse, konsolda "Negatif Sayı" yazdırın.

        Degilse, 10'dan küçük olup olmadığına bakın. 10'dan küçükse konsola "Pozitif Rakam" yazdırın,
        10'dan büyük veya eşitse konsola "Pozitif Sayı" yazdırın.

    */

        Scanner scan= new Scanner(System.in);
        System.out.println("Lütfen bir sayı giriniz");

       int num= scan.nextInt();

      if(num<0){
          System.out.println("Negatif Sayı");
      }else
          if ( num<10) {
          System.out.println("Pozitif Rakam");
        }else{
          System.out.println("Pozitif Sayı");
      }


    }
}
