package javaders.day33maps;

import java.util.Arrays;
import java.util.HashMap;
import java.util.TreeMap;

public class HashMap01 {
    public static void main(String[] args) {

        //example:Verilen bir stringde hangi harfin kaç defa kullanıldığını gösteren kodu yazınız


        String s="Hello Henry!";
        getTheNumOfOccurunceOfLetters(s);
        System.out.println(getTheNumOfOccurunceOfLetters(s));




    }
    /*
once HashMap ile yaptik fakat alfabetik sira olsun diye TreeMap' cevirdik beoylelikle alfabetik bur siraya sahip olduk..
Javada alfabetik sirada once buyuk harf ardindan küçük harf gelir. Cunku buyuk harf ascii value'si kucuk harflerinkinden kucuktur.
 */

    //String'deki harf dışı character'leri sil
    public static TreeMap<String,Integer>getTheNumOfOccurunceOfLetters(String s){
        s=s.replaceAll("[^A-Za-z]","");

        //Görünüm sayılarını depolamak için map oluştur
        TreeMap<String, Integer> numOfOccurunce=new TreeMap<>();

        //Harfleri al
        String letters[]=s.split("");

        //for-each loop
        for(String w:letters){
            Integer numOfOcc=numOfOccurunce.get(w);
            if(numOfOcc==null){
                numOfOccurunce.put(w,1);
            }else{
                numOfOccurunce.replace(w,numOfOcc+1);
            }

        }
        return numOfOccurunce;
    }


}
