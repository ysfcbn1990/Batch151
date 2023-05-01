package practise.day_06_practise;

import java.util.Scanner;

public class C02_Switch {
    public static void main(String[] args) {

/*
     Bir ATM'de aşağıdaki banka işlemlerini yapmak için, kullanicidan 1-4 arası işlem numarasını sisteme girmesini isteyiniz.

     işlem 1: Bakiye Sorgulama
     işlem 2: Para Cekme
     işlem 3: Para Yatırma
     işlem 4: İşlemi Sonlandırın

     Ve bu islemleri Switch case kullanarak yaptırınız.
     */



    Scanner scan = new Scanner(System.in);

    System.out.println("lütfen yapmak istediğiniz işlem için işlem numarasını giriniz \n işlem 1: Bakiye Sorgulama\n" +
            "     işlem 2: Para Cekme\n" +
            "     işlem 3: Para Yatırma\n" +
            "     işlem 4: İşlemi Sonlandırın");


    int işlemNo = scan.nextByte();
    int bakiye = 1000;
    switch (işlemNo) {
        case 1:
            System.out.println("Bakiyeniz " + bakiye +" TL");
            break;
        case 2:
            System.out.println("Lütfen çekmek istediğiniz tutarı giriniz");
            int cekilecekpara = scan.nextInt();
            if (cekilecekpara <= bakiye) {
                bakiye = bakiye - cekilecekpara;
                System.out.println("Yeni Bakiyeniz : " + bakiye + " tl");
            } else {
                System.out.println("Bakiyeniz yetersizdir");
            }

            break;
        case 3:
            System.out.println("Lütfen yatırmak istediğiniz tutarı giriniz");
            int yatırılacakPara = scan.nextInt();
            if (yatırılacakPara <= 2000) {
                bakiye = bakiye + yatırılacakPara;
                System.out.println("Yeni Bakiyeniz : " + bakiye + " TL");

            } else {
                System.out.println("ATM'de Günlük para yatırma limiti 2000 tl'dir");
            }
            break;

        case 4:
            System.out.println("Techpro Bankı kullandığınız için teşekürler");
            break;
        default: {
            System.out.println("Geçerli bir numara giriniz");
        }
    }





    }
}
