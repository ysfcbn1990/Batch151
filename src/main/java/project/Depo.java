package project;

import java.util.*;

public class Depo {

    static int id;
    static String urunIsmi;
    static String uretici;
    static int miktar;
    static String birim;
    static String raf;
static String secim;
static Scanner scan=new Scanner(System.in);
static List<String> urun=new ArrayList<>();
static List<String>uret=new ArrayList<>();
static List<String>birm=new ArrayList<>();

    public Depo() {
    }


    public static int getId() {
        return id;
    }

    public static void setId(int id) {
        Depo.id = id;
    }

    public static String getUrunIsmi() {
        return urunIsmi;
    }

    public static void setUrunIsmi(String urunIsmi) {
        Depo.urunIsmi = urunIsmi;
    }

    public static String getUretici() {
        return uretici;
    }

    public static void setUretici(String uretici) {
        Depo.uretici = uretici;
    }

    public static int getMiktar() {
        return miktar;
    }

    public static void setMiktar(int miktar) {
        Depo.miktar = miktar;
    }

    public static String getBirim() {
        return birim;
    }

    public static void setBirim(String birim) {
        Depo.birim = birim;
    }

    public static String getRaf() {
        return raf;
    }

    public static void setRaf(String raf) {
        Depo.raf = raf;
    }

}
