package javaders.day13loops;

public class loops01 {
    public static void main(String[] args) {
     //21 den 180 e kadar hem 4 hemde 6 ile bölünebilen tam sayıları konsola yazdıran kodu yazınız

        for(int i=21 ; i<181;i++  ){
            if(i%4==0&&i%6==0){
                System.out.print(i+" ");
            }
        }
        System.out.println(" ");
         //Size verilen küçük harfle yazılan stringin indexi çift sayı karakterlerini büyük harfe dönüştürünüz

        String s="miami";
        for(int i=0;i<s.length();i++){

          String ch=s.substring(i,i+1);
          if(i%2==0){
              System.out.print(ch.toUpperCase());
          }else{
              System.out.print(ch);
          }

        }
        System.out.println(" ");
       //Verilen bir string'de ilk 'a' harfinden onceki tum characterleri console'a yazdiriniz

        String t="Hello Java";
          for(int i=0;i<t.length();i++){

              char ch=t.charAt(i);

              if(ch=='a'){
                  break;//Loop'u herhangi bir şarta göre kırmak için "break" keyword kullanılır
              }else{
                  System.out.print(ch);
              }
          }
        System.out.println("");

          //Verilen bir String de son"a" dan sonraki karakterleri ters sırada yazdırınız
        //tokatci==>ict
        String u="Tokatci";
          for(int i=u.length()-1;i>=0;i--){

              char ch=u.charAt(i);
              if(ch=='a'){
                  break;
              }else{
                  System.out.print(ch);
              }
          }








    }//main
}//class
