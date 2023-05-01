package project;

public class Urunler {

    int id;
    String UrunIsmi;
    String uretici;
    int miktar;
    String Birim;
String raf;

    public Urunler(int id, String urunIsmi, String uretici, int miktar, String birim, String raf) {
        this.id = id;
        UrunIsmi = urunIsmi;
        this.uretici = uretici;
        this.miktar = miktar;
        Birim = birim;
        this.raf = raf;
    }

    public Urunler(){
    }
}




