package practise.day_08_practise;

public class C03_Array {
    public static void main(String[] args) {


     /*

      Aşağıdaki multi dimensional array'lerin iç array'lerinde aynı indexe sahip elamanların
      toplamını yazdıran bir program yazın.*/


      int arr1[][] = {{1,2},{3,4,5}};
      int arr2[][] = {{7,8,9},{10,11},{12}};

      int sınır=0;
       int toplam=0;
      for(int i=0;i< arr1.length;i++){//Dıştaki Arraylerin kısa olanının sayısınca döngüye alıcam

          if(arr1[i].length<arr2[i].length){//array1'in i. indexindeki dış arrayin eleman uzunluğu ile
                                             //arr2'in i.indexindeki dış eleman uzunluğunu karşılaştırdık
              sınır=arr1[i].length;

          }else{
              sınır=arr2[i].length;
          }
          for(int j=0;j<sınır;j++){

              toplam=arr1[i][j]+arr2[i][j];
              System.out.println(i+","+j+"indexindeki elemanlarin toplami " + toplam);
          }

      }






















    }

}
