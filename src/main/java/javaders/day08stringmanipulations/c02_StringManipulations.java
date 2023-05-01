package javaders.day08stringmanipulations;

import java.util.Scanner;

public class c02_StringManipulations {

    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        System.out.println("Lütfen e-mail adresini " +
                "i)mail adresi 'gmail' icermeli\n"+
                "ii)Space characteri mail'de olmamali\n" +
                "iii)mail adresinde buyuk harf olmamali\n" +
                " iv)En az bir tane noktalama isareti bulunmali" +
                "giriniz");

 /*
Kullanicidan email adresini girmesini isteyin,
Asagidaki kurallara gore kullanicinin
girdigi email adresini kontrol ediniz.
       i)mail adresi "gmail" icermeli
       ii)Space characteri mail'de olmamali
       iii)mail adresinde buyuk harf olmamali
       iv)En az bir tane noktalama isareti bulunmali
 */
         String email=input.nextLine();


         boolean gmail=email.contains("gmail");
         boolean space=!email.contains(" ");
         boolean bykhrf=email.replaceAll("[a-z0-9]","").replaceAll("[\\p{Punct}]","").
                 replaceAll(" ","").length()==0;
         boolean noktalama=email.replaceAll("[a-zA-Z0-9]","").replace(" ","").length()>0;
        boolean noktalama1= email.replaceAll("[^\\p{Punct}]","").length()>0;
        boolean noktalama2= email.replaceAll("[\\P{P}]","").length()>0;
        System.out.println(gmail && bykhrf && space && noktalama);





    }
}
