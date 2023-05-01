package javaders.day21datatime;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateTime02 {
    public static void main(String[] args) {
        LocalDateTime ltd= LocalDateTime.now();
        System.out.println(ltd);//2023-03-16T22:03:30.079056

       DateTimeFormatter dtf1=DateTimeFormatter.ofPattern("M/dd/yyyy-hh:mm a");
String formattedltd=dtf1.format(ltd);
        System.out.println(formattedltd);//3/16/2023-10:08 ÖS







    }
}
