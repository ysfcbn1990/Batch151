package practise.day_11_practise;

public class Den_C03_Cons {

    public static void main(String[] args) {

        C03_Constructor obj1=new C03_Constructor();

        System.out.println(obj1.marka);
        System.out.println(obj1.model);
        System.out.println(obj1.yil);
        System.out.println(obj1.yakit);


        obj1.marka="Mercedes";
        obj1.model="C180";
        obj1.yil=2023;
        obj1.yakit="Benzin";


        System.out.println(obj1.marka);//Mercedes
        System.out.println(obj1.model);//C180
        System.out.println(obj1.yil);//2023
        System.out.println(obj1.yakit);//Benzin



    }









}
