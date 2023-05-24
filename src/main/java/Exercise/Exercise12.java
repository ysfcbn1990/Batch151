package Exercise;

import java.util.Scanner;

public class Exercise12 {
    /*
Kullanicidan aldiginiz sayi cift ise yarisini ekrana yazdiriniz, tek ise "Bu sayi ikiye bolunmez" yazdiriniz
 */
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen bir sayı giriniz");
        int num= scan.nextInt();
        Object result=num%2==0?num/2:"Bu sayı ikiye bölünmez";
        System.out.println(result);

    }
}
