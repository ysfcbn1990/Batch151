package javaders.day35exceptions;

public class E02 {
    public static void main(String[] args) {


        System.out.println(getCharFromString("Java",2));
        System.out.println(getCharFromString("Java",8));









    }//main
    //Example 1: Bir string'deki karakteri index kullanarak alan bir method oluşturunuz

    public static char getCharFromString(String str,int idx){////StringIndexOutOfBoundsException String'lerde olmayan index kullanildiginda atilir
       try{
           return str.charAt(idx);
       }catch (StringIndexOutOfBoundsException e){
           Math.abs(idx);

           idx=idx%str.length();

        return str.charAt(idx);
       }
    }


}
