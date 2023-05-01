package javaders.introduction.day04scannerwrapperoperators;

public class WrapperClass {
    public static void main(String[] args) {

        // Primitive     ; char-      boolean-byte-short-int-    long-float-double
        //Wrapper Class   ;Character- Boolean-Byte-Short-Integer-Long_Float_Double


        //Wrapper Class'lar non_primitive'dir, o yüzden memory'de çok yer kaplarlar
        //şart değilse Wrapper class tercih etmeyiz
        //Böyle bir imkanın varlığından haberdar olmalıyız

        //"n" yazıp "nokta" koyarsanız hiç method göremezsiniz,çünkü primitivler method içermez
        int n = 12;
        //"m"yazıp nokta koyarsanız birçok method görebilirsiniz,çünkü Wrapper class lar method içerir
        Integer m = 12;

        byte p = 13;
        Byte r = 13;

        //Örnek1) short data type inin minimum ve maximum değerlerini kod yazarak bulunuz?
        Short maximum = Short.MAX_VALUE;
        System.out.println("maximum = " + maximum);
        Short minimum = Short.MIN_VALUE;
        System.out.println("minimum = " + minimum);

        //Örnek2) int data type nin minimum değeri ile byte data typenin maksimum değerleri toplamını bulunuz?
         int intMin= Integer.MIN_VALUE;
         byte byteMax = Byte.MAX_VALUE;
         System.out.println(intMin+byteMax);

        //örnek3)primitive int'i Wrapper Integer'a çeviriniz?
        //  primitive bir kutu içinde  bulunan değeri alarak
        //       wrapper yani method bulunan bir kutuya atama yapma işlemine Autoboxing denir
        int num = 13;
        Integer wrapperNum = num;
        //Wrapper Byte primitive byte ceviriniz
        Byte k = 13;
        byte primitiveK  = k;
        //wrapper bir kutu içinde bazı methodlarla birlikte bulunan değeri alarak
        //primitive yani method bulunmayan bir kutuya atama yapma işlemine Unboxing denir

        //örnek4)primitive char'i Wrapper Character'e çeviriniz?(Autoboxing)
         char initial= 'T';
         Character initialWrapper = initial;
         //ii)Wrapper Boolean'i primitive boolean'a çeviriniz?(Unboxing)
        Boolean isOld = true;
        boolean isOldpr = isOld;







    }
}
