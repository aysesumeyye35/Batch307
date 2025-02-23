package d27exceptions;

public class E06 {
    public static void main(String[] args) {
        //5) NullPointerException:(bos isaretcisi)
        // Null degerindeki bir variable referans olarak kullanildiginda olusur
        String s = "java";
        numberOfChar(s);//4

        String t = "";
        numberOfChar(t);//0

        String u = null;
        numberOfChar(u);//Null değerleri ile lenght() methodunu kullanmayınız
    }//main disi
    public static void numberOfChar(String s) {

        try {
            int a = s.length();
            System.out.println(a);
        } catch (NullPointerException e) {
            System.err.println("Null değerleri ile lenght() methodunu kullanmayınız");
        }
    }


}
