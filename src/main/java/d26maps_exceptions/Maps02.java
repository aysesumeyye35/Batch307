package d26maps_exceptions;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Locale;

public class Maps02 {
    public static void main(String[] args) {

        // meshur bir ınterview sorusu

        //ornek 1: Size verilen bir String'deki her kelimenin, o String'de kac defa kullanildigini
        //gosteren kodu yaziniz.(Case insensitive (Büyük/küçük harfe duyarsız olsun)
        //example 1: Given a String, count the number of times each word is used in that String
        // write the code that displays.(Case insensitive)

        String s = "Ali nasilsin Ali.";
        s = s.replaceAll("\\p{Punct}" , "").toLowerCase();
        System.out.println(s);//ali nasilsin ali noktalı harflerden kurtulduk önce

       String[] words = s.split(" ");
        System.out.println(Arrays.toString(words));//[ali, nasilsin, ali] 3 kelimeye böldük şimdi ise boş bir map açıp içini dolduracağız
        HashMap<String , Integer> myMap = new HashMap<>();
        System.out.println(myMap);//{} boş map açtık

        for(String w : words){
            Integer isThere = myMap.get(w);

            if (isThere == null) {
                myMap.put(w , 1);// map te eleman yoksa w dan yani ilk döngüde ali den 1 tane ekle
            } else {
                myMap.put(w, isThere +1);//map te var olan elemanı 1 arttırdık
            }


        }
        System.out.println(myMap);//{nasilsin=1, ali=2}

        //ODEV: Size verilen bir String'deki her harfin o String'de kac defa kullanildigini gosteren kodu yaziniz.
        //example 2: Write the code that shows how many times each letter in a given String is used in that String.
        //           "Hello" ==> h=1, e=1, l=2, o=1


        String h ="Hello";
        h= h.replaceAll("\\p{Punct}", "").toLowerCase();
        System.out.println(h);//hello
        String[] hll = h.split("");
        System.out.println(Arrays.toString(hll));//[h, e, l, l, o]
        HashMap<String , Integer> map = new HashMap<>();
        System.out.println(map);//{}
        for (String w : hll){
            Integer isThere = map.get(w);
            if (isThere == null){
                map.put(w ,1);
            }else{
               map.put(w , isThere + 1);
            }
        }
        System.out.println(map);//{e=1, h=1, l=2, o=1}






    }
}
