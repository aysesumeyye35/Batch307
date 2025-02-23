package d26maps_exceptions;

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

public class Map02 {
    public static void main(String[] args) {
        HashMap<String,Integer> stdAges = new HashMap<>();
        stdAges.put("Ali" , 18);
        stdAges.put("Can" , 19);
        stdAges.put("Tom" , 33);
        stdAges.put("Veli" , 63);
        stdAges.put("Ahmet" , 41);
        stdAges.put("Tom" ,35);
        System.out.println(stdAges);//{Can=19, Ahmet=41, Tom=35, Veli=63, Ali=18}tom 35 oldu

        //1) replace() methodu, value'lari key'leri kullanarak update etmeye yarar
        //Aynı işlemi put ile yapmak da teknik olarak işe yarar, ancak replace kullanmak,
        // kodunuzu okuyan diğer geliştiricilere ve size daha net bilgi verir.

        stdAges.replace("Tom", 39);
        System.out.println(stdAges); //{Can=19, Ahmet=41, Tom=39, Veli=63, Ali=18}

        //2) replace() methodu, eski deger kontrolu yaparakta calisir
        stdAges.replace("Tom" , 21 , 45);
        System.out.println(stdAges);//{Can=19, Ahmet=41, Tom=39, Veli=63, Ali=18}
        //Tom value'su degismez cunku eski deger 21 degil.

        stdAges.replace("Tom" , 39,45);
        System.out.println(stdAges);//{Can=19, Ahmet=41, Tom=45, Veli=63, Ali=18}
        //Degisiklik olacak cunku Tom'un eski value'su 39'du

        //3)putIfAbsent() metodu, belirtilen key ve value çiftini, key Map'te yoksa Map'e ekler.
        // Key Map'te zaten varsa, metodun hiçbir etkisi olmaz.

        stdAges.putIfAbsent("Tom" , 77);
        System.out.println(stdAges);//{Can=19, Ahmet=41, Tom=45, Veli=63, Ali=18} tom yani key yani map te olduğu için hiçbir değişiklik yapmadı

        stdAges.putIfAbsent("Ayşe" , 23);
        System.out.println(stdAges);//{Can=19, Ahmet=41, Ayşe=23, Tom=45, Veli=63, Ali=18} ayşe yani key map te yoksa ekler

        //4- get() ve getOrDefault() method'lari eger aranan eleman map'te var ise, ikisi de ayni isi yapar
        //key verirsiniz, size value verir. Ancak getOrDefault() metodu, anahtar bulunamadığında
        // bir varsayılan değer sağlama avantajına sahiptir.

        System.out.println(stdAges.get("Tom"));//45
        System.out.println(stdAges.getOrDefault("Tom" , 33));//45
        //Tom map ta var , o yüzden orijinal değeri geldi
        System.out.println(stdAges.get("Jerry"));//null , eleman yoksa get() null verir
        System.out.println(stdAges.getOrDefault("Jerry" , 404));//404 kabuldur
        System.out.println(stdAges);//{Can=19, Ahmet=41, Ayşe=23, Tom=45, Veli=63, Ali=18}

        //5)containsKey() metodu, Map'te bir key olup olmadığını kontrol eder.
        //containsValue() metodu ise, Map'te bir value olup olmadığını kontrol eder.
        //Boolean return ederler

        Boolean b = stdAges.containsValue(19);
        System.out.println(b);//true

        System.out.println(stdAges.containsValue(99));//false

        System.out.println(stdAges.containsKey("Tom"));//true bu method büyük küçük harfe duyarlıdır

        //----------------------------------------------Buyuk kucuk harfe duyarsız yapmak
        Map<String , Integer> stdAges2 = new HashMap<>();
        stdAges2.put("Tom".toLowerCase(), 25);
        System.out.println(stdAges2);//{tom=25}
        boolean b1 = stdAges2.containsKey("TOM".toLowerCase());
        System.out.println(b1);//true
        //---------------------------------------------
        //6)remove(); methodu key kullanarak entry silmeye yarar
        stdAges.remove("Tom");
        System.out.println(stdAges);//{Can=19, Ahmet=41, Ayşe=23, Veli=63, Ali=18}  tom ve value su silindi

        //remove(“Can”,19); seklinde kullanilan method, hem key hemde value’yu kontrol eder eslesirse siler yoksa silmez

        stdAges.remove("Can" , 18);
        System.out.println(stdAges);//{Can=19, Ahmet=41, Ayşe=23, Veli=63, Ali=18} , key ve value nun ikisinin de eşleşmesi gerekir





    }
}
