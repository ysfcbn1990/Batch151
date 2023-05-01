package javaders.day15loopsarrays;

import java.util.Arrays;
import java.util.Scanner;

public class Arrays03 {
    public static void main(String[] args) {
        //Kullanıcının çoklu datayı bir Arraye yerleştirebilmesi için gereken kodu yazınız
/*
1)Kullanıcıdan data almak için Scanner object oluşturmaliyız
2)Çoklu datayı yerleştirmek için bir array oluşturmaliyız
3)Array oluşturabilmek için kullanıcıdan array'e kaç tane eleman koyacağını almalıyım
4)loop oluşturup eleman ekleme işlemini  tekrar tekrar yapabilmeliyim
 */

        Scanner input =new Scanner(System.in);
        System.out.println("Please enter the number of elements you want to add");
         int numOfElements=input.nextInt();

        String  stdNames[]=new String[numOfElements];


        System.out.println("To stopp adding press 'q");

        for(int i=0;i<stdNames.length;i++){

            System.out.println("Enter the"+(i+1)+".student name");
            String name=input.next();



            if(name.equalsIgnoreCase("q")){
                break;
            }else{
                stdNames[i]=name;
            }
        }
        System.out.println(Arrays.toString(stdNames));





    }//main
}//class
