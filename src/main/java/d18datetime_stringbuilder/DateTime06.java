package d18datetime_stringbuilder;

import javax.print.attribute.SetOfIntegerSyntax;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Set;

public class DateTime06 {
    public static void main(String[] args) {
        /*LocalTime Class'ta kullanilan tarih saat formatlari

    HH : mm ==> 24'lu saat sistemi
    hh : mm ==> 12'li saat sistemi. AM, PM gosterilmez
    hh : mm a ==> 12'li saat sistemi. AM, PM gosterilir
    HH : mm : ss ==> saniyeyi gosterir
    HH : MM ==> yanlis format cunku MM aylar icin kullanilir
    "mm" "minute" demektir. "MM" "month" demektir.

    dd-MM-yyyy ==> gun - ay - yil
    MMM ==> Aug
    MMMM ==> August  */
        //-------------
        //ornek 1:"DateTimeFormatter", bir Class'tir ve tarih ve saat verilerini belirli bir
        // biçimde görüntülemek, okumak ve işlemek için kullanılan önemli bir araçtır.

        //DateTimeFormatter, tarih ve saat nesnelerini "metin" yani String olarak biçimlendirmenize ve
        // metni tarih ve saat nesnelerine çözmenize olanak tanır.
        //ofPattern()model demektir metodu, belirli bir kalıba (pattern) göre tarih ve zaman verilerini
        // biçimlendirmek için kullanılır.
        //format() method'u LocalTime'i String'e istedigimiz formatta cevirir
        LocalTime myCurrentTime = LocalTime.now();
        DateTimeFormatter dtf1 = DateTimeFormatter.ofPattern("HH:mm:ss");

        String formattedTime = dtf1.format(myCurrentTime);
        System.out.println(formattedTime);//23:00:40

        LocalDate myCurrentDate = LocalDate.now();
        DateTimeFormatter dtf2 = DateTimeFormatter.ofPattern("dd-MMM-yyyy");

        String formattedDate = dtf2.format(myCurrentDate);//kalıba göre formatla benim verdiğim tarihi
        System.out.println(formattedDate);//14-Oca-2025

        //ornek 3: Baska bir zaman dilimindeki tarih ve zamani nasil aliriz?

        //ZoneId class'i, zaman dilimi veya coğrafi bölge bilgisini temsil eder ve
        // tarih/saat işlemlerinde bu bilginin kullanılmasını sağlar.

        //Tokyo’da ayin kaci?
        LocalDate dateInTokyo = LocalDate.now(ZoneId.of("Asia/Tokyo"));
        System.out.println(dateInTokyo);//2025-01-15
        //Amsterdam’da ayin kaci?
        LocalDate dateInAmsterdam = LocalDate.now(ZoneId.of("Europe/Amsterdam"));
        System.out.println(dateInAmsterdam);//2025-01-14
        //Tokyo'da saat kac?
        LocalTime timeInTokyo = LocalTime.now(ZoneId.of("Asia/Tokyo"));
        System.out.println(timeInTokyo);//05:11:08.061828100
 /*
        //Tüm zone'lara bakalım
        Set<String> zoneIds = ZoneId.getAvailableZoneIds();
        for(String w: zoneIds){

        }
        System.out.println("Toplam zaman dilimi sayısı : " + zoneIds.size());
        //-------------------------------

  */
        //---------------
        //ornek 4: Tarih ve zamani ayni anda kullanalim.
        //LocalDateTime, tarih ve saatlerle çalışmak için kullanılır.
        LocalDateTime ldt = LocalDateTime.now();
        System.out.println(ldt);//2025-01-14T23:19:20.835691600

        DateTimeFormatter dtf3= DateTimeFormatter.ofPattern("dd * MMM * yyyy - hh : mm a ");
        String formattedLdt = dtf3.format(ldt);
        System.out.println(formattedLdt);
















    }

}
