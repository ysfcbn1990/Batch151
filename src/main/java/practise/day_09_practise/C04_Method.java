package practise.day_09_practise;

public class C04_Method {
    public static void main(String[] args) {


        //  10 sorumuz var
        // ogrencilerin cevapları:

        char[][] answers = {
                {'A', 'B', 'A', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
                {'D', 'B', 'A', 'B', 'C', 'A', 'E', 'E', 'A', 'D'},
                {'E', 'D', 'D', 'A', 'C', 'B', 'E', 'E', 'A', 'D'},
                {'C', 'B', 'A', 'E', 'D', 'C', 'E', 'E', 'A', 'D'},
                {'A', 'B', 'D', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
                {'B', 'B', 'E', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
                {'B', 'B', 'A', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
                {'E', 'B', 'E', 'C', 'C', 'D', 'E', 'E', 'A', 'D'}};


        // cevap anahtarı:

        char[] keys = {'D', 'B', 'D', 'C', 'C', 'D', 'A', 'E', 'A', 'D'};

        //  Her ogrencinin dogru cevap sayısını method olusturarak yazdıranız

 /*   output:
    1nolu ogrencinin dogru cevap sayısı: 7
    2nolu ogrencinin dogru cevap sayısı: 6
    3nolu ogrencinin dogru cevap sayısı: 5
    4nolu ogrencinin dogru cevap sayısı: 4
    5nolu ogrencinin dogru cevap sayısı: 8
    6nolu ogrencinin dogru cevap sayısı: 7
    7nolu ogrencinin dogru cevap sayısı: 7
    8nolu ogrencinin dogru cevap sayısı: 7*/


        doğruCevapSayısı(answers, keys);


    }

    public static void doğruCevapSayısı(char[][] answers, char[] keys) {
        for (int i = 0; i < answers.length; i++) {//0'dan öğrenci sayisina kadar döngüye aldık

            int sayaç=0;

            for (int j = 0; j < answers[i].length; j++) {


                if(answers[i][j]==keys[j]){//öğrencinin cevabı cevap anahtarıyla eşit mi kontrol edelim

                    sayaç++;//Eşitse sayacı 1 arttıralım

                }


            }
            System.out.println(i+1+" nolu öğrencinin doğru cevap sayısı: "+sayaç);
        }
    }
}