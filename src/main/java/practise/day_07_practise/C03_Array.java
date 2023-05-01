package practise.day_07_practise;

import java.util.Arrays;
import java.util.Scanner;

public class C03_Array {
    public static void main(String[] args) {
        // Kullanıcıdan 4 tane rakam sisteme girmesini isteyiniz
        // ve bu rakamları bir array'e esayn ediniz. Olusturdugunuz array'i yazdırınız

        // Array'in icindeki elemanların ortalamasını bulunuz. Ortalamayı yazdırınız

        // Ortalamadan daha buyuk olan array elemanlarını yazdırın


        Scanner scan=new Scanner(System.in);

        int arr[]=new int[4];

      for(int i=0;i<4;i++){//kullanıcıdan 4 tane rakam alacağımız için 0 dan 4e kadar for döngüsüne aldık
          System.out.println("Bir rakam giriniz");
          int rakam= scan.nextInt();
          arr[i]=rakam;//kullanıcıdan aldığımız her rakamı sırasıyla array'a atadık

      }

        System.out.println(Arrays.toString(arr));


      int toplam=0;
      for(int each:arr){
          toplam=toplam+each;
      }

      double ortalama=toplam/arr.length;
        System.out.println(ortalama);


        for (int each:arr){
            if(each>ortalama){
                System.out.println(each+" ");
            }


        }





    }
}
