package javaders.day27Interface;

public class CarRunner {
    public static void main(String[] args) {
        Engine.stop();//stop() methodu static olduğundan "interface" ismi ile ulaştım
        Honda h=new Honda();
        h.eco();//eco() methodu static olmadığından(default method) "object" ismi ile ulaştım



    }
}
