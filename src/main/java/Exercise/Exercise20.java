package Exercise;

import java.util.Arrays;

public class Exercise20 {
    public static void main(String[] args) {
        String stdNames[]=new String[5];

        stdNames[0]="Ajda";
        stdNames[3]="Cüneyt";
        stdNames[2]="Kemal";
        stdNames[1]="Ayhan";
        stdNames[4]="Filiz";

        System.out.println(Arrays.toString(stdNames));
//example 1:stdNames arrayindeki her ismin sonuna yıldız koyarak konsola yazdırınız
        for(String w:stdNames){
            System.out.println(w+"*");
        }
        //Example2)Bir integer array oluşturunuz.5 eleman ekleyiniz.elemanların toplamını bulup konsola yazdırınız
        int ages[]=new int[5];

        ages[0]=12;
        ages[1]=23;
        ages[2]=9;
        ages[3]=38;
        ages[4]=27;
        System.out.println(Arrays.toString(ages));

        int sum=0;

        for(int w:ages){
            sum=sum+w;
        }
        System.out.println(sum);
//example3:bir char arrayi oluşturup 3 eleman ekleyiniz.elemanların çarpımını ekranaa yazdırın

        char initials[]=new char[3];//charları matematiksel işlemlerde kullanırsanız java charların ascii değerleriyle işlem yapar
        initials[0]='J';//74
        initials[1]='P';//80
        initials[2]='A';//65

        int carpım=1;

        for(char w:initials){
            carpım=carpım*w;
        }
        System.out.println(carpım);


        //Array'leri kısa yoldan nasıl oluşturabiliriz

        int grades[]={67,98,100,34,76};
        //Example:grades arrayinde en küçük ve en büyük grade'in toplamını ekrana yazdıran kodu yazdırınız

        Arrays.sort(grades);
        System.out.println(grades[0]+grades[grades.length-1]);

        //Example2) Size verilen bir String arraydeki isimlerden 5 karakterde az karakter içerenleri consol'a yazdırınız
        String stdNames1[] = new String[5];
        stdNames1[0] = "Ajda";
        stdNames1[3] = "Cuneyt";
        stdNames1[2] = "Tom";
        stdNames1[1] = "Ayhan";
        stdNames1[4] = "Filiz";

        for(String w:stdNames1){
            if(w.length()<5){
                System.out.println(w);
            }
        }
//Example 3)Size verilen String array deki ismleri alfebetik sıraya koyduktan sonra "F" ile başlayan isimlerden önceki isimleri consola yazdırınız

        Arrays.sort(stdNames1);
for(String w:stdNames1){

    if(w.startsWith("F")){
        break;
    }
    System.out.println(w);
}
        System.out.println();
//Example 4)Size verilen String array deki ismleri alfebetik sıraya koyduktan sonra "F" ile başlayan isimlerden önceki isimleri ve "F" ile
// başlayanları consola yazdırınız

        Arrays.sort(stdNames1);
        for(String w:stdNames1){
            System.out.println(w);
            if(w.startsWith("F")){
                break;
            }

        }
        System.out.println();
//Example 5)Size verilen String array deki ismleri alfebetik sıraya koyduktan sonra "F" ile başlayan isimler hariç diğer isimleri consola yazdırınız

        Arrays.sort(stdNames1);
        for(String w:stdNames1){

            if(w.startsWith("F")){
            continue;
            }
            System.out.println(w);
        }

    }
}
