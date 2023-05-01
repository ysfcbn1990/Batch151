package practise.day_01_practice;


import java.util.Scanner;

public class C07_IfElse {
    public static void main(String[] args) {
// Kullanicidan ayri ayri sisteme iki sayi girmesini isteyiniz.
        // ilk sayinin ikinci sayidan buyuk olup olmadıgını yazdırın



        Scanner scan=new Scanner(System.in);

        System.out.println("Lütfen bir sayı giriniz");
        int sayi1= scan.nextInt();
        System.out.println("Lütfen ikinci sayıyı giriniz");
        int sayi2= scan.nextInt();

        if(sayi1>sayi2){
            System.out.println("Sayı1 Sayı2'den büyüktür");
        }else{
            System.out.println("Sayı1  Sayı2'den büyük değildir");
        }








    }
}
