package javaders.day37exceptionsenums;

public class IllegalGradeException extends Exception{
/*
1)Custom Exception Class oluşturmak için Exception Class'a extend etmeliyiz
Exception Class extend ederek oluşturduğunuz Custom Exception "Compile Time Exception"olur

2)Custom Exception Class oluştururken "constructor"oluşturmalısınız
Bu "constructor" "parent"taki constructor'ı çağırmalıdır
Bu "constructor" mesaj verecek veya vermeyecek şekilde oluşturulabilir

3)Custom Exception Class oluşturduğunuzda ismin sonunda "Exception"kelimesini kullanmalısınız
IllegalGradeException da olduğu gibi
 */

    public IllegalGradeException(String message){
        super(message);
    }
    public IllegalGradeException(){
        super();
    }


}
