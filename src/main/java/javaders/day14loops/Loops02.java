package javaders.day14loops;

import java.util.Scanner;

public class Loops02 {
    public static void main(String[] args) {
   //3 ten 8 e kadar tüm sayıları ekrana yazdıran kodu yazınız

        //1.way
        for(int i=3;i<9;i++){
            System.out.print(i+" ");
        }
        System.out.println("");
        //2.way
        System.out.println(" ");
        int i=3;
        while(i<9){

            System.out.print(i+" ");
            i++;
        }
      //1.Way
//21 den 180 e kadar hem 4 hem de 6 ile bolunebilen tamsayilari console'a yazdiran kodu yaziniz
        for(int k=21; k<181; k++){
            if(k%4==0 && k%6==0){
                System.out.print(k + " ");
            }
        }
 //2.way
        System.out.println(" ");
        int k=21;
     while(k<181){
         if(k%4==0 && k%6==0){
             System.out.print(k + " ");

         }
         k++;
     }

        System.out.println("");

//Size verilen kucuk harfle yazilmis String'in index'i cift sayi olan character'lerini buyuk harfe donusturunuz
//miami ==> MiAmI

String s="miami";
int m=0;
      while(m<s.length()){
       String ch=s.substring(m,m+1);
          if (m % 2 == 0) {
              System.out.print(ch.toUpperCase());
          }else{
              System.out.print(ch);
          }

          m++;//Bu kısmı unutmayın yoksa "infinite loop"oluşur.Yani "sonsuz loop" oluşur.
          // "sonsuz loop'"lar application'un donmasına sebep olur
      }
        System.out.println("");
//Size verilen tamsayının rakamları toplamını konsola yazdıran kodu yzınız

        int r=578;//20
         r=Math.abs(r);
       int sum=0;
       while(r>0){
           sum=sum+r%10;

           r=r/10;
       }


        System.out.println(sum);
//kullanıcıdan aldığınız sayı için çarpım tablosu oluştuan kodu oluşturunuz
        //3*1=3  3*2=6 3*3=9 ...... 3*10=30
        Scanner input=new Scanner(System.in);
        System.out.println("please enter a number");
                int n=input.nextInt();

                int u=1;
            while(u<11){

                System.out.println(n + "*"+u+"="+(n*u));

                u++;
            }



            //Kullanıcıdan aldığınız String deki sessiz harfleri konsola yazdıran kodu yazınız

        Scanner scan =new Scanner(System.in);
        System.out.println("please enter a word");
        String y=scan.next();
        int z=0;
        while(z<y.length()){

            char ch=y.charAt(z);
            boolean x=ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U';
            if(!x) {

                System.out.print(ch);
            }
            z++;

        }








    }//main
}//class
