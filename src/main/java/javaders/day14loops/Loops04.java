package javaders.day14loops;

import java.util.Scanner;

public class Loops04 {
    public static void main(String[] args) {
        //Kullanici username ve password'u girsin.
       //3 kereden fazla yanlis girerse "Your account was blocked" mesaji alsin
      //3 kereye kadar yanlis girerse "Invalid username or password, try again" mesaji alsin
      //Dogru girerse "Welcome to your account" mesaji alsin

Scanner input=new Scanner(System.in);
int counter=0;
String validUserName="techpro123";
String validPassWord="Education12?";

do{   if(counter==3){
    System.out.println("your account was blocked");
}

    System.out.println("Please enter your username");
    String userName=input.next();

    System.out.println("please enter your password");
    String password=input.next();

    counter++;
    if(userName.equalsIgnoreCase(validUserName)&&validPassWord.equalsIgnoreCase(validPassWord)){
        System.out.println("Welcome to your account");
        break;
    }else{
        System.out.println("invalid username or password");
        System.out.println((3-counter)+" right left");
    }


}while(true);










    }//main
}//class
