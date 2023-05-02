package Exercise;

import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args) {
        //Kullanıcıdan ilk ismini ve soyismini alıp ikisini aynı satırda ekrana yazdırın?
        Scanner scan=new Scanner(System.in);
        System.out.println("Please enter your first name");
        String firstName=scan.next();
        System.out.println("Please enter your second name");
        String secondName=scan.next();
        System.out.println(firstName+" "+secondName);

        //Kullanıcıdan adresini alınız ve ekrana yazdırınız?
        Scanner input=new Scanner(System.in);
        System.out.println("Please enter address");
        String address=input.nextLine();
        System.out.println(address);

        // KUllanıcıdan iki sayı alıp 4 işlem yapan ve işlemlerin sonuçlarını ekrana yazdıran kodu yazınız?
        Scanner number=new Scanner(System.in);
        System.out.println("Enter first number");
        int num1=number.nextInt();
        System.out.println("Enter second number");
        int num2=number.nextInt();
        System.out.println(num1+num2);
        System.out.println(num1-num2);
        System.out.println(num1/num2);
        System.out.println(num1*num2);

        //Kullanıcıdan bir dikdörtgenin iki kenar uzunluğunu alınız
        //i)Alanını hesaplayınız?
        //ii)çevresini hesaplayınız?
        System.out.println("Kısa kenar uzunlugunu giriniz");
        int kisa= scan.nextInt();
        System.out.println("Uzun kenar uzunlugunu giriniz");
        int uzun=scan.nextInt();
        int alan=kisa*uzun;
        int cevre=2*(kisa+uzun);
        System.out.println(alan);
        System.out.println(cevre);

    }
}
