package practise.day_05_practise;

public class Butce {

// Tum aile uyelerinin birikiminin
// bulundugu ortak ihtiyaclar icin
// kullanildigi bir butce ile kisisel
// harcamalarin yapildigi
// harclik'larin oldugu basit bir ev bütçesi kodu yazınız

    public static int butce;
    public int harclik;

    public void maasal(int alınanMaas){
        butce+=alınanMaas;
    }
    public void harclikAl(int alınanHarclık){
        butce-=alınanHarclık;
        harclik+=alınanHarclık;
    }

    public void butcedenHarca(int harcanacakPara){
        butce-=harcanacakPara;
    }
    public void harclıktanHarca(int harclıkHarcaması){
     harclik-=harclıkHarcaması;
    }

}
