package javaders.introduction.day02datatypesmethodcreation;

public class Variables01 {
    /*
    javada temelde iki tip data vardır
    1)primitive data type:
    char,boolean,byte,short,int,long,float,double
     2)non_primitive data type.
     String
    */

    /*
    Note 1:Primitive data typeları java oluşturmuştur,biz oluşturamayız.
    Note 2:Primitive data typeların isimlerinde sadece küçük harf kullanılır
    Note 3:primitive datalar data type larına göre memory'de farklı farklı yer kaplarlar.
    Note 4:primitive datalar içlerinde sizin atadığınız değerleri barındırır
     */
    /*
    non-primitive data types:
     1) örneğin String non-primitive bir data type örneğidir
     2)üretilen her class aynı zamanda bir "non-primitive data type'"dir.bu yüzden non-primitiveler sınırsız sayıdadır.
     3)Non-primitive data type'ların isimleri büyük harf ile başlar
     4)Non-primitive data type'ların tamamı için java memoryde aynı miktarda yer ayırır.
     */
    public static void main(String[] args) {
        //Örnek 1: şehir ismi için bir variable oluşturun ve bir değer atayıp onu ekrana yazdırın.
        String cityName = "Ankara";
        System.out.println(cityName);
        /*
        Interview sorusu:"primitive" ve "non-primitive" data type 'lar arasındaki fark nedir?
        1)"primitive"'ler sadece bizim atadığımız değeri içerir;
        "non-primitive"'ler bizim atadığımız değer ve methodlar içerir
        2)"primitive"ler küçük harfle başlar,"non-primitive"ler büyük harfle başlar.
        3)"primitive"leri java üretmiştir 8 tanedir
        "non-primitive"leri java ve developerler üretebilir.bu yüzden sınırsız sayıdadır.
        4)"primitive"ler memory de data type na göre yer kaplar
        "non-primitive"ler için java memoryde hep aynı büyüklükte yer ayırır.
         */



    }
}
