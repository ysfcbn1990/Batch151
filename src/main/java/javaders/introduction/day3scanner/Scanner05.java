package javaders.introduction.day3scanner;

import java.util.Scanner;

public class Scanner05 {
    public static void main(String[] args) {
        //Kullanıcıdan bir dikdörtgenin iki kenar uzunluğunu alınız
        //i)Alanını hesaplayınız?
        //ii)çevresini hesaplayınız?

        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen kenar uzunluklarını giriniz");
        byte kisakenar = input.nextByte();
        byte uzunkenar = input.nextByte();
        System.out.println("ALAN = "+(kisakenar*uzunkenar));
        System.out.println("ÇEVRE = "+(kisakenar*2+uzunkenar*2));

    }

}
