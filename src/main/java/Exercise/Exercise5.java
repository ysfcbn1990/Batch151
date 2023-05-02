package Exercise;

import java.util.Scanner;

public class Exercise5 {
    public static void main(String[] args) {
      /*
Kullanicidan email adresini girmesini isteyin,
Asagidaki kurallara gore kullanicinin
girdigi email adresini kontrol ediniz.
       i)mail adresi "gmail" icermeli
       ii)Space characteri mail'de olmamali
       iii)mail adresinde buyuk harf olmamali
       iv)En az bir tane noktalama isareti bulunmali
 */
        Scanner  scan =new Scanner(System.in);
        System.out.println("Lütfen email adresinizi \ni)mail adresi 'gmail'içermeli" +
                "\nii)Space karakteri mail'de olmamalı" +
                "\niii)mail adresinde büyük harf olmamalı" +
                "\niv)En az bir tane noktalama işareti bulunmalı" +
                "\nolacak sekilde giriniz");
        String email=scan.next();

        boolean gmail=email.contains("gmail");
        boolean space=!email.contains(" ");
        boolean bykhrf=email.replaceAll("[^A-Z]","").length()==0;
        boolean nktlma=email.replaceAll("[A-Za-z0-9]","").length()>0;

        boolean gecerliMi=gmail&&space&&bykhrf&&nktlma;

        System.out.println("gecerliMi = " + gecerliMi);


    }
}
