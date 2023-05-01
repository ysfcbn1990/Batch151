package javaders.day43Lambda;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Lambda01 {

    public static void main(String[] args) {

Course turkishDay=new Course("Turkish Daytime QA",213,"Spring",97);
Course turkishNight=new Course("Turkish Nightime QA",245,"Winter",98);
Course englishDay=new Course("English Daytime Java Dev",121,"Spring",91);
Course englishNight=new Course("English Nighttime Java Dev",137,"Winter",95);

List<Course> courseList=new ArrayList<>();

courseList.add(turkishDay);
courseList.add(turkishNight);
courseList.add(englishDay);
courseList.add(englishNight);

        System.out.println(birSayidanBuyukMu(courseList,90));

        System.out.println(isAnyCourseNameContainsQa(courseList, "QA"));

        System.out.println(getCourseNameWhoseAvgMax(courseList));

        System.out.println(sonIkidenDahaIyiKurslariAl(courseList));

        System.out.println(averageScoreUcuncuOlan(courseList));

        System.out.println(ogrenciSayisiVerilenSayidanAzOlanlariAlma(courseList, 150));

    }
//Example 1)Tüm Average score'ların 90 dan büyük olup olmadığını kontrol eden methodu oluşturunuz

    public static boolean birSayidanBuyukMu(List<Course> courseList,int avg){
      return  courseList.stream().allMatch(t->t.getAverageScore()>avg);

    }
    //Example 2)En az bir kurs isminin QA içerip içermediğini kontrol eden method'u oluşturunuz
    public static boolean isAnyCourseNameContainsQa(List<Course> courseList, String word){

        return courseList.stream().anyMatch(t->t.getCourseName().contains(word));

    }

    //Example 3: En yuksek average score'a sahip kurs ismini veren code'u yaziniz.
    public static String getCourseNameWhoseAvgMax(List<Course> courseList) {
       return courseList.stream().sorted(Comparator.comparing(Course::getAverageScore).reversed()).findFirst().get().getCourseName();



    }

    //Example 4: Average score 'u en düşük olan ilk iki kurs dışındaki tüm kursları return eden methodu oluşturunuz

    public static List<Course> sonIkidenDahaIyiKurslariAl(List<Course> courseList){
       return courseList.stream().sorted(Comparator.comparing(Course::getAverageScore)).skip(2).collect(Collectors.toList());
    }
    //Example 5: Average score 'u üstten üçüncü olan kursu veren methodu oluşturunuz

    public static Course averageScoreUcuncuOlan(List<Course> courseList){
        return courseList.
                stream().
                sorted(Comparator.comparing(Course::getAverageScore).reversed()).
                skip(2).
                limit(1).
                collect(Collectors.toList()).
                get(0);
    }

 //Example 5:Öğrenci sayısı 150'den az olan kursları return eden methodu oluşturunuz
    public static List<Course>ogrenciSayisiVerilenSayidanAzOlanlariAlma(List<Course> courseList,int numOfStd){
        return courseList.stream().filter(t->t.getNumOfStudents()<numOfStd).collect(Collectors.toList());
    }

}
