package javaders.introduction.day3scanner;


import java.util.Scanner;

public class Scanner02 {
    //Kullanıcıdan ilk ismini ve sayismini alıp ikisini aynı satırda ekrana yazdırın?
    public static void main(String[] args) {

        //1.adım; Scaner Class'dan object oluştur
        Scanner input = new Scanner(System.in);

        //2.adım:Kullanıcıya ne istediğimize dair mesaj veriniz
        System.out.println("Ilk isminizi giriniz...");
       String firstName = input.next();
        System.out.println("Soy isminizi giriniz...");
        String  lastname = input.next();
        System.out.println(firstName+" "+lastname);


    }


}
