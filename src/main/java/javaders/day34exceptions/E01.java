package javaders.day34exceptions;

public class E01 {
    /*
  1)Exception: Beklenmedik problem demektir
 2)"Exception"'ları halledebilmek için iki temel yol vardır
    i)"Exception"'a uygun çözümler üretebilirsiniz.Buna "Exception Handling" denir
    ii)"Exception" oluştuğunda bunu ilan eder ve geri çekilirsiniz.Buna da "Throw Exception" denir
 3)"Exception"'a uygun çözümler üretmede "try-catch"kullanılır
    "try block" da yapılması gereken işlemi "Java'dan"yapması istenir
    Java işlemi problemsiz bir şekilde yaparsa "catch block" Java tarafından okunmaz.
    "try block" da işlem yapılırken  "Exception" oluşursa "catch block" devreye girer ve "catch block" içindeki kodlar çalışır
 4)"try block" da islem yapilirken "Exception" olusursa "try block" icindeki Exception'dan sonraki kodlar calistirilmaz
     */
    public static void main(String[] args) {


       System.out.println(divide1(12,3));
       System.out.println(divide1(6,0));

        System.out.println(divide2(12,3));
        System.out.println(divide2(6,0));




    }//main
//1.Way:Exception'u handle etmede ilk ve iğrenç yol
    public static int divide1(int a,int b){
  if(b==0){
      return 0;
  }else{
      return a/b;
  }

    }
    //2.Way:Exception'u handle etmede harika yol
    public static int divide2(int a,int b){
        int result=0;
       try{

          result= a/b;

       }catch (ArithmeticException e){//AritmeticException matematik ile ilgili herhangi bir kural ihlali yapıldığında atılır
           System.out.println("Do not divide any number by zero");
       }
         return result;
    }



}//class
