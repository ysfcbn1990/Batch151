package practise.day_11_practise;

public class C02_Static {
      /*

    okulIsmi, okulNo, okulAcikMi seklinde uc tane static variable olusturalım.
    Bu static variable'leri main icerisinde yazdıralım

*/
    public static String okulIsmi="Yıldız Koleji";
    static int okulNo;
    static boolean okulAcikMi;

    public static void main(String[] args) {

        //static variable'lara class içerisindeki tüm methodlardan direk ulaşabiliriz
        //static variable'lar gökteki ay gibidir
        //static variable'ın değeri bir kişi tarafından değiştirilirse herkes için değişikliğe uğrar



        System.out.println(okulIsmi);
        System.out.println(okulNo);
        System.out.println(okulAcikMi);

               staticMethod();
             System.out.println(okulNo);

    }

    private static void staticMethod(){
        okulNo=200;
        System.out.println(okulNo);
    }





}
