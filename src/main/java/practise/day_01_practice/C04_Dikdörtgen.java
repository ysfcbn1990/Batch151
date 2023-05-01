package practise.day_01_practice;

import java.util.Scanner;

public class C04_Dikdörtgen {
    public static void main(String[] args) {

// Kullanicidan dikdortgenin a ve b kenarlarinin uzunluklarini ayri ayri sisteme girmesini isteyiniz.
        // ve Dikdorgenin cevresini hesaplayarak ekrana yazdiriniz


        Scanner scan=new Scanner(System.in);
        System.out.println("Dikdörtgenin a Kenarını Giriniz");
        int a=scan.nextInt();
        System.out.println("Dikdörtgenin b Kenarını Giriniz");
         int b=scan.nextInt();

        System.out.println("Dikdörtgenin Cevresi :"+((2*a)+(2*b)));














    }
}
