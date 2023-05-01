package javaders.day11nestedifternaryswitch;

import java.util.Scanner;

public class Switch01 {
    /*
     Gün isimlerini kullanıcıdan alınız o günün kaçıncı gün olduğunu ekrana yazdırınız
     Sunday ==>1    Monday==>2.... Saturday==>?
     */
    //Yazacağımız kodda 3 ten fazla durum varsa switch kullanılır.genel uygulama budur
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a dayname ");
        String dayName = input.next();

        if (dayName.equalsIgnoreCase("sunday")) {
            System.out.println("Sunday is the first day");
        } else if (dayName.equalsIgnoreCase("monday")) {
            System.out.println("Monday is the second day");
        } else if (dayName.equalsIgnoreCase("tuesday")) {
            System.out.println("Tuesday is the third day");
        } else if (dayName.equalsIgnoreCase("wednesday")) {
            System.out.println("Wednesday is the fourth day");
        } else if (dayName.equalsIgnoreCase("thursday")) {
            System.out.println("Thursday is the fifth day");
        } else if (dayName.equalsIgnoreCase("friday")) {
            System.out.println("Friday is the sixth day");
        } else if (dayName.equalsIgnoreCase("saturday")) {
            System.out.println("Saturday is the seventh day");
        } else {
            System.out.println("Invalid day name");
        }
        //2.way
        switch (dayName.toLowerCase()) {//küçük harf büyük harf duyarsızlaştırmak için kullanılır

            case "sunday":
                System.out.println("Sunday is the first day");
                break;
            case "monday":
                System.out.println("Monday is the second day");
                break;
            case "tuesday":
                System.out.println("Tuesday is the third day");
                break;
            case "wednesday":
                System.out.println("Wednesday is the fourth day");
                break;
            case "thursday":
                System.out.println("Thursday is the fifth day");
                break;
            case "friday":
                System.out.println("Friday is the sixth day");
                break;
            case "saturday":
                System.out.println("Saturday is the seventh day");
            default:
                System.out.println("Invalid day name");

        }


    } //main
}//class
