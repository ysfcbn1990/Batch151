package javaders.day15loopsarrays;

import java.util.Arrays;

public class Arrays02 {

    /*
    1)Application'larda "data " ile bu "dataları işleyen kodlar(Logic)" birbirinden ayrılır.
    Yani:logic dataya bağımlı olmamalıdır.
    Data'ya bağımlı olarak yazılan kodlara "hard code"denir
    "Hard code" hatalı kod demektir

     Asagidaki grades array'inde son elemani almak icin "4" veya "grades.length-1" kullanilabilir.
  "4" kullanirsaniz array'e bir eleman eklendiginde kodunuz yanlis cikti verir ama "grades.length-1"
  kullanirsaniz hep dogru sonucu alirsiniz

     */
    public static void main(String[] args) {

        //Array'leri kısa yoldan nasıl oluşturabiliriz

        int grades[]={67,98,100,34,76};
        System.out.println(Arrays.toString(grades));//[67, 98, 100, 34, 76]

     //Example:grades arrayinde en küçük ve en büyük grade'in toplamını ekrana yazdıran kodu yazdırınız

      Arrays.sort(grades);//arraysdeki sayıları küçükten büyüğe doğru sıralar


        System.out.println(Arrays.toString(grades));
        System.out.println(grades[0]+grades[grades.length-1]);//134

        //Example2) Size verilen bir String arraydeki isimlerden 5 karakterde az karakter içerenleri consol'a yazdırınız

        String stdNames[] = new String[5];
        stdNames[0] = "Ajda";
        stdNames[3] = "Cuneyt";
        stdNames[2] = "Tom";
        stdNames[1] = "Ayhan";
        stdNames[4] = "Filiz";

        for (String a :stdNames) {

            if (a.length() < 5) {
                System.out.println(a);
            }
        }
//Example 3)Size verilen String array deki ismleri alfebetik sıraya koyduktan sonra "F" ile başlayan isimlerden önceki isimleri consola yazdırınız
      Arrays.sort(stdNames);//Stringlerde alfebetik sıralama yapar

      for(String w : stdNames){

          if(w.startsWith("F")){
              break;
          }
          System.out.println(w);
      }
//Example 4)Size verilen String array deki ismleri alfebetik sıraya koyduktan sonra "F" ile başlayan isimlerden önceki isimleri ve "F" ile
// başlayanları consola yazdırınız

        Arrays.sort(stdNames);//Stringlerde alfebetik sıralama yapar

        for(String w : stdNames){

            System.out.println(w);

            if(w.startsWith("F")){

                break;
            }

        }

//Example 5)Size verilen String array deki ismleri alfebetik sıraya koyduktan sonra "F" ile başlayan isimler hariç diğer isimleri consola yazdırınız

        Arrays.sort(stdNames);//Stringlerde alfebetik sıralama yapar

        for(String w : stdNames){



            if(w.startsWith("F")){
              continue;

            }
                System.out.println(w);


        }










    }//main
}//class
