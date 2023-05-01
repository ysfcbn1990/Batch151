package practise.day_09_practise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C01_List {
    public static void main(String[] args) {

  /*
    Bir list olusturunuz. 1'den 15'e kadar sayıları bu liste ekleyiniz.
    Daha sonra 10'dan buyuk olan tum elemanları 2 katına cıkarınız
    */

        List<Integer>sayı=new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10,11,12,13,14,15));
        System.out.println(sayı);//[1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15]

        for(int i=0;i<sayı.size();i++){//0'dan listin uzunluğuna kadar döngüye aldık
            if(sayı.get(i)>10){//listin i.indexindeki sayı 10'dan büyük mü diye kontrol ettik
                sayı.set(i,2*sayı.get(i));//büyükse;i. indexindeki elemanı 2 katıyla set ettik
            }
        }

        System.out.println(sayı);//[1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 22, 24, 26, 28, 30]



    }


}
