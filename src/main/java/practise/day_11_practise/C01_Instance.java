package practise.day_11_practise;

public class C01_Instance {

    int sayı;
    String isim;
    boolean ogrenciMi;


    public static void main(String[] args) {

        // sayi, isim, ogrenciMi seklinde dort tane instance variable olusturalım.
        // Bu instance variable'lerin default degerlerini main icerisinde yazdıralım

        C01_Instance c1 = new C01_Instance();

        System.out.println(c1.isim);//null
        System.out.println(c1.sayı);//0
        System.out.println(c1.ogrenciMi);//false


        C01_Instance c2 = new C01_Instance();
      c1.isim="Hasan";
      c2.isim="Hüseyin";

        System.out.println(c1.isim);//hasan


        c1.sayı=20;
        c2.sayı=25;

        System.out.println(c2.sayı);//25

        System.out.println(c1.sayı);//20

        //instance variable'lar objeye baglıdır
        // hangi obje uzerinden degisiklik yapıldıysa, yapılan bu degisiklik sadece o objeyi baglar






    }


}
