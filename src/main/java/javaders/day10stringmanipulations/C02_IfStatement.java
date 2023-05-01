package javaders.day10stringmanipulations;

import java.util.Scanner;

public class C02_IfStatement {
    public static void main(String[] args) {
     //Ex.kullanıcı gün numarasını girsin kod gün ismini yazsın
        Scanner input=new Scanner(System.in);
        System.out.println("Lütfen gün numarasını giriniz\n"+
                "1 :Pazar 2 :Pazartesi 3 :Salı 4 :Çarşamba 5 :Perşembe 6 :Cuma 7 :Cumartesi");
        byte day=input.nextByte();

        if(day==1){
            System.out.println("Pazar");
        }else if(day==2){
            System.out.println("Pazartesi");
        } else if (day==3) {
            System.out.println("Salı");
        } else if (day==4) {
            System.out.println("Çarşamba");
        } else if (day==5) {
            System.out.println("Perşembe");
        } else if (day==6) {
            System.out.println("Cuma");
        } else if (day==7) {
            System.out.println("Cumartesi");
        }else{
            System.out.println("Geçersiz numara girdiniz.Lütfen geçerli bir numara giriniz");
        }


    } //main
}//class
