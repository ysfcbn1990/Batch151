package javaders.day18constructorsstatickeyword;

public class StaticNonStaticBlocks02 {


    public StaticNonStaticBlocks02(){

        System.out.println("Constructor 1");
    }
    public StaticNonStaticBlocks02(int price){

        System.out.println("Constructor 2");
    }
    public StaticNonStaticBlocks02(String name){

        System.out.println("Constructor 3");


    }
    public StaticNonStaticBlocks02(boolean isOld){

        System.out.println("Constructor 4");

    }
    //Non-static block constructor'larda çalıştırılması gereken ortak kodları içerir
    ////non-static block icindeki kodlar her constructor icin kullanilir.
    // Birden fazla non-static block varsa üstteki önce çalıştırılır.

    {
        System.out.println("I am constructor-ilk");
    }
    {
        System.out.println("I am constructor-ikiinci");
    }
    {
        System.out.println("I am constructor");
    }

    public static void main(String[] args) {
        StaticNonStaticBlocks02 s1=new StaticNonStaticBlocks02();
        StaticNonStaticBlocks02 s2=new StaticNonStaticBlocks02(12);
        StaticNonStaticBlocks02 s3=new StaticNonStaticBlocks02("Shirt");
        StaticNonStaticBlocks02 s4=new StaticNonStaticBlocks02(false);

    }






}
