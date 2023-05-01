package javaders.day28interface;

public interface Animal {

    void eat();

    void drink();

    // 1)interface'lerdeki tüm varibler otomatik olarak "final"'dır.
    // Bu yüzden interface içindeki variable'ı oluşturduğunuzda mutlaka değer ataması yapmalısınız
    // Bilindiği gibi "final" variable'ların değerleri değiştirilemez
    // 2)İnterface'lerdeki tüm variable'lar otomatik(default)  olarak "public" dir
    // 3)interface'lerdeki tüm variabler'lar otomatik(default) olarak "static" dir
    //static olmazsa ona ulaşmak için obje oluşturmak lazım.ama interfacelerden obje oluşturamazsınız


    int age=4;



}
