package d8stringManipulations01;

public class StringManipulations02 {
    public static void main(String[] args) {
        //Regular Expression (Regex) -düzenli ifade




        /*
        Meshur Regex'ler (Regular Expression):
        Bir grup data'yi almak icin kullanilir

        1) Tum rakamlar ==> [0-9]
        2) Tum kucuk harfler ==> [a-z]
        3) Tum buyuk harfler ==> [A-Z]
        4) Tum kucuk harfler ve buyuk harfler ==> [a-zA-Z]
        5) Tum harfler ve rakamlar ==> [a-zA-Z0-9]
        6) Tum noktalama isaretleri ==> \\p{Punct}
        7) Tum sesli harfler ==> [aeiouAEIOU]
       Tum a, x, y harfleri ==> [axy]
         a'dan g'ye tum kucuk ve buyuk harfler: [A-Ga-g]
        8) Tum kucuk harfler haric: ==> [^a-z]
        9) Tum harfler haric ==> [^a-zA-Z]

        Bu kisim da [] kullanilmaz. Buyuk harfler olumsuz anlama gelir
        Sadece space karakteri : \\s
        Space karakteri haric  : \\S
        Sadece rakamlar        : \\d  (digit ten geliyor)
        Rakamlar haric         : \\D
            */
        //----------------------------------
        //Ornek 1: s String’indeki tum rakamlari(0, 1, 2, 3, 4, 5, 6, 7, 8, 9) “*” a ceviriniz.
        //Example 1: Convert all digits (0, 1, 2, 3, 4, 4, 5, 6, 7, 8, 9) in String s to “*”

        /*
        String s = "Learn Java earn 1234 money";

        String s1 = s.replaceAll("[o-9]", "*");
        System.out.println(s1);

        //------------------------------
        //Ornek 2: “s” String’indeki rakam sayisini bulunuz.
        //Example 2: Find the number of digits in String “s”

       int num  = s.replaceAll("[^0-9]" , "").length();
        System.out.println(num);//4

        // method chan - metot zinciri  metotları arka arkaya kullanmaktır.
        // data tipinde en son kullanılan metot neyse o secılır.



         */




    }
}
