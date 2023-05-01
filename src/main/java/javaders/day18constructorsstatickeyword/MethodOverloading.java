package javaders.day18constructorsstatickeyword;

public class MethodOverloading {
    /*
    1) Bir method aynı isim ve farklı parametrelerle oluşturulursa buna "Method Overloading"denir
    2)"Method Overloading" Java'da "iyi organizasyon" için önemlidir
    3)"Method Overloading" yaparken parametre 3 şekilde değiştirilebilir
       i)parametree sayıları değiştirilebilir
       ii)parametrelerin data type'ları değiştirilebilir
       iii)parametrelerin data type'ları farklı ise yerleri değiştirilebilir
    4)MethodOverloading bir class'ın içinde oluşur bu yüzden "private"methodlar da overload edilebilir
    5)MethodOverloading bütün access modifier'larda kullanılabilir
    6)"static"method'lar "overload"edilebilirler.
     */

    public static void main(String[] args) {
        System.out.println(add(3,5));

    }

    public static int add(int a, int b) {

       return a+b;
  }
    public static int add(int a, int b,int c) {

        return a+b+c;
    }

    public static double add(double a, int b) {
        return a+b;
    }

    public static double add(int a, double b) {
        return a+b;
    }

}
