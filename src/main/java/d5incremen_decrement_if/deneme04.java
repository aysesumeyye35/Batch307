package d5incremen_decrement_if;

import java.util.Scanner;

public class deneme04 {
    public static void main(String[] args) {
/*
        String slogan = "Java Good";
        int sayi = slogan.length();

 */
        //öğrenci kimlik durumuna göre bir bilet fiyatı belirleyen bir kod
        // . age 18'den küçükse çocuk bileti fiyatı uygulanır.
        // Eğer age 18'den büyükse ve öğrenci kimliği varsa, öğrenci bileti fiyatı uygulanır.
        // Eğer age 65'ten büyükse yaşlı bileti fiyatı uygulanır, aksi takdirde tam bilet fiyatı uygulanır.


        //Kullanıcıdan bir sayı alın ve sayının pozitif mi yoksa negatif mi olduğunu kontrol edin.

        /*
        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen bir sayı giriniz");
        int sayi = input.nextInt();
        if (sayi<0){
            System.out.println("sayi negatiftir");
        }else{
            System.out.println("sayi pozitiftir");
        }


         */

        /*
        //Kullanıcıdan bir parola alın ve bu parolanın "java123" olup olmadığını kontrol edin

        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen şifrenizi giriniz");
        String musteri= input.nextLine();
        String parola = "java123";
        if (musteri.equals(parola)){
            System.out.println("şifre doğrudur");
        }else {
            System.out.println("şifreyi tekrar kontrol ediniz");
        }

         */
        //Kullanıcıdan bir not alın (0-100 arası) ve bu notun harf karşılığını (A, B, C, D, F)
        //belirleyin. 100-90 = A, 90-80= B, 80-70=C, 70-60=D, 0-60 F

        /*
        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen aldığınız notu giriniz");
        int puan = input.nextInt();
        String not = "0-100";


        if(puan<0 || puan>100){
            System.out.println("gecersiz");
        } else if (puan >= 90 ){
            System.out.println("A");
        }else if(puan>=80){
            System.out.println("B");
        }else if(puan >=70){
            System.out.println("C");
        }else if(puan>=60){
            System.out.println("D");
        }else{
            System.out.println("F");
        };


         */
        /*Ornek 1: Asagidaki kurallara gore kullanicinin girdigi password'u kontrol ediniz.

        i)En az 8 karakter olsun
        ii)Space karakteri password'de olmasin
        iii)En az bir tane buyuk harf olsun
        iv)En az bir tane kucuk harf olsun
        v)En az bir tane rakam olsun */

        /*
        Scanner input = new Scanner(System.in);
        String pwd = input.nextLine();
        System.out.println("Lütfen  şifrenizi giriniz");
        boolean lenghControl = pwd.length()>7;
        System.out.println("lenghControl = " + lenghControl);
        if(!lenghControl){
            System.out.println("Şifre en az 8 karakter içermelidir");
        }

        boolean spaceControl = pwd.replaceAll("[^ ]","").length()==0;
        System.out.println("spaceControl = " + spaceControl);
        if (!spaceControl){
            System.out.println("Şifre boşluk içermemelidir");
        }

        boolean upperCaseControl = pwd.replaceAll("[^A-Z]", "").length()>0;
        System.out.println("upperCaseControl = " + upperCaseControl);

        if(!upperCaseControl){
            System.out.println("Şifre en az 1 tane büyük harf içermelidir");
        }
        boolean lowerCaseControl = pwd.replaceAll("[^a-z]", "").length()>0;
        System.out.println("lowerCaseControl = " + lowerCaseControl);

        if (!lowerCaseControl){
            System.out.println("Şifre en az 1 tane küçük harf içermelidir");
        }

        boolean digitControl = pwd.replaceAll("[^0-9]", "").length()>0;
        System.out.println("digitControl = " + digitControl);
        if (!digitControl){
            System.out.println("Şifre en az 1 tane rakam içermelidir");

        }

        boolean isValid = lenghControl && spaceControl && upperCaseControl && lowerCaseControl && digitControl ;
        if (isValid){
            System.out.println("Şifre geçerlidir");
        }else{
            System.out.println("şifre geçersizdir");
        }




         */
        /*
        //4. soru İki sayı al ve bu sayıların eşit olup olmadığını kontrol et.

        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen iki sayı alınız");
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        if (num1==num2){
            System.out.println("Sayilar esittir");
        }else{
            System.out.println("Sayilar esit degildir");
        }


         */

        /*

        //5.soru Kullanıcıdan bir not alın (0-100 arası) ve bu notun
        //harf karşılığını (A, B, C, D, F) belirleyin. Ancak, not 50'nin altındaysa "kaldı" mesajı verin


        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen aldığınız notu giriniz");
        int puan = input.nextInt();
        String not = "0-100";


        if(puan<0 || puan>100){
            System.out.println("gecersiz");
        } else if (puan >= 90 ){
            System.out.println("A");
        }else if(puan>=80){
            System.out.println("B");
        }else if(puan >=70){
            System.out.println("C");
        }else if(puan>=60){
            System.out.println("D");
        }else if (puan>=50){
            System.out.println("F");
        }else{
            System.out.println("Kaldı");
        }


         */

        // Bir ülkedeki arac vergi oranları asağıda verilmiştir. Kullanıcıdan aracın vergisizFiyat
        //ve motor hacmi bilgisini alıp, anahtarTeslim fiyatı belirleyen bir program yazınız.
        //Örnek araçlar :
        //2500 TL fiyat, 1800 motor
        //900 TL fiyat, 1200 motor
        //2300 TL fiyat 3600 motor
        //Vergisiz Fiyat Motor Hacmi
        //1000 TL altı 1600 altı %40
        //1600 ve üstü %50
        //1000 TL üstü 1600 altı %75
        //1600-2499 %100
        //2500 ve üstü %200
        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen aracınızın vergisiz fiyatını giriniz");
        int vergisizPrice = input.nextInt();
        System.out.println("lütfen aracınızın motor hacmini giriniz");
        int motorHacmi = input.nextInt();
        int vergiOrani = 40000;





        if (vergisizPrice < 1000) {
            if (motorHacmi < 1600) {
               vergiOrani= 40;

            } else {
                vergiOrani = 50;
            }
        }

        else if (vergisizPrice > 1000) {

            if (motorHacmi < 1600) {
                vergiOrani = 75;
            }
            else if (motorHacmi > 1600 && motorHacmi < 2500) {
                vergiOrani = 100;
            } else if(motorHacmi>= 2500) {
                vergiOrani = 200;
            }
        }

        double vergiTutar = ((vergisizPrice * vergiOrani) * 0.01);
        double satisFiyati = vergisizPrice + vergiTutar;

        System.out.println("Arac vergisiz fiyatı = " + vergisizPrice);
        System.out.println("Arac Vergi Dilimi = " + vergiOrani);
        System.out.println("Vergi yükü = " + vergiTutar);
        System.out.println("Arac satıs fiyatı = " + satisFiyati);



    }
}
