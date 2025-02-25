package d8stringManipulations01;

import java.awt.geom.Path2D;
import java.util.Locale;

public class StringManipulations04 {
    public static void main(String[] args) {

        //Ornek 1: Asagida fiyatlari verilen urunlerin toplam fiyatini bulunuz.
        //String tv = "$456.99";   String laptop = "$875.99"; ==> 456.99 + 875.99 = 1332.98

        //Example 1: Find the total price of the following products.
        //String tv = "$456.99"; String laptop = "$875.99"; ==> 456.99 + 875.99 = 1332.98

        //valueOf() : Belirtilen String’i Double’a cevirir

        String tv = "$456.99";
        String laptop = "$875.99";
        tv = tv.replace("$" , "") ;//456.99
        //System.out.println(tv);
        laptop =laptop.replace("$" , "");//875.99
        //System.out.println(laptop);

        Double totalPrice = Double.valueOf(tv) + Double.valueOf(laptop);
        System.out.println(totalPrice);

        //------------------
        //Ornek 2: Kullanici isminin ilk harflerini alip buyuk hale getirerek console'a yazdiriniz.
        //           "   ali cAN   " ==> AC
        //Example 2: Take the first letters of the username, capitalize them and write them to the console.

        //trim() metodu bir String’deki bastaki ve sondaki bosluklari siler. Aradakileri silmez
        //split() String’i istediginiz karakterden parcalamaya yarar.
        //Not: Bir satirda, birden fazla methodu yanyana kullanirsaniz buna “method chain (zincir)” denir

        //\\s+ ifadesi, bir veya daha fazla ardışık boşluk karakterini ifade eder.
        String name = "  aLI cAn  ";
        char first = name.trim().toUpperCase().charAt(0);
        System.out.println(first);//A

        char last = name.trim().toUpperCase().split(" ")[1].charAt(0);
        System.out.println(last);//C

        System.out.println("" + first + last);//AC


    }
}
