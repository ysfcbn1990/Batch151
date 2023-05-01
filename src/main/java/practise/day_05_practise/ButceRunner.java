package practise.day_05_practise;

public class ButceRunner {


    public static void main(String[] args) {

        Butce baba=new Butce();


      baba.maasal(30000);
       baba.harclikAl(100);
      baba.harclıktanHarca(80);
        System.out.println(Butce.butce);

        Butce anne=new Butce();
        anne.maasal(50000);
         anne.harclikAl(500);
      anne.harclıktanHarca(500);
        System.out.println(Butce.butce);
        System.out.println(anne.harclik);

        Butce cocuk=new Butce();
        cocuk.harclikAl(200);
       cocuk.harclıktanHarca(180);

        System.out.println(Butce.butce);
        System.out.println(cocuk.harclik);

    }
}
