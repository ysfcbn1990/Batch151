package practise.day_06_practise;

import java.util.Scanner;

public class C01_Switch {

    public static void main(String[] args) {

 /*
       Kullanıcıdan yıl ve ay numarasını ayrı ayrı sisteme girmesini isteyiniz.
       Girilen ay numarasına göre ayin kaç gün çektigini yazdırınız.


       NOT: 1, 3, 5, 7, 8, 10, 12. aylar 31 gun çeker
            4, 6, 9, 11. aylar 30 gun çeker
            2. ay 4 yılda bir 29 gun ceker, diger yıllarda 28 gun ceker
        */


        Scanner input=new Scanner(System.in);
        System.out.println("Lütfen 1-12 arasındaki ay numarasını giriniz");
        int ay=input.nextInt();

        System.out.println("Lütfen yılı giriniz");
int yıl=input.nextInt();



      switch (ay){
          case 1:
          case 3:
          case 5:
          case 7:
          case 8:
          case 10:
          case 12:
              System.out.println(yıl+" yılı "+ay+". ayı 31 gün ceker.");
              break;
          case 4:
          case 6:
          case 9:
          case 11:
              System.out.println(yıl+" yılı "+ay+". ayı 30 gün ceker.");
              break;
          case 2:
              if(yıl%4==0){
                  System.out.println(yıl+" yılı "+ay+". ayı 29 gün ceker");
              } else  {
                  System.out.println(yıl+" yılı "+ay+". ayı 28 gün ceker");
              }
              break;
          default:
              System.out.println("Geçersiz numara girdiniz.tekrar deneyiniz");
      }
















    }


}
