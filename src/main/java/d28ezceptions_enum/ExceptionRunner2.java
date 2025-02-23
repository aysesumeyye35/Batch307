package d28ezceptions_enum;

public class ExceptionRunner2 {
    public static void main(String[] args) {

      numberOfStudents(-55);



    }//main disi
    public static void numberOfStudents(int sayi){

       if (sayi < 0){
           throw new InvalidNumberException("Bir okuldaki ogrenci sayisi negatif olamaz");
       }else{
           System.out.println(sayi);
       }
    }
}
