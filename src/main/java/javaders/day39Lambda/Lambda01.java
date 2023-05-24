package javaders.day39Lambda;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class

Lambda01 {
    public static void main(String[] args) {

        List<String>myList=new ArrayList<>();
        myList.add("Tom");
        myList.add("Jim");
        myList.add("Clara");
        myList.add("Tom");
        myList.add("Clara");
        myList.add("Angelina");


        printElements(myList);

        printEl(myList);
        System.out.println();
        printElExceptStarsWithT(myList);
        System.out.println();
        printElLengthLessThanFour(myList);
        System.out.println();
        printElLengthMoreThanFourWithUpper(myList);
        System.out.println();
        printElLengthMoreThanFourUniqueLowerCase(myList);
        System.out.println();
        printElUniqueToUpperCaseSorted(myList);
        System.out.println();
printElUniqueLowerCaseSortWithLength(myList);
    }



  //  Ilk yolumuzda uc katli bir yapi olusturuyoruz. Buna yapisal kod denir. Mimari bir yapi olusturduk.
  //  Ikinci yolda ise sadece for each dedik. Burada bir yapi olusturmak yerine javaya direct methodun ismini veriyoruz.
  //  Bu proglama tarzina functional programming denir
    // Functional Programing ==>sadece metodlarin kullanildigi mimarinin onemsiz oldugu kod.
    // Lambda functional programing'dir.
    //Lambda collection ve listlerde kullanilabilir fakat map'lerde kullanilamaz
    //Datayi azaltan method'lar en basta kullanilmalidir

    //Example 1: Bir List'teki elemanlari console'a yazdiran methodu olusturunuz.
    //1.way
    public static void printElements(List<String> myList) {//Yapısal kod = Structured Programming
        for (String w : myList) {
            System.out.print(w + " ");

        }
        System.out.println();
    }



     //2.Way
        public static void printEl(List<String> myList){ //Functional Programming=fonksiyonel kod=Lambda Functional Programming'dir
       myList.stream().//  myList.stream().//stream() List'in yapisini yukaridan asagiya olacak sekilde degistirir.Dataları akışa sunar
               forEach(t-> System.out.print(t+" "));//forEach()yazdırır

            }

   //filter()methodu filtreleme yapmak için kullanılır
     //Example 2:Bir List teki 'T'ile başlayanlar hariç tüm elemanları konsola yazdıran methodu oluşturun
    public static void printElExceptStarsWithT(List<String> myList){
      myList.
              stream().
              filter(t->!t.startsWith("T")).
              forEach(t-> System.out.print(t+" "));
    }


   // Example 3;Bir Listte character sayısı 4 den az olan tüm elemanları konsola yazdırınız

    public static void printElLengthLessThanFour(List<String> myList){
        myList.
                stream().
                filter(t->t.length()<4).
                forEach(t-> System.out.print(t+" "));
    }
    // Example 4;Bir Listte character sayısı 4 den çok  olan tüm elemanları büyük harflerle konsola yazdıran methodu oluşturunuz


                //map() var olan elemani degistirir

    public static void printElLengthMoreThanFourWithUpper(List<String> myList){
        myList.stream().
                filter(t->t.length()>4).
                map(t->t.toUpperCase()).
                forEach(t-> System.out.println(t));
    }


    //distinct()methodu tekrarsız elemanları almak için kullanılır
//distinct() ==> tekrarlı elemanları tek sefer yazdırmaya yarar.
    //lambda elemanları azaltanlar önce kullanılır.sonra elde kalan elemanları istenilen formata sokulur
    //Functional programminde her kodu . dan sonra alt satıra koyarız kodun okunurluğu açısından

    // Example 5;Bir List character sayısı 4 den çok  olan tüm elemanları küçük harflerle tekrarsız olarak konsola yazdıran methodu oluşturunuz


    public static void printElLengthMoreThanFourUniqueLowerCase(List<String> myList){
        myList.stream().
                distinct().//tekrarsız
                filter(t->t.length()>4).//eleme yapan filtreler
                map(t->t.toLowerCase()).//yapısını değiştirir
                forEach(t-> System.out.print(t+" "));
    }
//sorted():methodu harflerde alfabetik sıralama yapan sayılarda küçükten büyüğe sıralama yapan methoddur
 //tersten sıralama reverse() order'dır.

//Example 6: Bir List'teki elemanlari tekrarsiz olarak buyuk harflerle alfabetik sirada console'a yazdiran method'u olusturunuz.
 public static void printElUniqueToUpperCaseSorted(List<String> myList){
        myList.
                stream().
                distinct().
                map(t->t.toUpperCase()).
                sorted().//natural order'a göre sıralar
                forEach(t-> System.out.print(t+" "));
 }
//Example 7: Bir List'teki elemanlari tekrarsiz olarak küçük harflerle uzunluklarına göre küçükten büyüğe sıralayarak console'a yazdiran method'u olusturunuz
//ComparatorKarşılaştır demek
    public static void printElUniqueLowerCaseSortWithLength(List<String> myList){
        myList.
                stream().
                distinct().
                map(t->t.toLowerCase()).
                sorted(Comparator.comparing(t->t.length())).//Comparator.comparing(t->t.length()) Karşılaştırma şartını ben yazacaksam oluşturulur

                forEach(t-> System.out.print(t+" "));
    }






        }//class

