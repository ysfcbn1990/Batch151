package javaders.day16arraysforeachloop;

import java.util.Arrays;

public class Arrays04 {
    public static void main(String[] args) {

       //Size verilen bir cümlede kaç kelime olduğunu gösteren kodu yazınız?

        String s="Java is easy. Learn Java earn money ";

       String words[] =s.split(" ");

        System.out.println(Arrays.toString(words));

        System.out.println(words.length);

        //Size verilen bir cümlede kaç  harf gösteren kodu yazınız?

        String t="Java is easy. Learn Java earn money. ";

        String harf[]=t.replaceAll("[^a-zA-Z]","").split("");

        System.out.println(Arrays.toString(harf));//[J, a, v, a, i, s, e, a, s, y, L, e, a, r, n, J, a, v, a, e, a, r, n, m, o, n, e, y]

        System.out.println(harf.length);

     Arrays.sort(harf);
        System.out.println(Arrays.toString(harf));



    }
}
