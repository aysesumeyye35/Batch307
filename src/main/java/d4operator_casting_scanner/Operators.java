package d4operator_casting_scanner;

public class Operators {

    public static void main(String[] args) {

        int amountOfMoney1 = 25;
        int numberOfPeople1 = 10;
        System.out.println(amountOfMoney1 / numberOfPeople1); //2 cikti, 2.5 cikmaliydi, Java .5'i sildi

        double amountOfMoney2 = 25; //8 byte ondalikli sayi
        int numberOfPeople2 = 10; //4 byte tamsayi
        System.out.println(amountOfMoney2 / numberOfPeople2); //2.5
    /*
        +,-,*,/ islemleri Java'da matematikte kullanildigi gibi kullanilir
        Not 1: Java'da bir tamsayiyi baska bir tamsayiya bolerseniz sonuc her zaman tamsayi olur
        Not 2: Eger sonuc tamsayi degilse Java sonucun ondalik kismini silerek onu int'e donusturur.
        Not 3: Bir matematiksel islemde farkli data tiplerini kullanirsaniz sonuc her zaman buyuk data tipinde olur.
         */


      /*2) Java da "logical operator" lar.
       ==> AND (&&) isleminden true alabilmek icin her sey true olmalidir
       AND islemini carpma olarak dusunebiliriz

       ==> OR(||) isleminde bir tane true sonucu true yapmaya yeterlidir
       OR isleminde sonucun false olabilmesi icin hersey false olmalidir

       //==> NOT Operatoru (!) true olani false , false olani true yapar
       !true  ==> false
       !false ==> true
       !!true ==> true


               int amountOfMoney = 23;
        int numberOfPeople = 17;
       */

    /*3) Comparison (Karsilastirma) Operators
       <, >, <=, >=, ==, !=
       Not: Karsilastirma operatorlerini kullandiginizda sonuc kesinlikle boolean (true, false) alirsiniz*/

        boolean a = 3 < 5 ; //true
        boolean b = 2 + 3 != 5; //false
        boolean c = 2+3*5 >= 19; //false

        System.out.println(a && b); //false

        System.out.println(a || b || c);









    }




}
