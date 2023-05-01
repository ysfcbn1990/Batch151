package javaders.day36exceptions;

public class E03 {
    /*
    "throws" ile "throw" arasındaki farklar nelerdir
    1)"throws" method signature satırında kullanılır,"throw" ise method body içinde kullanılır
    2)"throws" method signature satirinda bir veya birden fazla Exception ile bir kere kullanilir.
      "throw" ise method body icinde bir tane Exception ile tekrar tekrar kullanilabilir.
    3)"throws" dan sonra sadece Exception Class isimleri yazılır,
    "throw" dan sonra ise "Exception Class"dan object oluşturulur
     */
    public static void main(String[] args) {

         printAge(-23);
        try{
            printAge(-23);
        }catch (IllegalArgumentException e){
            System.out.println("Negative ages are not valid");
        }
              printAge(-9);



    }
    //Example 1:Kullanıcıdan alınan yaşı konsola yazdıran method'u oluşturun
    public static void printAge(int age){
        if(age<0){
            throw new IllegalArgumentException("Used negative integers for ages");

        }

        System.out.println(age);
    }
}
