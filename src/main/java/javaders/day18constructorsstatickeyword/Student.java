package javaders.day18constructorsstatickeyword;



public class Student {
    /*
    1)"Static" "class member"'lar(variable+method+constructor+code blocks)tüm object'ler tarafından paylaşılır
    2)"Static"  "class member"'daki değişiklikler tüm objectler tarafından otomatik olarak görülür
    3)"Static" "class member"'lar gökteki ayın dünyaya bağlı olduğu gibi,class'a bağlıdır
    Bu yüzden "static variable'lara "class variable"'da denir
    4)4) "static" "class member"larin nasil calistigini anlamak icin cizim yapip static olanlari class'a olmayanlari object'e
         baglayarak düşünmek bu konuyu kolaylastirir.
     5)non-static variable=instance variable=object variable
     6)"Static class member"'ları çağırmak  için object oluştumak gerekmez ve tavsiye edilmez
     6)"Non-Static class member"'ları çağırmak  için object oluştumak şarttır
     7)static olanlarda değişim herkes tarafından farkedilir
     8)static olmak herkesin ortak noktası olduğunda yapılır
     */



public static int numOfRegisteredStd = 0;
public int num = 0;

    public Student() {
        numOfRegisteredStd++;
                num++;
    }

    public static void main(String[] args) {
        System.out.println(numOfRegisteredStd);//0
Student s1=new Student();
        System.out.println(numOfRegisteredStd);//1
Student s2=new Student();
        System.out.println(numOfRegisteredStd);//2
Student s3=new Student();

        System.out.println(numOfRegisteredStd);//3
        System.out.println(s1.num);//1

    }


}
