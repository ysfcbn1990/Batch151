package Exercise;

import java.util.Scanner;

public class Exercise19 {
    public static void main(String[] args) {

        //Kullanici username ve password'u girsin.
        //3 kereden fazla yanlis girerse "Your account was blocked" mesaji alsin
        //3 kereye kadar yanlis girerse "Invalid username or password, try again" mesaji alsin
        //Dogru girerse "Welcome to your account" mesaji alsin

    Scanner scan=new Scanner(System.in);


        String kul="Yusuf Çoban";
        String pas="Yusuf1453";
        int count=0;

        do{
            System.out.println("Please enter your username");
            String user=scan.nextLine();
            System.out.println("Please enter your password");
            String pasword=scan.nextLine();

            count++;

            if(kul.equals(user)&&pasword.equals(pas)){
                System.out.println("Welcome to your account");
            }else{
                System.out.println("Invalid username or password, try again");
            }
            if(count==4){
                System.out.println("Your account was blocked" );
                break;
            }

        }while(true);


    }
}
