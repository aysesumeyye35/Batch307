package d16arraylist_methodcreation_overloading;

import java.awt.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Arraylist02 {
    public static void main(String[] args) {
        //Ornek 1: Bir tane Integer List olusturunuz.Bu List'te birbirine en yakin iki tamsayiyi yaziniz.
        // Example 1: Create an Integer List.Write the two closest integers in this List.
        //           [12, 23, 10, 19] ==> 12 ve 10
/*
        List<Integer> nums = new ArrayList<>();
        nums.add(12);
        nums.add(23);
        nums.add(10);
        nums.add(19);
        System.out.println(nums); //[12, 23, 10, 19]

        //Collections.sort(nums);
        nums.sort(null);
        System.out.println(nums); //[10, 12, 19, 23]

        int minDiff = nums.get(1) - nums.get(0); // 12-10 = 2





        for (int i = 1; i < nums.size();                    i++) {

            minDiff = Math.min(minDiff, nums.get(i) - nums.get(i - 1));









        }
        System.out.println(minDiff); //2


 */
        //------------------
        //En küçük farkı hangi iki sayıdan elde ettiğimizi bulalım
     /*   for (int i = 1; i < nums.size(); i++) {
            if(nums.get(i) - nums.get(i-1) == minDiff){
                System.out.println(nums.get(i) + "ve" + nums.get(i-1));

            }
        }

    }

      */
}
}

