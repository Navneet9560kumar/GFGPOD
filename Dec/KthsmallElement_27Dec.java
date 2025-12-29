package Dec;

import java.util.Arrays;

public class KthsmallElement_27Dec {
      public static void main(String[] args) {
              int[] arr = {7, 10, 4, 3, 20, 15};
        int k = 3;
        Arrays.sort(arr); 

        System.out.println("kth Smallest Elemnt " +  arr[k-1]);
      }
}
