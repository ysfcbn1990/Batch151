package javaders.day40Lambda;

import java.util.*;
import java.util.stream.Collectors;

public class Lambda01 {
    public static void main(String[] args) {

        List<String> iller=new ArrayList<>(Arrays.asList("VanA","MUS","Gumushane","Kutahya","Ankara","MUS","Ordu","Gaziantep","Hatay","Edirne"));
         buyukHarfEnUzunSiraTekrarsiz(iller);
        System.out.println();
        BuyukHrfSonhrfArtanSiraTekrarsiz(iller);
        System.out.println();
buyukHarfTekrarsizArtanSirada(iller);
        System.out.println();

       System.out.println(krtrBestenFazlaSil(iller));
        System.out.println();
hBaslayanUileBitenSil(iller);
        System.out.println(hBaslayanUileBitenSil(iller));
        System.out.println();
        System.out.println(karakterSayisi(iller));
        System.out.println();



    }//main
    // 1) Tum list elemanlarini buyuk harfle, uzunluklarina gore, artan sirada ,tekrarsiz olarak yazdiriniz
    public static void buyukHarfEnUzunSiraTekrarsiz(List<String>iller) {
        iller.
                stream().
                distinct().
                map(t -> t.toUpperCase()).
                sorted(Comparator.comparing(t -> t.length())).
                forEach(t -> System.out.print(t + " "));

    }



    // 2) Tum list elemanlarini buyuk harfle, son harflerine gore, artan sirada ,tekrarsiz olarak yazdiriniz
public static void BuyukHrfSonhrfArtanSiraTekrarsiz(List<String>iller){
        iller.
                stream().
                distinct().
                map(t->t.toUpperCase()).//Lambda expression
                sorted(Comparator.comparing(t->t.charAt(t.length()-1))).
                forEach(t-> System.out.print(t+" "));
}



    // 3) Tum list elemanlarini buyuk harfle, uzunluklarina gore artan sirada ,tekrarsiz olarak yazdiriniz
    // Uzunluklari ayni olan elemanlar alfabetik sirada olsunlar
    public static void buyukHarfTekrarsizArtanSirada(List<String>iller){
        iller.
                stream().
                distinct().
                map(String::toUpperCase).
                sorted(Comparator.comparing(String::length).thenComparing(Comparator.naturalOrder())).
                forEach(System.out::println);//Method Referance()'de bu şekilde yazılır.
                //forEach(t-> System.out.print(t+" "));//Lambda expresiion'da şeklinde yazılıyor

    }


    // 4) Karakter sayisi 5 ten fazla olanelemanlari siliniz
    public static  List<String> krtrBestenFazlaSil(List<String>iller) {

        iller.removeIf(t->t.length()>5);
          return iller;

    }

    // 5)"H" ile baslayan veya "u" ile biten elemanlari siliniz

public static List<String>  hBaslayanUileBitenSil(List<String>iller) {

 iller.removeIf(t->t.startsWith("H")||t.endsWith("u"));
 return iller;
}


    // 6) List elemanlarini karakter sayilarinin karelerini aliniz Ve bir list olarak ekrana yazdirin
public static List<Integer>karakterSayisi(List<String>iller){

    return  iller.stream().map(t->t.length()*t.length()).collect(Collectors.toList());

}




    //  7) List elemanlarindan karakter sayisi cift sayi olanlari bir list icinde ekrana yazdiriniz.









}
