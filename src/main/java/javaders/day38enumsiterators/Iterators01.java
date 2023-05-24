package javaders.day38enumsiterators;

import java.util.*;

public class Iterators01 {
    /*
    1)Iterator'lar Loop'ların yaptığı aynı işi yapar.
    2)Iterator'larda sonsuz loop oluşma ihtimali yoktur
    3)Iterator'lar ile loop'lar arasında performans farkı yoktur
    4)Iterator'lar bir collection'dan eleman silme ve bir collection'daki elemanı değiştirme konusunda daha başarılıdır
    5)İki tip iterator var;1)Iterator: Sadece eleman silmede kullanılır,
                                       eleman eklemek veya elemanı değiştirmek mümkün değildir
                            2)ListIterator: Bu eleman silebilir,ekleyebilir ve değiştirebilir
                            Note:"Iterator" sadece soldan sağa (ilk elemandan son elemana )çalışır
                                          "ListIterator" ise iki yönlü çalışır.

     */
    public static void main(String[] args) {

        List<String> myList = new ArrayList<>();
        myList.add("Tom");
        myList.add("Jim");
        myList.add("Clara");
        myList.add("Angie");
        myList.add("Mark");
        System.out.println(myList);//[Tom, Jim, Clara, Angie, Mark]

//"Iterator" kullanalım.

     Iterator<String> myItr=myList.iterator();//POİNTER ıteratorun başına gelecek şekilde bir yapı oluşturur


     while(myItr.hasNext()){//hasnext()pointer'a senden sonra eleman var mı diye sorar
                            //Eleman varsa true yoksa false döndürür

         myItr.next();//next()pointer'ı bir sonraki elemanın önüne taşır ve üstünden atladığı elemanı return eder.

         myItr.remove();//next()methodunun return ettiği eleamnı siler
     }


        System.out.println(myList);//[]


//ListIterator kullanalım

        List<String>yourList = new ArrayList<>();
        yourList.add("Tom");
        yourList.add("Jim");
        yourList.add("Clara");

        System.out.println(yourList);

        ListIterator<String>yourListItr =yourList.listIterator();
        while(yourListItr.hasNext()){
            String el=yourListItr.next();

            yourListItr.set(el+"!");//set() methodu List'i update etmeye yarar.



        }


        System.out.println(yourList);


              //hasPrevious()ve previous nasıl kullanılır
        while(yourListItr.hasPrevious()){
            String el=yourListItr.previous();
            System.out.println(el);
            yourListItr.set("?"+el);//set()methodu listi update etmeye yarar

        }
        System.out.println(yourList);


        //En Sondan En Başa nasıl iterate edebiliriz
        LinkedList<String> ourList = new LinkedList<>();
        ourList.add("Tom");
        ourList.add("Jim");
        ourList.add("Clara");
        ourList.add("Angie");
        ourList.add("Mark");
        System.out.println(ourList);


        Iterator<String> ourListItr=ourList.descendingIterator();//;// descendingIterator() ancak LinkedList ile kulanilabilir.
////descendingIterator() otomatik olarak pointer'i en sona koyar ve islem sondan baslar
        ////descendingIterator() kullanabilmek icin LinkedList olmasi gerekir ArrayList'te kullanamayiz
        while (ourListItr.hasNext()){
            String el=ourListItr.next();
            System.out.println(el);
        }














    }



}
