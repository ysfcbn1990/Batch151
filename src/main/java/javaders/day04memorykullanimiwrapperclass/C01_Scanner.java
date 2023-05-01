package javaders.day04memorykullanimiwrapperclass;

import java.util.Scanner;

public class C01_Scanner {

    // Kullanicidan aldiginiz 5 basamakli
     // bir sayinin ilk 2 ve son 2 basamagindaki
    // sayilarin toplamini yazdiran kodu olusturunuz
    public static void main(String[] args) {

        Scanner input =new Scanner(System.in);
        System.out.println("Lutfen 5 basamaklı bir sayı giriniz?");
        int number = input.nextInt();//38671


        //son rakamı al
        int lastDigit = number%10;//1

        //sayıyı küçült
        number = number/10;//3867

        //sondan ikinci rakamı al
        int lastSecondDigit = number%10;//7

        number = number/10;//386

        //sondan üçüncü rakamı al
        int lastThirdDigit = number%10;//6
        number =number/10;//38

         //sondan dördüncü rakamı al
        int lastFourthDigit = number%10;//8
        number = number/10;//3

        //sondan beşinci rakamı al
        int lastFifthDigit = number%10;//3

        System.out.println(lastDigit+lastSecondDigit+lastFourthDigit+lastFifthDigit);















    }//main
}//class
