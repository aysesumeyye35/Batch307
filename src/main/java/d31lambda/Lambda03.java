package d31lambda;

import java.util.stream.IntStream;

public class Lambda03 {
    public static void main(String[] args) {

        //int sum = getSumFromSeventoSeventy();
        //System.out.println(sum);//2464
        //System.out.println(getMultiplicationFromThreeToNine1());//181440
        //System.out.println(getMultiplicationFromThreeToNine2());//181440
        //System.out.println(getFactorial(-6));
        System.out.println(getSumsOfBetweenTwoInteger(5 , 12));//24
    }//main disi
    //1)  7'den 70'e kadar tum tamsayilarin toplamini veren kodu yaziniz.
    //1) Write the code that returns the sum of all integers from 7 to 70

    /*
    a) IntStream - primitive int değerleri üzerinde ardışık işlemler yapmayı sağlar.(LongStream, DoubleStream'de var)
    b) range - Belirtilen başlangıç (dahil) ve bitiş değerleri (haric) arasında ardışık sayıları
    temsil eden bir akış oluşturur.
    c) rangeClosed - Belirtilen başlangıç (dahil) ve bitiş değerleri (dahil) arasında ardışık sayıları
    temsil eden bir akış oluşturur.
    d) addExact - tam ekle - İki int veya long değerini toplar. Math class'tadir.
    e) getAsInt - OptionalInt sınıfında bulunan bir metottur.Eğer bir değer mevcutsa bu değeri döndürür.(IntStream kullaninca bunu kullaniriz)
    Eğer bir değer mevcut değilse bir NoSuchElementException hatası fırlatır.
    */

    public static int getSumFromSeventoSeventy() {
        return IntStream.rangeClosed(7, 70).reduce(Math::addExact).getAsInt();
    }

    //2)  3'den 9'a kadar tum tamsayilarin carpimini veren methodu olusturunuz.
    //2) Create a method that multiplies all integers from 3 to 9.
    //1.yol:
    public static int getMultiplicationFromThreeToNine1() {
        return IntStream.
                rangeClosed(3, 9). //ikisi de dahil
                reduce(Math::multiplyExact).
                getAsInt();
    }

    //2.yol:
    public static int getMultiplicationFromThreeToNine2() {
        return IntStream.
                range(3, 10). //2.parametre dahil değil
                reduce(Math::multiplyExact).
                getAsInt();
    }
    //3)Size verilen sayinin faktoriyelini hesaplayan kodu yaziniz.
    //3)Write the code that calculates the factorial of the given number.

    //3! = 1 * 2 * 3 = 6
    //0! = 1
    //Negatif sayıların faktöriyeli yoktur

    public static int getFactorial(int x) {
        if (x == 0) {
            return 1;
        } else if (x < 0) {
            System.out.println("Gecersiz data girdiniz");
            return -1;
        } else {
            return IntStream.rangeClosed(1, x).reduce(Math::multiplyExact).getAsInt();

        }


    }
    //4)Size verilen iki tamsayi arasindaki tum cift sayilarin toplamini veren kodu yaziniz.
    //baslangic ve bitis dahil degil.
    //4)Write the code that gives you the sum of all even numbers between two given integers.
    //beginning and ending are not included.

    //sum metodu, IntStream üzerindeki tüm elemanların toplamını hesaplar ve bu toplamı döndürür.

    public static int getSumsOfBetweenTwoInteger(int a, int b) {
       if (a > b ){
           int temp = a; //1.adim

           a = b; //2.adim

           b = temp; //3.adim

       }

       return IntStream.range(a+1 , b).filter(Utils::isNumberEven).sum();
    }


}
