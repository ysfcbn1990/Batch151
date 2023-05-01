package pratices;

public class q01_Variables {
    public static void main(String[] args) {

        //bir variable başlat
        int age = 32;
        int number = 55;
        String isim = "Ali";

        System.out.println(age);
        System.out.println("number = " + number);
        System.out.println("isim = " + isim);
        System.out.println(isim);

        //Variable değerini kopyala
        int hisAge = age;
        System.out.println("hisAge = " + hisAge);
        String onunismi = isim;
        System.out.println("onunismi = " + onunismi);

        //Aynı satırda çoklu variable deklere et.
        int year = 2022, month=3, day =15;
        System.out.println("day = " + day);
        System.out.println("year = " + year);

        //Bir varible değerini güncelle
        year = 2023;
        System.out.println("year = " + year);
        year = 2050;
        System.out.println("year = " + year);

        year = year+5;
        System.out.println("year = " + year);

        // Bir variable deklere et: x
       double x;


        //Bir variable başlat:y
        double y = 100.543;

        //Başka Bir variable başlat: z
        double z = 43;

        //x değişkenini y değişkeni ile başlat
        x = y;


        //x değişkenini  güncelle
        x = 3.14;

        //Değişkenleri yazdır
        System.out.println("x = " + x);
        System.out.println("y = " + y);
        System.out.println("z = " + z);


    }
}
