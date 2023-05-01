package javaders.day21datatime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class DateTime01 {
    public static void main(String[] args) {

        //Anlık zamanı nasıl alırız
        LocalTime myCurrentTime= LocalTime.now();
        System.out.println(myCurrentTime);//21:06:32.971717900

        //Anlık zamanda bileşenler nasıl alınır
        int hour=myCurrentTime.getHour();
        System.out.println(hour);//21

        int minute=myCurrentTime.getMinute();
        System.out.println(minute);//7

      int second= myCurrentTime.getSecond();
        System.out.println(second);//42

        int nano=myCurrentTime.getNano();
        System.out.println(nano);//678481900


        //Gelecek ve geçmiş zamana nasıl gidilir

        LocalTime next= myCurrentTime.plusMinutes(23).minusSeconds(11);
        System.out.println(next);

        //Zaman formatı nasıl değiiştirilir
    //"HH" 24'Lük saat dilimini "hh"12'lik saat dilimini gösterir
        //"hh.mm a"ifadesindeki "a" 12'lik saat sisteminde "AM" "PM" yazılmasını sağlar
        //"ss" saniyeyi gösterir
        //"mm" "minute"demektir."MM" "month" demektir
        DateTimeFormatter dtf1=DateTimeFormatter.ofPattern("hh.mm.ss a");
       String formattedMyCurrentTime=  dtf1.format(myCurrentTime);
        System.out.println(formattedMyCurrentTime);//21.20

        //Date formatı nasıl değiştirilir
  LocalDate myCurrentDate=LocalDate.of(2022,8,25);
        System.out.println(myCurrentDate);

        //Tarihi Ay/Gün/Yıl şekline çeviriniz
DateTimeFormatter dtf2=DateTimeFormatter.ofPattern("MM/dd/yyyy");
String formattedMyCurrentDate=dtf2.format(myCurrentDate);
        System.out.println(formattedMyCurrentDate);//08/25/2022

     //Tarihi Gün/ay isminin ilk 3 harfi/yıl şekline çeviriniz
        DateTimeFormatter dtf3=DateTimeFormatter.ofPattern("dd/MMM/yy");
        String formattedMyCurrentDate2=dtf3.format(myCurrentDate);
        System.out.println(formattedMyCurrentDate2);//25/Ağu/22


        //Tarihi gün /ay ismi/Yıl şekline çeviriniz//25/August/2022
        DateTimeFormatter dtf4 = DateTimeFormatter.ofPattern("dd/MMMM/yyyy");
        String formattedMyCurrentDate3 = dtf4.format(myCurrentDate);
        System.out.println(formattedMyCurrentDate3);//25/Ağustos/2022


        //Başka bir zaman dilimindeki tarih ve zamanı nasıl alırız
        //tokyoda ayın kaçı
        LocalDate dateinTokyo=LocalDate.now(ZoneId.of("Asia/Tokyo"));
        System.out.println(dateinTokyo);//2023-03-17


        LocalDate dateinTaşkent= LocalDate.now(ZoneId.of("Asia/Tashkent"));
        System.out.println(dateinTaşkent);

        //Tokyo da saat kaç?
        LocalTime timeinTokyo=LocalTime.now(ZoneId.of("Asia/Tokyo"));
        System.out.println(timeinTokyo);//03:47:17.955471800

        //Köln'de saat kaç
        LocalTime timeinKöln=LocalTime.now(ZoneId.of("Europe/Berlin"));
        System.out.println(timeinKöln);//19:49:28.503015600




    }






}
