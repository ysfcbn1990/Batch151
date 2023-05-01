package javaders.day07stringmaipulations;

import java.util.Scanner;

public class C02_StringManipulations {
    public static void main(String[] args) {

     /*
     Aşağıdaki kurallara göre kullanıcının girdiği password'u kontrol ediniz

        i)En az 8 karakterden oluşsun
        ii)Pasword space içermesin
        iii)En az 1 tane büyük harf olsun
        iv)En az 1 tane küçük harf olsun
        v)En az 1 tane sembol olsun
        vi)En az 1 tane rakam olsun


        Pozitif Senaryo==> şartları sağlayan senaryo   true
        Negatif Senaryo==>Şartlara uymayan senaryo      false
      */

        Scanner input=new Scanner(System.in);
        System.out.println("Lütfen paswordunuzu   "+
       "    i)En az 8 karakterden oluşsun\n"+
        "ii)Pasword space içermesin\n"+
        "iii)En az 1 tane büyük harf olsun\n"+
       " iv)En az 1 tane küçük harf olsun\n"+
        "v)En az 1 tane sembol olsun\n"+
        "vi)En az 1 tane rakam olsun\n"+
        "giriniz...");

        String pwd =input.nextLine();


        //i)En az 8 karakterden oluşsun
        boolean krktrSys=pwd.length()>7;
        //boolean krktrSys2=pwd.length()=>8; makbul olanı >7dir
        //çünkü javaya daha az iş yaptırır

        //ii)Pasword space içermesin
        boolean spaceOlmamalı=!pwd.contains(" ");
        //" "==>space karakteri içer contains   !==mesin

        //iii)En az 1 tane büyük harf olsun

        boolean bykHrfOlmalı=pwd.replaceAll("[^A-Z]","").length()>0;


        //Methodları aynı satırda yan yana yazdırabiliriz.Buna method chain(method zinciri)denir


        //iv) En az 1 tane küçük harf olmalı
        boolean kckHarfOlmalı=pwd.replaceAll("[^a-z]","").length()>0;

        //v) En az 1 tane sembol olmalı Sembol( tüm harfler ve tüm rakamlar dışındaki herşey)
        boolean sembolOlmalı=pwd.replaceAll("[A-Za-z0-9]","").length()>0;

        //vi) En az 1 tane rakam olmalı
        boolean rakamOlmalı=pwd.replaceAll("[^0-9]","").length()>0;

        System.out.println("Pasword geçerli mi :"+(krktrSys && spaceOlmamalı && bykHrfOlmalı && kckHarfOlmalı && sembolOlmalı && rakamOlmalı));




















    }//main

}//class
