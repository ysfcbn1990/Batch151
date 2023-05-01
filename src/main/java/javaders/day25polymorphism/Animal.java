package javaders.day25polymorphism;

public class Animal {
    /*
    1)Parent'taki method ile Child'da Override edilen method'un access modifier'lari ayni olabilir.
    2)Child'da Override edilen method'un access modifier'i Parent'taki method'un access modifier'indan dar olamaz.
    3)Parent'taki method'un access modifier'i Child'da Override edilen method'un access modifier'indan dar olabilir.

    4) Method' un return type' i "primitive" ise Overrriding yapildiginda return type degistirilemez.
    5)Method' un return type' i "void" ise Overrriding yapildiginda return type degistirilemez.

     //Dondurdugumuz sey ile return type arasinda IS-A iliskisi varsa return type degistirilebilir

   6)Child'da Override edilen method'un "return type"i ile Parent'taki method'un "return type"i arasinda IS-A iliskisi
     varsa "return type"degisitirilebilir, aksi takdirda degistirilemez.
     Mesela;Integer Wrapper Class ile Long Wrapper Class arasında is a ilişkisi yoktur,o yüzden return type Integer
     olduğunda Long'a değiştirilemez

    7)Return type Wrapper Class olduğunda Overriding yaparken "return type"değiştirilemez.
    8)"final method"'lar override edilemezler.
      "final method"'lar 'ın body'si değiştirilemez ama Override ederken method body'i değiştiririz bu bir çelişkidir
      bu yüzden Java final methodların Override edilmesine müsaade etmez

    9)"static method"'lar Override edilemezler.Çünkü static method'lar tüm child'ler için ortak methodlardır.
    Bir child ortak methodu değiştirdiğinde diğer childler bundan etkilenebilir.Bu etkilenme ummadık sonuçlar ortaya çıkarabilir
    Bu yüzden Java "static method"'ların Override edilmesine müsaade etmez.

    10)"private method"'lar Override edilemez

     */
    public void move() {
        System.out.println("Animals move...");
    }
    public int add(int a,int b){
        return a+b;
    }

    public Animal create(){
        return new Animal();
    }
  public Integer multiply(Integer a,Integer b){
        return a*b;
  }
public final double circleArea(double r){
        return 3.14*r*r;
}




}
