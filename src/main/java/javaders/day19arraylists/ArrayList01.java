package javaders.day19arraylists;

import java.util.ArrayList;

public class ArrayList01 {
/*
1)Aynı data tipin'ndeki çoklu dataları depolamak için Array kullanırız
2)Array'lerin  bir negatif yanı var:içine koyacağınız eleman sayısını en başta belirlemek zorundasınız.
3)Arrayler eleman sayısında esnek değildirler.Bu yüzden java "Arraylist" adlı yeni bir yapı oluşturdu.
Bu yapı eleman sayısında esnektir.Hiç eleman koymazsanız eleman sayısını 0 olarak ayarlar,1000 eleman koyarsanız
eleman sayısını 1000 olarak ayarlar
4)"Arraylist" yerine sadece "List" de diyebiliriz.
5)Java Arraylist'leri oluşturduktan sonra Array'leri iptal etmedi çünkü;
i)Array'ler süper hızlıdır
ii)Array'ler memory'de çok az yer kaplar
6)Array'ler primitive data type'ları ve reference'ları depolayabilir ama "Arraylist'ler "non-primitive" data type'larını depolar.
Bu yüzden "Arraylist"'ler "Array"'lerdan daha çok yer kaplar.

 */
public static void main(String[] args) {

        //Arraylist nasıl oluşturulur
    ArrayList<Integer>ages=new ArrayList<>();

    //Arraylist consol'a nasıl yazdırılır
    System.out.println(ages);//[]

        //Arraylist2 eleman nasıl eklenir.
    //1.way
    ages.add(12);
    ages.add(24);
    ages.add(9);//add methodu elemanlrı "giriş sırasına"(insertion order) göre list'e yerleştirir
    System.out.println(ages);//[12,24,9]

   //2.way
    ages.add(1,99);
    System.out.println(ages);//[12, 99, 24, 9]


    //3.way :addAll() methodu bir listi diğer listin içine yerleştirir
    ArrayList<Integer>price=new ArrayList<>();
  price.add(23);
  price.add(33);
 ages.addAll(price);
    System.out.println(ages);//[12, 99, 24, 9, 23, 33]

    //4.way
    ages.addAll(3,price);
    System.out.println(ages);//[12, 99, 24, 23, 33, 9, 23, 33]

    //Arraylist 'te eleman sayısı nasıl  bulunur?

int numOfElement=ages.size();//size()methodu bir list'teki eleman sayısını verir

    System.out.println(numOfElement);//8

    //Arraylist'te specifik bir eleman nasıl alınır
    int el1=ages.get(3);//get()index kullanarak istediğimiz elemanı almaya yarar.
    System.out.println(el1);//23

    //Arraylist'te specifik bir eleman nasıl değiştirilir
       ages.set(6,111);
    System.out.println(ages);//[12, 99, 24, 23, 33, 9, 111, 33]

    //Array list te specific bir elemanin var olup olmadigini nasıl anlarız.
   boolean r1= ages.contains(99);
    System.out.println(r1);//true

    //Bir Arraylistin boş olup olmadığını nasıl kontrol ederiz
     boolean r2=ages.isEmpty();
    System.out.println(r2);//false

    //Bir Arraylistteki tüm elemanları nasıl sileriz
    ages.clear();
    System.out.println(ages);//[]

     boolean r3=ages.isEmpty();
    System.out.println(ages.isEmpty());


    //Example1=Bir listin boş olup olmadığını kontrol eden kodu yazınız
    ArrayList<String>names=new ArrayList<>();
 names.add("Ajda");
 names.add("Cuneyt");
 names.add("Angelina");
 names.add("Brad");


//1.way
      if(names.size()==0){
          System.out.println("List boştur");
      }else{
          System.out.println("Listte en az bir eleman vardır");
      }
   //2.way:Recomended

    if(names.isEmpty()){
        System.out.println("List boştur");
    }else{
        System.out.println("Listte en az bir eleman vardır");
    }























    }//main
}//class
