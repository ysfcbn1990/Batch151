package javaders.day28interface;



/*
child       parent
1)Class --> Class : extends
interface --> interface : extends
Class -->  interface : implements
interface --> Class : olamaz
Aynı ise "extends",farklı ise "implements" kullan
"interface"'i Class'ın child'i yapma olamaz

Abstract Class ile interface arasındaki farklar
1) Abstract Class'lar hem "abstract" hemde "concrete" method içerebilir fakat interface'ler sadece "abstract"method içerir
Ama interface'lerde istersek "default" ve "static" keywordlarını kullanarak "concrete" method üretebiliriz
2)Abstract Class'lar multiple inheritance'i desteklemez ama interface'ler destekler
3)Abstract Class'lar içinde her türlü variable oluşturulabilir,inteerface'ler içindeki variable'lara public,static ve final olmak zorundadır
4)"interface" Class'ın childi olamaz ama "abstract class" class'ın chiild'i olabilir
5)Abstract class'larda constructor vardır ama object üretemez,interface'lerde constructor yoktur bu yüzden object üretilemez
 */
public interface Mammal extends Animal{


    String feedBaby="Milk";
    int age=6;


}
