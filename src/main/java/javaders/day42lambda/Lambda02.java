package javaders.day42lambda;

import javaders.day41Lambda.Utils;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class Lambda02 {
    public static void main(String[] args) {
        System.out.println(verilenAraliktakiSayilarinToplami(10, 7));//34
        System.out.println(verilenAraliktakiSayilarinCarpimi(7,10));//5040
        System.out.println(verilenSayilarinRakamlariToplami(45, 47));//30

    }
    //rangeClosed() methodu ilk sayi buyuk oldugunda calismaz
    //ilk değer ikinci değerden büyükse rangeClosed() hata verir bu yüzden verilen değerleri swap yapmak gerekir

    //Swap için 1 tane private method oluştur
    private static List<Integer> swap(int starting,int ending){
        List<Integer>list=new ArrayList<>();
        if(starting>ending){
            starting=starting+ending;
            ending=starting-ending;
            starting=starting-ending;
        }
        list.add(starting);
        list.add(ending);
        return list;
    }
    /*
swap methodu başlangıç değeri ikinci değerden büyükse değerlerin yerini değiştirir. sadece if kısmı yapılırsa değişimi bize vermez.
 başlangıç ve bitiş değerlerini yani çoklu değeri depolamak için list kullanırız. array de kullanılabilir
 list in içine starting yani başlangıç değerini, ending yani ikinci değeri aldık. example1 de
 get 0 ve get 1 yazdık çünkü indexlerini yazdık
  */



    //Example 1: 7den 10 a kadar tamsayıların toplamını hesaplayan methodu oluşturunuz
    public static int verilenAraliktakiSayilarinToplami(int starting,int ending){

      List<Integer>list= swap(starting,ending);
        return IntStream.rangeClosed(list.get(0),list.get(1)).sum();
    }
    //Example 2: 7den 10 a kadar tamsayıların carpımını hesaplayan methodu oluşturunuz
    public static int verilenAraliktakiSayilarinCarpimi(int starting,int ending){
        List<Integer>list= swap(starting,ending);
        return IntStream.rangeClosed(list.get(0),list.get(1)) .reduce(Math::multiplyExact).getAsInt();
    }
    //Example 3: 45den 47 a kadar tamsayıların rakamları toplamını hesaplayan methodu oluşturunuz
    public static int verilenSayilarinRakamlariToplami(int starting,int ending){
        swap(starting,ending);
     return IntStream.rangeClosed(starting,ending).map(Utils::rakamlariToplami).sum();

    }

}
