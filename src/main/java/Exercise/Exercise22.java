package Exercise;

import java.util.Arrays;
import java.util.Scanner;

public class Exercise22 {
    public static void main(String[] args) {
        //Spesifik bir elemanın array'lerde olup olmadığını anlamak için gereken kodu yazınız

        String names[]={"K","C","R","A","S"};

        String el="A";

        Arrays.sort(names);

int result=Arrays.binarySearch(names,el);
if(result>=0){
    System.out.println("arrayde "+el+" elemanı mevcut");
}else{
    System.out.println("arrayde "+el+" elemanı yok");
}

//Size verilen bir cümlede kaç kelime olduğunu gösteren kodu yazınız?

        String s="Java is easy. Learn Java earn money ";
String kelime[]=s.replaceAll("[//P{punct}]","").split(" ");
        System.out.println(Arrays.toString(kelime));
int counter=0;
for(String w:kelime){
  counter++;

}

        System.out.println("s arrayinde "+counter+" kelime vardır");


        String students[][]={{"Alı","Kemal"},{"Cemal"},{"Ayhan","Beyhan","Seyhan"},{"Ceyhan","Kayahan"}};
        //Yukarıdaki student arrayinde toplam kaç isim olduğunu bulunuz

        int sum=0;
 for(String[] w:students){
     sum=sum+w.length;
 }
        System.out.println(sum);


        //Yukarıdaki student arrayinde içinde "M" olan isimleri consol'a yazdırınız

        for(String[] w:students){
            for(String m:w){
                if(m.contains("M")){
                    System.out.println(m);
                }

            }
        }

//Bir integer multidimensional array oluşturunuz.tüm elemanların çarpımını hesaplayınız

        int nums[][]={{5,4},{2,3,2},{7}};
        int çarpım=1;
 for(int []w:nums){
     for(int k:w){
         çarpım=k*çarpım;
     }
 }
        System.out.println(çarpım);

        //iki boyutlu bir arrayi tek boyutlu bir arraye ceviriniz
        int numbers[][]={{5,4},{2,3,2},{7}};//==>{5,4,2,3,2,7}
        int top=0;
        for(int[]w:numbers){
            top=top+w.length;
        }
        int[]yeni=new int[top];

        int i=0;
        for(int []w:numbers){
            for(int a:w){
              yeni[i]=a;
              i++;

            }

        }
        System.out.println(Arrays.toString(yeni));



    }
}
