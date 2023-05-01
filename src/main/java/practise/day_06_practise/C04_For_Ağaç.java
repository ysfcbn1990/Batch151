package practise.day_06_practise;

import java.util.Scanner;

public class C04_For_Ağaç {
    public static void main(String[] args) {

  /*

         Agac sekli olusturmak icin, kullanicidan yaprak satir sayisini ve gövde satir sayisini ayrı ayrı
         sisteme girmesini isteyiniz.

         Asagıdaki agac seklini konsala yazdırınız


        ^
        ^^
        ^^^
        ^^^^
        ^^^^^
        |||
        |||
        |||
        |||
        |||


         */


        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen yaprak sayısını giriniz");
        int yaprak= scan.nextInt();

        System.out.println("Lütfen gövde satır sayısını giriniz");
       int gövde= scan.nextInt();

       String yprk=" ";
       for(int i=0;i<yaprak;i++){
         yprk=yprk+"^";
           System.out.println(yprk);
       }
       for(int i=0;i<gövde;i++){
           System.out.println("|||");
       }







    }
}
