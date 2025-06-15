package june;

import java.sql.Array;
import java.util.Arrays;

public class smallestss_15 {

 
    public static  int smallestDivisor(int[] arr, int k) {
        // Code here
          int low = 1;
          int high = Arrays.stream(arr).max().getAsInt();
              int ans = high;

              while(low<=high){
                  int mid = low + (high -low)/2;
                  int total = 0;
                  for(int i = 0; i < arr.length; i++){
                      total += Math.ceil((double)arr[i]/mid);
                  }
                  if(total <=k){
                        ans =mid;
                        high = mid -1;

                  }else{
                        low = mid + 1;
                  }
              }
              return ans;
    }
      public static void main(String[] args) {
            int[]arr = {1,2,5,9};
            int k = 6;
            int n = arr.length;
            System.out.println(smallestDivisor(arr, k));
      }
}
