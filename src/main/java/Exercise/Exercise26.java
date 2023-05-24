package Exercise;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Exercise26 {
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
        System.out.println(names);
        System.out.println("sonHarfTekrrszBykHarf(names) = " + sonHarfTekrrszBykHarf(names));
        System.out.println(tersSiraKckHrfAyniKrkterAlfabetik(names));
        System.out.println(karakterSayisiİkidenBykMu(names));
        System.out.println(karaktrSayisiUctenKckMu(names));
        System.out.println(krktrSayisiDorttenKckMu(names));


    }
    //Example1)List elemanlarını son harflerine göre naturel order'da tekrarsız olarak büyük harfle bir listtin içinde return ediniz

    public static List<String> sonHarfTekrrszBykHarf(List<String> names){
      return  names.stream().distinct().map(String::toUpperCase).sorted(Comparator.comparing(t->t.charAt(t.length()-1))).collect(Collectors.toList());

    }
//Example2)List elemanlarını karakter sayılarına  göre ters sırada  küçük harfle bir listtin içinde return ediniz
//Aynı karakter sayısına sahip elemanlar kendi içinde alfabetik sırada olsun
    public static List<String> tersSiraKckHrfAyniKrkterAlfabetik(List<String> names){
        return   names.stream().
                map(String::toLowerCase).
                sorted(Comparator.comparing(String::length).reversed().thenComparing(t->t.charAt(0))).
                collect(Collectors.toList());
    }

    //Example 3)List elemanlarının tamamının karakter sayisinin 2 den büyük olup olmadığını kontrol eden methodu oluşturunuz

    public static boolean karakterSayisiİkidenBykMu(List<String> names){
        boolean a=names.stream().allMatch(t->t.length()>2);
        return a;
    }
//Example 4)List elemanlarının  hiçbirisini karakter sayisinin 3 den küçük olup olmadığını kontrol eden methodu oluşturunuz
public static boolean karaktrSayisiUctenKckMu(List<String> names){
        return names.stream().noneMatch(t->t.length()>3);
}
//Example 5)List elemanlarının en az birisinin karakter sayisinin 4 den kücük olup olmadığını kontrol eden methodu oluşturunuz

    public static boolean krktrSayisiDorttenKckMu(List<String> names){
        return names.stream().anyMatch(t->t.length()<4);
    }



}
