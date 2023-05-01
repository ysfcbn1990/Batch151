package javaders.day22stringbuilder;

public class Sb02 {
    public static void main(String[] args) {

        StringBuilder sb1=  new StringBuilder("Java is easy");
        System.out.println(sb1);//Java is easy

        sb1.reverse();//String'in ters çevrilmesi looplar ile de yapılır.bu kısa bir yoldur.
        System.out.println(sb1);//ysae si avaJ

     sb1.deleteCharAt(6);//Verilen indexteki karakteri siler.
        System.out.println(sb1);//ysae s avaJ

        sb1.delete(4,7);//Başlangıç index'(dahil) inden bitiş index(hariç)'ine kadar olan karakterleri siler
        System.out.println(sb1);//ysaeavaJ

       sb1.replace(2,5,"X");//replace(2,5,"X");==>2 dahil 5hariç==>index 2,3ve 4 deki karakterler yerine x koyar
        System.out.println(sb1);//ysXvaJ


sb1.insert(3,"2023");//ilk 3 indexi geç sonrasına verilen değeri yerleştir
        System.out.println(sb1);//ysX2023vaJ

StringBuilder sb2=new StringBuilder("Pava");
StringBuilder sb3=new StringBuilder("Lava");

int r1=sb2.compareTo(sb3);
        System.out.println(r1);//0==>Alfabetik olarak aynı sıradalar demektir
                                //Sonuç mesela -3 ise sb2,sb3'den alfabetik olarak 3 önde demektir
                               //Sonuç mesela 3 ise sb2,sb3'den alfabetik olarak 3 sonra demektir

//StringBuilder'ı nasıl Stringe dnüştürür
        sb2.toString();

String str=sb2.toString().toUpperCase();

//Stringi StringBuildere döönüştürülmesi
sb2=new StringBuilder(str);
        System.out.println(sb2);




















    }
}
