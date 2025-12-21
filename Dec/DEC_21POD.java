package Dec;

import java.util.ArrayList;

public class DEC_21POD {
     
    public ArrayList<Integer> countXInRange(int[] arr, int[][] err) {
        // code here
        
        ArrayList<Integer> ans = new ArrayList<>();

        for(int i=0;i<err.length;i++){
              int L = err[i][0];
            int R = err[i][1];
            int X = err[i][2];

            int count =0;
            for (int j = L; j <= R; j++) {
                  if(arr[j]==X) count++;
            }
               ans.add(count);

        }
                return ans;

        
    }

      public static void main(String[] args) {
            
      }
}
