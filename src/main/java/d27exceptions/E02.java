package d27exceptions;

public class E02 {
    public static void main(String[] args) {

        String s = "1234a";
        convertStringToInt(s);





    }//main disi
    //2) NumberFormatException : Bir metnin sayisal bir deger olarak donusturulememesi durumunda olusur
    public static void convertStringToInt (String s) {//Stringi tam sayıya çeviren bir method
       try {
           int intS = Integer.valueOf(s);//tırnağı kaldıran method intS ye yükledi ve aşağıda +1 ekledi
           System.out.println(intS + 1);//1235
       }catch ( NumberFormatException e){
           System.out.println("Donusum icin rakam disi karakter kullanmayiniz" + e.getMessage());//Donusum icin rakam disi karakter kullanmayinizFor input string: "1234a"
       }
    }

    //ARASTIRMA ODEVI: Java'da alınan hatayı (exception) konsola yazdırmanın yanı sıra, bu hatayı bir dosyaya yazdırmak,
    // bir veritabanına kaydetmek veya bir ağ üzerinden disari göndermek mumkun mu?




}
