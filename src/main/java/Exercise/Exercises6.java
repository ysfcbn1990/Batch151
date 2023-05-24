package Exercise;


import java.util.Scanner;

public class Exercises6 {
    public static void main(String[] args) {
        //Ex: Verilen sayı pozitif ise ekrana "Sayı Pozitif"yazdıran kodu yazınız

        int num=-65;
        if(num>0){
            System.out.println("Sayı Pozitif");
        }
//Sayı -1 ile 10 arasında ise ekrana verilen data rakamdır yazan kodu yazdırınız

        int number=5;
        if(num>-1&&num<10){
            System.out.println("Verilen data rakamdır");
        }
        //sayı 3 basamaklı ise ekrana Verilen data 3 basamaklıdır yazdıran kodu yazdırınız,

        int sayi=123;
        sayi=Math.abs(sayi);
        if(sayi>99&&sayi<100){
            System.out.println("Verilen data 3 basamaklıdır");
        }
        //Ex.Verilen karakter büyük harfse ekrana "Büyük Harf" yzdıran kodu yazınız
        char harf='C';
        if(harf>='A'&& harf<='Z' ){
            System.out.println("Büyük Harf");
        }
//Ex.Verilen sayı çift sayı ise ekrana "Çift Sayı" yazdıran kodu yazdırınız
        int deger=124;
        if(deger%2==0){
            System.out.println("Çift Sayi");
        }
        //Ex.Verilen bir sayı 300 den küçük veya 1200 den büyük ise "Harika sayı" yazdıran kodu yazınız
        int num1=350;
        if(num1<300||num1>1200){
            System.out.println("Harika Sayı");

        }
        //Ex.Kullanıcıdan aldığımız kodun tek mi çift mi olduğunu gösteren kodu yazınız
        Scanner scan =new Scanner(System.in);
        System.out.println("Lütfen bir sayı giriniz");
        int sayi1=scan.nextInt();
        if(sayi1%2==0){
            System.out.println("Çift Sayı");
        } else {
            System.out.println("Tek Sayı");
        }
//Verilen bir sayının pozitif negatif yada nötr olduğu kodu yazınız
      int num2=145;
        if(num2>0){
            System.out.println("Pozitif Sayı");
        } else if (num2<0) {
            System.out.println("Negatif Sayı");
        }else{
            System.out.println("Nötr Sayı");
        }


    }
}
