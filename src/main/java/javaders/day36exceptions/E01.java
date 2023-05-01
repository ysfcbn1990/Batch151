package javaders.day36exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class E01 {
    /*
    1)Run butonuna bastıktan sonra konsol'da alınan exception'lara "Runtime Exception" denir
    AritmeticException,NullPointerException,NumberFormatException,ArrayIndexOfBoundsException,StringIndexOfBoundsException
    "Runtime Exception"a örnektir
     "Runtime Exception"lara Unchecked  Exception"da denir.

    2)Code yazarken kırmızı alt çizgi şeklinde alınan Exception'lar da vardır,bunlara "Compilee Time Exception"denir
    FileNotFoundException,IOException "Compile Time Exception"a örnektir
    "Compilee Time Exception" lara "Checked Exception"da denir

    3)FileNotFoundException: Java'ya bir dosyayı bul dediğimizde,Java "dosyanın adresi" ve "dosyanın varlığı" konusunda
    hata oluşursa ne yapması gerektiğini söylemenizi ister.

    4)"IOException":"IO" Input Output demektir
                   Note:IOException,FileNotFoundException'ın parent'ıdır.

    5)Java 'da hatalar temelde 2'ye ayrılır
    //Exception' lar hendle edilebilir hatalardir.Lakin Error'lar asla handle edilemezler
      i)Exception'lar   ii)Error'lar: a)StackOverflow Error(Stack Memory'nin dolmasi halinde olusur)   b)Out Of Memory Error(Heap Memory"nin dolmasi halinde olusur)
                                      c)c)Virtual Machine Error( JVM (Java Sanal Makinesi) nin arizalanmasi halinde olusur)
     */
    public static void main(String[] args) throws IOException {

        //1.Way:Exception'ı method signature satırına ekledik

        FileInputStream fis = new FileInputStream("src/main/java/day36exceptions/TextFile");

        int i = 0;

        while ((i = fis.read()) != -1) {
            {//i nin içinde ascii değer olmuş oldu.ascii değer -1 olmadığı sürece loopu çalıştır

                System.out.print((char) i);
            }


        }

    }
}