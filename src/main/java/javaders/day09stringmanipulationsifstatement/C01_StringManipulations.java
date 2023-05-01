package javaders.day09stringmanipulationsifstatement;

public class C01_StringManipulations {

    public static void main(String[] args) {

    //************ isEmpty() ************\\
    /*
    isEmty () bir string methodunun boş mu dolu mu diye bakar.
    Bize boolean bir değer döndürür
    Sadece hiçlikte true döndürür

     */

    //Ex. Bir String'in hiç karakter içermediğini gösteren kodu yazınız?
    String str="";

    //1.yol lenght()
        boolean bosMu=str.length()==0;
        System.out.println("bosMu = " + bosMu);//2 iş yaptırıldı lenght() + ==0 ile karşılaştırma operatörü kullanıldı
      //2.yol isEmpty()
        boolean bosMu2= str.isEmpty();
        System.out.println("bosMu2 = " + bosMu2);//1 iş yaptırıldı isEmpty() makbul olan budur

        //Ex.Bir stringin boşluk hariç hiçbir karakter içermediğini gösteren kodu yazınız

        String str2="  ";
      boolean result = str2.replace(" ","").length()==0;
        System.out.println("result = " + result);
     boolean result2=str2.replace(" ","").isEmpty();
        System.out.println("result2 = " + result2);

        //**************** isBlank() ******************\\
        /*
        isBlank() methodu String bir datada space + hiçlik için true döndürür
                    Boş mu dolu mu olduğunu kontrol eder.Boolean bir değer döndürür
                    isEmpty den farkı variable 'da sadece space varsa boş mu dolu mu diye sorulduğunda
                    isBlank == Boş der
                    isEmpty == Boş değil der
         */

        //  String str2="  ";
        boolean result3=str2.isBlank();
        System.out.println("result3 = " + result3);//true

        boolean result4=str2.isEmpty();
        System.out.println("result4 = " + result4);//false


        //************* indexOf() ****************\\
        /* indexOf () Verilen karakter veya karakterlerin ilk görünümünün indexini verir
                     tekli karakter içinde çoklu karakter içinde kullanılabilir
                     Çoklu datalarda String ifadenin ilk görünümünün ilk karakterinin indexini döndürür
                     Olmayan bir datanın kaçıncı index de olduğunu sorgulatırsak bize  -1 döndürür
         */

       //Ex.Bir stringde  a,i ,e karakterlerinin ilk görünümlerinin indexleri toplamını ekrana yazdırınız
         String r ="Java is easy to Learn";
         int aIdx=r.indexOf('a');
        System.out.println("aIdx = " + aIdx);//1
        int iIdx=r.indexOf('i');
        System.out.println("iIdx = " + iIdx);//5
        int eIdx=r.indexOf('e');
        System.out.println("eIdx = " + eIdx);//8

        System.out.println("aIdx+iIdx+eIdx = " + (aIdx+iIdx+eIdx));//aIdx+iIdx+eIdx = 14

        //Ex: Bir Stringde Java kelimesinin ilk olarak kaçıncı indexde kullanıldığını gösteren kodu yazınız
        int java=r.indexOf("Java");
        System.out.println("java = " + java);

         String u="Ah Java vah Java sen ne guzel seysin Java";
         int java1=u.indexOf("Java");
        System.out.println("java1 = " + java1);//3


        int pyhton=u.indexOf("Pyhton");
        System.out.println("pyhton = " + pyhton);//-1


        //************ lastIndexOf() ************\\
        /*
        lastIndexOf() Verilen bir datada karakter yada karakterlerinin son görünümlerinin indexini verir
                 Olmayan bir datanın kaçıncı index de olduğunu sorgulatırsak bize  -1 döndürür
         */

        //Ex.Bir stringde  a,i ,e karakterlerinin son görünümlerinin indexleri toplamını ekrana yazdırınız
        String v ="Java is easy to Learn";
        int a=v.lastIndexOf('a');
        System.out.println("a = " + a);//18
        int i=v.lastIndexOf('i');
        System.out.println("i = " + i);//5
        int e=v.lastIndexOf('e');
        System.out.println("e = " + e);//17
        System.out.println("a+i+e = " + (a+i+e));//40




    }//main
}//class
