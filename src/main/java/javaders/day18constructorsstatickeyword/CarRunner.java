package javaders.day18constructorsstatickeyword;

public class CarRunner {
    public static void main(String[] args) {


      Car c1=new Car();
      Car c2=new Car("Mercedes","C300",2023,30000);
      Car c3=new Car("Audi","R8",2023,50000);
      Car c4=new Car("BMV");

        System.out.println("c1 = " + c1);
        System.out.println("c2 = " + c2);
        System.out.println("c3 = " + c3);
        System.out.println("c4 = " + c4);


    }
}
