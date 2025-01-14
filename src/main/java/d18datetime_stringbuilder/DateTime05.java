package d18datetime_stringbuilder;

import java.time.LocalDate;
import java.time.Period;

public class DateTime05 {
    public static void main(String[] args) {
        //Java'da Period class'i, tarihler arasındaki yıl, ay ve gün farklarını temsil etmek için kullanılır.

        //Kullanım Alanları
        //Period sınıfı, özellikle tarihler arasındaki uzun süreli farkları hesaplamak, tarihleri manipüle etmek
        // veya tarihler arası geçiş sürelerini yönetmek için kullanışlıdır. Finans, sağlık, eğitim gibi alanlarda
        // ve tarih ile ilgili işlemlerin sık yapıldığı her türlü yazılım geliştirme projelerinde etkili bir araçtır.

        //Period.between() metodu, iki tarih arasındaki farkı hesaplamak için kullanılır.
        // Bu metod, başlangıç ve bitiş tarihleri arasındaki tam yıl, ay ve gün farkını bir Period objesi olarak döndürür.

        LocalDate date1 = LocalDate.of(2024, 5 ,28);
        LocalDate date2 = LocalDate.of(2022, 12, 24);

        Period difference = Period.between(date2, date1);
        System.out.println(difference);//P1Y5M4D // p period , 1 yıl , 5 ay ,4 gün

        int yearD = difference.getYears();
        int monthD = difference.getMonths();
        int dayD = difference.getDays();
        System.out.println(date1 + " ve " + date2 + " arasındaki fark: ");//2024-05-28 ve 2022-12-24 arasındaki fark:
        System.out.println("Yıl " + yearD);//Yıl 1
        System.out.println("Ay " + monthD);//Ay 5
        System.out.println("Gün " + dayD);//Gün 4


    }
}
