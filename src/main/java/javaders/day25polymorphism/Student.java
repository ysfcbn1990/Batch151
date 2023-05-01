package javaders.day25polymorphism;

public class Student {

    public String stdName="Tom Hanks";

    public int age=23;



    //Encapsulation nedir:Data saklamaktır.(Data hiding)
   //Data'yı nasıl saklayabilirsin? Access Modifier'ini "private" yaparak.

    //Encapsulation yaptığımız datay'yı istersek diğer "class"'lardan okuyabiliriz
    //Nasıl okuruz?"get method" oluşturarak Encapsulate edilerek data'nın değerini okuyabiliriz
    //1)get method'ları hep public olur.
    // ii)get method'un return type'i okuduğu variable'ın return type ile aynı olur
    //Encapsulation yapılan variable'nın data type'ı   "boolean" ise get method ismi "is" ile başlar.




    //Encapsulation yaptığımız data'yı istersek diğer class'lardan nasıl değiştirebiliriz
    //Nasıl değiştirebiliriz
    //"set method" oluşturarak ENcapsulate edilmiş datanın değerini deiştirebiliriz
    // class kalip, obje'ler o kaliptan uretilen nesnelerdir.
     // "set method"u ise nesneyi degistirmek icin kullanilir. Class'a dokunmaz
   //i)set method'lar hep "public" olur.
    // ii)set method'un "return type"i hep void olur.
    //iii)set methodu parametre kullanir ve parametrenin data type'i variable ile ayni olur.
     //iv)set method kullanarak var olan abje üzerinden değişikler yaparak o objeyi sanki yeni bir obje gibi kullanabiliriz
    //v)Note:get method'ların diğer adı:"getter", set method'ların diğer adı :"setter"dır

    private String stdId="AC2023102T";
    private double gpa=3.87;
    private boolean successful= false;

    public String getStdId() {
        return stdId;
    }

    public double getGpa() {
        return gpa;
    }

    //Encapsulation yapılan variable'nın data type'ı   "boolean" ise get method ismi "is" ile başlar.
    public boolean isSuccessful() {
        return successful;
    }



    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public void setSuccessful(boolean successful) {
        this.successful = successful;
    }





}
