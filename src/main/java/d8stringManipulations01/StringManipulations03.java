package d8stringManipulations01;

import java.util.Scanner;

public class StringManipulations03 {

    public static void main(String[] args) {

        /*Ornek 1: Asagidaki kurallara gore kullanicinin girdigi password'u kontrol ediniz.

        i)En az 8 karakter olsun
        ii)Space karakteri password'de olmasin
        iii)En az bir tane buyuk harf olsun
        iv)En az bir tane kucuk harf olsun
        v)En az bir tane rakam olsun */

        /*Example 1: Check the password entered by the user according to the following rules.

        i) At least 8 characters
        ii)Space character should not be in password
        iii) At least one capital letter
        iv) At least one lowercase letter
        v)At least one number */

        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen şifrenizi giriniz");
        String pwd = input.nextLine();

        //i)En az 8 karakter olsun
        boolean lengthControl = pwd.length() > 7;
        //System.out.println("lengthControl = " + lengthControl);

        if (!lengthControl){
            System.out.println("Sifre en az 8 karakter içermelidir");
        }
        //ii)Space karakteri password'de olmasin
        boolean spaceControl = pwd.replaceAll("[^ ]" , "").length() ==0;
        //System.out.println("spaceControl = " + spaceControl);
        if (!spaceControl){
            System.out.println("Sifre boşluk içermemelidir");
        }
        //iii)En az bir tane buyuk harf olsun
        boolean upperCaseControl = pwd.replaceAll("[^A-Z]" ,"").length() >0 ;
        //System.out.println("upperCaseControl = " + upperCaseControl);

        if (!upperCaseControl){
            System.out.println("Sifre en az 1 tane büyük harf içermelidir");
        }
        //iv)En az bir tane kucuk harf olsun
        boolean lowerCaseControl = pwd.replaceAll("[^a-z]" ,"").length()>0;
        //System.out.println("lowerCaseControl = " + lowerCaseControl);
        if (!lowerCaseControl){
            System.out.println("Sifre en az 1 tane küçük harf  içermelidir");
        }
        //v)En az bir tane rakam olsun
        boolean digitControl = pwd.replaceAll("[^0-9]" ,"").length()>0;
        //System.out.println("digitControl = " + digitControl);

        if (!digitControl){
            System.out.println("Sifre en az 1 rakam içermelidir");
        }
        //Ödev : en az bir tane sembol içermeli
        boolean sembol = pwd.replaceAll("\\p{Punct}" , "" ).length()>0;
        if (sembol){
            System.out.println("Sifre en az 1 tane sembol içermelidir");
        }



        boolean isValid = lengthControl && spaceControl && upperCaseControl && lowerCaseControl && digitControl;

        if (isValid){
            System.out.println("Sifre geçerlidir");
        }else{
            System.out.println("Sifre geçersizdir");
        }













    }
}
