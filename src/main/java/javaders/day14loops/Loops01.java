package javaders.day14loops;

import java.util.Scanner;

public class Loops01 {
    public static void main(String[] args) {
        //Kullanıcıdan alınan bir tamsayının tekrarsız rakamlarının toplamını bulunuz
        //1838==>  1+3=4

    Scanner input=new Scanner(System.in);//ÜST SEVİYE İNTERWİEW SORUSU
        System.out.println("please enter an integer...");
        String s = input.next();
        int sum=0;
        for(int i=0;i<s.length();i++){

            String d=s.substring(i,i+1);
            if(s.indexOf(d)==s.lastIndexOf(d)){
                sum=sum+Integer.valueOf(d);



                ////intiger ile string toplanmaz bu yuzden string olan d integer a cevirilir.
                ////bunun icinde integer valueOf (d) ile yapariz
            }
        }
        System.out.println(sum);
        //indeOf() ile last indexOf() değerleri birbirine eşitse tekrarsız.eşit değilse tekrarlı karakterleri gösterir
        //Bu method string ifadelerle kullanılır

    //Bir stringdeki tekrarlı karakterleri ekrana yazdıran kodu yazınız
        String str="Alabala";//la
       String result="";


for(int i=0;i<str.length();i++){
    char ch=str.charAt(i);
    if((str.indexOf(ch)!=str.lastIndexOf(ch))&&!result.contains(""+ch)){
        result=result+ch;
    }
}
        System.out.println(result);































    }//main
}//class
