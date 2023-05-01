package javaders.day26abstraction;
/*
1)Bazen Parent class'taki methodun body'si hiçbir child class tarafından kullanılmaz.
Bu durumda parent'taki methoda body yazmak hiç kullanılmadığı için mantıklı değildir.
Bizde o methoda body yazmayız
2)Body'si yazılmayan methoda "Abstract Method" denir
Abstract ingilizcede "vücutsuz" veya " soyut" denir
3)Method'un body'sini yazmayınca Java hata verir.Bizde "abstract" keyword'unu kullanarak Java'ya bu methodun body'si
olmayacak deriz
4)"abstract" keyword'unu kullanınca elde ettiğimiz abstract method normal class'lara konulmaz,
o yüzden class'ıda "abstract" yaparız
5)Parent'daki method "abstract" ise bütün child class'lar o methodu override etmek zorundadır
Bu yüzden tüm child class'lar için mecburi olmasını istediğimiz fonksiyonları "abstract" yapmak mantıklı bir seçimdir
6)Body'si olan method'lar(Concrete Method) abstract class'ların içine yazılabilir
"abstract methodlar" concrete class'ların içine yazılamaz
7)Abstract keyword ile method body bir method'da aynı anda kullanılamaz
8)Abstract class'ların içinde abstract methodlar olur.""abstract methodlar"body'si olmadığı için "eksik method'"lar gibi
düşünülebilir
Yani abstract class içindeki eksiklik object'e yansır ve object eksiği olan bir object olmuş olur
Java bunu istemez çünkü eksik object eksik iş yapar,bu da application'ın yanlış çalışmasına sebep olur
Java application'u korumak için "abstract class"'lardan object üretilmesini engellemiştir

9)Abstract class'ların constructor'u vardır ama object oluşturamazlar
10)"final" methodlar "abstract" olamazlar
11)private methodlar "abstract" olamazlar
12)"abstract" class'ın abstract child'i veya concrete child'i olabilir

 */

/*
"final" keywordu açıklar mısınız?
final keyword i)variable'larda ii)methodlarda  iii)class'larda kullanılabilir
i)variable'larda kullanıldığında  a) O variable'a kesinlikle değer ataması yapılmalıdır
                                  b)İlk atanan  değer değiştirilemez
ii)method'larda  kullanıldığında  a)O methodun body'si değiştirilemez
                                   b)O method override edilemez
iii)class'larda kullanıldığında   a)O class'ın child class'ı olamaz ama final class'ın kendisi child olabilir
 */

public abstract class Courses {

    //Body'si olmayan method'a abstract(vucutsuz-soyut) method denir.
  public abstract void mat();


public void art(){
    System.out.println("Learn art");
}




}
