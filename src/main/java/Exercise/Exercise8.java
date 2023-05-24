package Exercise;

import java.util.Scanner;

public class Exercise8 {
    public static void main(String[] args) {
         /*
Kullanicidan 0'dan kucuk 120'den buyuk deger giremiyecek sekilde datalari aldiktan sonra
Eger calisan kadinsa 60 yasindan buyukse "Emekli Olabilir "yazdirin
Eger calisan erkek ise 65 yasindan buyukse "Emekli Olabilir" yazdiran kodu olusturunuz

 */

        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen yaşınızı giriniz");
        int age= scan.nextInt();
        System.out.println("Lütfen cinsiyetinizi giriniz");
        String cins=scan.next();

        if(age<0||age>120){
            System.out.println("Lütfen gecerli bir yas giriniz");
        }
        if(cins.equalsIgnoreCase("kadın")){
            if(age>60){
                System.out.println("Emekli olabilir");
            }else{
                System.out.println("çalışmalısınız.emekli olamazsınız");
            }
        } else if (cins.equalsIgnoreCase("Erkek")) {
            if(age>65){
                System.out.println("Emekli olabilirsiniz");
            }else {
                System.out.println("Çalışmalısınız.emekli olamazsınız");
            }
        }else{
            System.out.println("Geçersiz cinsiyet.Lütfen tekrar giriş yapınız");
        }


    }
}
