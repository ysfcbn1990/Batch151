package javaders.day44lambda;

import java.awt.color.ColorSpace;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.Clock;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Lambda01 {



    public static void main(String[] args) throws IOException {

        //Example 1: Verilen text file icindeki text'i console'a yazdiran code'u yaziniz.

        Files.lines(Paths.get("src/main/java/day44lambda/myTextFile.txt")).forEach(System.out::println);

       //lines methodu Paths.get ile calisir.
        //Satirlar oldugu icin "ln" i silmedik

      /*

    Notlar :

           1) lines methoduna dosya yolunu yazmak için Paths classından get methodunu kullanmalıyız.
           2) foreach() methodu ile satır satır okuma yaptık.
           3) Files classındaki lines methodu datayı Stream olarak verir. Bu sebeple stream'deki bütün
              methodları burada kullanabiliriz.

       */


        //Example 2:Verilen bir text file içindeki text'i büyük harflerle consol'a yazdıran code yazınız
        Files.lines(Paths.get("src/main/java/day44lambda/myTextFile.txt")).map(String::toUpperCase).forEach(System.out::println);


        //Example 3:Verilen bir text file içindeki textlerde Java kelimesinin olup olmadığını kontrol eden kodu yazınız
      boolean r1=  Files.lines(Paths.get("src/main/java/day44lambda/myTextFile.txt")).anyMatch(t->t.contains("Java"));
        System.out.println(r1);


        //Example 4:Verilen bir text file içindeki textlerde kullanılan farklı kelimeleri bir list içinde return ediniz
        List<String> words=

        Files.
                lines(Paths.get("src/main/java/day44lambda/myTextFile.txt")).
                map(t->t.replace("\\p{Punct}","").split(" ")).
                flatMap(Arrays::stream).
                distinct().
           collect(Collectors.toList());
        System.out.println(words);

        //flatMap() methodu arrayleri istenen sekle cevirir. Biz burada stream'e cevirdik


//Example 5:Verilen bir text file içindeki text'de toplam kaç harf kullanıldığını gösteren kodu yazınız
      long numOfLetters=  Files.
                lines(Paths.get("src/main/java/day44lambda/myTextFile.txt")).
                map(t->t.replaceAll("[^a-zA-Z]","").split("")).
                flatMap(Arrays::stream).
              count();

        System.out.println(numOfLetters);

//Example 6:Verilen bir text file içindeki text'de kullanılan tüm harfleri alfabetik olarak ters sırada bir listtin içinde return eden kodu yazınız
        List<String> letters=     Files.
                lines(Paths.get("src/main/java/day44lambda/myTextFile.txt")).
                map(t->t.replaceAll("[^a-zA-Z]","").split("")).
                flatMap(Arrays::stream).
                sorted(Comparator.reverseOrder()).
                collect(Collectors.toList());

        System.out.println(letters);

    }

}