package javaders.day41Lambda;

public class Utils {
    public static int getSquarel(int a){
        return a*a;
    }
    public static boolean tekMi(int a) {

        return a%2!=0;
    }
    public static boolean ciftMi(int a){
        return a%2==0;
    }

    public static boolean kucukMuYedi(int a){
        return a<7;
    }
    public static boolean buyukMuSekiz(int a){
        return a>8;
    }
    //Utils applicationda sik kullanilanlarin depolandigi class'tir

    public static int rakamlariToplami(int a){
        int sum=0;
        while (a>0){
            sum=sum+a%10;
           a= a/10;
        }
        return sum;
    }

}
