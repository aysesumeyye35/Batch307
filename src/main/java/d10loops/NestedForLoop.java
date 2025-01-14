package d10loops;

import java.util.Random;
import java.util.Scanner;

public class NestedForLoop {
    public static void main(String[] args) {
        // practise derslerinde çözdüklerimiz


        /*

         *
         * *
         *****
         *     *
         *       *

         */

        int satir = 5;
        for (int bulSatir = 1; bulSatir <= satir; bulSatir++) {
            for (int bosluk = satir - bulSatir; bosluk > 0; bosluk--) {
                System.out.print(" ");
            }
            for (int yildiz = 1; yildiz <= bulSatir * 2 - 1; yildiz++) {
                if (yildiz == 1 || yildiz == bulSatir * 2 - 1 || bulSatir == satir / 2 + 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }

            }
            System.out.println();
        }
        // kullanicidan toplamak istedigi sayilari alin
        // ve kullanici 0'a basincaya kadar devam edin
        // kullanici 0'a bastiginda
        // girdigi tum sayilarin toplamini yazdirin
        //ternary-> kaç defa dönecegi belli mi ? (for) :(en az bir kere calışmalı mı?(do while):(while))
        Scanner input = new Scanner(System.in);
        int sayı;
        int toplam = 0;
        do {
            System.out.println("Lütfen toplamak istediğiniz sayıları giriniz ,siz 0 a basana kadar toplama devam edecek");
            sayı = input.nextInt();
            toplam += sayı;
        } while (sayı != 0);
        System.out.println("toplam = " + toplam);

        // bilgisayara 1 ile 100 arasinda bir sayi tutturun
        // kullanicidan bu sayiyi tahmin etmesini isteyin
        // girilen her tahminde sayiyi buyut veya kucult diye kullaniciya yol gosterin
        // kullanici sayiyi buldugunda kac tahminde sayiyi buldugunu kullaniciya yazdirin
        // Random rnd=new Random();
        // int sayi=rnd.nextInt(100);  // burasi 100'den kucuk rastgele bir sayi olusturur
        // kullaniciya 5 tahmin hakkı verin bulursa tebrik edin bulamazsa exit atip tekrar oynamasini isteyin

        Random rnd = new Random();
        int sayi = rnd.nextInt(101);

        int tahminHakkı = 5;
        while (tahminHakkı > 0) {
            System.out.println("Lütfen tahminde bulunmak için 0-101 arasında bir değer giriniz");
            int number = input.nextInt();
            if (sayı > number) {
                System.out.println("Daha büyük oyun giriniz");
            } else if (sayı < number) {
                System.out.println("Daha küçük değer giriniz");
            } else {
                System.out.println("Tebrikler ");
                break;
            }
            tahminHakkı--;
            System.out.println("Kalan tahmin hakkınız : " + tahminHakkı);
            if (tahminHakkı == 0) {
                System.out.println("Tahmin hakkınız bitmiştir yeni 3 tahmin hakkı ister misin?" +
                        "\nevet icin 'e' \nhayır için 'h'");
                String str = input.next();
                if (str.equalsIgnoreCase("e")) {
                    tahminHakkı += 3;
                } else {
                    System.out.println("Görüşmek üzere tekrar bekleriz ♥");
                }
            }


        }
    }
}