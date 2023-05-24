package Exercise;

import java.util.Scanner;

public class Exercise18 {
    public static void main(String[] args) {

        //kullanıcı bir sayı girsin.sayı 100 den küçük ise kullanıcı "kazandınız" mesajı alsın.
        // Diğer durumlarda "kaybettiniz" mesajı alsın.

        Scanner scan = new Scanner(System.in);


        int i=0;

        do{
            System.out.println("Lütfen bir sayı giriniz");
            int sayi= scan.nextInt();
            if(sayi<100){
                System.out.println("Kazandınız");
                break;
            }else{
                System.out.println("Kaybettiniz");
            }

           i++;
        }while(true);










    }
}
