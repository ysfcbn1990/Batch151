package javaders.day37exceptionsenums;

public class IllegalAgeException extends RuntimeException{
/*
1)Eğer Run Time Custom Exception üretmek isterseniz RuntimeException Class'a Extends etmelisiniz
 */
    public IllegalAgeException(){
        super();
    }

    public IllegalAgeException(String message){
        super(message);
    }

}
