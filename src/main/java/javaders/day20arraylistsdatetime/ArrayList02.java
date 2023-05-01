package javaders.day20arraylistsdatetime;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArrayList02 {
    public static void main(String[] args) {

 /*
 Example1)Bir integer Listteki birbirine en yakın iki elemanı bulunuz
 [12,23,10,19]==>12 and 10
  */

        List<Integer>sayı=new ArrayList<>();
        sayı.add(12);
        sayı.add(23);
        sayı.add(10);
        sayı.add(19);

        System.out.println(sayı);//[12, 23, 10, 19]

        // Collections.sort(sayı);mehodu sayı listesindeki elemanları küçükten büyüğe(natural order) sıralar
        Collections.sort(sayı);
        System.out.println(sayı);//[10, 12, 19, 23]

    int minDeger=sayı.get(1)- sayı.get(0);

for(int i=1;i<sayı.size(); i++){
    minDeger=Math.min(minDeger, sayı.get(i)- sayı.get(i-1));
}


        System.out.println(minDeger);

for(int i=1;i<sayı.size();i++){
    if(sayı.get(i)- sayı.get(i-1)==minDeger){
        System.out.println(sayı.get(i)+" and "+sayı.get(i-1));
    }
}






    }//main

}//class
