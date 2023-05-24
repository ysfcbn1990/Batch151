package mini_projects.login;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class UserService {

    List<String> usernameList=new ArrayList<>();
    List<String> emailList=new ArrayList<>();
    List<String> passwordList=new ArrayList<>();


   public void showMenu(){
       System.out.println("===TECHPRO====");
       System.out.println("1-Üye Ol");
       System.out.println("2-Giriş Yap");
       System.out.println("3-Çıkış Yap");
       System.out.println("Seçiminiz:");
   }
public void register(){
    Scanner scanner=new Scanner(System.in);
    System.out.println("Lütfen ad-soyad giriniz");
    String name=scanner.nextLine();

    String username;
    boolean existsUsername;

    do{
        System.out.println("Kullanıcı adını giriniz");
        username=scanner.nextLine();
        existsUsername=usernameList.contains(username);
        if(existsUsername){
            System.out.println("Bu username daha önce kullanılmıştır.Yeni bir username deneyiniz");
        }
    }while(existsUsername);

    String email;
    boolean isValid;
    boolean existEmail;
    do{
        System.out.println("Email giriniz");
        email=scanner.nextLine().trim();
        isValid=validateEmail(email);

        existEmail=emailList.contains(email);

        if(existEmail){
            isValid=false;
            System.out.println("Bu email daha önce kullanılmıştır.Yeni bir email deneyiniz");
        }


    }while(!isValid);






     String password;
     boolean isValidPassword;

     do{
         System.out.println("Şifre giriniz");
         password=scanner.nextLine();
         isValidPassword=validatePassword(password);

     }while(!isValidPassword);
    User user=new User(name,username,email,password);
    usernameList.add(username);
    emailList.add(email);
    passwordList.add(password);

    System.out.println(user);
    System.out.println("Tebrikler kayıt işleminiz gerçekleşmiştir.");
    System.out.println("Kullanıcı adı veya email ve şifre ile sisteme girebilirsiniz");



}

public void login(){
       Scanner scanner=new Scanner(System.in);
    System.out.println("Kullanıcı adı veya email giriniz");
    String usernameOremail=scanner.nextLine();


    boolean isEmail=emailList.contains(usernameOremail);
    boolean isUsername=usernameList.contains(usernameOremail);

    if(isEmail||isUsername) {


        while (true) {
            System.out.println("Şifrenizi giriniz");
            String password = scanner.nextLine();

            int idx;
            if (isUsername) {
                idx = usernameList.indexOf(usernameOremail);
            } else {
                idx = emailList.indexOf(usernameOremail);
            }

            if (passwordList.get(idx).equals(password)) {
                System.out.println("Sisteme giriş yaptınız");
                break;
            } else {
                System.out.println("Şifreniz yanlıştır.Tekrar deneyiniz");
            }
        }
    } else{

        System.out.println("Sisteme kayıtlı kullanıcı bulunamadı");
        System.out.println("Bilgileri kontrol ediniz yada üye olunuz");

    }




}




public static boolean validateEmail(String email){
       boolean isValid;
       boolean space=email.contains(" ");
       boolean isContainAt=email.contains("@");
       if(space){
           System.out.println("Email boşluk içeremez");
           isValid=false;
       } else if (!isContainAt) {
           System.out.println("Email @ içermelidir");
           isValid=false;
       }else{
           String firstPart = email.split("@")[0];
           String secondPart = email.split("@")[1];

           boolean checkStart=firstPart.replaceAll("[a-zA-Z0-9_.-]","").length()==0;
           boolean checkEnd=secondPart.equals("gmail.com")||
                   secondPart.equals("hotmail.com")||
                   secondPart.equals("yahoo.com");
            if(!checkStart){
                System.out.println("Email küçük harf,büyük harf,rakam ve _.- dışında karakter içeremez");
            } else if (!checkEnd) {
                System.out.println("Emailiniz gmail.com,hotmail.com veya yahoo.com ile bitmeli");
            }
            isValid=checkEnd && checkStart;
       }
return isValid;
}
public static boolean validatePassword(String password){
       boolean isValid;
       boolean space=password.contains(" ");
       boolean karakter=password.length()>=6;
       boolean bykHarf=password.replaceAll("[^A-Z]","").length()>0;
       boolean kckHarf=password.replaceAll("[^a-z]","").length()>0;
       boolean rakam=password.replaceAll("[\\D]","").length()>0;
       boolean sembol=password.replaceAll("[\\P{Punct}]","").length()>0;
       if(space){
           System.out.println("Şifre boşluk içeremez");
       } else if (!karakter) {
           System.out.println("Şifre en az 6 karakter içermelidir");
       } else if (!bykHarf) {
           System.out.println("Şifre en az bir büyük harf içermelidir");
       } else if (!kckHarf) {
           System.out.println("Şifre en az bir küçük harf içermelidir");
       }else if (!rakam) {
           System.out.println("Şifre en az bir rakam içermelidir");
       }else if (!sembol) {
           System.out.println("Şifre en az bir sembol içermelidir");
       }


    isValid=!space&&karakter&&bykHarf&&kckHarf&&rakam&&sembol;
       if(!isValid){
           System.out.println("Tekrar deneyiniz");
       }

     return isValid;
}


}
