package javaders.day35exceptions;

public class E03 {
    /*
    1)try block'tan sonra çoklu catch block kullanılabilir
    catch block'lar arasında parent-child ilişkisi yoksa catch block'lar istenildiği gibi sıralanabilir
     catch block'lar arasında parent-child ilişkisi varsa child üstte olmalıdır

     2)"Exception Class" tüm Exception'ların parent'ıdır
     Çoklu catch block kullanmak yerine sizden istenen fonksiyonu karşıladığı sürece
     tek catch block'u "Exception Class" ile kullanabilirsiniz

     3)"try + 1 catch" olur - "try + çok catch" olur - "try" tek başına kullanılamaz
     4)"try" catch block olmadan kullanılabilir mi?
       "try + finally" olabilir.
     */
    public static void main(String[] args) {
        /*
//valueOf() bos String'de de NumberFormatException hatasi verir
//Bir method'dan 2 farkli exception alma ihtimalimiz var. Ikisini birden handle etmemiz gerekir.
//valueOf() method'una sayi olmayan bir deger atanirsa "NumberFormatException" hatasi alinir.
//"Exception" tum exception'lari kapsayan genel bir exception turudur. 911 gibi...
//Excaption'a ozel durumlarda farkli "catch block"lar kullanmamiz gerekebilir
//"catch block"lar arasinda parent-child iliskisi varsa child yukarida parent asagida olmalidir. Eger bu iliski yoksa "catch block"lar arasinda siralamanin onemi yoktur
//"Exception Class" tum exception classlarin parent'idir


 */


        System.out.println(convertStringToIntDivideByLength("6"));
        System.out.println(convertStringToIntDivideByLength2("6"));
        System.out.println(convertStringToIntDivideByLength3("6"));
    }

    // Example 1:Bir Stringi ınteger'a çeviren ve bu integer 'ı Stringin lengtinin 1 eksiğine bölen method oluşturunuz
    public static int convertStringToIntDivideByLength(String str) {
        int result = 0;
        try {
            int a = Integer.valueOf(str);
            result = a / (str.length() - 1);
        } catch (NumberFormatException e) {
            System.out.println("Non-digit character cannot be used in valueOf() ");
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
        return result;
    }

    public static int convertStringToIntDivideByLength2(String str) {
        int result = 0;
        try {
            int a = Integer.valueOf(str);
            result = a / (str.length() - 1);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
            return result;


    }
    public static int convertStringToIntDivideByLength3(String str) {
        int result = 0;
        try {
            int a = Integer.valueOf(str);
            result = a / (str.length() - 1);
        } catch (ArithmeticException e){
            System.out.println("Jump");
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return result;


    }
}