package javaders.day31collectionsmaps;

import java.util.LinkedList;
import java.util.Queue;

public class Queues01 {
    public static void main(String[] args) {

        Queue<String>wareHouse =new LinkedList<>();

    wareHouse.add("Milk");
    wareHouse.add("Meat");
    wareHouse.add("Bread");
    wareHouse.add("Egg");
    wareHouse.add("Cheese");
        System.out.println(wareHouse);
wareHouse.remove();
        System.out.println(wareHouse);//[Meat, Bread, Egg, Cheese]

        System.out.println(wareHouse.peek());//Meat
        System.out.println(wareHouse);//[Meat, Bread, Egg, Cheese]

        System.out.println(wareHouse.element());//Meat
        System.out.println(wareHouse);//[Meat, Bread, Egg, Cheese]

        System.out.println(wareHouse.poll());//Meat
        System.out.println(wareHouse);//[Bread, Egg, Cheese]

        wareHouse.clear();

        System.out.println(wareHouse.peek());//null
        System.out.println(wareHouse.element());//Exception

        System.out.println(wareHouse.poll());//null
        System.out.println(wareHouse.remove());//exception








    }




}
