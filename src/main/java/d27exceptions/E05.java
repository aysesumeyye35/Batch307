package d27exceptions;

public class E05 {
    public static void main(String[] args) {

        //try blogundan sonra birden fazla catch bloğu kullanabilir miyiz?
        int a = 12;
        int b = 1;
        String s = "My Java";
        getCharFromString(s , a , b);//a


    }//main disi

    public static void getCharFromString(String s , int a , int b) {
        try {
            int idx = a / b;
            char ch = s.charAt(idx);
            System.out.println(ch);
        }catch (ArithmeticException e) {
            System.out.println("Sifira bolme yapilamaz " + e.getMessage());
        }catch (StringIndexOutOfBoundsException e){
            System.out.println("Olmayan index kullandınız " + e.getCause());//Olmayan index kullandınız null 12/1 olduğunda 12 index yok ki
        }

    }
    //2.yol: Tum exception turlerini tek bir catch'te yakalamak icin "Exception" adli parent kullanilir
    public static void getCharFromString2(String s, int a, int b) {
        try {
            int idx = a / b;
            char ch = s.charAt(idx);
            System.out.println(ch);
        }catch (Exception e){
            System.out.println("Bir istisna olustu " + e.getClass());
        }
    }



}
