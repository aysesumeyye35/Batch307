public class deneme05 {
    public static void main(String[] args) {
                /*
        Verilen bir multi dimensional array'in
        her array'ini ayri ayri ele alarak inner indexindeki elamanlarinin ortalamasından
        büyük elemanlari yazdıran bir kod yazınız.
        */
/*
        int a[]={1,2,3};
        int b[]={4,5,6};
        int c[]={7,8,9,10};

        int arrayler[][]={a,b,c};
*/


        int sayilar[][]={{8,57,37},//34
                {99,88,11},//66
                {32,34,15,12},//23.25
                {2,3,5,1}};//2.75

        double toplam=0;
        double ort=0;
        for (int [] i:sayilar) {
            for (int sayi:i
            ) {
                toplam+=sayi;
            }
            ort=toplam/i.length;
            System.out.println("Bu arraydeki ort : "+ort);
            for (int sayi:i) {//ort buyuk sayilar kontrol edilicek
                if (sayi>ort){
                    System.out.println("Bu sayı ort. büyük : "+sayi);
                }
            }
            toplam=0;
            ort=0;//a arrayinden b arrayine gecerken toplamı ve ort 0 lamayı sağladı
            System.out.println("Sıradaki array'e geçis yapıldı");

        }
    }
     /*
         Asagidaki multi dimensional array'in
         ic array'lerindeki tum elemanlarin toplamini birer birer bulan
         ve herbir sonucu yeni bir array'in elemani yapan
         ve yeni array'i ekrana yazdiran bir program yaziniz
         Ornek; {{1,2,3}, {4,5}, {6, 7} } ==> 1 + 2 + 3 = 6 4+5=9 6+7=13 ==> output: (6, 9, 13)
         */// TODO: 16.01.2025 ödev!!!
    int[][] sayı =  {{1,2,3},
                      {4,5},
                      {6, 7} };
    int toplam=0;

}