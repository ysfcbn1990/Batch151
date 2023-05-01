package javaders.day33maps;

import java.util.Hashtable;

public class HashTable01 {
/*
"HashMap" ile "HashTable" arasındaki fark nedir?
1)"HashMap'ler "thread-safe" değildir "HashTable" "thread-safe"dir
"HashMap" "sycnhronized" değildir "HashTable" "sycnhronized" dir
2)"HashMap" bir tane "null" key'e ve istediğiniz kadar "null" value'a müsaade eder
"HashTable" key'lerde de value'larda da "null"kullanılmasına müsaade etmez
3)"HashMap" hızlıdır "HashTable" "HashMap"'e göre yavaştır
4)"HashNaap" ve "HashTable" ikisi de entry'lei rastgele sıralar



 */

    public static void main(String[] args) {


        Hashtable<String,Integer>stdAges=new Hashtable<>();
        stdAges.put("Tom",43);
        stdAges.put("Jim",52);
        stdAges.put("Jack",21);
        stdAges.put("Henry",43);
        stdAges.put("Walker",85);
      //  stdAges.put(null,85);==>"HashTable'ların key'lerine null konulamaz
      //  stdAges.put("Chris",null);==>"HashTable"'ların value'larına da null konulamaz

        System.out.println(stdAges);//{Jim=52, Henry=43, Tom=43, Walker=85, Jack=21}

    }
}
