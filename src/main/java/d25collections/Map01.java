package d25collections;

import java.util.*;

public class Map01 {
    public static void main(String[] args) {

        //1) Map'ler sozluk gibidir. Aciklamalidir.  orn: Ali = 13 .Map'ler collections degildir. Ordan miras almaz
        //2) Sol taraf yani key'ler tekrarsizdir. Value tarafi tekrarli olabilir.
        //3) Key tarafi icin Set kullanilir. Values için ise genellikle Collection yapısı kullanılır.
        //4) Map'in elemanlarina komple 'entry set' (giris elemani) denir.

        //Map nasil olusturulur?
        //put():Bir key-value çiftini map’e ekler.
        //1) HashMap: Key-value çiftlerini rastgele bir sırayla depolayan bir Map türüdür.En hizlisidir.
        HashMap<String , Integer> myMap = new HashMap<>();
        myMap.put("Ali Can ", 13);
        myMap.put("Veli Han ", 18);
        myMap.put("Ayşe Kaya ", 15);
        myMap.put("Fatma Yılmaz", 19);
        myMap.put("Ali Can ", 25);//key tekrarlı kullanılırsa son value üzerine yazdırılır hata olmaz

        System.out.println(myMap);//{Veli Han =18, Ayşe Kaya =15, Ali Can =13, Fatma Yılmaz=19}

        //Sadece ‘key’ degerlerini nasil alabiliriz?
        //keySet(): Map’teki tüm key’lerin bir set’ini döndürür.Set’in sırası rastgeledir.

       Set<String> keySide = myMap.keySet();
        System.out.println(keySide);//[Veli Han , Ayşe Kaya , Ali Can , Fatma Yılmaz]

        //Sadece 'value' degerlerini nasil alabiliriz?
        //values():Map’teki tüm value’ların bir collection’ını döndürür.Collection’ın sırası rastgeledir.
        Collection<Integer> valueSide = myMap.values();
        System.out.println(valueSide);//[18, 15, 25, 19]

        //--------------------------
        //get(): Bir key’e karşılık gelen değeri döndürür.key verirsiniz value’sunu getirir
        Integer age = myMap.get("Ali Can");
        System.out.println(age);//null

        //-----------------
        //Ornek 1: myMap'deki kisilerin yaslarinin ortalamasi nedir?
        //Example 1: What is the average age of the people in myMap?
        int total = 0;
        Collection<Integer> ages = myMap.values();
        System.out.println(ages);//[18, 15, 25, 19]
        for (Integer w: ages){
            total = total + w;
        }
        System.out.println(total / ages.size());//19

        System.out.println("-----------------------");
        //entrySet() metodu, HashMap'in tüm degerlerini içeren (key-value) bir Set döndürür.
        // Dongu gibi ayri satirlarda yazdirir.Cunku Loop'lar direkt Map'ler ile kullanilamaz.
        //Bu yuzden ozel method gelistirilmis. Set'in icinde Map yapisi saklanir.

        System.out.println(myMap);//{Veli Han =18, Ayşe Kaya =15, Ali Can =25, Fatma Yılmaz=19}

        Set< Map.Entry<String, Integer> > myEntrySet= myMap.entrySet();
        System.out.println(myEntrySet);//[Veli Han =18, Ayşe Kaya =15, Ali Can =25, Fatma Yılmaz=19]

        for (Map.Entry<String, Integer> w: myEntrySet) {//Map.Entry<String, Integer> data type dir
            System.out.println(w);
            //Veli Han =18
            //Ayşe Kaya =15
            //Ali Can =25
            //Fatma Yılmaz=19
        }
        //------------------------
        //Ornek 2:  Verilen Map'deki kisi isimlerinin character sayisi ile yaslarinin toplamini bulunuz.
        //Example 2: Find the sum of the number of characters and the age of the person names in the given Map.

        //Java’da Map.Entry kullanarak bir Set üzerinde loop yapabilir ve
        // hem anahtarları (getKey()) hem de değerleri (getValue()) elde edebilirsiniz.
        HashMap<String , Integer> people = new HashMap<>();
        people.put("Ali" , 3);
        people.put("Can" , 5);
        people.put("Ayşe", 2);
        int sum = 0 ;
        Set<Map.Entry<String, Integer>> mySet = people.entrySet();
        for (Map.Entry<String, Integer> w : mySet){
            sum = sum + w.getKey().length() + w.getValue();
        }
        System.out.println(sum);//20








    }
}
