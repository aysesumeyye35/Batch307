package d12loopsarrays;

public class ForLoops05 {
    public static void main(String[] args) {
        //Ornek 1: Verilen sayıda ondalık kısımdaki rakamların toplamını bulunuz.
       //Example 1: Find the sum of the digits in the decimal part of the given number.
       //            28.587 ==> 5+8+7=20
        double num = 28.587;
        String sNum = String.valueOf(num); // " 28.587"
        String decimalPart = sNum.split("[\\.]")[1];
        int intDecimalPart = Integer.valueOf(decimalPart);
        //-------------
        int sum = 0;
        for (int i = intDecimalPart; i >0 ; i = i/10) {

            sum = sum + i % 10;

        System.out.println(sum); //20


    }
}
}














