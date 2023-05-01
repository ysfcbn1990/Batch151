package javaders.introduction.day3scanner;

public class Runner {
    public static void main(String[] args) {

        //Object nasıl oluşturulur?
        //Class Ismi + Object Ismi+ Atama Operatorü + "new" + Constructor
        Car             myCar           =             new        Car();

        //"new" keyword'u sıfırdan yeni bir obje oluşturmakiçin kullanılır.
        //Constructor Java ' da nesneleri oluşturmak için kullanılan özel bir methoddur.
        System.out.println(myCar .fiyat);
        System.out.println("myCar.model = " + myCar.model);

        myCar.hareket();
        myCar.dur();

        Student  tomHanks = new Student();
        System.out.println("tomHanks.name = " + tomHanks.name);
        System.out.println("tomHanks.address = " + tomHanks.address);
        System.out.println("tomHanks.grade = " + tomHanks.grade);
        tomHanks.feed();
        tomHanks.study();
        byte grade = tomHanks.grade;
        System.out.println("grade = " + grade);

    }
}
