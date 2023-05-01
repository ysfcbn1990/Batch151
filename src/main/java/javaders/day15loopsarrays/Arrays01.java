package javaders.day15loopsarrays;

import java.util.Arrays;

public class   Arrays01 {
    public static void main(String[] args) {

/*
1)Array Java 'nın "aynı data tipi"nde "çoklu data" depolamak için oluşturduğu bir yapıdır
2)Array'ler" primitive data type'ları" veya "reference'lar" ile çalışır
3)Array'ler "super fast" dir ve "memoryde çok az yer" kaplarlar
 */
//array nasıl oluşturulur
String stdNames[]=new String[5];

//Array nasıl yazdırılır
        System.out.println(Arrays.toString(stdNames));//[null, null, null, null, null]<===>null ar String in default değeridir

//Array'e nasıl eleman eklenir
        stdNames[0]="Ajda";//[Ajda, null, null, null, null]
        stdNames[3]="Cüneyt";//[Ajda, null, null,Cüneyt, null]
        stdNames[2]="Kemal";//[Ajda, null, Kemal,Cüneyt, null]
        stdNames[1]="Ayhan";
        stdNames[4]="Filiz";//[Ajda, Ayhan, Kemal,Cüneyt, Filiz]
        System.out.println(Arrays.toString(stdNames));
//Array'deki spesifik bir elemanı nasıl alabiliriz

        System.out.println(stdNames[3]);//Cüneyt

//example 1:stdNames arrayindeki her ismin sonuna yıldız koyarak konsola yazdırınız
            //1.yol
        for(int i=0;i< stdNames.length;i++){//length Stringlerde parantezli(method),Array'lerde parantezsiz(method değil) kullanılır
                System.out.println(stdNames[i] + "*");
        }
            //2.yol:for-each loop==>Enhanced(Zenginleştirilmiş)loop_Mümkünse hep for-each loop kullanın değile diğerlerini kullanın
                    //:for-each loop Arraylerde kullanılır.collectionlardada kullanılır.Array denince aklımıza for-each loop gelmeli

             for(String w:stdNames){
                     System.out.println(w+"*");
             }

     //Example2)Bir integer array oluşturunuz.5 eleman ekleyiniz.elemanların toplamını bulup konsola yazdırınız
        int ages[]=new int[5];
        System.out.println(Arrays.toString(ages));
        ages[0]=12;
        ages[1]=23;
       ages[2]=9;
        ages[3]=38;
       ages[4]=27;
        System.out.println(Arrays.toString(ages));

int sum=0;
for(int w :ages){
    sum=sum +w;
}
        System.out.println(sum);//109
//example3:bir char arrayi oluşturup 3 eleman ekleyiniz.elemanların çarpımını ekranaa yazdırın

        char initials[]=new char[3];//charları matematiksel işlemlerde kullanırsanız java charların ascii değerleriyle işlem yapar
       initials[0]='J';//74
       initials[1]='P';//80
        initials[2]='A';//65

        int sum1=1;
        for(char w : initials){
            sum1=sum1*w;

        }

        System.out.println(sum1);







    }
}
