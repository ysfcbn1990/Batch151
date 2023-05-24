package Exercise;

import java.util.Arrays;
import java.util.Scanner;

public class Exercise21 {
    public static void main(String[] args) {
        //Kullanıcının çoklu datayı bir Arraye yerleştirebilmesi için gereken kodu yazınız
/*
1)Kullanıcıdan data almak için Scanner object oluşturmaliyız
2)Çoklu datayı yerleştirmek için bir array oluşturmaliyız
3)Array oluşturabilmek için kullanıcıdan array'e kaç tane eleman koyacağını almalıyım
4)loop oluşturup eleman ekleme işlemini  tekrar tekrar yapabilmeliyim
 */

        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen eleman sayısını giriniz");
        int sayı= scan.nextInt();

        String a[]=new String[sayı];
        System.out.println("TO Stop adding press q");

 for(int i=0;i<a.length;i++){
     System.out.println("Lütfen "+(i+1)+". ismi giriniz");
     String name=scan.next();
     if(name.equalsIgnoreCase("q")){
         break;
     }else{
         a[i]=name;
     }


 }
        System.out.println(Arrays.toString(a));


    }
}
