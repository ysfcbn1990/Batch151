package javaders.day24inheritancepolymorphism;

public class Volvo extends Car {
    public void secure(){
        System.out.println("Volvo is most secure car in the world...");
    }

   @Override//Bu bir "annatation" dir @Override annatation'u Override kurallarını kontrol eder


    public void move() {

        System.out.println("Volvo moves...");

    }


}
