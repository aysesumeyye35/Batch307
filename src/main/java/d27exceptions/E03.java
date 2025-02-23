package d27exceptions;

public class E03 {
    public static void main(String[] args) {

        //3) StringIndexOutOfBoundsException, bir String nesnesinin, karakter dizisindeki
        // geçersiz bir indekse erişmeye çalışıldığında ortaya çıkan bir istisna türüdür.

        String s = "Java";
        //selectChar(s, 2);
        selectChar(s,6);





    }//main disi
    public static void selectChar(String s, int idx) {

        try {
            char ch = s.charAt(idx);
            System.out.println(ch);//index 2 = v
        } catch (StringIndexOutOfBoundsException e) {
            System.err.println("Olmayan index kullanmayınız:" + e.getMessage());
            e.printStackTrace();////kod yazan hatayi gormek isterse kullanir. exception'i gosterir ama firlatmaz
        }
        System.out.println("App calisiyor");
    }
        //Not: kodda printStackTrace() varsa exception fırlatılmış gibi gösterir ama hata değildir aşağıda exceptionın içeriğini gösterir




}
