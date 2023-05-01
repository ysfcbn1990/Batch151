package javaders.day32maps;

import java.util.Arrays;
import java.util.HashMap;

public class HashMap02 {
    public static void main(String[] args) {

        //Example 1: Verilen cümledeki kelimelerin görünüm sayısını veren kodu yazınız
//"I like you you like like!"  => I=1, like=3, you=1

        String s="I like you you like like!";

        //Like ile Like! aynı yapabilmek için tüm noktalama işaretlerini silelim
s=s.replaceAll("\\p{Punct}","");
        System.out.println(s);//I like you like like


        //Ben kelimelerle çalışmalıyım bu yüzden split()kullanmalıyım

        String words[]=s.split(" ");
        System.out.println(Arrays.toString(words));//[I, like, you, like, like]


        HashMap<String,Integer>occ=new HashMap<>();



        //words array'indeki kelimeler birer birer Map'de var mı yok mu diye kontrol edilecek
        //words array'indeki kelimeler Map'de yoksa value'su 1 olarak yerleştirilecek
        //words array'indeki kelimeler Map'de varsa varolan value'u 1 arttırılarak yerleştirilecek

        for(String w:words){
          Integer num=occ.get(w);
          if(num==null){
              occ.put(w,1);
          }else{
              occ.replace(w,num+1);
          }


        }

        System.out.println(occ);//{like=3, I=1, you=2}


    }
}
