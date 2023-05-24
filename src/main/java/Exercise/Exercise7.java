package Exercise;

import java.util.Scanner;

public class Exercise7 {
    public static void main(String[] args) {
        //Ex.kullanıcı gün numarasını girsin kod gün ismini yazsın

      Scanner scan= new Scanner(System.in);
        System.out.println("Lütfen görmek istediğiniz gün nummarasını \n" +
                "1)Pazartesi 2)Salı 3)Çarşamba 4)Perşembe 5)Cuma 6)Cumartesi 7)Pazar \n" +
                "giriniz");
        byte dayNo= scan.nextByte();

        if(dayNo==1){
            System.out.println("Pazartesi");
        } else if (dayNo==2) {
            System.out.println("Salı");
        }else if (dayNo==3){
            System.out.println("Çarşamba");
        } else if (dayNo==4) {
            System.out.println("Perşembe");
        } else if (dayNo==5) {
            System.out.println("Cuma");
        } else if (dayNo==6) {
            System.out.println("Cumartesi");
        } else if (dayNo==7) {
            System.out.println("Pazar");
        }else {
            System.out.println("Geçersiz numara girdiniz");
        }


    }
}
