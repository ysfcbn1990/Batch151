package javaders.day22stringbuilder;

public class  Sbf01 {
    public static void main(String[] args) {

        /*
        1)StringBuffer Java'da String üreten bir Class'dır.
        2)StringBuffer ,StringBuilder'a çok benzer,yani ikisi' de "mutable" String üretir
        3)StringBuffer "multi-thread"'dir ama StringBuilder "multi-thread"değildir
        4)Java StringBuffer'ı StringBuilder'dan önce oluşturdu.
        5)StringBuilder "multi-thread"olmadığı için StringBuffer'dan daha hızlı çalışır
        6)"multi-thread" yapılırken yapılan işlerin sıralaması önem arzeder.
        Yapılan işleri mantıklı bir sıraya koymak synchronization olarak adlandırılır
        StringBuffer "multi-thread" olduğu için aynı zamanda "synchronized"dir

        3 tane String oluşturan class öğrendik
        i)immutable string lazımsa;String Class
        ii)mutable string lazımsa;StringBuilder veya StringBuffer
          1)StringBuilder'i multi-thread gerekmezse kullanırız
          2)StringBuffer'i multi-thread gerekirse kullanırız
         */



StringBuffer sbf1=new StringBuffer("Java");





    }
}
