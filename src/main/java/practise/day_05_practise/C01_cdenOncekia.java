package practise.day_05_practise;

import java.util.Scanner;

public class C01_cdenOncekia {

    /*
      Kullanıcıdan aldığınız 'c' ve 'a' iceren bir String değer içerisindeki
   'c' karakterinden önceki 'a' karakterlerinin sayısını bulan bir kod yazınız.
   */


    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        System.out.println("Lütfen a ve c harfleri içeren kelime giriniz");
        String str=input.next();

        int counter=0;
        for(int i=0;i<str.indexOf("c");i++){
            if(str.charAt(i)=='a'){
                counter++;
            }
        }

        System.out.println(str+" kelimesinde c den önce "+counter+" a harfi vardır");


       int sayac=0;
        if(str.contains("c")&&str.contains("a")){
            for(int i=0;i<str.length();i++){
                if(str.charAt(i)=='a'){
                    sayac++;
                }else if(str.charAt(i)=='c'){
                    break;
                }


            }

        }else{
            System.out.println("Lütfen 'c' ve 'a' harfi içeren kelime giriniz");
        }


        System.out.println(sayac);

    }
}