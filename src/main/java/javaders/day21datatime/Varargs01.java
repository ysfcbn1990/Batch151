package javaders.day21datatime;

public class Varargs01 {
    public static void main(String[] args) {

add(5,2,4,3);
        System.out.println(add(5,2,3,4));//14
        System.out.println(add(5,2));//7
        System.out.println(add(5));//5
        System.out.println(add());//0
       a("Ali Can","Kemal Han","Tuncay Çınar","İbrahim Çınar");

    }
    //Toplama işlemi yapan bir method oluşturun

    //Aşağıdaki gibi farklı methodlar oluşturarak iş yapamayız.Çünkü kullanıcı farklı sayıdaki sayıları toplamak isteyebilir
    //Her ihtimal için bir method oluşturmak mümkün değildir
/*
    public int add(int a,int b){
        return a+b;
    }

    public int add(int a,int b,int c){
        return a+b+c;
    }
    public int add(int a,int b,int c,int d){
        return a+b+c+d;
    }

    //Java Farklı sayıdaki parametrelerin hepsini kabul eden bir yapı oluşturdu.
    //Bu yapıya "Varargs"denir
    //"Varargs" arkada "Array" yapısını kullanır*/
    /*
    1)Bir method parantezinde birden fazla "Varargs"kullanılamaz
    2)Bir method parantezinde birden fazla parametre kullanılacaksa "Varargs" en sonda olmalıdır.
     */
    public static int add(int... a){
int sum=0;
for(int w:a){
    sum=sum+w;
}
return sum;
    }
    //Verilen isimlerin ilk harflerini konsola yazdıran methodu oluşturun
    public static void a(String...s){
     String initials=" ";
     for(String w:s){
        initials= initials+w.charAt(0)+w.split(" ")[1].charAt(0);
         System.out.println(initials);
         initials="";
     }
    }

}
