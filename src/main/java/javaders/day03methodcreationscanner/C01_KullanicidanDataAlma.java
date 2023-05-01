package javaders.day03methodcreationscanner;


import java.util.Scanner;

public class C01_KullanicidanDataAlma {

    public static void main(String[] args) {


        //Kullanicidan aldiginiz
// character ile asagidaki gibi bir gorunum olusturunuz
/*
          A
         A A
        A A A
 */
        /*
         //Sadece char data type için nextChar diye bir method olmadığı için
         kullanıcıdan data alıp ch konteynırına yerleştirmek için next().charAt(0); methodunu kullanırız


        */

         Scanner input =new Scanner(System.in);
        System.out.println("Lutfen bir character veriniz?");
        char ch = input.next().charAt(0);
        System.out.println("  "+ch+"  ");//5 karakter
        System.out.println(" "+ch+" "+ch+" ");//5 karakter
        System.out.println(ch+" "+ch+" "+ch);//5 karakter

        // Aralarında bir tab boşluk bırakarak aynı şekli oluşturalım
        System.out.println("\t\t"+ch+"\t\t\n\t"+ch+"\t"+"\t"+ch+"\t\n"+ch+"\t\t"+ch+"\t\t"+ch);






    }//main
}//class
