package javaders.day18constructorsstatickeyword;

public class StudentRunner {
    public static void main(String[] args) {
        //Static olan numOfRegisteredStd variable'nı çağırmak için sadece class ismini kullandık,object oluşturmadık
        System.out.println(Student.numOfRegisteredStd);

     //Static olmayan "num" variable'nı çağırmak için object oluşturduk
        Student s1 = new Student();
        System.out.println(s1.num);


        //Static olan 'numOfRegisteredStd'variable'ına object üzerinden de ulaşabilirsiniz ama bu hatadır
        System.out.println(s1.numOfRegisteredStd);







    }//main
}//class
