package javaders.day03methodcreationscanner;

public class C03_MethodCreation {

    public static void main(String[] args) {
        //Dikdortgenin alanini hesaplatan bir method olusturunuz
        dikdortgenAlani(9, 10);




        // Karenin Alanini hesaplatan methodu yaziniz
        System.out.println( kareAlani(6)/2);




    }//main





    private static int kareAlani(int a) {

        return a * a;
    }

    private static void dikdortgenAlani(int a, int b) {

        System.out.println(a * b);//200
    }
}//class