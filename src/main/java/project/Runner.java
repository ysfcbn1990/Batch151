package project;

public class Runner extends Depo{

    public static void main(String[] args) {

Depo d=new Depo();
anaMenu();




    }
   public static void anaMenu(){
        System.out.println("Lütfen yapmak istediğiniz işlemi seçin\n1)Urun tanımlama\n2)Urun Listele" +
                "\n3)Urun Girisi\n4)Urun Rafa Koyma\n5)Urun Cıkısı\n0)cıkıs");
        String secim=scan.next();

        switch (secim){
            case "1":  UrunTanımlama();
            case "2": UrunListele();
            case "3": UrunGiris();
            case "4": UrunRafaKoyma();
            case "5": UrunCikis();
            case "0":
            System.exit(0);
            default:
                System.out.println("Yanlış seçim yaptınız");
        anaMenu();
        }



   }

    private static void UrunCikis() {
    }


    private static void UrunRafaKoyma() {
    }

    private static void UrunGiris() {

    }

    private static void UrunListele() {
    }

    private static void UrunTanımlama() {

        System.out.println("Lütfen eklemek istediğiniz ürün ismini giriniz");
        urunIsmi=scan.next();
        urun.add(urunIsmi);

        System.out.println("Lütfen uretici ismini giriniz");
        uretici=scan.next();
        uret.add(uretici);

        System.out.println("Lütfen birimi giriniz");
        birim=scan.next();
        birm.add(birim);


        System.out.println("işleminiz başarıyla gerçekleşmiştir.iyi günler");
        anaMenu();
    }
}
