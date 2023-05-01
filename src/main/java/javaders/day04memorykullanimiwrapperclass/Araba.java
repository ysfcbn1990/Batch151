package javaders.day04memorykullanimiwrapperclass;

import java.util.Scanner;

public class Araba {


    public String model = "V60";
    public String renk = "Beyaz";
    public int fiyat = 1500000;

    public static void main(String[] args) {




    /*
   //Class == Variable (pasif özellikler)     ==Object
           == Methodlar (aktif özellikler)


        */


        //Class ismi   Objenin ismi    =  new   Class ismi()  == Constructor;
        Scanner input = new Scanner(System.in);
        Araba volvo = new Araba();

        hareket();
        dur();
        yakit();
        System.out.println("volvo.fiyat = " + volvo.fiyat);
        System.out.println("volvo.model = " + volvo.model);
        System.out.println("volvo.renk = " + volvo.renk);



    }//main

   public static void yakit() {
        System.out.println("Volvo az yakıt tüketir");
    }

   public static void dur() {

        System.out.println("Volvo güvenli durur");
    }

    public static void hareket() {//Aktif özellikler
        System.out.println("Volvo hızlı gider..");
    }


}//class
