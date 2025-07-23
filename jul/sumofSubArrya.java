package jul;

import java.util.*;

public class sumofSubArrya {



      // ye sub set nekalrahe hai hai ham 
      public static List<List<Integer>>subset(int[]nums){
            List<List<Integer>> res = new ArrayList<>();
            res.add(new ArrayList<>()); // start with empty subset
            for(int num: nums){
                  int size = res.size();
                  for(int i=0;i<size;i++){
                        List<Integer>newSubset= new ArrayList<>(res.get(i));
                        newSubset.add(num);
                        res.add(newSubset);
                  }
            }
            return  res;
      }

       public int subarraySum(int[] arr) {
        // code here
        int res = 0, n = arr.length;
        for(int i=0;i<n;i++){
            res += arr[i] * (i+1) * (n-i);
        }
        return res;
    }
      public static void main(String[] args) {
            
      }
}
