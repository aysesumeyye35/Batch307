package d5incremen_decrement_if;

import java.util.Scanner;

public class deneme03 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
       /*
        System.out.println("lütfen hesaplamak istediğiniz dairenin yarıçapını giriniz ");
        double r = input.nextDouble();
        System.out.println(" çevre : "+ 2*3*r);
        System.out.println("alan: "+ 3*r*r);
        System.out.println("Çevre : "+2*Math.PI*r);//14.399999999999999   gerçek pi sayisi ile : 15.079644737231007



        */



        //Soru : Kullanicidan dikdortgenler prizmasinin uzun,
        //kisa kenarlarini ve
        //yuksekligini isteyip prizmanin hacmini(uzun*kısa*yukselik) hesaplayip yazdirin

        /*
        double uzunKenar;
        double kisaKenar;
        double yukseklik;
        double hacim;
        System.out.println("lütfen hesaplamak istediğiniz uzun kenarı giriniz ");
        uzunKenar = input.nextDouble();
        System.out.println("kısa kenarı giriniz");
        kisaKenar = input.nextDouble();
        System.out.println("Yuksekliği giriniz");
        yukseklik = input.nextDouble();

        if (uzunKenar > kisaKenar)
        {

            hacim = uzunKenar * kisaKenar * yukseklik ;
            System.out.println("hacim :" + hacim);

        }  else if (uzunKenar < kisaKenar)
        {

            System.out.println("uzun kenar kısa kenardan az oldu, kontrol edip tekrar giriniz");
        } else {

            System.out.println("Uzun ve kısa kenar birbirine eşittir. Verilerin doğruluğundan emin olunuz");
            hacim = uzunKenar * kisaKenar * yukseklik ;
            System.out.println("hacim :" + hacim);

        }


         */

        /*
        //Kullanicidan alinan bir sayinin tek mi cift mi oldugunu yazdiran kodu olusturunuz
        System.out.println("Lütfen bir tam sayı giriniz");
        int sayi = input.nextInt();
        if(sayi % 2 ==0 ){
            System.out.println("sayi çifttir");
        } else {
            System.out.println("sayi tektir");
        }


         */


        /*
        //Kullanicidan alinan bir sayinin pozitif,
        //negatif veya notr oldugunu kontrol eden kodu yaziniz

        System.out.println("Lütfen bir sayi giriniz");

        double num = input.nextDouble();

        if(num > 0 ){
            System.out.println("Bu sayı pozitiftir");
        } else if(num < 0 ){
            System.out.println("Bu sayı negatiftir");
        } else{
            System.out.println("Nötrdür");
        }



         */


        /*Ornek 1: Kullanicidan gun sayisini aldiginizda gun ismini yazan kodu yaziniz
         1==> Pazar, 2 ==> Pazartesi …*

         */

        /*

        System.out.println("Lütfen kaçıncı gün olduğunu giriniz");

        int num = input.nextInt();

        if(num < 1 ){
            System.out.println("Gün sayıları 1'den küçük olamaz ");
            }else if(num ==1 ){
            System.out.println("Pazar");
        }else if(num == 2){
            System.out.println("Pazartesi");
        }else if(num == 3){
            System.out.println("Salı");
        }else if(num == 4 ){
            System.out.println("Çarşamba");
        }else if(num == 5){
            System.out.println("Perşembe");
        }else if(num == 6){
            System.out.println("Cuma");
        }else if(num == 7){
            System.out.println("Cumartesi");
        }else{
            System.out.println("Gün sayıları 7'den büyük olamaz");
        }


         */

        /*

        System.out.println("Lütfen kaçıncı gün olduğunu giriniz");
        int num= input.nextInt();
        if(num >= 1 && num <= 7 ){
            System.out.println("Gün sayısı doğrudur");
        }else if(num ==1 ){
            System.out.println("Pazar");
        }else if(num == 2){
            System.out.println("Pazartesi");
        }else if(num == 3){
            System.out.println("Salı");
        }else if(num == 4 ){
            System.out.println("Çarşamba");
        }else if(num == 5){
            System.out.println("Perşembe");
        }else if(num == 6){
            System.out.println("Cuma");
        }else if(num == 7) {
            System.out.println("Cumartesi");
        }else if(num > 7){
            System.out.println("Gün sayısı 7 'dn büyük olamaz");
        }



         */

        /*Ornek 1: Kullanicidan yas degerini alan ve yasin hangi evrede oldugunu asagidaki tabloya gore yazdiran kodu olusturunuz.

        0-4 (dahil) ==> bebek
        5-12 (dahil)==> cocuk
        13-20 (dahil) ==> genc
        21-30 (dahil) ==> yetiskin
        30 ustu ==> Tanimlanmamis*/

        /*
        System.out.println("Lütfen yaşınızı giriniz");
        byte age = input.nextByte();
        if(age <0 ){
            System.out.println("Geçerli bir yaş giriniz");
        }else if(age < 5){
            System.out.println("Bebek");
        }else if(age <13){
            System.out.println("Çocuk");
        }else if(age < 21){
            System.out.println("Genç");
        }else if(age < 31){
            System.out.println("Yetişkin");
        }else{
            System.out.println("Tanimlanmamıs yas");
        }


         */

      /*
        //Ornek 1: Bir sayinin mutlak degerini hesaplayan kodu yaziniz.
        //Example 1: Write the code that calculates the absolute value of a number.


       //(c )?(t):(f);

       int c = -4;
       int result = c<0 ? -1 * c : c ;
        System.out.println(result);


       */

        /*

        //Ornek 2: Iki sayinin isareti ayni ise bu sayilari carpan, isaretleri farkli ise
        // "Farkli isaretli sayilari carpamiyorum" mesaji veren kodu yaziniz.

        //Example 2: If the signs of two numbers are the same, multiply these numbers, if the signs are different
        // Write the code that gives the message "I cannot multiply numbers with different signs".


        int c = 7;
        int d = -4;
        Object result1 = (c > 0 && d > 0 ) || (c < 0 && d <0 )? c * d : "Farkli isaretli sayilari carpamiyorum";
        System.out.println(result1);


         */


        /*
        //Ornek : Size verilen sayinin 3 basamakli olup olmadigini kontrol eden kodu yaziniz.
        //Example : Write the code to check if the given number has 3 digits

        int a = 123;
        String result = (a > 99 && a < 1000) ? "Uc basamalidir" : "Uc basamakli değildir";
        System.out.println(result);


        int a = -123;
        a = Math.abs(a);
        String result =(a > 99 && a < 1000) ? "Uc basamalidir" : "Uc basamakli değildir";
        System.out.println(result);


         */


        /*Ornek 1:  Verilen yilin "Leap Year" olup olmadigini kontrol eden kodu yaziniz.
        Example 1: Write the code to check if the given year is a "Leap Year".

        1) Yil 100'e bolunurse 400'e de bolunmelidir. 1600==>Leap    1800==>Leap degil
        2) Yil 100'e bolunmuyorsa 4'e bolunmelidir. 2004==>Leap    2005==>Leap degil */

        // (c) ? (t): (f);
        // (c) ? ( (c) ? (t): (f)): ((c) ? (t): (f));

        /*
        int year = 1987;

        String result = (year % 100 == 0) ?
                ( (year % 400 ==0) ? ("Leap Year"): ("Leap Year değil")):
                ((year % 4 == 0) ? ("Leap Year"): ("Leap Year değil"));
        System.out.println(result);

         */


        //Ornek 1: “s” String’inde kullanilan karakter sayisini bulunuz.
        //Example 1: Find the number of characters used in String “s”.

        /*
        String s = "Java is easy";
        int sLength = s.length();
        System.out.println(sLength);

        System.out.println("--------------");

        //Ornek 2: "s" String'inde ilk ve son index'teki karakterleri aliniz.
        //Example 2: Get the characters in the first and last index of String "s".

        char firstChar = s.charAt(0);
        System.out.println(firstChar);
         char lastChar = s.charAt(11);
        System.out.println(lastChar);
        char lastChar2 = s.charAt(s.length()-1);
        System.out.println(lastChar2);

        System.out.println("-------------");

        //Ornek 3: "s" String'indeki ilk 4 karakteri aliniz.
        //Example 3: Get the first 4 characters of the string "s".

        String sub1 = s.substring(0,4);
        System.out.println(sub1);

        String sub2 = s.substring(5,7);
        System.out.println(sub2);

        String sub3 = s.substring(8,12);
        System.out.println(sub3);

        //Ornek 4: "s" String'indeki "is" kelimesini aliniz.
        //Example 4: Get the word "is" in String "s".

        String sub4 = s.substring(8);
        System.out.println(sub4);

        //Ornek 6: "s" String'inde easy kelimesinin var olup olmadigini kontrol ediniz.
        //Example 6: Check if the word easy exists in the String "s".

        boolean isExist = s.contains("easy");
        System.out.println(isExist);


         */

        /*

        //Ornek 2: 20(dahil) den 3(dahil) e kadar tum tamsayilari console'a yazdiriniz.


        for(int i = 20 ;i> 2 ; i--){
            System.out.println(i);
        }


        //Ornek 3: 3'den 20'ye kadar tum cift sayilari console'a yazdiriniz(20 dahil)


        for(int i=4 ; i< 21 ; i+=2){
            System.out.println(i);
        }



        for(int i = 4 ; i<21 ; i++){
            if (i % 2==0);
            System.out.println(i);
        }



         */

        /*Ornek 1: Verilen bir String'de ilk 'a' harfinden onceki tum character'leri console'a yazdiriniz
        ==> "Tramvay"==> "Tr"*/

        /*
        String s = "Tramvay";
        for (int i = 0; i < s.length() ; i++) {
            char ch = s.charAt(i);

            if (ch == 'a'){
              break;
            }
            System.out.print(ch);
        }


         */
        /*
        //Ornek 2: Verilen bir String'de kucuk harfleri console'a yazdirmayan kodu yaziniz.
        //"Pwd12?Ab" ==> P12?A

        String s1 = "Pwd12?Ab";
        for (int i = 0; i < s1.length(); i++) {
            char ch = s1.charAt(i);
            if (ch>='a'&& ch<= 'z'){
                continue;
            }else{
                System.out.print(ch);
            }

        }


         */

        /*
        //ornek 3: Verilen bir String'i tersden yazan kodu yaziniz.
        //example 3: Write the code that reverses a given String

        //           String t = "Ali Can";  ==> "naC ilA"


        String t = "Ali Can";
        String reverse = "";
        for (int i = t.length()-1; i >=0; i--) {
            reverse = reverse + t.charAt(i);

        }

        System.out.println(reverse);


         */
        /*
        String n = "Java";
        String reverse = "";
        for (int i = n.length()-1; i >=0 ; i--) {
            reverse = reverse + n.charAt(i);
        }

        System.out.println(reverse);


         */

        //ornek 1: Verilen bir tamsayinin rakamlari toplamini console yazdiriniz.
        //example 1: Print the sum of the digits of a given integer to the console

        //578 ==> 5+7+8=20 ==> Output 20 olmali

        int sum = 0;
        for (int i =578; i > 0 ; i = i /10) {
            sum = sum + i % 10;
        }

        System.out.println("Toplam= " + sum );

        //Ornek 2: Bir String’teki tekrarsiz karakterleri veren kodu yaziniz.
        //Example 2: Write the code that returns the non-repeating characters in a String.
        // Yusuf ==> Ysf
        String t = "Yusuf";
        String unique = "";
        for (int i = 0; i < t.length(); i++) {
            char ch= t.charAt(i);
            if(t.indexOf(ch)== t.lastIndexOf(ch)){
                unique = unique + ch;
            }


        }
        System.out.println("Tekrarsız:" + unique);















    }
}

