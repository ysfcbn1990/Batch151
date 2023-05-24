package Exercise;

import java.util.Scanner;

public class Exercise17 {
    public static void main(String[] args) {

        //3 ten 8 e kadar tüm sayıları ekrana yazdıran kodu yazınız

        int i=3;
        while(i<9){
            System.out.print(i+" ");
            i++;
        }
        System.out.println();
//21 den 180 e kadar hem 4 hem de 6 ile bolunebilen tamsayilari console'a yazdiran kodu yaziniz
    int a=21;
     while(a<181){
         if(a%4==0&&a%6==0){
             System.out.print(a+" ");
         }
         a++;

     }
        System.out.println();
//Size verilen kucuk harfle yazilmis String'in index'i cift sayi olan character'lerini buyuk harfe donusturunuz
//miami ==> MiAmI

        String s="miami";
        String result="";
        int k=0;
        while(k<s.length()){

            if(k%2==0){
             result=result+s.substring(k,k+1).toUpperCase();
            }else{
                result=result+s.substring(k,k+1);
            }

            k++;
        }
        System.out.println(result);

        //Size verilen tamsayının rakamları toplamını konsola yazdıran kodu yzınız

        int r=578893;//20

        int sum=0;
        r=Math.abs(r);
        while(r>0){
            sum=r%10+sum;

            r/=10;
        }
        System.out.println(sum);
//kullanıcıdan aldığınız sayı için çarpım tablosu oluştuan kodu oluşturunuz
 Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen sayı giriniz");
        int sayi= scan.nextInt();

        int c=1;
        while(c<11){

            System.out.println(c+" * "+sayi+" = "+(c*sayi));
            c++;
        }
//Kullanıcıdan aldığınız String deki sessiz harfleri konsola yazdıran kodu yazınız
        System.out.println("Lütfen kelimeyi giriniz");
        String kul=scan.next();
        String son="";
        int p=0;
        while(p<kul.length()){
            char ch=kul.charAt(p);
            boolean x=ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U';
            if(!x) {

                System.out.print(ch);
            }

            p++;
        }




    }
}
