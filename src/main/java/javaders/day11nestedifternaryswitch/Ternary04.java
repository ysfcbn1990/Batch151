package javaders.day11nestedifternaryswitch;


import java.util.Scanner;

/*
Kullanicidan aldiginiz sayi cift ise yarisini ekrana yazdiriniz, tek ise "Bu sayi ikiye bolunmez" yazdiriniz
 */
/*
1)Ternary'de true ve false durumları için size verilen data type'ları farklı ise oluşturduğunuz container'in data type'nı
"Object"yapınız..
2)Object java da bir class'dir
"Object" Java'daki bütün class'ların"Parent'i dır.yani babasıdır.Hz.Adem gibi
"Object"Class'ın "Parent"'i yoktur.
Java'da parenti olmayan tek Class "Object Class"'tır.
 */
public class Ternary04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter an integer");
        int num = input.nextInt();

  Object result= num%2==0 ? num/2 :"Bu sayı ikiye bölünmez";
        System.out.println(result);










    }//main
}//class

