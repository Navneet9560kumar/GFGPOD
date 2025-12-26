package Dec;

import java.util.*;

public class DEC_26POD {

      // find a missing numbdr we have a three metod \


          public static List<Integer> findMissing(int[] nums){
            int n = nums.length;
            List<Integer> res =  new ArrayList<>();
            // Mark visited nnumber 
            for(int i=0; i<n;i++){
                  int idx = Math.abs(nums[i]) -1;
                  if(nums[idx]>0){
                        nums[idx] =-nums[idx];
                  }
            }
            // Find missing numbers 
            for(int i=0;i<n;i++){
                  if(nums[i]>0){
                        res.add(i+1);
                  }
            }
            return res;
       }

// second method
       public static int missingNumber(int[] nums) {
            int n =  nums.length;
            int expected = n * (n+1)/2;
            int acu =0;

            for(int num: nums){
                  acu += num;
            }
            return expected-acu;

       }

       // thred method 

             public static void missingNumbersss  (int[] arr) {
    Set<Integer> set = new HashSet<>();
    for (int num : arr) {
        set.add(num);
    }

    int max = arr[arr.length - 1];

    for (int i = 1; i <= max; i++) {
        if (!set.contains(i)) {
            System.out.print(i + " ");
        }
    }
}


public int kthMissing(int[] arr, int k) {

    Set<Integer> set = new HashSet<>();
    for (int num : arr) {
        set.add(num);
    }

    int max = arr[arr.length - 1];
    int count = 0;

    for (int i = 1; i <= max; i++) {
        if (!set.contains(i)) {
            count++;              // ek missing mila
            if (count == k) {
                return i;         // yahi kth missing hai
            }
        }
    }

    // agar max ke andar nahi mila
    return max + (k - count);
}


      public static void main(String[] args) {
           int[] arr = {2, 3, 4, 7, 11};
           int k = 5;
        
    missingNumbersss(arr);
      }

}
