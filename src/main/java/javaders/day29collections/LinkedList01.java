package javaders.day29collections;

import java.util.LinkedList;

public class LinkedList01 {



/*
ArrayList'ler eleman ekleme ve silme'de tekrar indexleme yapmak zorunda olduklarından eleman ekleme ve silmede başarısızdırlar.yani yavaş çalışırlar
NOTE:LinkedList' de eleman yerine "node" var denir.
ArrayListler eleman silme ve eklemede yavastirlar. Cunku tekrar indexlemeye ihtiyac duyarlar.
LinkedListler ise elaman silmede basarilidirlar. LinkedListlerde her eleman bir sonrakini gosteriyor
ve en sondakinin sonrasi olmasa da null gosterir. LinkedListeler index kullanmazlar.

LinkedListlerde en bastaki elemandan daha once Head eleman vardir. Son eleman'a Tail denir en sonda
oldugu icin. Elemanlarin yapisi farkli olup bunlara Node denir. Yapinin bir yuzune point, on yuzune
ornegimize gore harf olan kismina Data denir. Node, Data ve Point'den olusuyor.
Bir eleman sildigimizde eleman sildik demiyoruz, node sildigimizi soyluyoruz.
NOTE:LinkedList'ler "index" kullanmazlar bu yuzden "node" ekleme ve silme islemlerinde tekrar "index'leme" yapilmaz
NOTE:LinkedList'ler de node ekleme ve silme islemleri yaparken sadece pointer'lari degistirir
ArrayList'ler eleman bulmada çok başarılıdır

1) LinkedList’ler index kullanmazlar bu yuzden node ekleme ve silme islemlerinde tekrar indexleme yapilmaz.
2)LinkedList’lerde node ekleme ve silme islemleri yaparken sadece pointer’lari degistirir.
3)LinkedList'ler node silme ve ekleme'de çok başarılı oldukları için,silme ve ekleme işlemlerini çoklukla yapacağımız zaman
LinkedList kullanınız
4)ArrayList'ler indexleri adres gibi kullanır bu yüzden ArrayList'ler "search" işlemlerinde çok başarılıdır
note:İhtiyacınız olan collection çoğunlukla silme ve ekleme işlemleri yapacaksa(müze ziyaretleri gibi) LinkedList
"search" işlemleri yapacaksa(Amerika eyaletleri gibi)ArrayList kullanınız


 */

    public static void main(String[] args) {


        LinkedList<String>s=new LinkedList<>();
        s.add("Esra");
        s.add("Steve");
        s.add("Ajda");
        s.add("Müge");
        s.add("Cuneyt");
        s.add("Esra");
        s.add(2,"Esen");
        s.addFirst("Kemal");
        s.addLast("Ajdar");

        System.out.println(s);//[Kemal,Esra, Steve, Ajda, Esen, Müge, Cuneyt, Esra, Ajdar]

      //  s.remove(2);
        System.out.println(s);//[Kemal, Steve, Esen, Müge, Cuneyt, Esra, Ajdar]

       // s.remove("Ajdar");
        System.out.println(s);//[Kemal, Steve, Esen, Müge, Cuneyt, Esra]

    //  s.remove();
        System.out.println(s);//[Steve, Esen, Müge, Cuneyt, Esra]

    //    s.removeFirstOccurrence("Esra");
        System.out.println(s);//[Kemal, Steve, Esen, Ajda, Müge, Cuneyt, Esra, Ajdar]

        s.removeLastOccurrence("Esra");
        System.out.println(s);//[Kemal, Esra, Steve, Esen, Ajda, Müge, Cuneyt, Ajdar]


        /*
         * Retrieves, but does not remove, the head (first element) of this list.

       * @return the head of this list, or {@code null} if this list is empty
         */
     String r1=s.peek();//ilk elemanı size getirir ama silmez(copy-paste)
        System.out.println(r1);//kemal
        System.out.println(s);//[Kemal, Esra, Steve, Esen, Ajda, Müge, Cuneyt, Ajdar]


       String r2=s.poll();//İlk elemanı size verir ve List'ten siler(cut-paste)
        System.out.println(r2);//Kemal
        System.out.println(s);//[Esra, Steve, Esen, Ajda, Müge, Cuneyt, Ajdar]

        String r3=s.element();//İlk elemanı silmeden size verir
        System.out.println(r3);//Esra
        System.out.println(s);//[Esra, Steve, Esen, Ajda, Müge, Cuneyt, Ajdar]

        /*
        Retrieves, but does not remove, the head (first element) of this list.
        Throws:NoSuchElementException – if this list is empty

        note:peek() element() ikiside elemanı silmeden size verir.
        Ama peek() List boş ise size "null" verir,element ise "hata" verir
        */

        String r4=s.pop();
        System.out.println(r4);
        System.out.println(s);

/*
        note:poll() pop() ikiside elemanı siler size verir.
        Ama poll() List boş ise size "null" verir,pop() ise "hata" verir
 */








    }




}
