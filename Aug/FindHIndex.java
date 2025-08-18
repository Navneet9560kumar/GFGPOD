package Aug;

import java.util.Arrays;

public class FindHIndex {

          public int hIndex(int[] citations) {
        // code here
        Arrays.sort(citations);
        int n = citations.length;
        int idx = 0;
        
        while(idx < n && citations[n-1-idx] > idx){
            idx++;
        }
        return idx;
    }
      public static void main(String[] args) {
            
      }
      
}
