package javaders.day31collectionsmaps;

import java.util.Deque;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class Queues02 {
    public static void main(String[] args) {

        ////PriorityQueue'de belirlenen oncelige gore siralama yapilir
        Queue<String>line=new PriorityQueue<>();

  line.add("Milk");
  line.add("Meat");
  line.add("Egg");
  line.add("Orange");
  line.add("Tomatoes");

        System.out.println(line);

        Deque<String>d=new LinkedList<>();
//Deque ==> Iki uclu "Queue" demek.
        //Deque'daki add(), get(), peek(), poll() remove() methodlari first-last seklinde iki uclu olarak bulunur

        d.add("Milk");
        d.add("Meat");
        d.add("Egg");
        d.add("Orange");
        d.add("Tomatoes");














    }
}
