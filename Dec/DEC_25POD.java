package Dec;

import java.util.*;

public class DEC_25POD {

         public ArrayList<Integer> findPeakGrid(int[][] mat) {
        int rows = mat.length;
        int cols = mat[0].length;

        int low = 0, high = cols - 1;

        while (low <= high) {
            int midCol = (low + high) / 2;

            // Step 1: find max element row index in mid column
            int maxRow = 0;
            for (int i = 0; i < rows; i++) {
                if (mat[i][midCol] > mat[maxRow][midCol]) {
                    maxRow = i;
                }
            }

            int curr = mat[maxRow][midCol];
            int left  = midCol - 1 >= 0 ? mat[maxRow][midCol - 1] : -1;
            int right = midCol + 1 < cols ? mat[maxRow][midCol + 1] : -1;

            // Step 2: peak check (>= neighbors)
            if (curr >= left && curr >= right) {
                ArrayList<Integer> ans = new ArrayList<>();
                ans.add(maxRow);
                ans.add(midCol);
                return ans;
            }
            // Step 3: move to bigger neighbor
            else if (right > curr) {
                low = midCol + 1;
            } else {
                high = midCol - 1;
            }
        }

        return new ArrayList<>();
    }

      public static void main(String[] args) {
            
      }
}
