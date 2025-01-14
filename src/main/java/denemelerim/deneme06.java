package denemelerim;

import java.util.Arrays;
import java.util.Scanner;

public class deneme06 {
    public static void main(String[] args) {
         /*Ornek 1:
       Gecerli Username="admin" ve Password="pwd123" dur.
       Kullanicidan username ve password'u alin.
       Username ve password dogru ise console'a "Hesabiniza hosgeldiniz!" yazdirin.
       Username veya password yanlis ise 4 kere "Username ve password'unuzu giriniz" mesaji versin.
       Username veya password 4. kere yanlis girilirse "Hesabiniz bloke olmustur" mesaji vererek islemi tamamlayiniz.

Example 1:
       Valid Username="admin" and Password="pwd123".
       Get the username and password from the user.
       If the username and password are correct, print "Welcome to your account!" to the console.
       If the username or password is incorrect, prompt "Enter your username and password" 4 times.
       If the username or password is entered incorrectly for the 4th time, complete the process with the message "Your account is blocked".
*/
        Scanner input =new Scanner(System.in);
        int counter = 0;
        int maxDeneme = 4;
        do{
            if(counter==maxDeneme){
                System.out.println("Hesabınız bloke olmuştur");
                break;
            }
            System.out.println("Lütfen username i giriniz");
            String userName = input.next();
            System.out.println("Lütfen passwordu giriniz");
            String passWord = input.next();
            if(userName.equals("admin")&&passWord.equals("pwd123")){
                System.out.println("Hesabınıza hoş geldiniz" );
                break;
            }else{
                counter++;
                int kalanHakkınız = maxDeneme - counter;
                if(kalanHakkınız>0){
                    System.out.println("userName ve password yanlış.kalan hak:" + kalanHakkınız);
                }
            }

        }while (true);

        //Ornek 4: [0, 2, 3, 0, 12, 0] arrayinde tum sifirlari sona yerlestiriniz(Interview Sorusu)
        //Example 4: In the array [0, 2, 3, 0, 12, 0], place all zeros at the end.

        //         [0, 2, 3, 0, 12, 0] ==> [2, 3, 12, 0, 0, 0]
        int[] arr ={0, 2, 3, 0, 12, 0} ;
        int[] newarr= new int[arr.length];
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(newarr));
        int firstIndex =0;
        for (int w: arr) {
            if( w!= 0){
                newarr[firstIndex] =w;
                firstIndex++;
            }

        }
        System.out.println(Arrays.toString(newarr));



        
        
    }
}
