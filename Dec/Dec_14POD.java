package Dec;

import java.util.ArrayList;

public class Dec_14POD {


      public ArrayList<Integer> prefixSum2D(int[][] mat, int[][] queries) {
        // code hereint
        int n= mat.length;
            int m= mat[0].length;

            // step 1: create prefix sum array
            int[][] prefix= new int[n][m];

            for (int i = 0; i < n; i++) {
                  for(int j=0;j<m;j++){
                        int up = (i>0)? prefix[i-1][j]: 0;
                        int left = (j>0)? prefix[i][j-1]: 0;
                        int diag= (i>0 && j>0)? prefix[i-1][j-1]: 0;

                        prefix[i][j]= mat[i][j] + up + left - diag;
                  }
            }
            
        // Step 2: Answer Queries
        ArrayList<Integer> ans = new ArrayList<>();

        for(int[]q: queries){
              int r1= q[0];
              int c1= q[1];
              int r2= q[2];
              int c2= q[3];

              int total= prefix[r2][c2];

              if(r1>0) total -= prefix[r1-1][c2];
                  if(c1>0) total -= prefix[r2][c1-1];
                      if(r1>0 && c1>0) total += prefix[r1-1][c1-1];
                  ans.add(total);
        }
        return ans;
        
    }
      public static void main(String[] args) {
            int[][] arr = {
                  {1, 2, 3, 4},
                  {5, 6, 7, 8},
                  {9, 10, 11, 12}
            };


      }
}
