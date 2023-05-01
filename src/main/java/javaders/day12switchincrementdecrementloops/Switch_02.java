package javaders.day12switchincrementdecrementloops;

import java.util.Scanner;

public class Switch_02 {
    /*
    Kullanıcıdan aldığınız karakterin sesli harf olup olmadığını konrol eden kodu yazınız
    sesli harflerr:a-e-i-o-u
     */
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        System.out.println("Please enter a letter");

        char letter=input.next().charAt(0);
//1.YOL
        switch (letter){
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
            case 'A':
            case 'E':
            case 'I':
            case 'O':
            case 'U':
                System.out.println("it is a vowel");
            break;
            default:
                System.out.println("it is not a vowel");
        }
           //2.Way

        String letter2=input.next().substring(0,1).toLowerCase();
        switch (letter2){
            case "a":
            case "e":
            case "i":
            case "o":
            case "u":

                System.out.println(" it is a vowel");
                break;
            default:
                System.out.println("it is not a vowel");
        }


//3.yol
        String letter3=input.next().substring(0,1);
        switch (letter3){
            case "a":
            case "e":
            case "i":
            case "o":
            case "u":
            case "A":
            case "E":
            case "I":
            case "O":
            case "U":
                System.out.println(letter3 +"  is a vowel");
                break;
            default:
                System.out.println(letter3 +" is not a vowel");
        }








    }
}
