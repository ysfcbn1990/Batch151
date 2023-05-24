package javaders.day41Lambda;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Lambda01 {
    public static void main(String[] args) {

        List<Integer> nums = new ArrayList<Integer>();
        nums.add(8);
        nums.add(9);
        nums.add(7);
        nums.add(-4);
        nums.add(9);
        nums.add(2);
        nums.add(4);
        nums.add(6);
        nums.add(15);

        System.out.println(tekSayiKareToplami1(nums));
        System.out.println(tekSayiKareToplami2(nums));
        System.out.println(tekSayiKareToplami3(nums));
        System.out.println();

        System.out.println(ciftSayiTekrarsizKareCarpimi(nums));
        System.out.println(ciftSayiTekrarsizKareCarpimi1(nums));
        System.out.println();

        System.out.println(ciftSayiMaxTekSayiMinToplami(nums));
        System.out.println(ciftSayiMaxTekSayiMinToplami1(nums));
        System.out.println();
        System.out.println(ciftSayiYediKucukMaxTekSayiSekizdenBuyukMinToplami(nums));
        System.out.println(ciftSayiYediKucukMaxTekSayiSekizdenBuyukMinToplami1(nums));
        System.out.println();


    }

    //Example1)Verilen Listteki tek sayı olan elemanların kareleri toplamını hesaplayan method oluşturunuz
    public static int tekSayiKareToplami1( List<Integer> nums){
      return  nums.
              stream().
              filter(t->t%2!=0).
              map(t->t*t).
              reduce(0,(t,u)->t+u);//
        // Note: reduce() methodundaki toplama isleminde
        // "t" ilk parametrenin ilk degerini daha sonraki tum degerleri toplamdan alir, "u" ise stream'den alir


    }
    public static int tekSayiKareToplami2( List<Integer> nums){
        return  nums.
                stream().
                filter(Utils::tekMi).
                map(Utils::getSquarel).//İhtiyacınız olan method Java class2larında yoksa util clas oluşturup içinde
                // ihtiyacınız olan methodu oluşturunuz ve method reference kullanınız
                reduce(0,Math::addExact);//Classs:: Method Ismi ==>Method Reference


    }
    public static int tekSayiKareToplami3( List<Integer> nums){
        return  nums.
                stream().
                filter(Utils::tekMi).
                map(Utils::getSquarel).
                reduce(Math::addExact).
                get();//Classs:: Method Ismi ==>Method Reference
        //get();//get() method'u Optional<Integer> i Integer'a cevirir


    }

    //Example2)Veerilen bir listteki çift sayı olan elemanların tekrarsız olarak kareleri çarpımını hesaplayan bir method oluşturunuz

    public static int ciftSayiTekrarsizKareCarpimi(List<Integer> nums){
       return nums.
               stream().
               filter(Utils::ciftMi).
               map(Utils::getSquarel).
               distinct().
               reduce(1,(t,u)->t*u);
        //Note:Soruda, kareleri tekrarsız olmalı deniyor. Bu nedenle distinc methodu, kareleri hesapladiktan sonra (map'ten sonra) yazildi
    }
    public static int ciftSayiTekrarsizKareCarpimi1(List<Integer> nums){
        return nums.
                stream().
                filter(Utils::ciftMi).
                map(Utils::getSquarel).
                distinct().
                reduce(Math::multiplyExact).get();
        //Note:Soruda, kareleri tekrarsız olmalı deniyor. Bu nedenle distinc methodu, kareleri hesapladiktan sonra (map'ten sonra) yazildi
    }

    //Example3)Verilen bir listteki çift sayı olan elemanların maximum değeri ile
    // tek sayı olan elemanları minimum değerinin toplamını hesaplayan methodu oluşturun


    public static int ciftSayiMaxTekSayiMinToplami(List<Integer> nums){
        int max= nums.stream().distinct().filter(t->t%2==0).reduce((t,u)->t>u?t:u).get();

        int min=nums.stream().distinct().filter(t->t%2!=0).reduce((t,u)->t<u?t:u).get();

        return max+min;
        //reduce() methodunu etkisiz eleman kullanmadan kullanirsak data tipleri uyusmadigi icin hata verir(Optional Integer verir).
        // Burada reduce() methodundan sonra get() methodunu kullanmamiz gerekir
    }
    public static int ciftSayiMaxTekSayiMinToplami1(List<Integer> nums){
        int max= nums.stream().distinct().filter(Utils::ciftMi).max(Integer::compareTo).get();

        int min=nums.stream().distinct().filter(Utils::tekMi).min(Integer::compareTo).get();

        return max+min;

    }



    //Example4)Verilen bir listteki çift sayı olan elemanların 7den küçük maximun değeri ile
    //    // tek sayı olan elemanları 8 den büyük minimum değerinin toplamını hesaplayan methodu oluşturun

    public static int ciftSayiYediKucukMaxTekSayiSekizdenBuyukMinToplami(List<Integer> nums) {
        int max = nums.stream().distinct().filter(t->t%2==0 && t<7).reduce((t,u)->t>u?t:u).get();

        int min = nums.stream().distinct().filter(t->t%2!=0 && t>8).reduce((t, u) -> t < u ? t : u).get();

        return max + min;

    }
    //"(t -> t % 2 != 0 && t>8)" bu yapiya lambda expression denilir.Lambda expression ==> Lambda cumlesi
    public static int ciftSayiYediKucukMaxTekSayiSekizdenBuyukMinToplami1(List<Integer> nums) {
        int max = nums.stream().distinct().filter(Utils::ciftMi).filter(Utils::kucukMuYedi).max(Integer::compareTo).get();

        int min = nums.stream().distinct().filter(Utils::tekMi).filter(Utils::buyukMuSekiz).min(Integer::compareTo).get();

        return max + min;

    }

}
