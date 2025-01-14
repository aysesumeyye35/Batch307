package d16arraylist_methodcreation_overloading;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayList03 {
    public static void main(String[] args) {
        //Bir list olusturmak icin kisayol
        List<Integer> mylist = Arrays.asList(1 ,3 ,4 , 9, 7);
        System.out.println(mylist);

        //1- Arrays.asList() ile oluşturulan liste, sabit boyutludur. Array gibi calismaya baslar.
        // Bu, listenin boyutunu değiştiremezsiniz; yani yeni eleman ekleyemez veya çıkaramazsınız.
        //Listin eleman sayisini degistiren methodlari kullanamazsiniz.
        //2- Arrays.asList() ile oluşturulan liste, bazı liste işlemlerini desteklemez.
        // Örneğin, remove(), add(), clear() gibi yöntemler desteklenmez. Ama set() veya size() kullanabilirsiniz

        //clear() metodu, bir listedeki tüm elemanları silmek için kullanılır.
        // mylist.remove(0); Hata
        // mylist.add(5);Hata
         //mylist.clear(); Hata
        mylist.set(0 , 5);
        System.out.println(mylist);
        System.out.println(mylist.size());//5





    }
}
