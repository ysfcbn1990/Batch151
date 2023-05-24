package Exercise;

import java.util.Scanner;

/*
    Gün isimlerini kullanıcıdan alınız o günün kaçıncı gün olduğunu ekrana yazdırınız
    Sunday ==>1    Monday==>2.... Saturday==>?
    */
public class Exercise13 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen gün ismini giriniz \n" +
                "1)Pazartesi 2)Sali 3)Çarşamba 4)Perşembe 5)Cuma 6)Cumartesi 7)Pazar");
        String nameDay=scan.next();

        switch (nameDay.toLowerCase()){
            case "pazartesi":
                System.out.println("1.gün");
                break;
            case "salı":
                System.out.println("2.gün");
                break;
            case "çarşamba":
                System.out.println("3.gün");
                break;
            case "perşembe":
                System.out.println("4.gün");
                break;
            case "cuma":
                System.out.println("1.gün");
                break;
            case "cumartesi":
                System.out.println("1.gün");
                break;
            case "pazar":
                System.out.println("1.gün");
                break;
            default:
                System.out.println("Geçersiz gün ismi girdiniz.Tekrar deneyiniz");

        }




    }
}
