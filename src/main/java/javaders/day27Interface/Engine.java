package javaders.day27Interface;

/*
      interface'deki methodlar
1)"interface" içine concrete "method" konulamaz
2)"interface" içindeki methodların abstract olduğunu Java bilir.Bu yüzden
"intreface" içindeki abstract methodlarda abstract keyword kullanmaya gerek yoktur
3)"interface" içindeki abstract methodların tamamı "public"dir
Bu yüzden "interface" içinde abstract method oluştururken "access modifier"
yazmaya gerek yoktur
4)Bir interface 'i bir classın parenti yapmak istediğinizde extends keyword yerine
"implements"keyword kullanınız
5)"Concrete child class"'lar "parent interface"'deki abstract methodları override etmek zorundadırlar
6)"i"nterface"'ler bir application'da "Concrete Child Class"'ların yapmak zorunda oldukları
fonksiyonları barındırırlar.Bu yüzden "interface"'lere "to-do list" de denir.
7)Birden fazla "parent"  "inteface" içinde aynı isimli abstract methodlar oluşturabilirsiniz
Abstract methodların body'si olmadığı için child class'lar aynı isimli method'lardan herhangi birini override ederek kullanabilirler
8)Birden fazla "parent interface" icinde ayni ismli abstract methodlar olusturdugunuzda bu
method'larin "return type"lari ayni olmak zorundadir.
9)Normalde "interface" içine concrete "method" konulamaz.ama bazı özel durumlarda "concrete method"
koymamız gerekirse;
             i)"default" keywordunu aşağıdaki gibi kullanarak "interface içine" "concrete method"
koyabiliriz.
            ii)"static" keywordunu aşağıdaki gibi kullanarak "interface içine" "concrete method"
koyabiliriz.
10)"default" veya "static" keyword'unu kullanarak oluşturduğunuz "concrete method"'ların
"concrete child class"lar tarafından kullanma zorunluluğu yoktur
11)"default" keyword'unu kullanarak olusturgunuz "concrete method"lara "object" olusturarak
   ulasilabilir.
   "static" keyword'unu kullanarak olusturgunuz "concrete method"lara ulasmak icin "object"
   olusturmaya gerek yoktur, "interface" ismi yeterlidir.
   12)"interface" lerden object oluşturulamaz."interface"'lerin "constructor" ı yoktur
 */
public interface Engine {

    void start();

    void payment();

    default void eco(){
        System.out.println("Uses gas less...");
    }

    static void stop(){
        System.out.println("Stops securely...");
    }
}
