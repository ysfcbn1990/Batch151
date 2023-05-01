package javaders.day10stringmanipulations;

import java.util.Scanner;

public class C01_IfStatement {
    public static void main(String[] args) {


//if it rains;ı will cancel the picnic
//Eğer yağmur yağarsa pikniği iptal edeceğim
        //kodun dinamik yazılması için variable'nın ismi yazılır.
        // direk değer yazılırsa hurd coding yani tek datalık kod olur.


//Ex.Verilen karakter büyük harfse ekrana "Büyük Harf" yzdıran kodu yazınız
        char ch='A';

        if(ch>='A'&&ch<='Z'){

            System.out.println("Büyük Harf");
        }
//Ex.Verilen sayı çift sayı ise ekrana "Çift Sayı" yazdıran kodu yazdırınız

       byte sayı=24;
        if(sayı%2==0){
            System.out.println("Cift Sayı");

        }
//Ex.Verilen bir sayı 300 den küçük veya 1200 den büyük ise "Harika sayı" yazdıran kodu yazınız

        int sayı1=1453;
        if(sayı1<300  || sayı1>1200){
            System.out.println(" Harika Sayı");
        }
//Ex.Kullanıcıdan aldığımız kodun tek mi çift mi olduğunu gösteren kodu yazınız
       /* Scanner input=new Scanner(System.in);
        System.out.println("Lütfen sayı giriniz");
        int num=input.nextInt();
        if(num%2==0){
            System.out.println("Cift Sayı");}
        if(num%2!=0){
            System.out.println("Tek Sayı");}
        */

        //2.yol if else
      /*
       Scanner input=new Scanner(System.in);

        System.out.println("Lütfen sayı giriniz");

        int num=input.nextInt();

        if(num%2==0){//Eğer num koyternının içerisindeki datanın 2 ye bölümünden kalan'0'a eşitse "Çift Sayı"yazdırır
            System.out.println("Cift Sayı");
    }  else{//else= değilse demek.Geriye kalan tüm ihtimaller için burası çalışır
        System.out.println("Tek sayı");}
                      */

//Verilen bir sayının pozitif negatif yada nötr olduğu kodu yazınız

        int say=10;
        if(say<0) {
            System.out.println("3 lü kontrol Negatif sayı");
        } else if(say>0) {
            System.out.println("3 lü kontrol Pozitif sayı");
        } else {
            System.out.println("3 lü kontrol nötr sayı");
        }






















    } //main

}//class
