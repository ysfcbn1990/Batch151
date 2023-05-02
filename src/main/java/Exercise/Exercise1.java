package Exercise;

public class Exercise1 {
    public static void main(String[] args) {

        write("Hello World");
        add(32,34);
        firstAndSecondMultiplyThirdAdd(3,5,7);
        getCube(3.5);


    }
    //Ornek 1: Girilen bir kelimeyi ekrana yazdiran bir method olusturup kullaniniz
    public static void write(String a){
        System.out.println(a);
    }
    //Ornek2
    // :toplama islemi yapan bir method olusturunuz.
    public static int add(int a,int b){
     return a+b;
    }
    //Ornek 3: Verilen 3 sayidan ilk ikisini carpan ve sonuncu sayi ile toplayan bir method olusturunuz.
    public static int firstAndSecondMultiplyThirdAdd(int a,int b,int c){
        return a*b+c;
    }
    //Ornek 4: Verilen bir ondalik sayinin kupunu hesaplayan method olusturup kullaniniz.
    public static double getCube(double a){
        return a*a*a;
    }
    //Ornek2: 2 sayiyi carpma islemi yapan bir method olusturunuz.
    public static int multiply(int a,int b){
        return a*b;
    }

}
