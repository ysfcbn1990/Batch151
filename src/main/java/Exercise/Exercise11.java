package Exercise;

import java.util.Scanner;

public class Exercise11 {
    public static void main(String[] args) {
        /*
Verilen yilin "Artik Yil"(Leap Year) olup olmadigini kontrol eden kodu yaziniz.
   1)Yil 100'e bolunurse 400'e de bolunmelidir. 1600==>Leap    1800==>Leap degil
   2)Yil 100'e bolunmuyorsa 4'e bolunmelidir. 2004==>Leap    2005==>Leap degil
 */
        Scanner scan=new Scanner(System.in);
        System.out.println("Please enter year");
        int year= scan.nextInt();
        String result=year%100==0?(year%400==0?"Artık Yıl":"Artık Yıl Değil"):(year%4==0?"Artık Yıl":"Artık Yıl Değil");
        System.out.println(result);

        //2.yol

        if(year%100==0){
            if(year%400==0){
                System.out.println("Artık Yıl");
            }else{
                System.out.println("Artık Yıl Değil");
            }
           if(year%4==0){
               System.out.println("Artık Yıl");
           }else{
               System.out.println("Artık Yıl Değil");
           }

        }


    }
}
