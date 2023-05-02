package Exercise;

import java.util.Scanner;

public class Exercise3 {
    public static void main(String[] args) {
        //kullanıcıdan alacağınız 5 basamaklı bir sayının ilk iki ve son iki basamağındaki
        // rakamların toplamını yazdıran kodu yazınız?

        Scanner scan =new Scanner(System.in);
        System.out.println("Lütfen bes basamaklı bir sayı giriniz");
        int number= scan.nextInt();

        int birbas=number%10;
        number=number/10;
        int onbas=number%10;
        number=number/10;
        int yuzbas=number%10;
        number=number/10;
        int binbas=number%10;
        number=number/10;
        int onbinbas=number%10;

        System.out.println(birbas+onbas+binbas+onbinbas);




    }
}
