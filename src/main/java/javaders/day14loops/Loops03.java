package javaders.day14loops;

import java.util.Scanner;

public class Loops03 {
    public static void main(String[] args) {

        int i=1;
        while(i<1){//while loop'da loop body'sinin hiç çalışmaması mümkündür.(zero execution is possible)
            System.out.println("while loop");//Ekrana hiçbir şey yazmaz
            i++;
        }

        //do-while-loop
        int k=1;

        do{//do-while loopta loop boddy'si en az bir kere çalışır
            System.out.println("do-while loop");
            k++;
        }while(k<1);

//while kontrol yapar kodu oyle calistir.
//do-while  calistirir sonra kontrol eder.
 //genellikle oyunlarda kullanılır


        //kullanıcı bir sayı girsin.sayı 100 den küçük ise kullanıcı "kazandınız" mesajı alsın.
        // Diğer durumlarda "kaybettiniz" mesajı alsın.

        Scanner input=new Scanner(System.in);


do{
    System.out.println("Please enter an integer");
    int n=input.nextInt();
    if(n<100){
        System.out.println("won!");
    }else{
        System.out.println("Lost!");
        break;
    }
}while(true);//while parantezi içine true yazılınca o loop sonsuz loop olur.sürekli çalışır


//kullanıcıdan alınan bir cümlenin büyük harfle başlayıp nokta ile bittiğini kontrol eden kodu yazınız?

        do{
            System.out.println("please enter a word");
            String s=input.next();



            if(s.endsWith(".")&&(s.charAt(0)>='A'&&s.charAt(0)<='Z')){
                System.out.println("your sentence correct grammatically");
            }else{
                System.out.println("your sentence has grammatical mistake");
                break;
            }
        }while(true);











    }//main
}//class
