package Exercise;

import java.util.ArrayList;
import java.util.List;

public class Exercise25 {
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

        System.out.println(tekSayiKareTop(nums));
        System.out.println(ciftTkrrszKareleriCarpm(nums));
        System.out.println(ciftMaxTekMinTop(nums));
        System.out.println(yediKckMaxCiftSekizBykMinTekTop(nums));

    }
    //Example1)Verilen Listteki tek sayı olan elemanların kareleri toplamını hesaplayan method oluşturunuz

    public static int tekSayiKareTop( List<Integer> nums){
       return nums.stream().filter(t->t%2!=0).map(t->t*t).reduce(0,(t,u)->t+u);
    }
//Example2)Veerilen bir listteki çift sayı olan elemanların tekrarsız olarak kareleri çarpımını hesaplayan bir method oluşturunuz

    public static int ciftTkrrszKareleriCarpm(List<Integer> nums){
      return  nums.stream().filter(t->t%2==0).map(t->t*t).distinct().reduce(Math::addExact).get();
    }
    //Example3)Verilen bir listteki çift sayı olan elemanların maximum değeri ile
    // tek sayı olan elemanları minimum değerinin toplamını hesaplayan methodu oluşturun

    public static int ciftMaxTekMinTop(List<Integer> nums){
       int max= nums.stream().filter(t->t%2==0).reduce(Math::max).get();
       int min=nums.stream().filter(t->t%2!=0).reduce(Math::min).get();
       return min+max;
    }

    //Example4)Verilen bir listteki çift sayı olan elemanların 7den küçük maximun değeri ile
    // tek sayı olan elemanları 8 den büyük minimum değerinin toplamını hesaplayan methodu oluşturun
     public static int yediKckMaxCiftSekizBykMinTekTop(List<Integer> nums){
        int cift=nums.stream().filter(t->t%2==0&&t<7).max(Integer::compareTo).get();
        int tek=nums.stream().filter(t->t%2!=0&&t>8).min(Integer::compareTo).get();
        return cift+tek;
     }


}
