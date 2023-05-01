package javaders.day31collectionsmaps;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMap01 {
    public static void main(String[] args) {
        //map deyince aklınıza sözlük gelsin
        //map'le key value structoru'nu kullanır
     /*   MY NOTES:
        Map'lerde sozluklerdeki gibi kelime ve manasi seklinde bir kullanim vardir.
        "key" kismi tekrarsiz, "value kismi tekrarlı olabilir.
        Mapler "key" ve "value" structur'ini kullanir.
        Map'lerdeki elemanlara "entry" denir.
        Elemanlarin tamanina ise "entryset" denilir.
       Entry'ler   Tekrarsiz  oldugu icin "EntrySet"denilir
       Key ve Value'lar icin ayri ayri data type 'i olabilirler.Bu data type'lari farkli olabilir
       Map'ler "Collection"değildir,farklı bir yapıdır


          HasMap'ler entry'leri rastgele sıralar.Bu yüzden en hızlı map'dir

      */
/*
/** Map deyince aklimiza sözlük gelmeli.

    (KEY)    =    (VALUE)                        Map'ler key-value structure'ni kullanir.
   Tekrarsiz     Tekrarli
                                                 Map'lerdeki elemanlara yani girilen elemana "Entry" denir.
 Cat   =       Evcil Hayvan
 Dog   =       Evcil Hayvan                      Girilen elemanlarin tamamina "EntrySet" denir.
 Crocodile   =   Timsah                          Map'lerdeki elemanlar tekrarsiz oldugu icin
 Tiger   =       Kaplan

Map deyince akliniza sozluk gelsin. Sozluklerde sol tarafta kelime, sag tarafta kelimenin anlami olur.
Ornek:
Cat=Evcil hayvan
Dog=Evcil hayvan
Su sozluk yapisi Java'daki map yapisina benzer. Kelimenin oldugu sirada ayni kelimeden birden fazla bulunmaz
bu kelimeler tekrarsizdir. Sol tarafta tekrarli kelimeler yani esanlamli kelimeler olabilir. Maplerde de boyle
iki bolum olur. Ilk bolum tekrarsiz, ikinci bolumde tekrarli bolum olabilir. Tekrarsiz kisim key, tekrarli kisim
value olarak tanimlanir. Key=Value
Maplar key=value yapisini kullanir. Maplerde birinci ve ikinci deger var. Maplerdeki elemanlara "Entry" denilir.
Elemanlari iceren yapinin tamamina "EntrySet" denir.
Java tekrarsizlara Set diyor,
Key ve valueler icin ayri ayri data tipi olur.
HashMap'e baktigimizda birinci yazilan key'in
ikinci yazilan value'nin data tipini gosterir.

HashMapler HashSetler'de oldugu gibi entry'leri rastgele siralar.
Bu yuzden maplerde en hizli HashMap'tir.
Mapler Collection degildir, tamamiyle farkli bir yapidir.
Mapler'de {} kullanilir. Ekrana yazdirdigimizda entryleri {} icinde gorduk.
Setler ise [] kullanir.
Map'lere eklemeyi add methodu ile degil put methodu ile yaptik.

Get() methodu key ile calisir ve value kismini verir. Integer calisir, integer verir.
Ornek getCat() bize Cat'in anlamini verir

keySet() methodu keyler ile alakalidir. Bize bir set verir. Keyler tekrarsizdir,
keyler verilirken Set'in icine konulur. KeySet methodu butun keyleri verir.
Methodun icine girdigimizde methodun return type'i bizim olusturacagimiz
conteynerin data type ile ayni olmasi gerektigi yazili.

Tum valueleri Integer ile aliyoruz. Keyleri alirken String kullandik.

Ortalama nufusu alirken for each loop kullandik ve value.size'i kullandik.
Value.size'a toplami bolduk.

Mapler'de bazen sadece valueler bazen de sadece keyler ile calisabiliriz.

entrySet() methodu entryler'i kalip halinde Set icine koyar. Get() methodu valueler'i Set icine koyar.
Looplar Mapler'de calismaz. Map'in ismini for each loop parantezi icine koydugumuzda uyari verdi.
Bazen Mapler'deki elemanlar arasina girmek, loop ile bakmak isteriz. Tekrarli islerde loop yapmamzi gerekir.
Map'te loop kullanabilmemiz icin entrySet() methodu kullanilir. Aksi halde looplari kullanamayiz.

entrySet() bize Set verir. Her Set'in < > arasina data tipi yazilir. Set;in elemanlarinin data tipi Map'deki
entrylerdir. Entry'lerin keyleri String, valueleri Integerdir.
 */



           //Map nasıl oluşturulur
        HashMap<String,Integer>countryPopulation=new HashMap<>();

          //Map'e entry nasıl eklenir
countryPopulation.put("Germany",83000000);
countryPopulation.put("Albania",3000000);
countryPopulation.put("USA",400000000);
countryPopulation.put("Turkey",83000000);
countryPopulation.put("Netherland",18000000);

        System.out.println(countryPopulation);//{Netherland=18000000, USA=400000000, Turkey=83000000, Germany=83000000, Albania=3000000}

        //// get() methodu "key" ile calisir ve "value" kismini verir
        countryPopulation.get("USA");
        System.out.println(countryPopulation.get("USA"));//400000000

      //Bütün key'leri nasıl alabiliriz
       Set<String> keys= countryPopulation.keySet();
        System.out.println(keys);//[Netherland, USA, Turkey, Germany, Albania]

        //Bütün "value"'ları nasıl alabilirim
        Collection<Integer> values =  countryPopulation.values();
        System.out.println(values);//[18000000, 400000000, 83000000, 83000000, 3000000]

        //Example1=countryPopulation map'indeki ülkelerin nüfusların ortalaması kaçtır
        Collection<Integer> value =  countryPopulation.values();
 int sum=0;
        for(Integer w :value){
            sum=sum+w;
        }

        System.out.println(sum/value.size());//117400000


       //entrySet() "entry"leri kalip halinde alip bize "Set"in icine koyarak verir
        //Elemanlari "enrtry"olan bir "Set" verdi
        //Loop'lar map'ler ile kullanilamaz. Sadece entry'ler arasinda gezmek istedigimizde loop kullanabiliriz

        Set<Map.Entry<String,Integer>> entries=countryPopulation.entrySet();

        System.out.println(entries);//[Netherland=18000000, USA=400000000, Turkey=83000000, Germany=83000000, Albania=3000000]

        //Example2)countryPopulation Map'indeki ülkelerin karakter sayısı ile nüfusları toplamını bulunuz

        int toplam=0;
        for(Map.Entry<String,Integer> w:entries){
            toplam=toplam+w.getKey().length()+ w.getValue();

        }
        System.out.println(toplam);
























    }
}
