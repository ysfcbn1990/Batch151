package javaders.introduction.day3scanner;

//java'nın util kütüphanesinden scanner class import edildi demektir.
import java.util.Scanner;

public class Scaner01 {

    public static void main(String[] args) {
     //1.adım;"Scanner class"tan bir obje oluştur
        Scanner input = new Scanner(System.in);
        //obje ismini input yaptık çünkü bu object kullanıcıdan alınan datayı benim kodlarımın içine koyacak

        //2.adım;Kullanıcıya ne istediğinize dair mesaj veriniz
        System.out.println("Lütfen yaşınızı giriniz...");

        //3.adım;Uygun methodu kullanarak kullanıcının verdiği datayı memorye yerleştiriniz
       byte age =  input.nextByte();
        System.out.println(age);




    }
}
