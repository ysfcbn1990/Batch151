package javaders.day22stringbuilder;

public class Student {

//stdName "public olduğu için diğer class'lardan ulaşılabilir

   public String stdName="Ali Can";

   //Access Modifier'ı "default" olan ile "public" olan class memberler aynı package içinde kullanıldıklarında
   //aynı özellikleri gösterirler.
   // Fakat farklı package geçtiğinizde "public" olanlara ulaşılabilir " default " olanlara ulaşılamaz

   int age=23;


   //"Acces Modifier"'i "private"olan Class Member'lar sadece oluşturuldukları class içinden görülebilirler
   //Oluşturuldukları class'ın dışına çıktıklarında görünmez ulaşılmaz olurlar

 private String healthCondition= "Cancer";

 //"Acces Modifier"'i "protected"olan Class Member'lar aynı package içinde iken "public" gibi davranırlar
    //Farklı package geçtiğinizde "protected" olanlar sadece child class'lardan görülebilirler
protected int salary=3000;

//note : Classlar "public" ve "default" olabilir ama "private" ve "protected" olamazlar

}
