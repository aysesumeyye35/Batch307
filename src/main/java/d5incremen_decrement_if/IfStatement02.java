package d5incremen_decrement_if;

import java.util.Scanner;

public class IfStatement02 {
    public static void main(String[] args) {

        //Ornek 1: Kullanicidan alinan bir sayinin tek mi cift mi oldugunu yazdiran kodu olusturunuz.
    //Example 1: Create the code that prints whether a number received from the user is odd or even.

    //1.yol:

    Scanner input = new Scanner(System.in);
        System.out.println("Lutfen bir sayi giriniz");

    int num = input.nextInt();
        if (num % 2 == 0) {
        System.out.println("Çift sayı");
    }


        if ( num % 2 != 0 ) { // num %2 == 1
        System.out.println("Tek sayı");

    }
    //------------
    // 2.yol : if - else
        if (num % 2 == 0 ) {

            System.out.println("Sayı çifttir");

        }  else {

            System.out.println("sayı tektir");
        }

}
}
