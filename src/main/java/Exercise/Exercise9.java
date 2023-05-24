package Exercise;

import java.util.Scanner;

public class Exercise9 {
    public static void main(String[] args) {
        //   kullanıcıdan alınan iki sayıdan küçük olanı ekrana yazdırınız

        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen ilk sayıyı giriniz");
        int first = input.nextInt();
        System.out.println("Lütfen ikinci sayıyı giriniz");
        int second = input.nextInt();

        String small = first < second ? "ilk sayı ikinciden küçüktür" : "İkinci sayı ilk sayıdan küçüktür";
        System.out.println(small);

        int result = first < second ? first : second;
        System.out.println(result);











    }
}