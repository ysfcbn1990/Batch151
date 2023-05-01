package javaders.day08stringmanipulations;

public class C01_StringManipulations {


    //*********** replaceFirst() **************\\
    /*
    replaceFirst();replace () ile aynı işi yapmakla birlikte ilk gördüğü datayı değiştirir
    String döndürür
     */

    public static void main(String[] args) {

        String str="Bizimle Java Ogrenmek Cok Kolay";

        //Ex:str Stringindeki ilk gördüğü "i" harflerinin yerine "e" harfi yerleştiriniz?
        String str2=str.replaceFirst("i","e");
        System.out.println("str2 = " + str2);//str2 = Bezimle Java Ogrenmek Cok Kolay
        String str3=str.replace("i","e");
        System.out.println("str3 = " + str3);//str3 = Bezemle Java Ogrenmek Cok Kolay

        //*************** trim()***********//
        /*
        trim() Bir Stringde baştaki ve sondaki space karakterlerini siler ortadaki space karakterlerine dokunmaz
        */

        String isim= "     Mehmet Fatih Yıldırım   ";
    //Ex.isim stringindeki varsa bas ve sondaki spaceleri siliniz?

        String spaceDelete=isim.trim();
        System.out.println("spaceDelete = " + spaceDelete);
        System.out.print("**************");
        System.out.println(isim);
        System.out.print("**************");//**************     Mehmet Fatih Yıldırım
        System.out.println( spaceDelete); //**************Mehmet Fatih Yıldırım

        //Ex : Aşağıda fiyatları verilen ürünlerin toplam fiyatını bulunuz?
        String tv="599.99$";
        String laptop = "299.99$";
     String tv2=tv.replace("$","");//"599.99"
        System.out.println("tv2 = " + tv2);
        //$ gördüğün yere hiçbirşey koyma;yani dolar sembolünü sil
       String laptop2 =laptop.replace("$","");//299.99
        System.out.println("laptop2 = " + laptop2);

        Double totalPrice=Double.valueOf(tv2)+Double.valueOf(laptop2);
        System.out.println("totalPrice = " + totalPrice);//totalPrice = 899.98

     /*
     valueOf() methodu bize String olan bir datayı sayısal bir değere yani işlem yapacağımız bir değere çeviriyor.
      */

        String tamIsim= "  mehmet fatih   ";
        //Ex. Verilen tamIsim Stringini içindeki ilk ismin ilk harfi ile son ismin ilk harfini büyük harf olarak yan yana
        //yazdırınız

      char first=tamIsim.trim().toUpperCase().charAt(0);
      char second =tamIsim.trim().toUpperCase().split(" ")[1].charAt(0);
        System.out.println(""+first + second);











    }//main



}//class
