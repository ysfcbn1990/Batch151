package practise.day_07_practise;

import java.util.Scanner;

public class C01_While {
    public static void main(String[] args) {

        // Kullanıcıdan sisteme bir rakam girmesini isteyiniz
// kullanıcının girdigi sayının while loop kullanarak faktoriyelini bulunuz


        Scanner input=new Scanner(System.in);
        System.out.println("Lütfen bir rakam giriniz");
        int num= input.nextInt();
        int toplam=1;
        int i=1;
        while(i<num+1){
            toplam=toplam*i;


            i++;
        }

        System.out.println(num+"! = "+toplam);



    }
}
