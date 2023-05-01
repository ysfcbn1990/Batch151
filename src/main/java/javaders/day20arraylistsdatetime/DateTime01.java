package javaders.day20arraylistsdatetime;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.util.Scanner;

public class DateTime01 {
    public static void main(String[] args) {

        //İçinde bulunduğumuz zaman dilimindeki tarihi nasıl alırız?
        LocalDate myCurrentDate = LocalDate.now();
        System.out.println(myCurrentDate);//2023-03-15

        //Tarihten istediğimiz bileşeni nasıl alırız?
       int monthValue= myCurrentDate.getMonthValue();
        System.out.println(monthValue);//3


        int yearValue=myCurrentDate.getYear();
        System.out.println(yearValue);//20

        int dayValue=myCurrentDate.getDayOfMonth();
        System.out.println(dayValue);//15

        //Aşağıdaki "month"bir Enum 'dir
        //Enum ,Java'da sabit değerleri(Ay isimleri,Gün isimleri,Ülkedeki şehir isimleri,Gezegen isimleri) depolamak için kullanılır
        //Javada degismeyen sabit datalar buyuk harfle yazilir
       Month montName= myCurrentDate.getMonth();
        System.out.println(montName);//MARCH

        //Aşağıdaki "DayOfWeek" bir "Enum"'dir
        DayOfWeek dayName =myCurrentDate.getDayOfWeek();
        System.out.println(dayName);//WEDNESDAY


        //ileriki tarihe nasıl gidilir
      myCurrentDate.plusDays(5);
        System.out.println(myCurrentDate.plusDays(5));//2023-03-20

        System.out.println(myCurrentDate.plusMonths(2));//2023-05-15

       //Geçmiş tarihe nasıl gidilir
        System.out.println( myCurrentDate.minusYears(30).minusMonths(2).minusDays(18));
         //1992-12-28

//Spesifik bir tarih objesi nasıl oluşturulur
        LocalDate gokhanDob=LocalDate.of(1986,6,10);
        LocalDate fatihDob= LocalDate.of(1985,2,25);

//Bir tarihin bir tarihten sonra olup olmadığı nasıl kontrol edilir
        boolean r1=gokhanDob.isAfter(fatihDob);
        System.out.println(r1);//true

        //Bir tarihin bir tarihten önce olup olmadığı nasıl kontrol edilir
         boolean r2=fatihDob.isBefore(gokhanDob);
        System.out.println(r2);//true

//Bir tarihin bir tarihe eşit olup olmadığı nasıl kontrol edilir
        boolean r3=gokhanDob.isEqual(fatihDob);
        System.out.println(r3);//false


//Example1)Kullanıcıdan aldığınız tarih geçmişe aitse "Geçersiz tarih girdiniz" mesajı veriniz
        //Kullanıcıdan aldığınız tarih geleceğe aitse"Zamanı girebilirsiniz"deyiniz

        Scanner input=new Scanner(System.in);
        System.out.println("Please enter year,month and day numbers in the given order");
int year= input.nextInt();
int month = input.nextInt();
int day = input.nextInt();

LocalDate givenDate = LocalDate.of(year,month,day);

if(givenDate.isBefore(LocalDate.now())){

    System.out.println(givenDate+" Invalid date");
}else{
    System.out.println("Enter time for the ticket");
}


int lenghtOfMonth=myCurrentDate.lengthOfMonth();
        System.out.println(lenghtOfMonth);//31
//Example2=Kullanıcının girdiği tarihin gün ismini bulan kodu yazınız
        System.out.println("Please enter year,month and day numbers in the given order");
        int y= input.nextInt();
        int m = input.nextInt();
        int d = input.nextInt();

        LocalDate Date = LocalDate.of(y,m,d);
        System.out.println(Date.getDayOfWeek());









    }//main
}//class

