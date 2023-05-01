package javaders.day17multidimensionalarraypassbyvalue;

public class PassByValue01 {
    /*
    Method oluşturmak için aşağıdaki 5 adımı takip ediniz
    1)Access Modifier
    2)Return Type
    3)Method ismi
    4)Method Parantezi
    5)Süslü Parantez.{}method body içerisine yazılır

    Note:"main method" içindeki tüm methodlar static olmalıdır.
    Bir methodu static yapmak için" Access modifier" ile "return type" arasına "static" yazmak yeterlidir

    PassByValue:
    1)Java Pass by Value kullanır.
    2)Yani Java methodların orjinal değeri değiştirmesine müsade etmez.
    3)Java methodlara değer yollarken orjinal değerin kopyasını oluşturur ve o kopyayı method'a yollar
    Method kopya değer üzerinde değişiklik yapar,böylece orjinal değer korunmuş olur
    4)Java esnek bir dildir.istersek yazdığımız kod ile orjinal değerin değişmesini de temin edebiliriz

    Pass by Reference:
    1)Pass by Reference da methoda reference yollanır
    2)Reference adres demektir.Adres yollanınca method adresi kullanarak orjinal değere ulaşır ve orjinal değeri değiştirir
    Bu yüzden "C#" gibi Pass by Reference kullanan dillerde method variable'ın orjinal değerini değiştirir
     */
    public static void main(String[] args) {

        int shirtPrice=200;
        System.out.println(discount("student",shirtPrice));
        System.out.println(shirtPrice);

        shirtPrice=discount("veteran",shirtPrice);
        System.out.println(shirtPrice);
    }
    //discount methodu oluşturunuz
    public static int discount(String type,int price){
        switch (type){
            case "student":
                price=price-20;
                break;
            case "veteran":
                price=price-40;
                break;
            case"senior":
                price=price-30;
                break;
            default:
                price=price;
        }
        return price;
    }


}
