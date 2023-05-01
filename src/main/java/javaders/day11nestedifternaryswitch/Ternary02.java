package javaders.day11nestedifternaryswitch;

import java.util.Scanner;

/*
Kullanıcıdan bir sayı alınız o sayı pozitif ise ekrana' pozitif 'yazdırın değilse ekrana 'pozitif değildir' yazdırın
 */
public class Ternary02 {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        System.out.println("Please enter an integer..");
        int num=input.nextInt();

        String result=num>0 ? "Pozitif":"Pozitif değildir";
        System.out.println(result);







    }


}
