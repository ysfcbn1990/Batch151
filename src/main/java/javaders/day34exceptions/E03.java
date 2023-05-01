package javaders.day34exceptions;

public class E03 {
    public static void main(String[] args) {


        System.out.println(getNumOfChars("Java"));
        System.out.println(getNumOfChars("Money"));
        System.out.println(getNumOfChars(""));

        System.out.println(getNumOfChars(null));












    }
    //Bir Stringdeki character sayısını veren method oluşturunuz
    public static int getNumOfChars(String s){
      int result=0;
        try{
            result= s.length();
        }catch (NullPointerException e){//NullPointerException String class'da null ile uyumlu olmayan methodlar kullanıldığında atılır

            System.out.println("Some String methods do not work with null...");
            System.out.println(e.getMessage());//Java'nın Exception için ürettiği teknik mesajı varsa verir

        }

        return result;
    }


}
