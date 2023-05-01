package practise.day_05_practise;

public class maymun {
    /* INTERWIEW SORUSU


Adada yalnız bir maymun var
Her gün 4 muz yemesi gerekiyor
o adada sadece 165 muz var
Maymunun kac gun hayatta kalabilecegini hesaplayan kodu yaziniz.

*/
    public static void main(String[] args) {


        int muz = 165;
        int gün = 0;
        boolean maymunHayattamı = true;

        do{
            muz-=4;
            System.out.println("Kalan muz sayısı "+muz);
            gün++;
            if(muz<4){
                maymunHayattamı=false;
                System.out.println("bugün "+gün+".gün.Yeterli muz kalmadı.Maymun rahmetli ");
            }else{
                System.out.println("bugün"+gün+".gün ;Maymun hala yaşıyor");
            }


        }while(maymunHayattamı);














    }
}