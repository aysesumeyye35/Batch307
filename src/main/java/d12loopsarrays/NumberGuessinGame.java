package d12loopsarrays;

import java.util.Random;
import java.util.Scanner;

public class NumberGuessinGame {
    public static void main(String[] args) {

        //Ornek 1: 0-100 arasi sayi tahmin etme oyununu do-while ile yaziniz.
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        //0 ile 100 arasında rastgele sayi uretiyoruz
        int rastgeleSayi = random.nextInt(101);

        //ODEV: 20(dahil) ile 100(dahil) arasında random sayi isteseydik?

        //Kullanıcının kac kere tahmin yaptığını takip etmek için bir sayac oluşturuyoruz
        int denemeSayısı =0 ;

        //Kullanıcın yaptığı tahmini saklamak için bir değişken oluşturuyoruz
        int tahminEdilen;

        //Tahmin için bir değişken oluşturalım
        boolean tahminDogrumu = false;
        System.out.println("0 ile 100 arasıda bir sayıyı tahmin etmeye çalışın");

        do {
            // Kullanıcıdan tahmini alalım
            System.out.println("Tahmininizi yapınız");
            tahminEdilen= scanner.nextInt();
            //sayacı bir arttıralım
            denemeSayısı++;
            //Tahmini kontrol edelim
            if(tahminEdilen < rastgeleSayi){
                System.out.println("Sayi daha büyük");
            }else if(tahminEdilen>rastgeleSayi){
                System.out.println("Sayi daha kucuk");
            }else{
                tahminDogrumu= true;
                System.out.println("Tebrikler doğru bildiniz");
                System.out.println("denemeSayısı = " + denemeSayısı);
            }
        }while(!tahminDogrumu);




    }
}
