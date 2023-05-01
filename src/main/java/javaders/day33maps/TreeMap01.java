package javaders.day33maps;
/*
1)TreeMap "thread-safe" ve "synchronized"değildir
Note:Map'lerde Multi-thread kullanmanız gerektiğinde sadece HashTable kullanabilirsiniz
2)TreeMap'ler value'larda null kullanımına müsaade eder,key'lerde etmez
3)TreeMap entry'leri keylerine göre natural order'a göre sıraya koyar.Bu yüzden çoook yavaştır
 */


import java.util.HashMap;
import java.util.TreeMap;

public class TreeMap01 {

    public static void main(String[] args) {

long t1=System.nanoTime();
        TreeMap<String,Integer>countryPopulation=new TreeMap<>();
        countryPopulation.put("USA",400000000);
        countryPopulation.put("Netherland",18000000);
        countryPopulation.put("Türkiye",83000000);
        countryPopulation.put("Belgium",12000000);
        countryPopulation.put("Mexico",125000000);
        countryPopulation.put("Brasil",215000000);
        countryPopulation.put("France",75000000);
        countryPopulation.put("Finland",8000000);
        countryPopulation.put("Germany",85000000);
        countryPopulation.put("Madagaskar",30000000);

        System.out.println(countryPopulation);//{Belgium=12000000, Brasil=215000000, Finland=8000000, France=75000000,
        // Germany=85000000, Madagaskar=30000000, Mexico=125000000, Netherland=18000000, Türkiye=83000000, USA=400000000}

        long t2=System.nanoTime();

        HashMap<String,Integer>countryPop=new HashMap<>();
        countryPop.put("USA",400000000);
        countryPop.put("Netherland",18000000);
        countryPop.put("Türkiye",83000000);
        countryPop.put("Belgium",12000000);
        countryPop.put("Mexico",125000000);
        countryPop.put("Brasil",215000000);
        countryPop.put("France",75000000);
        countryPop.put("Finland",8000000);
        countryPop.put("Germany",85000000);
        countryPop.put("Madagaskar",30000000);


TreeMap<String,Integer>countryPop2=new TreeMap<>(countryPop);

        System.out.println(countryPop2);

long t3=System.nanoTime();

        System.out.println(t3-t2);
        System.out.println(t2-t1);



    }










}
