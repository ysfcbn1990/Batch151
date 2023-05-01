package javaders.day18constructorsstatickeyword;

import java.time.LocalDate;

/*
1)"Static block"'lar "static variable"'lara ilk değerlerini atamak için(initalize) kullanılır
2)"static bir variable'a değer atamak için kod yazmamız gerekirse "static block"kullanınız
3)"static bir variable'a değer atamak için yazılması gereken kod main method içine de yazılabilir
"static block"içine yazılan kod "main method"içine yazılan koddan önce çalıştırılır.
4)Bir class'ta bir den fazla static block varsa üstteki önce çalıştırılır
 */
public class StaticNonStaticBlocks01 {

    //"static variable"'lar static block kullanılmadan da "initalize" edilebilirler
    public static double pi = 3.14;

    //"static variable"'lar static block kullanılarak da "initalize" edilebilirler
    //Aşağıdaki gibi "static bir variable'a değer atamak için kod yazmamız gerekirse "static block"kullanınız
    public static void main(String[] args) {
        System.out.println("Hey I am main method");
    }
    public static double price ;

    static {
        System.out.println("Hey I am static block1");
        LocalDate d=LocalDate.now();
        if(d.getMonthValue()==3){
            price=1000;
        }else{
            price=1200;
        }

    }
static{
    System.out.println("Hey I am static block2");

}





}
