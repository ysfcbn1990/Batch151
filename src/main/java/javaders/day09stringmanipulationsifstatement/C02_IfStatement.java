package javaders.day09stringmanipulationsifstatement;

public class C02_IfStatement {
    public static void main(String[] args) {

        //interwiew questıons USA QA

        // Bir Stringdeki tekrarsız karakterleri ekrana yazdırınız
        //String y="abbccdc";

        String y="aac";//c
       char ch=y.charAt(0);
       if (y.indexOf(ch)== y.lastIndexOf(ch)){
           System.out.println(ch);
       }//if body iki curly braces arası

      char ch1=y.charAt(1);
       if(y.indexOf(ch1)==y.lastIndexOf(ch1)){
           System.out.println(ch1);
       }
       char ch2=y.charAt(2);
       if(y.indexOf(ch2)==y.lastIndexOf(ch2)){
           System.out.println(ch2);
       }

       //Ex: Verilen sayı pozitif ise ekrana "Sayı Pozitif"yazdıran kodu yazınız

        int num=-65;
       if(num>0){
           System.out.println("Sayı Pozitif");
       }

     //Sayı -1 ile 10 arasında ise ekrana verilen data rakamdır yazan kodu yazdırınız

     int rakam=3;
       if(-1< rakam && 10>rakam){
           System.out.println("Verilen data rakamdır");
       }
        System.out.println("******* *******");

   //sayı 3 basamaklı ise ekrana Verilen data 3 basamaklıdır yazdıran kodu yazdırınız,

        int sayı =-999;

        sayı=Math.abs(sayı);
      if(sayı>99 && sayı<1000){
          System.out.println("Veilen data 3 basamaklıdır");
      }













    }//main
}//clas
