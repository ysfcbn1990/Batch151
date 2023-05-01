package javaders.day30collections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class Sets01 {
/*
1)Set'ler tekrarsız eleman(unique) depolamak için kullanılır
2)3 tane set Class vardır
i)HashSet Class:
"Hash" benzersiz id oluşturma tekniğidir.Bu tekniğe "Hashing Technique" denir
"HashSet" elemanları rastgele sıralar
"HashSet" elemanları sıralamadığından çok hızlı çalışır.
"HashSet" "null"ı eleman olarak kabul eder.1tane depolayabilir.tekrarsız olduğu için
"HashSet" ler tekrarsız eleman depolamak içindir


ii)LinkedHashSet Class:
"LinkedHashSet"'ler elemanları sizin verdiğiniz sıraya göre dizdiklerinnden(insertion order) HashSet'lere göre yavaştır
 "LinkedHashSet"'ler tekrarsız eleman depolamak içindir

iii)TreeSet Class:
"TreeSet'ler elemanları naturel order'a göre dizerler
"TreeSet'ler elemanları naturel order'a göre dizdiklerinden çooooook yavaştırlar
En yavaş Set "TreeSet"'tir

3)TreeSet çok yavaş olduğundan mümkün olduğu kadar TreeSet kullanmamaya çalışırız

 */

    public static void main(String[] args) {

        HashSet<String>hs=new HashSet<>();
        hs.add("Ajda");
        hs.add("Cüneyt");
        hs.add("Esra");
        hs.add("Zeki");
        hs.add("Ezel");
        hs.add("Cüneyt");//Tekrarlı eleman eklediğinizde hata vermez ama tekrarlı elemanı sadece bir kere ekler.
        hs.add(null);
        hs.add(null);

        System.out.println(hs);//[null,Zeki, Ajda, Cüneyt, Esra, Ezel]

        System.out.println(hs.hashCode());

        LinkedHashSet<Integer> lhs=new LinkedHashSet<>();
      lhs.add(234);
      lhs.add(87);
      lhs.add(-32);
      lhs.add(124);
      lhs.add(null);
        System.out.println(lhs);//[234, 87, -32, 124,null]

        LinkedHashSet<Integer> ls=new LinkedHashSet<>();
        ls.add(451);
        ls.add(87);
        ls.add(231);
        ls.add(124);

        System.out.println(ls);//[451, 87, 231, 124]

        lhs.retainAll(ls);

        System.out.println(lhs);//[87, 124]==>İlk LinkedHashSet'teki farklı elemanlar silindi
        System.out.println(ls);//[451, 87, 231, 124]


        TreeSet<Character> ts=new TreeSet<>();
        ts.add('G');
        ts.add('A');
        ts.add('Z');
        ts.add('R');
        ts.add('U');
        ts.add('R');
       // ts.add(null);==>TreeSet'lere null eklenemez


        System.out.println(ts);//[A, G, R, U, Z]
        ts.first();
        System.out.println(ts.first());//A
        System.out.println(ts.last());//Z


        System.out.println( ts.lower('R'));//G ==>Verilen eleman olan 'R'  den bir önceki elemanı verir.
        System.out.println(ts.lower('D'));//A
        System.out.println(ts.lower('A'));//null
        System.out.println(ts.higher('K'));//R==>Verilen K'den bir sonraki elemanı verir.//Higher elemanın kendisini vermiyor hiiçbi şekilde

        System.out.println(ts.headSet('R'));//[A, G]==>Parantez içindeki R dahil değildir
        System.out.println(ts.headSet('R',true));//[A, G, R]==>Parantez içindeki 'R'dahildir

        System.out.println(ts.tailSet('G'));//[G, R, U, Z]==>Parantez içindeki G dahildir.
        System.out.println(ts.tailSet('G',false));//[R, U, Z]==>Parantez içindeki G dahil değildir

        System.out.println(ts.ceiling('R'));//R==>Eleman Setin içinde varsa elemanın kendisi return eder
        System.out.println(ts.ceiling('K'));//R==>Eleman Setin içinde yoksa sonraki elemanı return eder

        System.out.println(ts.floor('G'));//G==>Eleman Setin içinde varsa elemanın kendisi return eder
        System.out.println(ts.floor('J'));//G==>Eleman Setin içinde yoksa sonraki elemanı return eder

        System.out.println(ts.subSet('G','V'));//[G, R,U]==>İlk parametre dahil ikinci parametre hariç
        System.out.println(ts.subSet('G',false,'Z',true));//[R, U, Z]


















    }
}
