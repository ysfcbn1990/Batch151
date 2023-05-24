package Exercise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Exercise24 {
    public static void main(String[] args) {
        List<String> iller=new ArrayList<>(Arrays.asList("VanA","MUS","Gumushane","Kutahya","Ankara","MUS","Ordu","Gaziantep","Hatay","Edirne"));

        bykHarfleUzunluklarinaGoreTkrrszYazdir(iller);
        System.out.println();
        bykHarfSonHarfleArtanSiradaTkrrszYaz(iller);
        System.out.println();
        bykHarfTkrrszUzunluklarinaGoreAyniOlanAlfabetikOlaniYaz(iller);
        System.out.println();
        System.out.println(krktrSayisi5tenFazlaOlaniSil(iller));
        System.out.println(HileBaslayanUileBitenSil(iller));
        System.out.println();
        System.out.println(elemanKrktrSayisiKaresi(iller));
        System.out.println();


    }
    // 1) Tum list elemanlarini buyuk harfle, uzunluklarina gore, artan sirada ,tekrarsiz olarak yazdiriniz
    public static void bykHarfleUzunluklarinaGoreTkrrszYazdir ( List<String> iller){
        iller.stream().distinct().map(String::toUpperCase).sorted(Comparator.comparing(t->t.length())).forEach(t-> System.out.println(t+" "));
    }
    // 2) Tum list elemanlarini buyuk harfle, son harflerine gore, artan sirada ,tekrarsiz olarak yazdiriniz
    public static void bykHarfSonHarfleArtanSiradaTkrrszYaz(List<String> iller){
        iller.stream().distinct().map(String::toUpperCase).sorted(Comparator.comparing(t->t.charAt(t.length()-1))).forEach(t-> System.out.println(t+" "));
    }
    // 3) Tum list elemanlarini buyuk harfle, uzunluklarina gore artan sirada ,tekrarsiz olarak yazdiriniz
    // Uzunluklari ayni olan elemanlar alfabetik sirada olsunlar

    public static void bykHarfTkrrszUzunluklarinaGoreAyniOlanAlfabetikOlaniYaz(List<String> iller){
        iller.stream().distinct().map(String::toUpperCase).sorted(Comparator.comparing(String::length).thenComparing(Comparator.naturalOrder())).
                forEach(t-> System.out.println(t+" "));
    }
    // 4) Karakter sayisi 5 ten fazla olanelemanlari siliniz
    public static List<String> krktrSayisi5tenFazlaOlaniSil(List<String> iller){
        iller.removeIf(t->t.length()>5);
        return iller;
    }

    // 5)"H" ile baslayan veya "u" ile biten elemanlari siliniz

    public static List<String> HileBaslayanUileBitenSil(List<String> iller){
        iller.removeIf(t->t.startsWith("H")||t.endsWith("u"));
        return iller;
    }
    // 6) List elemanlarini karakter sayilarinin karelerini aliniz Ve bir list olarak ekrana yazdirin
    public static List<Integer> elemanKrktrSayisiKaresi(List<String> iller){
       return iller.stream().map(t->t.length()*t.length()).collect(Collectors.toList());

    }

}
