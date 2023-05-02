package Exercise;

import java.util.Scanner;

public class Exercise4 {
    public static void main(String[] args) {
   /*     Aşağıdaki kurallara göre kullanıcının girdiği password'u kontrol ediniz

        i)En az 8 karakterden oluşsun
        ii)Pasword space içermesin
        iii)En az 1 tane büyük harf olsun
        iv)En az 1 tane küçük harf olsun
        v)En az 1 tane sembol olsun
        vi)En az 1 tane rakam olsun*/

        Scanner scan=new Scanner(System.in);
        System.out.println("please enter your password");
        String pasword=scan.nextLine();

       boolean karakter=pasword.length()>7;
       boolean space=!pasword.contains(" ");
       boolean bykhrf=pasword.replaceAll("[^A-Z]","").length()>0;
       boolean kckhrf=pasword.replaceAll("[^a-z]","").length()>0;
       boolean rakam=pasword.replaceAll("[0-9]","").length()>0;
       boolean smbl=pasword.replaceAll("[a-zA-Z0-9]","").length()>0;

       boolean gecerli=karakter&&space&&bykhrf&&kckhrf&&rakam&&smbl;

       if(gecerli==true){
           System.out.println("sifre gecerli");
       }else{
           System.out.println("gecersiz sifre");
       }



    }
}
