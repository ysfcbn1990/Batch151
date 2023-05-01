package practise.day_02_practice;

import java.util.Scanner;

public class C04_SwitchCase {
    public static void main(String[] args) {
           /*

Bir restoranda, müşteriler menüden yemeklerini seçerler.
Restoran, müşterilerin seçtiği yemeği pişirmek için bir
program yazilmasini ister. Örneğin, müşteriler menuden hangi yemegi
secerse  o menunun musteriye hazirlanip sunuldugu ve ucretin
belirlendigi bir program yaziniz

*/

Scanner input=new Scanner(System.in);
        String yemek="hamburger";
        switch (yemek){
            case "hamburger":
                System.out.println("Hamburger menüsü 200 TL");
                break;
            case"pizza":
                System.out.println("Pizza menüsü 500 TL");
                break;
            case "tavuk":
                System.out.println("Tavuk menüsü 700 Tl");
                break;
            default:
                System.out.println("Seçeneğiniz menümüzde bulunmuyor");
        }

   /*
             Bir arac kiralama sitesinde secilen araba markasina gore degisen kiralam ucretine gore
             Toplam odenecek fiyati gostern kodu yaziniz
             SUV ==>500.0
             SEDAN ==> 400.0
             HATCBACK ==> 350.0
             geriye kalanlar ==>300.0 TL


              */
        /*
Hayvanat bahçesinde ziyaretçilere yemek vermek için bir robot kullanılıyor.
Ziyaretciler hangi hayvani beslemek istiyorsa onun ismini yazsin  ve Robotta
gidip o hayvani beslesin.Örneğin, ziyaretçilerin "fil" hayvanını beslemek
istediklerini söylediklerinde, robot fil hayvanının yanına gider ve
onlara yemek verir.Ziyaretçilerin hangi hayvanları beslemek istediklerini
kontrol eden bir program yaziniz
elephant,lion,giraffe
default belirtilen hayvan bulunamadı
 */






    }
}
