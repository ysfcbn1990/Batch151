package javaders.day19arraylists;

import java.util.ArrayList;
import java.util.List;

public class ArrayList02 {
    public static void main(String[] args) {
// Bir Methodu öğrenirken aşağıdaki üç şeyi öğrenin
        //O method ne iş yapar?
        //O method nasıl kullanılır?
        //O method size neyi verir?

        ArrayList<String>cities=new ArrayList<>();
        cities.add("Miami");
        cities.add("Giresun");
        cities.add("Yozgat");
        cities.add("Barcelona");
        cities.add("Miami");
        cities.add("Giresun");
        cities.add("Giresun");
        cities.add("Yozgat");


        //Arraylist'te bir elemanın "ilk görünümü"nasıl silinir

        System.out.println(cities.remove("Miami"));//true
        System.out.println(cities);//[Giresun, Yozgat, Barcelona, Miami, Giresun]

        //Arraylist'te bir elemanın indexi kullanılarak nasıl silinir
        System.out.println( cities.remove(2));//barcelona
        System.out.println(cities);//[Giresun, Yozgat, Miami, Giresun]


        //ArrayList oluştururken en başa ArrayList yerine List de yazabiliirsiniz.Sebebini collections konusunda göreceğiz

        List<Integer> ages =new ArrayList<>();
     ages.add(23);
     ages.add(12);
     ages.add(7);
     ages.add(4);


         // primitiv int olur, primitiv int remove() method icinde kullanilinca Java onu index sanar.
        // Java'ya 12 nin index olmadigini soylemek icin primitive int yerine wrapper class integer kullanmaliyiz
        //example: 12 elamanını ages listen siliniz
     ages.remove((Integer) 12);
        System.out.println(ages);//[23, 7, 4]

        //Bir ArrayList'teki bir elemanın tüm görünümlerini nasıl sileriz
        List<String>citiesToRemovo=new ArrayList<>();
       citiesToRemovo.add ("Giresun");
        citiesToRemovo.add("Yozgat");

        System.out.println( cities.removeAll(citiesToRemovo));//true

        System.out.println(cities);//[Miami]


        //Kısa yoldan bir list oluşturmak için aşağıdaki list.of() methodu kullanılabilir
        List<Character>initials=List.of('a','k','c','d','k');
        System.out.println(initials);//[a, k, c, d, k]

       List<Character>letters=List.of('a','k','c','d','k');
        System.out.println(letters);//[a, c, k, d, k]

        //İki ArrayList'in birbirine eşit olup olmadığını nasıl anlarız
       //equals();methodu aynı elemanlar aynı index'te olduğu sürece true verir
       boolean r1=initials.equals(letters);
        System.out.println(r1);//false


        //indexOf(k); yazarsanız k'nin ilk görünümünün index'ini verir.
      int r2=  initials.indexOf('k');//
        System.out.println(r2);//1

        //lastindexOf(k); yazarsanız k'nin son görünümünün index'ini verir.
      int r3=initials.lastIndexOf('k');
        System.out.println(r3);//4

        //Example1) Bir list'teki tekrarsız elemanları ekrana yazdıran kodu yazınız

        List<Double>prices=List.of(2.5,1.25,2.5,3.75,1.25,4.0);

        for(Double w:prices){
            if(prices.indexOf(w)==prices.lastIndexOf(w)){
                System.out.print(w+" ");//3.75 4.0
            }
        }
        System.out.println("");
//Example=Bir Listte tekrarlı eleman olup olmadığını göstereen kodu yazınız
        List<Double>heights=List.of(2.5,2.5,3.75,1.25,4.0);
        int a=0;
        for(Double w:heights){
            if(heights.indexOf(w)!=heights.lastIndexOf(w)){
                a++;

            }
        }

        if(a==0){
            System.out.println("All elements are unique in the list");

        }else{
            System.out.println("At least one element is not unique in the list");
        }









    }

}
