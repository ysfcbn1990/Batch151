package Exercise;

import java.util.*;

public class Exercise23 {
    public static void main(String[] args) {
        List<String>myList=new ArrayList<>();
        myList.add("Tom");
        myList.add("Jim");
        myList.add("Clara");
        myList.add("Tom");
        myList.add("Clara");
        myList.add("Angelina");
//Example 1: Bir List'teki elemanlari console'a yazdiran methodu olusturunuz.
        yazdir(myList);
        System.out.println();
        TileBaslayanYazdir(myList);
        System.out.println();
        krktrSayisi(myList);
        System.out.println();
        krktrSayisiDorttenFazlaOlaniBykYaz(myList);
        System.out.println();
        krktSayisi4AzOlaniKckTkrrszYazdir(myList);
        System.out.println();
        tkrrszBykHarfleAlfabetikYaz(myList);
        System.out.println();
        tkrrszKckHarfUzunlkSirala(myList);


    }

    public static void yazdir(List<String>myList){

        myList.stream().forEach(t-> System.out.print(t+" "));

    }
    //Example 2:Bir List teki 'T'ile başlayanlar hariç tüm elemanları konsola yazdıran methodu oluşturun
    public static void TileBaslayanYazdir(List<String>myList){
        myList.stream().filter(t->t.startsWith("T")).forEach(System.out::println);
    }
    // Example 3;Bir Listte character sayısı 4 den az olan tüm elemanları konsola yazdırınız
    public static void krktrSayisi(List<String>myList){
        myList.stream().filter(t->t.length()<4).forEach(t-> System.out.println(t+" "));
    }
    // Example 4;Bir Listte character sayısı 4 den çok  olan tüm elemanları büyük harflerle konsola yazdıran methodu oluşturunuz
    public static void krktrSayisiDorttenFazlaOlaniBykYaz(List<String>myList){
        myList.stream().filter(t->t.length()>4).map(String::toUpperCase).forEach(System.out::println);
    }
    // Example 5;Bir List character sayısı 4 den çok  olan tüm elemanları küçük harflerle tekrarsız olarak konsola yazdıran methodu oluşturunuz
    public static void krktSayisi4AzOlaniKckTkrrszYazdir(List<String>myList){
        myList.stream().distinct().filter(t->t.length()>4).map(String::toLowerCase).forEach(t-> System.out.println(t+" "));

    }
//Example 6: Bir List'teki elemanlari tekrarsiz olarak buyuk harflerle alfabetik sirada console'a yazdiran method'u olusturunuz.
    public static void tkrrszBykHarfleAlfabetikYaz(List<String>myList){
        myList.stream().distinct().map(String::toUpperCase).sorted().forEach(t-> System.out.println(t+" "));
    }
//Example 7: Bir List'teki elemanlari tekrarsiz olarak küçük harflerle uzunluklarına göre küçükten büyüğe sıralayarak console'a yazdiran method'u olusturunuz
    public static void tkrrszKckHarfUzunlkSirala(List<String>myList){
        myList.stream().distinct().map(String::toLowerCase).sorted(Comparator.comparing(t->t.length())).forEach(t-> System.out.println(t+" "));
    }


}
