package javaders.day16arraysforeachloop;

import java.util.Arrays;

public class Arrays03 {
    public static void main(String[] args) {
        //Spesifik bir elemanın array'lerde olup olmadığını anlamak için gereken kodu yazınız

        String names[]={"K","C","R","A","S"};

        String el="A";

        int counter=0;

        for(String w:names){


            if(w.equals(el)){
                counter++;
                break;
            }
        }
        if(counter>0){
            System.out.println("Array has " + el);
        }else{
            System.out.println("Array does not have " + el);
        }


        //2.Way:
        // BinarySearch() method hızlı arama yapar.
        // BinarySearch() methodunu sort() yapmadan kullanmayınız çünkü binarySearch()mantığı sıralı elemanlar için geçerlidir
        //  BinarySearch() methodu var olan elemanlar için o elemanın index'ini verir
        // BinarySearch() methodundan aldığımız index 0 veya 0'dan büyükse bu o eleman array'de var demektir
        // BinarySearch() methodu olmayan elemanlar için negatif tamsayı değeri verir.
        // - işaretinin anlamı o eleman yok demektir
        //"sayı "ise o eleman olsaydı kaçıncı eleman olurdu demektir

        Arrays.sort(names);

        int result=Arrays.binarySearch(names,el);//-3 YOk demektir.olsaydı 3.eleman olacaktı

        System.out.println(result);

        if(result<0){
            System.out.println("Array does not have " + el);
        }else{
            System.out.println("Array has " + el);
        }














    }
}
