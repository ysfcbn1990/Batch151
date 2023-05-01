package javaders.day17multidimensionalarraypassbyvalue;

import java.util.Arrays;

public class MultiDimensionalArray01 {
    public static void main(String[] args) {

/*
1)Bir Array'in elemanlarıda array olursa bu tarz array'lere "multidimensional array"denir.
2
 */

//"Multidimensional array nasıl oluşturulur
         String names[][]=new String[3][2];
//"Multidimensional array"e eleman nasıl eklenir
   names[1][0]="P";
   names[2][1]="Z";
    names[0][0]="A";
    names[0][1]="K";
    names[1][1]="M";
    names[2][0]="C";

    //"Multidimensional array"'leri consol'a yazdırmak için "toString()"methodu değil;deepToString()"methodunu kullanınız

        System.out.println(Arrays.deepToString(names));//[[A, K], [P, M], [C, Z]]


//"Multidimensional array"'den spesifik bir eleman nasıl yazdırılır

        System.out.println(names[1][1]);//M


//"Multidimensional array"içindeki bir array'i yazdırmak
        System.out.println(Arrays.toString(names[0]));//[A, K]
        System.out.println(Arrays.toString(names[1]));//[P, M]

        //Kısa yoldan "Multidimensional array"nasıl oluşturulur.
        String students[][]={{"Alı","Kemal"},{"Cemal"},{"Ayhan","Beyhan","Seyhan"},{"Ceyhan","Kayahan"}};

        //Yukarıdaki student arrayinde toplam kaç isim olduğunu bulunuz

        int sum=0;
        for(String[] w:students){
            sum=sum+w.length;

        }
        System.out.println(sum);//8

      //Yukarıdaki student arrayinde içinde "M" olan isimleri consol'a yazdırınız

        for(String[]w:students){
          for(String k:w){
              if(k.contains("m")){
                  System.out.println(k);
              }

          }
        }

//Bir integer multidimensional array oluşturunuz.tüm elemanların çarpımını hesaplayınız

int nums[][]={{5,4},{2,3,2},{7}};
int çarpım=1;
for(int[]w:nums){
    for(int i:w){

     çarpım=çarpım*i;



    }
}
        System.out.println(çarpım);
//iki boyutlu bir arrayi tek boyutlu bir arraye ceviriniz
        int numbers[][]={{5,4},{2,3,2},{7}};//==>{5,4,2,3,2,7}

        //1.step iki boyutlu arrayde kaç eleman olduğunu bulan kodu yazmalıyız
        int toplamElemanSayisi=0;
        for(int[] w:numbers){
            toplamElemanSayisi=toplamElemanSayisi+w.length;
        }

        //2.step Tek boyutlu array'i iki boyutlu array'İn eleman sayısını kullanarak oluşturmalıız
        int newArr[]=new int[toplamElemanSayisi];


        //3.step iki boyutlu arraydeki elemanları tek boyutlu array' e transfer etmeliyiz
       int idx=0;

       for(int[]w:numbers){

           for(int k:w){
               newArr[idx]=k;
               idx++;
           }

       }

        System.out.println(Arrays.toString(newArr));
        System.out.println(idx);

        //Bir integer multidimensional array deki en küçük ve en büyük elemanın toplamını bulunuz

        int ages[][]={{15,4},{12,43,21},{7}};//==>4+43=47

        int small=ages[0][0];
        int big=ages[0][0];

for(int[]w:ages){
    for(int k:w){
   small=Math.min(small,k);
   big=Math.max(big,k);
    }
}
        System.out.println(small);
        System.out.println(big);
        System.out.println(small+big);









    }
}
