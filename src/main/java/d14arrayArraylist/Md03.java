package d14arrayArraylist;

public class Md03 {
    public static void main(String[] args) {
        //Ornek 1: int turunde bir Multidimensional Array'deki en kucuk ve en buyuk elemanin toplamini bulunuz.

        //Example 1: Find the sum of the smallest and largest element in a Multidimensional Array of type int.

      int[][] ages ={{15,4} ,{12 ,43, 21}};
      int smallest = ages[0][0];
      int biggest = ages [0][0];

        for (int[] w : ages) {
            for (int k: w) {
                smallest = Math.min(smallest ,k);
                biggest =Math.max(biggest, k);
            }

        }
        System.out.println(smallest);
        System.out.println(biggest);
        System.out.println(smallest + biggest);



    }
}
