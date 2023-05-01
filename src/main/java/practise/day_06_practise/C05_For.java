package practise.day_06_practise;

import java.util.Scanner;

public class C05_For {
    public static void main(String[] args) {
/*
         Kullanıcıdan sisteme 5 adet sayi girmesini isteyiniz
         Bu sayilardan 5 ile 10 arasındakiler haric, digerlerinin toplamını bulunuz

      */


        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen 5 adet sayıyı giriniz");
        int toplam=0;
        for(int i=0;i<5;i++){
            System.out.println(i+1+". sayıyı giriniz");
            int sayi=scan.nextInt();

            if(sayi>=5&&sayi<=10){
                System.out.println("Girdiğiniz sayi 5 ile 10 arasında olduğundan işleme alınmayacaktır");
            }else{
               toplam=toplam+sayi;

            }
        }
        System.out.println("Girdiğiniz Sayıların Toplamı : "+toplam);






    }
}
