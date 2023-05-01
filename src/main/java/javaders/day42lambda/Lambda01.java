package javaders.day42lambda;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Lambda01 {
    /* Match
allMatch() ==> tum elemanlar sarti saglarsa true dondurur
anyMatch() ==>bir yada birden daha fazla eleman sarti saglarsa true dondurur
noneMatch() ==>hic bir eleman sarti saglamazsa true dondurur
 */
    public static void main(String[] args) {

        List<String> names = new ArrayList<>();
        names.add("Tom");
        names.add("Alex");
        names.add("Jim");
        names.add("Michael");
        names.add("Mary");
        names.add("Alexander");
        names.add("Alex");
        names.add("Brad");
        System.out.println(sonHarflaerineGoreTekrarsizBuyukhrfleListeEkle(names));//[MİCHAEL, TOM, JİM, ALEXANDER, ALEX, MARY]

        System.out.println(krkterSyisinaGoreTersSiradaKucukHrfleAyniKrkterAlfabetikSiraListeEkle(names));//[alexander, michael, alex, alex,brad, mary, jim, tom]

        System.out.println(krktrSayisiIkidenBuyukMu(names));//true

        System.out.println(krkterSayisiHicBiriUctenKucukOlmamalı(names));//true

        System.out.println(enAzBirUzunlukDorttenAz(names));//true


    }

    //Example1)List elemanlarını son harflerine göre naturel order'da tekrarsız olarak büyük harfle bir listtin içinde return ediniz
    public static List<String> sonHarflaerineGoreTekrarsizBuyukhrfleListeEkle(List<String> names) {//[MİCHAEL, TOM, JİM, ALEXANDER, ALEX, MARY]
        return names.
                stream().
                distinct().
                map(String::toUpperCase).
                sorted(Comparator.comparing(t -> t.charAt(t.length() - 1))).
                collect(Collectors.toList());// Normalde distinct elemanlari depolamak icin "Set" kullanilir.
        // ama lambda'daki collect(Collectors.toSet()); method'u elemanlari
        // rastgele siralar halbuki bu soruda rastgele siralama kabul edilmiyor.
        // Bu yuzden mecburen collect(Collectors.toList()); kullandik.

    }
    //Example2)List elemanlarını karakter sayılarına  göre ters sırada  küçük harfle bir listtin içinde return ediniz
//Aynı karakter sayısına sahip elemanlar kendi içinde alfabetik sırada olsun

public static List<String>krkterSyisinaGoreTersSiradaKucukHrfleAyniKrkterAlfabetikSiraListeEkle(List<String> names){
     return   names.stream().
                map(String::toLowerCase).
                sorted(Comparator.comparing(String::length).reversed().thenComparing(t->t.charAt(0))).
                collect(Collectors.toList());
}

//Example 3)List elemanlarının tamamının karakter sayisinin 2 den büyük olup olmadığını kontrol eden methodu oluşturunuz
    public static boolean krktrSayisiIkidenBuyukMu(List<String> names){
        return names.stream().allMatch(t->t.length()>2);
        //allMatch()=Bir listteki bütün elemanların spesifik ö1zelliklerine bakmak için kullanılır
    }

//Example 4)List elemanlarının  hiçbirisini karakter sayisinin 3 den küçük olup olmadığını kontrol eden methodu oluşturunuz
public static boolean krkterSayisiHicBiriUctenKucukOlmamalı(List<String> names){
      return  names.stream().noneMatch(t->t.length()<3);
}
//Example 5)List elemanlarının en az birisinin karakter sayisinin 4 den kücük olup olmadığını kontrol eden methodu oluşturunuz
public  static boolean enAzBirUzunlukDorttenAz(List<String> names){
       return names.stream().anyMatch(t->t.length()<4);
}










}//class