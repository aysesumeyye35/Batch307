package d3datatypes_concat_operators;

public class Concatenation {

    public static void main(String[] args) {

        //Ornek 1: Bir String ve iki int variable olusturun. String degeri ile Integer'larin toplamini console'a yazdirin.
        //Example 1: Create a String and two int variables. Print the string value and the sum of the Integers to the console.

        //Java da "+" sembolu iki sayi arasinda kullanilirsa "toplama islemi" olur
        //Java da "+" sembolu iki String veya bir String ve bir sayi arasinda kullanilirsa "concatenation" islemi olur
        //"concatenation" islemi birlestirme yapar
        //Not: Concatenation islemlerinde Java matematikteki islem onceligini kullanir

        String s = "Apple";
        int a = 10;
        int b = 11;

        System.out.println(s + a + b);// Apple1011
        System.out.println(s +(a+b) );//Apple21
        System.out.println(s + a * b);//Apple110
        System.out.println(a + b + s);//21Apple










    }








}
