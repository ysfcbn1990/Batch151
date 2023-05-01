package practise.day_01_practice;

public class C02_Ascii {
    public static void main(String[] args) {
// Rakam kullanmadan 65, 66, 67, 68, 69, 70 sayilarinin toplamını bulunuz
  /* ASCİİ

        A ==> 65
        B ==> 66
        C ==> 67
        D ==> 68
        E ==> 69
        F ==> 70

         */
        char A='A';
        char B='B';
        char C='C';
        char D='D';
        char E='E';
        char F='F';
        System.out.println(A+B+C+D+E+F);

        //2.yol
        System.out.println((int)'A'+(int)'B'+(int)'C'+(int)'D'+(int)'E'+(int)'F');
//3.YOL
        System.out.println('A'+'B'+'C'+'D'+'E'+'F');














    }
}
