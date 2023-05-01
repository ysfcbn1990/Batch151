package pratices;

import java.math.MathContext;
import java.util.regex.MatchResult;

public class QO4_Hipotenus {
    //Hipotenüs hesaplayan bir kod yazınız
    public static void main(String[] args) {
        System.out.println(hipotenusHesapla(5,12)*2);

    }
    public static double hipotenusHesapla(double dikKenar1,double dikKenar2){
       return Math.sqrt(dikKenar1*dikKenar1+dikKenar2*dikKenar2) ;

    }



}
