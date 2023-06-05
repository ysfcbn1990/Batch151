package javaders.day32maps;

import java.util.HashMap;

public class
HashMap01 {
    public static void main(String[] args) {
        /*
        keySet() methodu bize tum keyleri verir.
 entrySet() methodu tum entryleri bir setin icine koyarak verir.
 replace() methodu valueleri degistirmek icin kullanilir. ornek ("Ezel", 38) iken stdAges.replace("Ezel, 39); ile
 value yani 38, 39'a cevrildi. Bu method keyleri update etmeye yarar.

 Valuleri update etmek icin replace() kullanilabilir, ancak valuleri degistirmek istedigimizde put() yerine replace
 kullanmak en makul olanidir. Okunabilirlik acisindan replace methodu tercih edilir.

 Replace() methodlarindan biri sadece key'e bakiyor, diger replace() methodunda key'nin eski degerine(value)
 bakiyor ve degistiriyor. Yani iki is yapiyor.

replace("Angelina", 57, 61); methodu Map'in icinde "Angelina", 57 varsa 57'yi 61'e donusturur, yoksa donusturmez.
Yani value Map icinde 57 ise degistirecek. 57 olan value yoksa bir degisiklik yapmayacak.

putIfAbsent(); methodu, yoksa oraya ekleme yap diyoruz. Ornek "Brad", 60 yazdik bu method icine ve Map'e method ile
bakildi, Map'de "Brad" ,58 oldugundan bir degisiklik yapilmadi. Cunku key olarak Brad var. Key'i dikkate alir.
Key yoksa istenileni Map icine koyacak.
         */


        HashMap<String,Integer>stdAges=new HashMap<>();

        stdAges.put("Ajda",77);
        stdAges.put("Ezel",38);
        stdAges.put("Tom",76);
        stdAges.put("Brad",58);
        stdAges.put("Angelina",58);

        //"key"i tekrarli kullandigimizda hata vermez sadece en son verilen entry'nin değerini kabul eder.
        //Bu yöntem value güncellemede kullanılabilir.Buna "overwrite"denir.
        //Entry'lerin belirli bir sirada kullanilmasi gerekmiyorsa "HashMap" kullanmak en iyi yoldur


        stdAges.put("Tom",83);

          //Hashmap'ler entry'leri rastgele sıralar.Bu yüzden çok hızlı çalışır
        //Map'ler entry'leri sıralarken key'lere bakıp sıralar

        System.out.println(stdAges);//{Tom=76, Angelina=58, Ajda=77, Brad=58, Ezel=38}

        //replace()methodu "value"ları "key"'leri kullanarak update etmeye yarar

        stdAges.replace("Ezel",39);
        System.out.println(stdAges);//{Tom=83, Angelina=58, Ajda=77, Brad=58, Ezel=39}

        // stdAges.replace("Angelina",58,61);//methodu Map'in içinde "Angelina" 58 varsa 58 i 61 e dönüştürür,yoksa dönüştürmez
        stdAges.replace("Angelina",58,61);
        System.out.println(stdAges);//{Tom=83, Angelina=61, Ajda=77, Brad=58, Ezel=39}

        //putIfAbsent("Ali",60):METHODU map'de Ali key olarak yoksa   Map'e "Ali=60"i ekler,varsa eklemez
        stdAges.putIfAbsent("Ali",60);
        System.out.println(stdAges);//{Tom=83, Angelina=61, Ajda=77, Brad=58, Ezel=39,Ali=60}

        //getOrDefault("Ayse", 0); methodu Map'de varolan "key"ler icin "get() methodu" ile ayni ciktiyi verir.

        //getOrDefault("Ayse", 0); methodu Map'de olmayan "key"ler icin ikinci parametreye koydugunuz degeri verir.
        // "get() methodu" ise null verir.

        System.out.println(stdAges.get("Tom"));//83
        System.out.println(stdAges.getOrDefault("Tom",0));//83

        System.out.println(stdAges.get("Ayse"));//null
        System.out.println(stdAges.getOrDefault("Ayse",0));//0



        ////containsValue(77); methodu value'larin icerisinde 77 olup olmadigini kontrol eder.
        System.out.println(   stdAges.containsValue(77));//true
        System.out.println(   stdAges.containsValue(99));//false

        //containsKey("Ali"); methodu key'lerin icerisinde Ali olup olmadigini kontrol eder.
        System.out.println(stdAges.containsKey("Ali"));//true

        ////remove("Ali"); methodu "key"kullanarak entry'i silmeye yarar.
        stdAges.remove("Ali");
        System.out.println(stdAges);//{Tom=83, Angelina=61, Ajda=77, Brad=58, Ezel=39}

        ////remove("Tom", 81); methodu Map'de key'si "Tom", value'su 81 olan bir entry varsa onu siler, yoksa silmez
        stdAges.remove("Tom",81);
        System.out.println(stdAges);//{Tom=83, Angelina=61, Ajda=77, Brad=58, Ezel=39}

        HashMap<String, Integer> kidsAge = new HashMap<>();

        kidsAge.put("John", 12);
        kidsAge.put("Jim", 22);
        kidsAge.put("Jack", 32);

      //  size() methodu kac tane entry oldugunu soyler. Collectionlarda da kullandik.

        //putAll() methodu, bir Map'in icine baska bir Map koymaya yarar. Bunun icin birden fazla Map olmali.
        //Degisen ilk Map'tir. Hangi Map, digerine konulursa, konulan degismiyor
        //stdAges.putAll(kidsAge); methodu stdAges Map'ine kidsAge Map'ini ekler. Dolayisiyla stdAges Map'i degismis olur.
        //Ama kidsAge Map'i degismez.
stdAges.putAll(kidsAge);
        System.out.println(stdAges);//{Tom=83, Angelina=61, John=12, Ajda=77, Brad=58, Jack=32, Ezel=39, Jim=22}
        System.out.println(kidsAge);//{John=12, Jack=32, Jim=22}



    }//main





}
