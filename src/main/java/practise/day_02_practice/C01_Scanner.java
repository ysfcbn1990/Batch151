package practise.day_02_practice;

import java.util.Scanner;

public class C01_Scanner {

    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);

//Ex:Kullanıcıdan aldığınız bir şekil ile Aşağıdaki şekli oluşturan kodu yazınız

/*
             A
            A A
           A A A
    */
/*

        Scanner input=new Scanner(System.in);
        System.out.println("Lütfen bir şekil giriniz");
           char ch=input.next().charAt(0);

        System.out.println("  "+ch+"  "+"\n"+" "+ch+" "+ch+" "+"\n"+ch+" "+ch+" "+ch);



//Kullanıcıdan iki sayı alıp dört işlem yapan ve işlemlerin sonucunu konsola yazdıran kodu yazınız

        System.out.println("Lütfen ilk sayıyı giriniz");
      int sayı1=input.nextInt();
        System.out.println("Lütfen ikinci sayıyı giriniz");
     int sayı2=input.nextInt();

        System.out.println(sayı1+sayı2);
        System.out.println(sayı1-sayı2);
        System.out.println(sayı1*sayı2);
        System.out.println(sayı1/sayı2);

*/

//Kullanıcıdan alacağınız 5 basamaklı bir sayının ilk iki ve son iki rakamları toplamını bulan kodu yazınız

        System.out.println("Lütfen beş basamaklı sayı giriniz");
      int  sayı=input.nextInt();

      int ilkbasmak=sayı%10;//34657
      int onlar=(sayı/10)%10;//7

       int yüzler=(sayı/100)%10;

       int binler=(sayı/1000)%10;//

       int onbinler=(sayı/10000)%10;


        System.out.println(onlar+ilkbasmak+binler+onbinler);














    }//main
}//class
