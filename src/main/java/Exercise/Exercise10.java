package Exercise;

import java.util.Scanner;

public class Exercise10 {
    public static void main(String[] args) {
        //  Kullanıcıdan bir sayı alınız o sayı pozitif ise ekrana' pozitif 'yazdırın değilse ekrana 'pozitif değildir' yazdırın

        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen bir sayı giriniz");
       int number= scan.nextInt();

       String result=number>0?"Sayı Pozitif":"Pozitif Değildir";
        System.out.println(result);






    }
}
