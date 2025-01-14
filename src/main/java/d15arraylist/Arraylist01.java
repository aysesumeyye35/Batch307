package d15arraylist;

import java.util.ArrayList;

public class Arraylist01 {
    public static void main(String[] args) {

        /*ArrayList, dinamik boyutlu bir array'dir; eleman ekleyip çıkarırken boyutu otomatik olarak ayarlanır.
        Gerçek hayatta bir alışveriş listesi gibi düşünülebilir.
        Alışveriş listesi, ürün isimlerini içerir ve bu isimler String türündedir.*/
        /*
        1)Array'ler primitive data type'lari ve reference'lari depolayabilir ama Arraylist'ler
        non-primitive'leri (reference'lari) depolar
        2)ArrayListler memory'de Array'lerden daha fazla yer kaplar
        3)Array'ler olusturulurken bastan eleman sayisini belirtmek zorundayiz
        4)ArrayList'ler eleman sayisinda esnektirler.
        5) Array'leri Java niye iptal etmedi?
        a) Array'ler cok daha hizlidir
        b) Array'ler memory'de cok az yer kaplarlar
        c) Bu nedenle eleman sayisi belli olan datalari depolamak icin Array'ler tercih edilir

        6) Java'da generic (kapsamli) türler (<> ile belirtilen türler) için yalnızca referans
        veri türleri kullanılabilir. Primitive veri türleri (örneğin int, char, boolean, double, vb.)
         doğrudan generic türlerin içine yerleştirilemez. Bu nedenle, özel bir durumla karşılaştığınızda,
         bu türleri ilgili sınıflarla sarmalamanız (wrapper) gerekir.
        */

        //ArrayList nasil olusturulur
        //ArrayList<Integer> ages = new ArrayList<Integer>(); //Java 6 ve oncesi
        ArrayList<Integer> ages = new ArrayList<>();// java 7 ve sonrası ,type inference

        //ArrayList’lere eleman nasil eklenir?
        //add() metodu, ArrayList’e yeni bir eleman eklemek için kullanılır ve
        // eklenen elemanı listenin sonuna yerleştirir.














    }
}
