package javaders.day24inheritancepolymorphism;

public class Car {
    /*
    Java diyor ki once parent'i sonra child'i olustur. Burada once Car sonra Toyota'yi olusturduk.
Java once Car'i calistirir. Yani once onu yazdirir, sonra asagidaki constructorlari calistirir.
Biz Java'ya Toyota(); constructor'ini calistir, icinde parametre olmayani calistir dedik.
Bu constructor Toyota uretecek, ama once parent'i olan Car'in uretilmesi gerekir.
Her constructor'in ilk satirinda gorunmez kodu vardir. O da super() seklindedir.
Super parent demektir. O yuzden once parent'e gidilir.
Car'in da parent'i varsa oradaki constructor da super parantez nedeniyle kendi parent'ina gider.
En tepeden Object Class'tan calismaya basladi asagilara kadar geldi.
Bizi yukariya tasiyan kod su super keyword'udur. Bu sizi parent'daki constructor'a tasir.

//Parent Class ve Super Class es anlamlidir
//Sub Class ve Child Class es anlamlidir

  1) Inheritance'da object olustururken constructor'lar yukaridan(Parent)
       asagiya(Child) dogru calisir.
    2)Parent ve Super es anlamlidir, Child ve Sub es anlamlidir.
    3)super() her constructor'in ilk satirinda gorunmez olarak bulunur.
      Isterseniz gorunur sekilde de yazabilirsiniz
    4)super()sizi parent class'daki constructora taşır
    5)this();sizi aynı class içindeki constructorlar arasında gezdirir
    6)this ();içinde bulunduğunuz class'taki variable'ları çağırmaya yarar
    "super"parent class'taki variable'ları çağırmaya yarar
    7)parent'tan chil'a giderken HAS-A iliskisi vardir
    child'dan parent'a giderken IS-A iliskisi vardir
    8)Eger data type'lari arasinda HAS-A veya IS-A iliskisi varsa bu data type'lerine "COVARIANT" denir
     */
    /*

    1)Polymorphism==>Çoklu şekil
    Yani bir methodun farklı şekillerde karşımıza çıkması demektir
    Polymorphism==Overloading+Overriding

    2)Overriding parent'daki methodu child'lara gore,child'in ihtiyaçlarına göre ozellestirerek kullanma islemi demektir
    3)Overriding 'de methodun body'si değiştirilir
    4)Overriding 'de method signature dokunulmaz,dokunulursa Java kızar.move()==>method signature==method ismi+parametre

    @Override//Bu bir "annatation" dir @Override annatation'u Override kurallarını kontrol eder

     */


    public void move(){
        System.out.println("Cars move...");
    }

    public void getBreak(){
        System.out.println("Cars break...");
    }
    public void engine(){
        System.out.println("Cars have engine...");
    }

  public String model="Car";

    public int price=0;

    public Car(){

    System.out.println("Car constructor 1");
   }
    public Car(int i){
this();
        System.out.println("Car constructor 2");
    }
}
