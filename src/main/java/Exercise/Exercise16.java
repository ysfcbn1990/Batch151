package Exercise;

import java.util.Scanner;

public class Exercise16 {
    public static void main(String[] args) {
        //Kullanıcıdan alınan bir tamsayının tekrarsız rakamlarının toplamını bulunuz
        //1838==>  1+3=4

        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen bir tamsayı giriniz");
       String sayi=scan.next();
        int sum=0;
     for(int i=0;i<sayi.length();i++){
         String d=sayi.substring(i,i+1);
         if(sayi.indexOf(d)==sayi.lastIndexOf(d)){
             sum=Integer.valueOf(d)+sum;
         }
     }
        System.out.println(sum);


        //Bir stringdeki tekrarlı karakterleri ekrana yazdıran kodu yazınız
        String str="Alabala";//la
        String result="";

       for(int i=0;i<str.length();i++){
           String a=str.substring(i,i+1);
           if(str.indexOf(a)!=str.lastIndexOf(a)&&!result.contains(a)){
               result=result+a;
           }
       }
        System.out.println(result);





    }
}
