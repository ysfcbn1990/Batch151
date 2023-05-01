package javaders.day18constructorsstatickeyword;
/*
1)Constructor nasıl oluşturulur
   Access Modifier + Class ismi + () + {}
 2)Method ile Constructor arasındaki farklar nelerdir?
   i)"Method"'larda return type olur.Constructor'larda olmaz
   ii)Method'lar yaptıkları işe göre isimlendirilirler.Constructor'lar ise her zaman class ismi ile isimlendirilirler
   iii)Method'lar bir aksiyon yapmak için oluşturulur.Constructor'lar ise object oluşturmak içindir
   iv)"Method" isimleri küçük harfle başlar. Constructor'lar ise class ismi ile aynı olduğu için büyük harfle başlar
 3)Parametreli Constructor'lar oluşturarak aynı class'tan farklı özelliklere sahip object'ler oluşturabiliriz
 */




public class Car {

    String make = "Honda";
    String model = "Accord";
    int year = 2021;
    public int price = 18000;


    //Default Constructor
    //Default Constroctor'lar "parametre"kullanmazlar,
    //Default Constroctor'ların body'si boştur
    //Java kıskançtır.Siz default constructoru elle yazdığınızda
    // java object class içindeki default constructoru kullandırtmaz

    public Car(){

    }




    public Car(String make, String model, int year, int price) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.price = price;
    }

    public Car(String make) {
        this.make = make;
    }


    public Car(String make, int price) {
        this.make = make;
        this.price = price;
    }


}
