package javaders.day16arraysforeachloop;

import java.util.Scanner;

public class Arrays02 {
    public static void main(String[] args) {
      //kullanıcı +,-,*,/,% işlemlerini yapabilen bir hesap makinesi yapınız
      //kullanıcı 'q'ya basmadığı müddetçe işlemseçip yapabilsin

      /*
      1)Kullanıcıdan data almak için Scanner object oluştur
      2)kullanıcıdan yapacağı işlemi almalıyız
      3)kullanıcıdan iki tane sayı almalıyız
      4)tekrar tekrar işlem yapabilmek için loop kullanmalıyız
       */

        Scanner input=new Scanner(System.in);

        System.out.println("To stop calculation press 'q'");

        char opr=' ';

        do{
            System.out.println("Please enter the operation among +,-,*,/,%");
            opr=input.next().toLowerCase().charAt(0);


            if(opr=='q'){
                System.out.println("see you again");
                break;
            }
            boolean r=opr=='+'||opr=='-'||opr=='*'||opr=='/'||opr=='%';
            if(!r){
                System.out.println("undefined operation");
                break;
            }


            System.out.println("please enter the first number");
            int n1=input.nextInt();

            System.out.println("Please enter the second number");
            int n2=input.nextInt();

                switch (opr){
                    case '+':
                        System.out.println(n1+"+"+n2+"="+(n1+n2));
                        break;
                    case '-':
                        System.out.println(n1+"-"+n2+"="+(n1-n2));
                        break;
                    case '*':
                        System.out.println(n1+"*"+n2+"="+(n1*n2));
                        break;
                    case '/':
                        System.out.println(n1+"/"+n2+"="+(n1/n2));
                        break;
                    case '%':
                        System.out.println(n1+"%"+n2+"="+(n1*n2)/100);
                        break;

                }
            }

        while(true);


    }
}
