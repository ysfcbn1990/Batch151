package Exercise;

public class Exercise15 {
    public static void main(String[] args) {
        //4'den 24'e kadar tum tamsayilari ayni satirda, aralarina bosluk birakarak console'a yazdiriniz
        for(int i=4;i<25;i++){
            System.out.print(i+" ");
        }
        System.out.println();
        //33'den 11'e kadar tum cift tamsayilari ayni satirda, aralarina bosluk birakarak console'a yazdiriniz

        for(int i=33;i>10;i--){
            if(i%2==0){
                System.out.print(i+" ");
            }
        }
        System.out.println();
//20'den 74'e kadar tum tek tamsayilari ayni satirda, aralarina bosluk birakarak console'a yazdiriniz

        for(int i=20;i<75;i++){
            if(i%2!=0){
                System.out.print(i+" ");
            }
        }
        System.out.println();
        //Massachuttes kelimesindeki tüm sesli harfleri consol'e yazdırınız

        String s="Massachuttes";

        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            boolean k=    ch=='a'||ch=='i'||ch=='e'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U';
            if(k){
                System.out.print(ch+" ");
            }

        }
        System.out.println();
        //21 den 180 e kadar hem 4 hemde 6 ile bölünebilen tam sayıları konsola yazdıran kodu yazınız
for(int i=21;i<181;i++){
    if(i%4==0&&i%6==0){
        System.out.print(i+" ");
    }
}
        System.out.println();
        //Size verilen küçük harfle yazılan stringin indexi çift sayı karakterlerini büyük harfe dönüştürünüz

        String m="miami";
for(int i=0;i<m.length();i++){
    String k=m.substring(i,i+1);
    if(i%2==0){
        System.out.print(k.toUpperCase());
    }else{
        System.out.print(k);
    }
}
        //Verilen bir string'de ilk 'a' harfinden onceki tum characterleri console'a yazdiriniz
        System.out.println();
        String t="Hello Java";

    for(int i=0;i<t.length();i++){
    char ch=t.charAt(i);
        if(ch=='a'||ch=='A'){
            break;
        }
        System.out.print(ch);
    }
        System.out.println();
        //Verilen bir String de son"a" dan sonraki karakterleri ters sırada yazdırınız
        //tokatci==>ict
        String u="Tokatci";
for(int i=u.length()-1;i>-1;i--){
    char ch=u.charAt(i);
    if(ch=='a'){
        break;
    }else{
        System.out.print(ch);
    }
}
        System.out.println();
        //Verilen bir string'de küçük harfleri konsola yazmayınız.
        //Pwd12?Ab
        String p="Pwd12?Ab";
for(int i=0;i<p.length();i++){
    char ch=p.charAt(i);
    if(ch>='a'&&ch<='z'){
    continue;
    }else{
        System.out.print(ch);
    }
}
        System.out.println();

//Bir Stringin ters çeviren kodu yazınız
        String b="Java";
        String ters="";
 for(int i=b.length()-1;i>-1;i--){
     ters=ters+b.substring(i,i+1);
 }
        System.out.println(ters);

        //Bir tamsayının rakamlarının toplamını veren kodu yazınız

        int a=789;
        a=Math.abs(a);
        int sum=0;
        for(int i=a;i>0;i/=10){
            sum=i%10+sum;
        }
        System.out.println(sum);




    }
}
