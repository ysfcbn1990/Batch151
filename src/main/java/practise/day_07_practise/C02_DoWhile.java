package practise.day_07_practise;

import java.util.Scanner;

public class C02_DoWhile {
    public static void main(String[] args) {

  /*
    Bir top belirli yükseklikten atılmaktadır.(Scanner ile kullanıcıdan yüksekliği alınız)
    Atıldıktan sonra, atıldığı yüksekliğin 1/2 si kadar yerden yukarı doğru zıplamaktadır
    Top zıplama  yüksekliği 1 metrenin altına indiğinde durmaktadır.
    Bu ana kadar aldigi TOPLAM YOLU ve YERE VURMA SAYISINI bulan do while code blogu create ediniz.
    */

        Scanner scan=new Scanner(System.in);
        System.out.println("Yüksekliği giriniz");
       double yükseklik= scan.nextDouble();

       double toplamYol=0;
       int vurmaSayısı=0;




       do{
      toplamYol+=yükseklik;
      vurmaSayısı++;
      toplamYol+=yükseklik*0.5;
      yükseklik=yükseklik*0.5;

       }while (yükseklik>=1);

       toplamYol+=yükseklik;
       vurmaSayısı++;
        System.out.println("Yere Vurma Sayısı : "+vurmaSayısı);
        System.out.println("Toplam Alınan Yol : "+toplamYol);

    }



}
