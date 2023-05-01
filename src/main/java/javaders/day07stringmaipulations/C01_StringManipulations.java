package javaders.day07stringmaipulations;

public class C01_StringManipulations {

    public static void main(String[] args) {

        String s="Learn Java earn money";
        //**************endswith()**********

        /*
       endswith();Metnin belirli bir datayla bitip bitmediğini verir.
                  Bize boolean bir sonuç döndürür.
                  Tek karakterde,çoklu karakterde kullanılabilir
        */

        //Ex.s Stringining "money" ile bitip bitmediğini kontrol ediniz
        boolean isEnd=s.endsWith("money");//true
        System.out.println(isEnd);

        //******replace()********
        /*
        replace() ;Metnin içerisindeki belirli bir datanın yerine verilen diğer datayı yerleştirir
                  Bize String bir sonuç döndürür.
                  Tek karakterde,çoklu karakterde kullanılabilir
                  Ancak her iki tarafda da çift tırnak yada her iki tarafdada tek tırnak
                  kullanılmalıdır

     */

        //String s="Learn Java earn money";

        //ex.s Stringindeki money kelimesini "money" kelimesini "dolar"kelimesi ile değiştiriniz

      String s1  =s.replace("money","dolar");
        System.out.println("s1 = " + s1);//s1 = Learn Java earn dolar

        //ex.s Stringindeki earn kelimesini "win" kelimesine çeviriniz
        String s2=s.replace("earn","win");
        System.out.println("s2 = " + s2);//s2 = Lwin Java win money

       //EX.s Stringindeki "a"harflerini "*" ile değiştiriniz
        String s3=s.replace("a","*");
        System.out.println("s3 = " + s3);//s3 = Le*rn J*v* e*rn money
        String s4=s.replace('a','*');
        System.out.println("s4 = " + s4);//s4 = Le*rn J*v* e*rn money


        //Ex.s Stringindeki "n" harflerini "***" ile değiştiriniz
        String s5=s.replace("n","***");
        System.out.println("s5 = " + s5);//s5 = Lear*** Java ear*** mo***ey

        //Ex.s Stringindeki tüm "e" harflerini siliniz?
      String s6=s.replaceAll("e","");
        System.out.println("s6 = " + s6);//s6 = Larn Java arn mony
      //char s6=s.replaceAll('e','');eror
       //char data tipinin içerisine mutlaka bir karakter yerleştirimelidir.
      //space bir karakterdir.char'ın içine yerleştirilebilir.
      //Ancak hiçlik javada char için kullanılmaz.Bu nedenle silme işlemi yaparken
      //mutlaka String kullanmalıyız

      //******** replaceAll()***********
        /*
        replaceAll();Bir grup datayı değiştirmek için kullanılır.
        Bir grup datayı ifade edebilmek için Regular Expression(regex)kullanılır

         */


        String t="Yucel 25 ya$indadir sandık ama 30'mıs!.";
        //t Stringindeki tüm rakamları "*" a çeviriniz
        String t1=t.replaceAll("[0-9]","*");
        System.out.println("t1 = " + t1);//t1 = Yucel ** ya$indadir sandık ama **'mus!.
         /*
         En Çok Kullanılan Regex'ler
         1)Tüm rakamlar ==>[0-9]
         2)Tüm küçük harfler ==>[a-z]
         3)Tüm büyük harfler ==>[A-Z]
         4)Tüm harfler ==>[a-zA-Z]
         5)Tüm harfler ve rakamlar ==>[a-zA-Z0-9]
         6)Tüm noktalama işaretleri ==>\\p{Punct}
         7)Tüm sesli harfler ==>[aeiouAEIOU]



         ^ ==> den farklı,haricinde

         1)Tüm rakamlar hariç ==>[^0-9]
         2)Tüm küçük harfler hariç ==>[^a-z]
         3)Tüm büyük harfler hariç==>[^A-Z]
         4)Tüm harfler hariç==>[^a-zA-Z]
         5)Tüm harfler ve rakamlar hariç ==>[^a-zA-Z0-9]
         6)Tüm noktalama işaretleri hariç ==>\\p{Punct}
         7)Tüm sesli harfler hariç ==>[^aeiouAEIOU]

         */

       // String t="Yucel 25 ya$indadir sandık ama 30'mıs!.";
       //EX.t Stringindeki tüm harfleri ve tüm rakamları ünleme çeviriniz
        String t2=t.replaceAll("[a-zA-Z0-9]","!");
        System.out.println("t2 = " + t2);//t2 = !!!!! !! !!$!!!!!!! !!!!ı! !!! !!'!ı!!.

        //EX.tStringindeki spaceler dışındaki tüm karakterleri'+''ya dönüştürünüz
        String t3=t.replaceAll("[^ ]","+");
        System.out.println("t3 = " + t3);//t3 = +++++ ++ ++++++++++ ++++++ +++ ++++++++

        //EX.t Stringindeki tüm küçük harfler dışındaki karakterleri '?'e dönüştürünüz
        String t4=t.replaceAll("[^a-z]","?");
        System.out.println("t4 = " + t4);//t4 = ?ucel????ya?indadir?sand?k?ama????m?s??

        //EX.t Stringindeki tüm sesli harfler dışındaki karakterleri & operatörüne dönüştürünüz
        String t5=t.replaceAll("[^aeiouAEIOU]","&");
        System.out.println("t5 = " + t5);//t5 = &u&e&&&&&&a&i&&a&i&&&a&&&&&a&a&&&&&&&&&
        











    }//main


}//class
