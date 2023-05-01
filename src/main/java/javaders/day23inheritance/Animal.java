package javaders.day23inheritance;

public class Animal {

/*
  1)eat(){} methodu gibi birçok Classın kullanması gereken methodları her class'a ayrı ayrı yazarsak
  i)Tekrar yapmış oluruz,tekrar ideal code'da olmamalıdır
  ii)Aynı methodu tekrar tekrar yazmak zaman kaybıdır
  iii)Tekrar tekrar yazılan methodun tamiri çok zaman alır
  iv)Tekrar tekrar yazılan methodun geliştirilmesi çok zaman alır
  v)Method'u tekrar tekrar yazmak "atomic yapı" ya terstir
  2)"private" Class member'ler child class'lar tarafından kullanılamaz
  "public" Class member'ler child class'lar tarafından kullanılabilir
  "default" Class member'ler aynı package'de child class'lar tarafından kullanılabilir
  "protected" Class member'ler farklı package'dede olsalar child class'lar tarafından kullanılabilir.
  3)"Java"'da bir Class'ın sadece 1 tane parent'ı olabilir.
  Çoklu parent'e "Multiple Inheritance"derler,tekli parent'a "Single inheritance"derler.
  Java "Multiple Inheritance"'i desteklemez,Java "Single Inheritance"kullanır
  4)Apartman şeklindeki inheritance yapısına "Multilevel Inheritance"denir.
  Java "Multilevel Inheritance" ı destekler.
 */



 public  void  eat(){

     System.out.println("Animals eat...");
    }
    public void drink(){

     System.out.println("Animals drink...");
    }


}
